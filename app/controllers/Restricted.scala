package controllers

import java.util.concurrent.TimeoutException

import models.{Employee, Page, User}
import play.api.Logger
import play.api.data.Form
import play.api.data.Forms._
import play.api.libs.concurrent.Promise
import play.api.mvc.{Action, Controller}
import views.html

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.concurrent.duration._




/**
  * Created by Mabbasi on 10/09/2016.
  */
object Restricted extends Controller with Secured
{

  implicit val timeout = 60.seconds

  val HomeRestricted = Redirect(routes.Restricted.list())

  val userForm = Form(
    mapping(
      "NATIONALCODE" -> text,
      "NAME" -> text,
      "PASSWORD" -> text
    )(User.apply)(User.unapply)
  )

  val employeeForm = Form(
    mapping(
      "ID" -> ignored(0: Long),
      "NAME" -> nonEmptyText,
      "ADDRESS" -> nonEmptyText,
      "DOB" -> date("yyyy-MM-dd"),
      "JOININGDATE" -> date("yyyy-MM-dd"),
      "DESIGNATION" -> nonEmptyText )(Employee.apply)(Employee.unapply))

  def create = Action {
    Ok(html.createFormEmployee(employeeForm))
  }


//
//  def index1 = IsAuthenticated { username =>
//    _ =>
//      User.findByNationalCode(username).map { user =>
//        Ok(
//          HomeRestricted
//          //html.restricted(user)
//          //html.createFormEmployee(employeeForm)
//        )
//      }.getOrElse(Forbidden)
//  }


  def IsAuthenticatedNew(maybeString: Option[String]):Boolean = {
    val x1= User.findByNationalCodeStatus(maybeString)

    x1 match {
      case Some(x1) => true
      case null => false
    }
//     if (x1 != null) {
//       true
//     }
//     else
//     {
//       false
//     }
  }

  def index1 = Action { implicit req=>
    val status = IsAuthenticatedNew(req.session.get("NATIONALCODE"))
    if (status)
      HomeRestricted
    else
      HomeRestricted
  }



  def list(page: Int, orderBy: Int, filter: String , username: String , email:String) = Action.async { implicit request =>
    //    val futurePage: Future[Page[Employee]] = TimeoutFuture(Employee.list(page = page, orderBy = orderBy, filter = ("%" + filter + "%")))
    val data =Employee.list(page = page, orderBy = orderBy, filter = ("%" + filter + "%"));
    val futurePage: Future[Page[Employee]] =Future(Employee.list(page = page, orderBy = orderBy, filter = ("%" + filter + "%")  ))
    val use= request.session.get("NATIONALCODE")
    val ema= request.session.get("NAME")

    futurePage.map(page => Ok(html.list(page, orderBy, filter , use.get , ema.get ))).recover {
      case t: TimeoutException =>
        Logger.error("Problem found in employee list process")
        InternalServerError(t.getMessage)
    }
  }


  def save = Action.async { implicit request =>

    employeeForm.bindFromRequest.fold(
      formWithErrors => Future.successful(BadRequest(html.createFormEmployee(formWithErrors))),
      employee => {
        //val xx=Employee.insert(employee) ;
        val futureUpdateEmp: Future[Option[Long]] = Future(Employee.insert(employee))
        futureUpdateEmp.map {
          case Some(empId) =>
            val msg = s"Employee ${employee.NAME} has been created"
            Logger.info(msg)
            HomeRestricted.flashing("success" -> msg)
          case None =>
            val msg = s"Employee ${employee.NAME} has not created"
            Logger.info(msg)
            HomeRestricted.flashing("error" -> msg)
        }.recover {
          case t: TimeoutException =>
            Logger.error("Problem found in employee update process")
            InternalServerError(t.getMessage)
        }
      }
    )
  }
  def delete(id: Long) = Action.async {
    val futureInt = TimeoutFuture(Employee.delete(id))
    futureInt.map(i => HomeRestricted.flashing("success" -> "Employee has been deleted")).recover {
      case t: TimeoutException =>
        Logger.error("Problem deleting employee")
        InternalServerError(t.getMessage)
    }
  }

  def update(id: Long) = Action.async { implicit request =>
    employeeForm.bindFromRequest.fold(
      formWithErrors => Future.successful(BadRequest(html.editFormEmployee(id, formWithErrors))),
      employee => {
        val futureUpdateEmp: Future[Int] = TimeoutFuture(Employee.update(id, employee))
        futureUpdateEmp.map { empId =>
          HomeRestricted.flashing("success" -> s"Employee ${employee.NAME} has been updated")
        }.recover {
          case t: TimeoutException =>
            Logger.error("Problem found in employee update process")
            InternalServerError(t.getMessage)
        }
      })
  }

  def edit(id: Long) = Action.async {
    val futureEmp: Future[Option[Employee]] = TimeoutFuture(Employee.findById(id))
    futureEmp.map {
      case Some(employee) => Ok(html.editFormEmployee(id, employeeForm.fill(employee)))
      case None => NotFound
    }.recover {
      case t: TimeoutException =>
        Logger.error("Problem found in employee edit process")
        InternalServerError(t.getMessage)
    }
  }


  object TimeoutFuture {

    def apply[A](block: => A)(implicit timeout: FiniteDuration): Future[A] = {

      val promise = scala.concurrent.promise[A]()

      // if the promise doesn't have a value yet then this completes the future with a failure
      Promise.timeout(Nil, timeout).map(_ => promise.tryFailure(new TimeoutException("This operation timed out")))

      // this tries to complete the future with the value from block
      Future(promise.success(block))

      promise.future
    }

  }

}


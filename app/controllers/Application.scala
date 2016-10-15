package controllers

import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index())
  }

  //  implicit val timeout = 60
  //
  //  def index = Action {
  //    Ok(views.html.index("hello"))
  //  }
  //
  //  val employeeForm = Form(
  //    mapping(
  //      "ID" -> ignored(0: Long),
  //      "NAME" -> nonEmptyText,
  //      "ADDRESS" -> nonEmptyText,
  //      "DOB" -> date("yyyy-MM-dd"),
  //      "JOININGDATE" -> date("yyyy-MM-dd"),
  //      "DESIGNATION" -> nonEmptyText)(Employee.apply)(Employee.unapply))
  //
  //  def create = Action {
  //    Ok(html.createform(employeeForm))
  //  }
  //
  ////  def index1 = Action {
  ////   // Home
  ////  }
  //
  //  //val Home = Redirect(routes.Application.list())
  //
  //  def list() = {
  //
  //  }

}

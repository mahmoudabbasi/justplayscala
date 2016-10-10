package controllers

import models.User
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import views.html

/**
  * Created by Mabbasi on 10/09/2016.
  */
object Authentication extends Controller {

  val loginForm = Form(
    tuple(
      "NATIONALCODE" -> text,
      "PASSWORD" -> text
    ) verifying ("Invalid email or password", result => result match {
      case (nationalCode, password) => User.authendicate(nationalCode, password).isDefined
    })
  )


  val CreateUser = Form(
    mapping(
      "NATIONALCODE" -> text,
      "NAME" -> text,
      "PASSWORD" -> text
    ) (User.apply)(User.unapply)
  )



  def login = Action { implicit request =>
    Ok(html.login(loginForm))
  }

  def create =Action { implicit request =>
    Ok(html.createform(CreateUser))
  }

  def logout = Action {
    Redirect(routes.Authentication.login).withNewSession.flashing(
      "success" -> "You've been logged out"
    )
  }

  def authenticate = Action { implicit request1 =>
    loginForm.bindFromRequest.fold(
      formWithErrors => BadRequest(html.login(formWithErrors)),
      user => Redirect(routes.Restricted.index()).withSession("NATIONALCODE" -> user._1)
    )
  }


  def authenticate1 = Action {
    Ok("Hello world")
    //CreateUser.
//    CreateUser.bindFromRequest.fold(
//      formWithErrors => BadRequest(html.createform(formWithErrors)),
//      user => Redirect(routes.Restricted.index()).withSession("NATIONALCODE" -> user.NATIONALCODE)
//    )
  }






}

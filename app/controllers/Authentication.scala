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

  def login = Action { implicit request =>
    Ok(html.login(loginForm))
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

}

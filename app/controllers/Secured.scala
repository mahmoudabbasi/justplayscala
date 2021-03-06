package controllers

import models.User
import play.api.mvc._

/**
  * Created by Mabbasi on 10/09/2016.
  */
trait Secured {

  private def username(request: RequestHeader) = request.session.get("NATIONALCODE")

  private def onUnauthorized(request: RequestHeader) = {
    Results.Redirect(routes.Authentication.login)
  }

  def IsAuthenticated(f: => String => Request[AnyContent] => Result) = {
    Security.Authenticated(username, onUnauthorized) { user =>
      Action(request => f(user)(request))
    }
  }




}

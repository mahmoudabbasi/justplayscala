package controllers

import play.api.mvc.Controller
import models.User
import views._
/**
  * Created by Mabbasi on 10/09/2016.
  */
object Restricted extends Controller with Secured  {

  /**
    * Display restricted area only if user is logged in.
    */
  def index = IsAuthenticated { username =>
    _ =>
      User.findByNationalCode(username).map { user =>
        Ok(
          html.restricted(user)
        )
      }.getOrElse(Forbidden)
  }
}


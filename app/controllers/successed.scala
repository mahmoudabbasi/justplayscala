package controllers

import models.User
import play.api.mvc._
import views.html

/**
  * Created by Mabbasi on 10/10/2016.
  */
object successed extends Controller with Secured {

  /**
    * Display restricted area only if user is logged in.
    */
  def index = IsAuthenticated { username =>
    _ =>
      User.findByNationalCode(username).map { user =>
        Ok(
          html.success(user.NAME)
        )
      }.getOrElse(Forbidden)
  }
}

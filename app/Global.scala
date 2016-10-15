import models.User
import play.api.{Application, GlobalSettings}

/**
  * Created by Mabbasi on 10/09/2016.
  */
object Global extends GlobalSettings {
  override def onStart(app: Application): Unit = {
    InitialData.Insert();
  }
}

object InitialData {
  def Insert() = {
    if (User.findAll.isEmpty) {
      Seq(
        User("user1@company.com", "User One", "secret"),
        User("user2@company.com", "User Two", "secret"),
        User("user3@company.com", "User Three", "secret")
      ).foreach(User.create)
    }
  }

}
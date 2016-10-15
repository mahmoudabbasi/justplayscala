package models

import anorm.SqlParser._
import anorm._
import play.api.db.DB
import play.api.Play._

/**
  * Created by Mabbasi on 10/09/2016.
  */
case class User(NATIONALCODE: String, NAME: String, PASSWORD: String)


object User {

  //  Parse a User from a ResultSet
  val simple = {
    get[String]("user.NATIONALCODE") ~
      get[String]("user.NAME") ~
      get[String]("user.PASSWORD") map {
      case nationalcode ~ name ~ password => User(nationalcode, name, password)
    }
  }

  def findByNationalCode(NationalCode: String): Option[User] = {
    DB.withConnection {
      implicit connetion =>
        SQL("select * from PRACTICE.USER where NATIONALCODE={nationalCode}").on(
          'nationalCode -> NationalCode).as(User.simple.singleOpt)
    }
  }

  def findAll: Seq[User] = {
    DB.withConnection {
      implicit connetion =>
        SQL("select * from PRACTICE.USER").as(User.simple *)
    }
  }

  def authendicate(national: String, pass: String): Option[User] = {
    DB.withConnection {
      implicit connection =>
        SQL("select * from PRACTICE.USER where NATIONALCODE={nationalCode} and PASSWORD ={password}").on(
          'nationalCode -> national,
          'password -> pass).as(User.simple.singleOpt)
    }
  }

  def createUser(nationalcode: String, name: String, password: String) = {
    val ss = User(nationalcode, name, password);
    create(ss)

  }

  def create(user: User): User = {
    DB.withConnection { implicit connection =>
      SQL(
        """
                insert into PRACTICE.USER values (
                  {nationalCode}, {name}, {password}
                )
        """).on(
        'nationalCode -> user.NATIONALCODE,
        'name -> user.NAME,
        'password -> user.PASSWORD).executeUpdate()
      user
    }
  }
}

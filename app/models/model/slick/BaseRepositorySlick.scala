package models.model.slick

import scala.slick.driver.JdbcDriver.simple._

/**
  * Created by Mabbasi on 10/24/2016.
  */
object DriverHelper {
  val user = "db2inst1"
  val url = "jdbc:db2://192.168.53.62:50000/startapi"
  val password = "123"
  val jdbcDriver = "com.ibm.db2.jcc.DB2Driver"
  val db = Database.forURL(url, user, password, driver = jdbcDriver)
}






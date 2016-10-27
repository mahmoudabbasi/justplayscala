package models.model.slick

import scala.slick.driver.JdbcDriver.simple._
import scala.slick.jdbc.meta.MTable


/**
  * Created by Mabbasi on 10/27/2016.
  */
object Hello {
  def main(args: Array[String]) {
    val user = "db2inst1"
    val url = "jdbc:db2://192.168.53.62:50000/startapi"
    val password = "123"
    val jdbcDriver = "com.ibm.db2.jcc.DB2Driver"

    val db = Database.forURL(url, user, password, driver = jdbcDriver)

    create(db);

  }

  def createIfNotExists(tables: TableQuery[_ <: Table[_]]*)(implicit session: Session) {
    tables foreach {table => if(MTable.getTables(table.baseTableRow.tableName).list.isEmpty) table.ddl.create}
  }

  def create(db :Database) = {
    val suppliers = TableQuery[Suppliers]
    val coffees = TableQuery[Coffees]
    db.withSession {  implicit session =>
      createIfNotExists(suppliers)
    }
//    db.withSession {
//      implicit session =>
//        suppliers.ddl.create
//        coffees.ddl.create
//    }
  }


}



class Suppliers(tag: Tag) extends Table[(Int, String, String, String, String, String)](tag,Some("PRACTICE"), "SUPPLIERS") {
  def id = column[Int]("SUP_ID", O.PrimaryKey) // This is the primary key column
  def name = column[String]("SUP_NAME")
  def street = column[String]("STREET")
  def city = column[String]("CITY")
  def state = column[String]("STATE")
  def zip = column[String]("ZIP")
  // Every table needs a * projection with the same type as the table's type parameter
  def * = (id, name, street, city, state, zip)
}


class Coffees(tag: Tag) extends Table[(String, Int, Double, Int, Int)](tag, Some("PRACTICE"),"COFFEES") {
  def name = column[String]("COF_NAME", O.PrimaryKey)
  def supID = column[Int]("SUP_ID")
  def price = column[Double]("PRICE")
  def sales = column[Int]("SALES")
  def total = column[Int]("TOTAL")
  def * = (name, supID, price, sales, total)
  // A reified foreign key relation that can be navigated to create a join
  def supplier = foreignKey("SUP_FK", supID, TableQuery[Suppliers])(_.id)
}

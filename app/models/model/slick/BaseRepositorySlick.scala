package models.model.slick



/**
  * Created by Mabbasi on 10/24/2016.
  */
/*object DriverHelper {

  val user = "db2inst1"
  val url = "jdbc:db2://192.168.53.62:50000/startapi"
  val password = "123"
  val jdbcDriver = "com.ibm.db2.jcc.DB2Driver"

  val db = Database.forURL(url, user, password, driver = jdbcDriver)

  val suppliers: TableQuery[Suppliers] = TableQuery[Suppliers]
  //val coffees: TableQuery[Coffees] = TableQuery[Coffees]


  def init(tables: Seq[TableQuery[_ <: Table[_]]]) {
    db withSession { implicit session =>
      tables.map(_.ddl).reduce(_ ++ _).create
    }
  }

}*/


/*class Suppliers(tag: Tag) extends Table[(Int, String, String, String, String, String)](tag,Some("PRACTICE"), "SUPPLIERS") {
  def id = column[Int]("SUP_ID", O.PrimaryKey) // This is the primary key column
  def name = column[String]("SUP_NAME")
  def street = column[String]("STREET")
  def city = column[String]("CITY")
  def state = column[String]("STATE")
  def zip = column[String]("ZIP")
  // Every table needs a * projection with the same type as the table's type parameter
  def * = (id, name, street, city, state, zip)
}*/


/*class Coffees(tag: Tag) extends Table[(String, Int, Double, Int, Int)](tag, Some("PRACTICE"),"COFFEES") {
  def name = column[String]("COF_NAME", O.PrimaryKey)
  def supID = column[Int]("SUP_ID")
  def price = column[Double]("PRICE")
  def sales = column[Int]("SALES")
  def total = column[Int]("TOTAL")
  def * = (name, supID, price, sales, total)
  // A reified foreign key relation that can be navigated to create a join
  def supplier = foreignKey("SUP_FK", supID, TableQuery[Suppliers])(_.id)
}*/









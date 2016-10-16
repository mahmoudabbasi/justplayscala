package models

import java.util.Date

import anorm.SqlParser._
import anorm._
import play.api.db.DB
import play.api.Play.current
/**
  * Created by Mabbasi on 10/03/2016.
  */
case class Employee (ID: Long, NAME: String, ADDRESS: String, DOB: Date, JOININGDATE: Date, DESIGNATION: String )

case class Page[A](items: Seq[A], page: Int, offset: Long, total: Long) {
  lazy val prev = Option(page - 1).filter(_ >= 0)
  lazy val next = Option(page + 1).filter(_ => (offset + items.size) < total)
}

object Employee {


  val employee = {
    get[Long]("employee.id") ~
      get[String]("employee.name") ~
      get[String]("employee.address") ~
      get[Date]("employee.dob") ~
      get[Date]("employee.joiningdate") ~
      get[String]("employee.designation") map {
      case id ~
        name ~
        address ~
        dob ~
        joiningDate ~
        designation => Employee(id, name, address, dob, joiningDate, designation)
    }
  }

  def findById(id:Long) :Option[Employee] ={
    DB.withConnection { implicit connection =>
      SQL("select * from PRACTICE.EMPLOYEE where ID = {id}").on('id -> id).as(employee.singleOpt)
    }
  }

  def list( page :Int=0 , pageSize:Int=10,orderBy: Int=1,filter:String="%"):Page[Employee]={

    val offest = pageSize * page
    DB.withConnection { implicit connection=> val employees = SQL(
      """
          select * from PRACTICE.EMPLOYEE
      """
    ).on(
      'pageSize -> pageSize,
      'offset -> offest,
      'filter -> filter,
      'orderBy -> orderBy
    ).as(employee *)

      val totalRows = SQL(
        """
          select count(*) from PRACTICE.EMPLOYEE
        """
      ).on(
        'filter -> filter
      ).as(scalar[Long].single)

      Page(employees, page, offest, totalRows)

    }


  }

  def insert(employee: Employee): Option[Long] = {
    DB.withConnection { implicit connection =>
      SQL(
        """
          insert into PRACTICE.EMPLOYEE ( NAME, ADDRESS, DOB, JOININGDATE, DESIGNATION ) values (

    		{NAME}, {ADDRESS}, {DOB}, {JOININGDATE}, {DESIGNATION}
          )
        """).on(
        //   'ID -> None,
        'NAME -> employee.NAME,
        'ADDRESS -> employee.ADDRESS,
        'DOB -> employee.DOB,
        'JOININGDATE -> employee.JOININGDATE,
        'DESIGNATION -> employee.DESIGNATION).executeInsert()
    }
  }

  def update(id: Long, employee: Employee): Int = {
    DB.withConnection { implicit connection =>
      SQL(
        """
          update PRACTICE.EMPOLYEE
          set NAME = {name}, ADDRESS = {address}, DOB = {dob}, JOININGDATE = {joiningDate}, DESIGNATION = {designation}
          where ID = {id}
        """).on(
        'id -> id,
        'name -> employee.NAME,
        'address -> employee.ADDRESS,
        'dob -> employee.DOB,
        'joiningDate -> employee.JOININGDATE,
        'designation -> employee.DESIGNATION).executeUpdate()
    }
  }

  def delete(id: Long): Int = {
    DB.withConnection { implicit connection =>
      SQL("delete from PRACTICE.EMPLOYEE where ID = {id}").on('id -> id).executeUpdate()
    }
  }

}

package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
import models.Employee
/**/
object formElements extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Employee],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(employeeForm: Form[Employee]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*7.2*/implicitFieldConstructor/*7.26*/ = {{ FieldConstructor(twitterBootstrapInput.f) }};
Seq[Any](format.raw/*3.32*/("""

"""),format.raw/*6.1*/("""
"""),format.raw/*7.75*/("""

"""),_display_(/*9.2*/inputText(employeeForm("NAME"), '_label -> "Name", 'class -> "form-control")),format.raw/*9.78*/("""
"""),_display_(/*10.2*/inputText(employeeForm("ADDRESS"), '_label -> "Address", 'class -> "form-control")),format.raw/*10.84*/("""
"""),_display_(/*11.2*/inputText(employeeForm("DOB"), '_label -> "Date of Birth", 'class -> "form-control")),format.raw/*11.86*/("""
"""),_display_(/*12.2*/inputText(employeeForm("JOININGDATE"), '_label -> "Joining Date", 'class -> "form-control")),format.raw/*12.93*/("""
"""),_display_(/*13.2*/inputText(employeeForm("DESIGNATION"), '_label -> "Designation", 'class -> "form-control")))}
  }

  def render(employeeForm:Form[Employee]): play.twirl.api.HtmlFormat.Appendable = apply(employeeForm)

  def f:((Form[Employee]) => play.twirl.api.HtmlFormat.Appendable) = (employeeForm) => apply(employeeForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Oct 16 08:21:44 IRST 2016
                  SOURCE: D:/project/Lesson1/justplayscala/app/views/formElements.scala.html
                  HASH: aaa760a5c9377d6153e1a0636df191b4cc0aac97
                  MATRIX: 542->28|667->83|699->107|778->58|808->80|837->156|867->161|963->237|992->240|1095->322|1124->325|1229->409|1258->412|1370->503|1399->506
                  LINES: 19->3|21->7|21->7|22->3|24->6|25->7|27->9|27->9|28->10|28->10|29->11|29->11|30->12|30->12|31->13
                  -- GENERATED --
              */
          
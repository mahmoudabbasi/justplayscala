
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
object createForm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Employee],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(employeeForm: Form[Employee]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.32*/("""




"""),_display_(/*7.2*/main("Employee-Self-Service")/*7.31*/ {_display_(Seq[Any](format.raw/*7.33*/("""
  """),format.raw/*8.3*/("""<!-- Begin page content -->
  <div class="container">
    <div class="page-header">
      <h1>Add an employee</h1>
    </div>

  </div>
""")))}))}
  }

  def render(employeeForm:Form[Employee]): play.twirl.api.HtmlFormat.Appendable = apply(employeeForm)

  def f:((Form[Employee]) => play.twirl.api.HtmlFormat.Appendable) = (employeeForm) => apply(employeeForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Oct 03 17:21:39 IRST 2016
                  SOURCE: D:/project/Lesson1/justplayscala/app/views/createForm.scala.html
                  HASH: 508f8a95b649ea29b35b861ea07ede27f84dde6b
                  MATRIX: 540->26|658->56|694->67|731->96|770->98|800->102
                  LINES: 19->2|22->2|27->7|27->7|27->7|28->8
                  -- GENERATED --
              */
          
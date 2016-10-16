
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
object createFormEmployee extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Employee],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(employeeForm: Form[Employee]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*6.2*/implicitFieldConstructor/*6.26*/ = {{ FieldConstructor(twitterBootstrapInput.f)}};
Seq[Any](format.raw/*2.32*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*6.74*/("""

"""),_display_(/*8.2*/main("Employee-Self-Service")/*8.31*/ {_display_(Seq[Any](format.raw/*8.33*/("""
  """),format.raw/*9.3*/("""<!-- Begin page content -->
  <div class="container">
    <div class="page-header">
      <h1>Add an employee</h1>
    </div>

    <div class="row">
      <div class="col-md-8">
      """),_display_(/*17.8*/form(routes.Restricted.save())/*17.38*/ {_display_(Seq[Any](format.raw/*17.40*/("""
        """),format.raw/*18.9*/("""<fieldset>"""),_display_(/*18.20*/formElements(employeeForm)),format.raw/*18.46*/("""</fieldset>

        <div class="actions">
          <input type="submit" value="Create this employee" class="btn btn-primary"> or
          <a href=""""),_display_(/*22.21*/routes/*22.27*/.Restricted.list()),format.raw/*22.45*/("""" class="btn btn-default">Cancel</a>
        </div>
      """)))}),format.raw/*24.8*/("""
      """),format.raw/*25.7*/("""</div>
      <div class="col-md-4">
      """),_display_(/*27.8*/info()),format.raw/*27.14*/("""
      """),format.raw/*28.7*/("""</div>
    </div>
  </div>
""")))}),format.raw/*31.2*/("""
"""))}
  }

  def render(employeeForm:Form[Employee]): play.twirl.api.HtmlFormat.Appendable = apply(employeeForm)

  def f:((Form[Employee]) => play.twirl.api.HtmlFormat.Appendable) = (employeeForm) => apply(employeeForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Oct 16 08:21:44 IRST 2016
                  SOURCE: D:/project/Lesson1/justplayscala/app/views/createFormEmployee.scala.html
                  HASH: a69991518147ead668894d58932e3ce7c37dd8fb
                  MATRIX: 548->26|673->81|705->105|783->56|813->78|842->153|872->158|909->187|948->189|978->193|1197->386|1236->416|1276->418|1313->428|1351->439|1398->465|1580->620|1595->626|1634->644|1725->705|1760->713|1831->758|1858->764|1893->772|1954->803
                  LINES: 19->2|21->6|21->6|22->2|24->5|25->6|27->8|27->8|27->8|28->9|36->17|36->17|36->17|37->18|37->18|37->18|41->22|41->22|41->22|43->24|44->25|46->27|46->27|47->28|50->31
                  -- GENERATED --
              */
          
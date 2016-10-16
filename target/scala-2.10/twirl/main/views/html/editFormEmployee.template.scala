
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
object editFormEmployee extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,Form[Employee],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(id: Long, employeeForm: Form[Employee]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {import helper._
implicit def /*7.2*/implicitFieldConstructor/*7.26*/ = {{ FieldConstructor(twitterBootstrapInput.f) }};
Seq[Any](format.raw/*3.42*/("""

"""),format.raw/*6.1*/("""
"""),format.raw/*7.75*/("""

"""),_display_(/*9.2*/main("Employee-Self-Service")/*9.31*/ {_display_(Seq[Any](format.raw/*9.33*/("""

  """),format.raw/*11.3*/("""<!-- Begin page content -->
  <div class="container">
    <div class="page-header">
      <h1>Edit employee</h1>
    </div>

    <div class="row">
      <div class="col-md-8">
      """),_display_(/*19.8*/form(routes.Restricted.update(id))/*19.42*/ {_display_(Seq[Any](format.raw/*19.44*/("""
        """),format.raw/*20.9*/("""<fieldset>
        """),_display_(/*21.10*/formElements(employeeForm)),format.raw/*21.36*/("""
        """),format.raw/*22.9*/("""</fieldset>

        <div class="actions">
          <input type="submit" value="Save this employee"	class="btn btn-primary"> or
          <a href=""""),_display_(/*26.21*/routes/*26.27*/.Restricted.list()),format.raw/*26.45*/("""" class="btn btn-default">Cancel</a>
        </div>
      """)))}),format.raw/*28.8*/("""
      """),format.raw/*29.7*/("""</div>
      <div class="col-md-4">
      """),_display_(/*31.8*/info()),format.raw/*31.14*/("""
      """),format.raw/*32.7*/("""</div>
    </div>

    """),_display_(/*35.6*/form(routes.Restricted.delete(id), 'class -> "topRight")/*35.62*/ {_display_(Seq[Any](format.raw/*35.64*/("""
      """),format.raw/*36.7*/("""<input type="submit" value="Delete this employee" class="btn btn-danger">
      """)))}),format.raw/*37.8*/("""
  """),format.raw/*38.3*/("""</div>
""")))}),format.raw/*39.2*/("""
"""))}
  }

  def render(id:Long,employeeForm:Form[Employee]): play.twirl.api.HtmlFormat.Appendable = apply(id,employeeForm)

  def f:((Long,Form[Employee]) => play.twirl.api.HtmlFormat.Appendable) = (id,employeeForm) => apply(id,employeeForm)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Oct 16 08:21:44 IRST 2016
                  SOURCE: D:/project/Lesson1/justplayscala/app/views/editFormEmployee.scala.html
                  HASH: aaf482ebe240d60b852280fdb51d7db8fc0f6c1c
                  MATRIX: 551->28|686->93|718->117|797->68|827->90|856->166|886->171|923->200|962->202|995->208|1212->399|1255->433|1295->435|1332->445|1380->466|1427->492|1464->502|1644->655|1659->661|1698->679|1789->740|1824->748|1895->793|1922->799|1957->807|2010->834|2075->890|2115->892|2150->900|2262->982|2293->986|2332->995
                  LINES: 19->3|21->7|21->7|22->3|24->6|25->7|27->9|27->9|27->9|29->11|37->19|37->19|37->19|38->20|39->21|39->21|40->22|44->26|44->26|44->26|46->28|47->29|49->31|49->31|50->32|53->35|53->35|53->35|54->36|55->37|56->38|57->39
                  -- GENERATED --
              */
          
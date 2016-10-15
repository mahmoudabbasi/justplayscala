
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

/**/
object login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[scala.Tuple2[String, String]],Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[(String,String)])(implicit flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.54*/("""

"""),_display_(/*3.2*/main("sample valid")/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""



  """),_display_(/*7.4*/helper/*7.10*/.form(routes.Authentication.authenticate)/*7.51*/ {_display_(Seq[Any](format.raw/*7.53*/("""

    """),_display_(/*9.6*/form/*9.10*/.globalError.map/*9.26*/ { error =>_display_(Seq[Any](format.raw/*9.37*/("""
      """),format.raw/*10.7*/("""<p class="error">
        """),_display_(/*11.10*/error/*11.15*/.message),format.raw/*11.23*/("""
      """),format.raw/*12.7*/("""</p>
    """)))}),format.raw/*13.6*/("""

    """),_display_(/*15.6*/flash/*15.11*/.get("success").map/*15.30*/ { message =>_display_(Seq[Any](format.raw/*15.43*/("""
      """),format.raw/*16.7*/("""<p class="success">
        """),_display_(/*17.10*/message),format.raw/*17.17*/("""
      """),format.raw/*18.7*/("""</p>
    """)))}),format.raw/*19.6*/("""

    """),format.raw/*21.5*/("""<div class="container">
      <div class="row">
        <div class="col-md-4 col-md-offset-6">
          <h1>login user</h1>

          <p>Please your credentials.</p>
    <p>
      <input type="email" name="NATIONALCODE" placeholder="Email" id="NATIONALCODE" value=""""),_display_(/*28.93*/form("NATIONALCODE")/*28.113*/.value),format.raw/*28.119*/("""">
    </p>
    <p>
      <input type="password" name="PASSWORD" id="PASSWORD" placeholder="Password">
    </p>
    <p>
      <button type="submit" id="loginbutton">Login</button>
    </p>

    </div>
    </div>
    </div>
  """)))}),format.raw/*40.4*/("""


""")))}))}
  }

  def render(form:Form[scala.Tuple2[String, String]],flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(form)(flash)

  def f:((Form[scala.Tuple2[String, String]]) => (Flash) => play.twirl.api.HtmlFormat.Appendable) = (form) => (flash) => apply(form)(flash)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Oct 15 13:22:30 IRST 2016
                  SOURCE: D:/project/Lesson1/justplayscala/app/views/login.scala.html
                  HASH: 4641885aa765a48c33f30a8ff789e7d0b6de5daf
                  MATRIX: 539->1|679->53|709->58|737->78|776->80|812->91|826->97|875->138|914->140|948->149|960->153|984->169|1032->180|1067->188|1122->216|1136->221|1165->229|1200->237|1241->248|1276->257|1290->262|1318->281|1369->294|1404->302|1461->332|1489->339|1524->347|1565->358|1600->366|1902->641|1932->661|1960->667|2228->905
                  LINES: 19->1|22->1|24->3|24->3|24->3|28->7|28->7|28->7|28->7|30->9|30->9|30->9|30->9|31->10|32->11|32->11|32->11|33->12|34->13|36->15|36->15|36->15|36->15|37->16|38->17|38->17|39->18|40->19|42->21|49->28|49->28|49->28|61->40
                  -- GENERATED --
              */
          
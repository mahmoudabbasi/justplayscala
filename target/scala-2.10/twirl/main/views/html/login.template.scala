
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

"""),_display_(/*3.2*/main("Welcome to Play! Login Sample - Restricted Area")/*3.57*/ {_display_(Seq[Any](format.raw/*3.59*/("""

  """),format.raw/*5.3*/("""<h1>login user</h1>

  <p>Please provide your credentials.</p>

  """),_display_(/*9.4*/helper/*9.10*/.form(routes.Authentication.authenticate)/*9.51*/ {_display_(Seq[Any](format.raw/*9.53*/("""

    """),_display_(/*11.6*/form/*11.10*/.globalError.map/*11.26*/ { error =>_display_(Seq[Any](format.raw/*11.37*/("""
      """),format.raw/*12.7*/("""<p class="error">
        """),_display_(/*13.10*/error/*13.15*/.message),format.raw/*13.23*/("""
      """),format.raw/*14.7*/("""</p>
    """)))}),format.raw/*15.6*/("""

    """),_display_(/*17.6*/flash/*17.11*/.get("success").map/*17.30*/ { message =>_display_(Seq[Any](format.raw/*17.43*/("""
      """),format.raw/*18.7*/("""<p class="success">
        """),_display_(/*19.10*/message),format.raw/*19.17*/("""
      """),format.raw/*20.7*/("""</p>
    """)))}),format.raw/*21.6*/("""

    """),format.raw/*23.5*/("""<p>
      <input type="email" name="NATIONALCODE" placeholder="Email" id="NATIONALCODE" value=""""),_display_(/*24.93*/form("NATIONALCODE")/*24.113*/.value),format.raw/*24.119*/("""">
    </p>
    <p>
      <input type="password" name="PASSWORD" id="PASSWORD" placeholder="Password">
    </p>
    <p>
      <button type="submit" id="loginbutton">Login</button>
    </p>

  """)))}),format.raw/*33.4*/("""

  """),format.raw/*35.3*/("""<p class="note">
    Try <em>user1@company.com</em> with <em>secret</em> as password.
  </p>
""")))}))}
  }

  def render(form:Form[scala.Tuple2[String, String]],flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(form)(flash)

  def f:((Form[scala.Tuple2[String, String]]) => (Flash) => play.twirl.api.HtmlFormat.Appendable) = (form) => (flash) => apply(form)(flash)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Oct 10 13:48:03 IRST 2016
                  SOURCE: D:/project/Lesson1/justplayscala/app/views/login.scala.html
                  HASH: 0551cb12d46295b0123189a6573f16256a879a80
                  MATRIX: 539->1|679->53|709->58|772->113|811->115|843->121|939->192|953->198|1002->239|1041->241|1076->250|1089->254|1114->270|1163->281|1198->289|1253->317|1267->322|1296->330|1331->338|1372->349|1407->358|1421->363|1449->382|1500->395|1535->403|1592->433|1620->440|1655->448|1696->459|1731->467|1855->564|1885->584|1913->590|2145->792|2178->798
                  LINES: 19->1|22->1|24->3|24->3|24->3|26->5|30->9|30->9|30->9|30->9|32->11|32->11|32->11|32->11|33->12|34->13|34->13|34->13|35->14|36->15|38->17|38->17|38->17|38->17|39->18|40->19|40->19|41->20|42->21|44->23|45->24|45->24|45->24|54->33|56->35
                  -- GENERATED --
              */
          
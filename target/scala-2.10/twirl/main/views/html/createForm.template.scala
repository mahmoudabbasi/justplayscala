
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
object createform extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[User],Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[User])(implicit flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.43*/("""

"""),_display_(/*3.2*/main("Welcome to Create User Design")/*3.39*/ {_display_(Seq[Any](format.raw/*3.41*/("""

  """),format.raw/*5.3*/("""<h1>Create Login</h1>

  """),_display_(/*7.4*/helper/*7.10*/.form(routes.Authentication.authenticate1)/*7.52*/ {_display_(Seq[Any](format.raw/*7.54*/("""

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

    """),format.raw/*21.5*/("""<p>
      <input type="email" name="NATIONALCODE" placeholder="Email" id="NATIONALCODE" placeholder="nationalCode" >
    </p>
    <p>
      <input type="text" name="NAME" placeholder="Name" id="NAME" placeholder="Name">
    </p>

    <p>
      <input type="password" name="PASSWORD" id="PASSWORD" placeholder="Password">
    </p>
    <p>
      <button type="submit" id="loginbutton">Login</button>
    </p>

  """)))}),format.raw/*35.4*/("""


""")))}))}
  }

  def render(form:Form[User],flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(form)(flash)

  def f:((Form[User]) => (Flash) => play.twirl.api.HtmlFormat.Appendable) = (form) => (flash) => apply(form)(flash)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Oct 10 13:43:31 IRST 2016
                  SOURCE: D:/project/Lesson1/justplayscala/app/views/createform.scala.html
                  HASH: 2a424a3abeb3b6c1be6a9b78c88a3fe1c794d2cf
                  MATRIX: 520->1|649->42|679->47|724->84|763->86|795->92|848->120|862->126|912->168|951->170|985->179|997->183|1021->199|1069->210|1104->218|1159->246|1173->251|1202->259|1237->267|1278->278|1313->287|1327->292|1355->311|1406->324|1441->332|1498->362|1526->369|1561->377|1602->388|1637->396|2092->821
                  LINES: 19->1|22->1|24->3|24->3|24->3|26->5|28->7|28->7|28->7|28->7|30->9|30->9|30->9|30->9|31->10|32->11|32->11|32->11|33->12|34->13|36->15|36->15|36->15|36->15|37->16|38->17|38->17|39->18|40->19|42->21|56->35
                  -- GENERATED --
              */
          
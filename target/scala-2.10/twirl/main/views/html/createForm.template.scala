
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
object createform extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[scala.Tuple3[String, String, String]],Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[(String,String,String)])(implicit flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.61*/("""

"""),_display_(/*3.2*/main("Welcome to Create User Design")/*3.39*/ {_display_(Seq[Any](format.raw/*3.41*/("""

  """),format.raw/*5.3*/("""<div class="container">
    <div class="row">
      <div class="col-md-3 col-md-offset-4">
  <h1>Create Login</h1>

  """),_display_(/*10.4*/helper/*10.10*/.form(routes.Authentication.authenticate1)/*10.52*/ {_display_(Seq[Any](format.raw/*10.54*/("""

    """),_display_(/*12.6*/form/*12.10*/.globalError.map/*12.26*/ { error =>_display_(Seq[Any](format.raw/*12.37*/("""
      """),format.raw/*13.7*/("""<p class="error">
        """),_display_(/*14.10*/error/*14.15*/.message),format.raw/*14.23*/("""
      """),format.raw/*15.7*/("""</p>
    """)))}),format.raw/*16.6*/("""

    """),_display_(/*18.6*/flash/*18.11*/.get("success").map/*18.30*/ { message =>_display_(Seq[Any](format.raw/*18.43*/("""
      """),format.raw/*19.7*/("""<p class="success">
        """),_display_(/*20.10*/message),format.raw/*20.17*/("""
      """),format.raw/*21.7*/("""</p>
    """)))}),format.raw/*22.6*/("""
    """),format.raw/*23.5*/("""<form>
      <div class="form-group">
      <input class="form-control" type="email" name="NATIONALCODE" placeholder="Email" id="NATIONALCODE" placeholder="nationalCode" >
      </div>
      <div class="form-group">
      <input class="form-control" type="text" name="NAME" placeholder="Name" id="NAME" placeholder="Name">
      </div>
      <div class="form-group">
      <input class="form-control" type="password" name="PASSWORD" id="PASSWORD" placeholder="Password">
      </div>
      <div class="form-group">
          <button type="submit" id="loginbutton">Login</button>
      </div>
        </form>
  </div>
  </div>
  </div>

  """)))}),format.raw/*41.4*/("""


""")))}))}
  }

  def render(form:Form[scala.Tuple3[String, String, String]],flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(form)(flash)

  def f:((Form[scala.Tuple3[String, String, String]]) => (Flash) => play.twirl.api.HtmlFormat.Appendable) = (form) => (flash) => apply(form)(flash)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Oct 15 13:29:31 IRST 2016
                  SOURCE: D:/project/Lesson1/justplayscala/app/views/createform.scala.html
                  HASH: 5adfdb65237e7a23c2dba875e5ca13c48c5261fa
                  MATRIX: 552->1|699->60|729->65|774->102|813->104|845->110|995->234|1010->240|1061->282|1101->284|1136->293|1149->297|1174->313|1223->324|1258->332|1313->360|1327->365|1356->373|1391->381|1432->392|1467->401|1481->406|1509->425|1560->438|1595->446|1652->476|1680->483|1715->491|1756->502|1789->508|2476->1165
                  LINES: 19->1|22->1|24->3|24->3|24->3|26->5|31->10|31->10|31->10|31->10|33->12|33->12|33->12|33->12|34->13|35->14|35->14|35->14|36->15|37->16|39->18|39->18|39->18|39->18|40->19|41->20|41->20|42->21|43->22|44->23|62->41
                  -- GENERATED --
              */
          
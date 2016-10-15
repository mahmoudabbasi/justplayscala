
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
  def apply/*1.2*/(form: Form[(String, String, String)])(implicit flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.63*/("""

    """),_display_(/*3.6*/main("Welcome to Create User Design")/*3.43*/ {_display_(Seq[Any](format.raw/*3.45*/("""

        """),format.raw/*5.9*/("""<div class="container">
            <div class="row">
                <div class="col-md-3 col-md-offset-4">
                    <h1>Create Login</h1>

                    """),_display_(/*10.22*/helper/*10.28*/.form(routes.Authentication.authenticate1)/*10.70*/ {_display_(Seq[Any](format.raw/*10.72*/("""

                        """),_display_(/*12.26*/form/*12.30*/.globalError.map/*12.46*/ { error =>_display_(Seq[Any](format.raw/*12.57*/("""
                            """),format.raw/*13.29*/("""<p class="error">
                                """),_display_(/*14.34*/error/*14.39*/.message),format.raw/*14.47*/("""
                            """),format.raw/*15.29*/("""</p>
                        """)))}),format.raw/*16.26*/("""

                        """),_display_(/*18.26*/flash/*18.31*/.get("success").map/*18.50*/ { message =>_display_(Seq[Any](format.raw/*18.63*/("""
                            """),format.raw/*19.29*/("""<p class="success">
                                """),_display_(/*20.34*/message),format.raw/*20.41*/("""
                            """),format.raw/*21.29*/("""</p>
                        """)))}),format.raw/*22.26*/("""
                        """),format.raw/*23.25*/("""<form>
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
                                <button class="btn btn-default" type="submit" id="loginbutton">Login</button>
                            </div>
                        </form>
                    </div>
            </div>
        </div>

    """)))}),format.raw/*41.6*/("""


    """)))}))}
  }

  def render(form:Form[scala.Tuple3[String, String, String]],flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(form)(flash)

  def f:((Form[scala.Tuple3[String, String, String]]) => (Flash) => play.twirl.api.HtmlFormat.Appendable) = (form) => (flash) => apply(form)(flash)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Oct 15 13:44:57 IRST 2016
                  SOURCE: D:/project/Lesson1/justplayscala/app/views/createform.scala.html
                  HASH: c558abcc4910826acab0efb3745bda1ddd2f7338
                  MATRIX: 552->1|701->62|735->71|780->108|819->110|857->122|1062->300|1077->306|1128->348|1168->350|1224->379|1237->383|1262->399|1311->410|1369->440|1448->492|1462->497|1491->505|1549->535|1611->566|1667->595|1681->600|1709->619|1760->632|1818->662|1899->716|1927->723|1985->753|2047->784|2101->810|3140->1819
                  LINES: 19->1|22->1|24->3|24->3|24->3|26->5|31->10|31->10|31->10|31->10|33->12|33->12|33->12|33->12|34->13|35->14|35->14|35->14|36->15|37->16|39->18|39->18|39->18|39->18|40->19|41->20|41->20|42->21|43->22|44->23|62->41
                  -- GENERATED --
              */
          

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
  def apply/*1.2*/(form: Form[(String, String)])(implicit flash: Flash):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.55*/("""

"""),_display_(/*3.2*/main("sample valid")/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""


    """),_display_(/*6.6*/helper/*6.12*/.form(routes.Authentication.authenticate)/*6.53*/ {_display_(Seq[Any](format.raw/*6.55*/("""




        """),format.raw/*11.9*/("""<div class="container">
            <div class="row">
                <div class="col-md-3 col-md-offset-4">
                    """),_display_(/*14.22*/form/*14.26*/.globalError.map/*14.42*/ { error =>_display_(Seq[Any](format.raw/*14.53*/("""
                        """),format.raw/*15.25*/("""<p class="error">
                            """),_display_(/*16.30*/error/*16.35*/.message),format.raw/*16.43*/("""
                        """),format.raw/*17.25*/("""</p>
                    """)))}),format.raw/*18.22*/("""
                    """),_display_(/*19.22*/flash/*19.27*/.get("success").map/*19.46*/ { message =>_display_(Seq[Any](format.raw/*19.59*/("""
                        """),format.raw/*20.25*/("""<p class="success">
                            """),_display_(/*21.30*/message),format.raw/*21.37*/("""
                        """),format.raw/*22.25*/("""</p>
                    """)))}),format.raw/*23.22*/("""
                    """),format.raw/*24.21*/("""<h1>login user</h1>

                    <p>Please your credentials.</p>

                    <form role="form" data-toggle="validator">
                        <div class="form-group">
                            <input class="form-control" type="email" name="NATIONALCODE" placeholder="Email" id="NATIONALCODE" value=""""),_display_(/*30.136*/form("NATIONALCODE")/*30.156*/.value),format.raw/*30.162*/("""" required>
                        </div>
                        <div class="form-group">
                            <input class="form-control" type="password" name="PASSWORD" id="PASSWORD" placeholder="Password" required>
                        </div>
                        <div class="form-group">
                            <button class="btn btn-default" type="submit" id="loginbutton">Login</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    """)))}),format.raw/*42.6*/("""


""")))}))}
  }

  def render(form:Form[scala.Tuple2[String, String]],flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(form)(flash)

  def f:((Form[scala.Tuple2[String, String]]) => (Flash) => play.twirl.api.HtmlFormat.Appendable) = (form) => (flash) => apply(form)(flash)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Oct 15 13:50:15 IRST 2016
                  SOURCE: D:/project/Lesson1/justplayscala/app/views/login.scala.html
                  HASH: feb17d30ebace549034cc7770ca3c4e9450000ae
                  MATRIX: 539->1|680->54|710->59|738->79|777->81|813->92|827->98|876->139|915->141|960->159|1120->292|1133->296|1158->312|1207->323|1261->349|1336->397|1350->402|1379->410|1433->436|1491->463|1541->486|1555->491|1583->510|1634->523|1688->549|1765->599|1793->606|1847->632|1905->659|1955->681|2310->1008|2340->1028|2368->1034|2944->1580
                  LINES: 19->1|22->1|24->3|24->3|24->3|27->6|27->6|27->6|27->6|32->11|35->14|35->14|35->14|35->14|36->15|37->16|37->16|37->16|38->17|39->18|40->19|40->19|40->19|40->19|41->20|42->21|42->21|43->22|44->23|45->24|51->30|51->30|51->30|63->42
                  -- GENERATED --
              */
          
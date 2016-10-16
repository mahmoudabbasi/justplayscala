
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

                        """),format.raw/*16.25*/("""<div class="alert alert-danger">
                            <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                            <strong>  """),_display_(/*18.40*/error/*18.45*/.message),format.raw/*18.53*/("""</strong>
                        </div>

                    """)))}),format.raw/*21.22*/("""
                    """),_display_(/*22.22*/flash/*22.27*/.get("success").map/*22.46*/ { message =>_display_(Seq[Any](format.raw/*22.59*/("""
                        """),format.raw/*23.25*/("""<div class="alert alert-success">
                            <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                            <strong> """),_display_(/*25.39*/message),format.raw/*25.46*/("""</strong>
                        </div>

                    """)))}),format.raw/*28.22*/("""
                    """),format.raw/*29.21*/("""<h1>login user</h1>

                    <p>Please your credentials.</p>

                    <form role="form" data-toggle="validator">
                        <div class="form-group">
                            <label for="NATIONALCODE">email:</label>
                            <input class="form-control" type="email" name="NATIONALCODE" placeholder="Email" id="NATIONALCODE" value=""""),_display_(/*36.136*/form("NATIONALCODE")/*36.156*/.value),format.raw/*36.162*/("""" required>
                        </div>
                        <div class="form-group">
                            <label for="PASSWORD">password:</label>
                            <input class="form-control" type="password" name="PASSWORD" id="PASSWORD" placeholder="Password" required>
                        </div>
                        <div class="form-group">
                            <button class="btn btn-default" type="submit" id="loginbutton">Login</button>
                            <a class="btn btn-default" href=""""),_display_(/*44.63*/routes/*44.69*/.Authentication.create),format.raw/*44.91*/("""">Create User</a>

                        </div>

                    </form>
                </div>
            </div>
        </div>
    """)))}),format.raw/*52.6*/("""


""")))}))}
  }

  def render(form:Form[scala.Tuple2[String, String]],flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(form)(flash)

  def f:((Form[scala.Tuple2[String, String]]) => (Flash) => play.twirl.api.HtmlFormat.Appendable) = (form) => (flash) => apply(form)(flash)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Oct 15 16:08:59 IRST 2016
                  SOURCE: D:/project/Lesson1/justplayscala/app/views/login.scala.html
                  HASH: 50d10ba091f91a4eb38e5613c5eea495a08ee3a5
                  MATRIX: 539->1|680->54|710->59|738->79|777->81|813->92|827->98|876->139|915->141|960->159|1120->292|1133->296|1158->312|1207->323|1263->351|1470->531|1484->536|1513->544|1610->610|1660->633|1674->638|1702->657|1753->670|1807->696|2014->876|2042->883|2139->949|2189->971|2614->1368|2644->1388|2672->1394|3250->1945|3265->1951|3308->1973|3487->2122
                  LINES: 19->1|22->1|24->3|24->3|24->3|27->6|27->6|27->6|27->6|32->11|35->14|35->14|35->14|35->14|37->16|39->18|39->18|39->18|42->21|43->22|43->22|43->22|43->22|44->23|46->25|46->25|49->28|50->29|57->36|57->36|57->36|65->44|65->44|65->44|73->52
                  -- GENERATED --
              */
          
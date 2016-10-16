
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](_display_(/*1.2*/main("Login test")/*1.20*/ {_display_(Seq[Any](format.raw/*1.22*/("""

    """),format.raw/*3.5*/("""<div class="container">
        <div class="row">
            <div class="col-md-3 col-md-offset-4">
                <div class="container">
                    <ul class="list-inline">
                        <h1>login test</h1>
                        <h3>list selected login</h3>

                        <li><a href=""""),_display_(/*11.39*/routes/*11.45*/.Authentication.login),format.raw/*11.66*/("""">Login</a></li>
                        <li><a href=""""),_display_(/*12.39*/routes/*12.45*/.Restricted.index1),format.raw/*12.63*/("""">Restricted Area</a></li>
                        <li><a href=""""),_display_(/*13.39*/routes/*13.45*/.Authentication.create),format.raw/*13.67*/("""">Create User</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Oct 16 08:50:00 IRST 2016
                  SOURCE: D:/project/Lesson1/justplayscala/app/views/index.scala.html
                  HASH: 7365597dc02eaa8d418dfe1af645a7e5d82301ba
                  MATRIX: 580->1|606->19|645->21|679->29|1036->359|1051->365|1093->386|1176->442|1191->448|1230->466|1323->532|1338->538|1381->560
                  LINES: 22->1|22->1|22->1|24->3|32->11|32->11|32->11|33->12|33->12|33->12|34->13|34->13|34->13
                  -- GENERATED --
              */
          

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
    <h1>login test</h1>

    <p>list selected login</p>

    <ul>
        <li><a href=""""),_display_(/*11.23*/routes/*11.29*/.Authentication.login),format.raw/*11.50*/("""">Login</a></li>
        <li><a href=""""),_display_(/*12.23*/routes/*12.29*/.Restricted.index),format.raw/*12.46*/("""">Restricted Area</a></li>
        <li><a href=""""),_display_(/*13.23*/routes/*13.29*/.Authentication.create),format.raw/*13.51*/("""">Create User</a></li>
    </ul>
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
                  DATE: Sat Oct 15 13:30:08 IRST 2016
                  SOURCE: D:/project/Lesson1/justplayscala/app/views/index.scala.html
                  HASH: 28a7ed0a35db1703af1d2b0d892b2a974e0ab197
                  MATRIX: 580->1|606->19|645->21|679->29|903->226|918->232|960->253|1027->293|1042->299|1080->316|1157->366|1172->372|1215->394
                  LINES: 22->1|22->1|22->1|24->3|32->11|32->11|32->11|33->12|33->12|33->12|34->13|34->13|34->13
                  -- GENERATED --
              */
          
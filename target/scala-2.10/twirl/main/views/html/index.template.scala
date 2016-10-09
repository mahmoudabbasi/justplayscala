
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

Seq[Any](_display_(/*1.2*/main("Welcome to Play! Login Sample")/*1.39*/ {_display_(Seq[Any](format.raw/*1.41*/("""

    """),format.raw/*3.5*/("""<h1>Play! Login Sample</h1>

    <p>You are in the public area where no authentication is required</p>

    <ul>
        <li><a href=""""),_display_(/*8.23*/routes/*8.29*/.Authentication.login),format.raw/*8.50*/("""">Login</a></li>
        <li><a href=""""),_display_(/*9.23*/routes/*9.29*/.Restricted.index),format.raw/*9.46*/("""">Restricted Area</a></li>
    </ul>

""")))}))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Oct 09 13:31:14 IRST 2016
                  SOURCE: D:/project/Lesson1/justplayscala/app/views/index.scala.html
                  HASH: 3ebf3f044d85af1a8f2986ce23391de5b73219ae
                  MATRIX: 580->1|625->38|664->40|698->48|864->188|878->194|919->215|985->255|999->261|1036->278
                  LINES: 22->1|22->1|22->1|24->3|29->8|29->8|29->8|30->9|30->9|30->9
                  -- GENERATED --
              */
          
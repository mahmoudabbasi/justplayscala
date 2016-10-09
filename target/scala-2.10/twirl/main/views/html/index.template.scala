
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.18*/("""

"""),_display_(/*3.2*/main("play with anorm")/*3.25*/{_display_(Seq[Any](format.raw/*3.26*/("""
  """),format.raw/*4.3*/("""<div class="container"  >
        <div class="page-header">
             <h1> sticky footer with fix navbar </h1>
        </div>
  </div>
""")))}))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Oct 04 07:43:13 IRST 2016
                  SOURCE: D:/project/Lesson1/justplayscala/app/views/index.scala.html
                  HASH: ee852a712dc15aec56a0e201bf13f87a95512d4d
                  MATRIX: 505->1|609->17|639->22|670->45|708->46|738->50
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4
                  -- GENERATED --
              */
          
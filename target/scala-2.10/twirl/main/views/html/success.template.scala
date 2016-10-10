
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

/*  @(user: models.User) */
object success extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /*  @(user: models.User) */
  def apply/*2.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*2.19*/("""

"""),_display_(/*4.2*/main("create user database ")/*4.31*/ {_display_(Seq[Any](format.raw/*4.33*/("""

  """),format.raw/*6.3*/("""<h1> your create userss success </h1>

  <h2>"""),_display_(/*8.8*/message),format.raw/*8.15*/("""</h2>
  """),format.raw/*9.66*/("""

  """),format.raw/*11.11*/("""
    """),format.raw/*12.68*/("""
  """),format.raw/*13.12*/("""

""")))}))}
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Mon Oct 10 14:12:47 IRST 2016
                  SOURCE: D:/project/Lesson1/justplayscala/app/views/success.scala.html
                  HASH: 7ffbced684e8f4167b160b013338f26ed1d6f1d8
                  MATRIX: 553->30|658->47|688->52|725->81|764->83|796->89|869->137|896->144|932->216|966->230|1000->299|1032->312
                  LINES: 19->2|22->2|24->4|24->4|24->4|26->6|28->8|28->8|29->9|31->11|32->12|33->13
                  -- GENERATED --
              */
          
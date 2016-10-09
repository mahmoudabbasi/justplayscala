
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>

    <head>

        <title>"""),_display_(/*8.17*/title),format.raw/*8.22*/("""</title>
        """),format.raw/*9.30*/("""
        """),format.raw/*10.9*/("""<link rel="stylesheet" media="screen" href="stylesheets/main.css"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"/>
        <link rel="shortcut icon" type="image/png" href="images/favicon.png"/>

    </head>

    <body>
       """),_display_(/*17.9*/content),format.raw/*17.16*/("""

        """),format.raw/*19.9*/("""<div id="footer">
            <div class="container">
                <p class="text-muted">Play includes a simple data access layer
                    called Anorm that uses plain SQL to interact with the database and
                    rovides an API to parse and transform the resulting datasets.</p>
            </div>
        </div>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </body>
</html>"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Oct 09 08:02:32 IRST 2016
                  SOURCE: D:/project/Lesson1/justplayscala/app/views/main.scala.html
                  HASH: 89941331d0d3421b4206c12171b46ba8d8e92caa
                  MATRIX: 509->1|627->31|655->33|733->85|758->90|802->128|838->137|1154->427|1182->434|1219->444
                  LINES: 19->1|22->1|24->3|29->8|29->8|30->9|31->10|38->17|38->17|40->19
                  -- GENERATED --
              */
          
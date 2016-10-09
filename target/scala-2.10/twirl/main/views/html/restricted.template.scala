
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
object restricted extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.User):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.21*/("""

"""),_display_(/*3.2*/main("Welcome to Play! Login Sample - Restricted Area")/*3.57*/ {_display_(Seq[Any](format.raw/*3.59*/("""

  """),format.raw/*5.3*/("""<h1>Play! Login Sample - Restricted Area</h1>

  <p>You are logged in as """),_display_(/*7.28*/user/*7.32*/.NAME),format.raw/*7.37*/(""" """),format.raw/*7.38*/("""/ """),_display_(/*7.41*/user/*7.45*/.NATIONALCODE),format.raw/*7.58*/("""</p>

  <ul>
    <li><a href=""""),_display_(/*10.19*/routes/*10.25*/.Authentication.logout),format.raw/*10.47*/("""">Logout</a></li>
    <li><a href=""""),_display_(/*11.19*/routes/*11.25*/.Restricted.index),format.raw/*11.42*/("""">Restricted Area</a></li>
  </ul>

""")))}))}
  }

  def render(user:models.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Oct 09 14:41:06 IRST 2016
                  SOURCE: D:/project/Lesson1/justplayscala/app/views/restricted.scala.html
                  HASH: 983b4db6a9f993c8d5224a87ba4df9f6bb725113
                  MATRIX: 515->1|622->20|652->25|715->80|754->82|786->88|888->164|900->168|925->173|953->174|982->177|994->181|1027->194|1088->228|1103->234|1146->256|1210->293|1225->299|1263->316
                  LINES: 19->1|22->1|24->3|24->3|24->3|26->5|28->7|28->7|28->7|28->7|28->7|28->7|28->7|31->10|31->10|31->10|32->11|32->11|32->11
                  -- GENERATED --
              */
          
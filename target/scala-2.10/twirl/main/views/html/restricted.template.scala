
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

"""),_display_(/*3.2*/main("scala test login")/*3.26*/ {_display_(Seq[Any](format.raw/*3.28*/("""

  """),format.raw/*5.3*/("""<h1>login test valid user</h1>

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
                  DATE: Sat Oct 15 12:56:06 IRST 2016
                  SOURCE: D:/project/Lesson1/justplayscala/app/views/restricted.scala.html
                  HASH: d93bde0843e0413a8d83af68145d0e4a8c2d1e16
                  MATRIX: 515->1|622->20|652->25|684->49|723->51|755->57|842->118|854->122|879->127|907->128|936->131|948->135|981->148|1042->182|1057->188|1100->210|1164->247|1179->253|1217->270
                  LINES: 19->1|22->1|24->3|24->3|24->3|26->5|28->7|28->7|28->7|28->7|28->7|28->7|28->7|31->10|31->10|31->10|32->11|32->11|32->11
                  -- GENERATED --
              */
          

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
    """),format.raw/*4.5*/("""<div class="container">
        <div class="row">
            <div class="col-md-3 col-md-offset-4">
    <h1>login test valid user</h1>

    <p>You are logged in as """),_display_(/*9.30*/user/*9.34*/.NAME),format.raw/*9.39*/(""" """),format.raw/*9.40*/("""/ """),_display_(/*9.43*/user/*9.47*/.NATIONALCODE),format.raw/*9.60*/("""</p>

    <ul>
        <li><a href=""""),_display_(/*12.23*/routes/*12.29*/.Authentication.logout),format.raw/*12.51*/("""">Logout</a></li>
        <li><a href=""""),_display_(/*13.23*/routes/*13.29*/.Restricted.index),format.raw/*13.46*/("""">Restricted Area</a></li>
    </ul>
    </div>
    </div>
    </div>

""")))}))}
  }

  def render(user:models.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sat Oct 15 13:52:14 IRST 2016
                  SOURCE: D:/project/Lesson1/justplayscala/app/views/restricted.scala.html
                  HASH: d572c09dd3fd0af4094ea7ec64bbdc5ab676d093
                  MATRIX: 515->1|622->20|652->25|684->49|723->51|755->57|952->228|964->232|989->237|1017->238|1046->241|1058->245|1091->258|1158->298|1173->304|1216->326|1284->367|1299->373|1337->390
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|30->9|30->9|30->9|30->9|30->9|30->9|30->9|33->12|33->12|33->12|34->13|34->13|34->13
                  -- GENERATED --
              */
          
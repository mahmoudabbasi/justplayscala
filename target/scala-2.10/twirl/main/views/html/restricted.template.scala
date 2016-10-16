
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
    """),format.raw/*4.5*/("""<div   class="container">
        <div class="row">
            <div class="col-md-3">
                You are logged in as """),_display_(/*7.39*/user/*7.43*/.NAME),format.raw/*7.48*/(""" """),format.raw/*7.49*/("""/ """),_display_(/*7.52*/user/*7.56*/.NATIONALCODE),format.raw/*7.69*/("""
            """),format.raw/*8.13*/("""</div>

            <div class="col-md-10">
            </div>

        </div>

        <div class="row">
            <div class="col-lg-1">
                <a class="btn btn-link" href=""""),_display_(/*17.48*/routes/*17.54*/.Restricted.index1),format.raw/*17.72*/("""">Restricted</a>
            </div>
            <div class="col-lg-1">
                <a class="btn btn-link" href=""""),_display_(/*20.48*/routes/*20.54*/.Authentication.logout),format.raw/*20.76*/("""">Logout</a>
            </div>
            <div class="col-lg-10">
            </div>
        </div>

        <form class="form-horizontal">
            <div class="form-group">

                <div class="col-sm-10">
                    <input class="form-control" type="text" name="nationalcode" placeholder="NationalCode" id="nationalcode" placeholder="nationalcode" >
                </div>
                <label class="control-label col-sm-2" for="nationalcode">: national code</label>
            </div>
            <div class="form-group">

                <div class="col-sm-10">
                    <input class="form-control" type="text" name="name" placeholder="Name" id="name" placeholder="name" >
                </div>
                <label class="control-label col-sm-2" for="name">:name</label>
            </div>
            <div  class="form-group">

                <div class="col-sm-10">
                    <input class="form-control" type="text" name="family" placeholder="Family" id="name" placeholder="Family" >
                </div>
                <label class="control-label col-sm-2" for="name">:family</label>
            </div>
        </form>

    </div>


""")))}))}
  }

  def render(user:models.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Oct 16 08:50:41 IRST 2016
                  SOURCE: D:/project/Lesson1/justplayscala/app/views/restricted.scala.html
                  HASH: 3bcaafbd5bf456923c7a96bcf36a8e50c90263d4
                  MATRIX: 515->1|622->20|652->25|684->49|723->51|755->57|909->185|921->189|946->194|974->195|1003->198|1015->202|1048->215|1089->229|1313->426|1328->432|1367->450|1515->571|1530->577|1573->599
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|28->7|28->7|28->7|28->7|28->7|28->7|28->7|29->8|38->17|38->17|38->17|41->20|41->20|41->20
                  -- GENERATED --
              */
          
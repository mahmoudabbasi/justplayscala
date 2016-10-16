
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
object twitterBootstrapInput extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[helper.FieldElements,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(elements: helper.FieldElements):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*5.52*/("""
"""),format.raw/*6.1*/("""<div class="form-group """),_display_(/*6.25*/if(elements.hasErrors)/*6.47*/ {_display_(Seq[Any](format.raw/*6.49*/("""has-error""")))}),format.raw/*6.59*/("""">
  <label for=""""),_display_(/*7.16*/elements/*7.24*/.id),format.raw/*7.27*/("""" class="col-sm-2 control-label">"""),_display_(/*7.61*/elements/*7.69*/.label),format.raw/*7.75*/("""</label>
  <div class="col-sm-10">
    """),_display_(/*9.6*/elements/*9.14*/.input),format.raw/*9.20*/("""
    """),format.raw/*10.5*/("""<span class="help-block">"""),_display_(/*10.31*/elements/*10.39*/.infos.mkString(", ")),format.raw/*10.60*/("""</span>
  </div>
</div>
"""))}
  }

  def render(elements:helper.FieldElements): play.twirl.api.HtmlFormat.Appendable = apply(elements)

  def f:((helper.FieldElements) => play.twirl.api.HtmlFormat.Appendable) = (elements) => apply(elements)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Oct 16 08:21:45 IRST 2016
                  SOURCE: D:/project/Lesson1/justplayscala/app/views/twitterBootstrapInput.scala.html
                  HASH: 20990bd140fe015f5c2d61ddcf4d63eb2620bade
                  MATRIX: 535->1|655->33|686->194|714->196|764->220|794->242|833->244|873->254|918->273|934->281|957->284|1017->318|1033->326|1059->332|1126->374|1142->382|1168->388|1201->394|1254->420|1271->428|1313->449
                  LINES: 19->1|22->1|24->5|25->6|25->6|25->6|25->6|25->6|26->7|26->7|26->7|26->7|26->7|26->7|28->9|28->9|28->9|29->10|29->10|29->10|29->10
                  -- GENERATED --
              */
          

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
import models.Page
import models.Employee
/**/
object list extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[Page[Employee],Int,String,String,String,play.api.mvc.Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(currentPage:  Page[Employee], currentOrderBy: Int, currentFilter: String ,use:String , ema:String)(implicit flash: play.api.mvc.Flash):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {
def /*20.2*/header/*20.8*/(orderBy: Int, title: String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*20.41*/("""
  """),format.raw/*21.3*/("""<th class="col"""),_display_(/*21.18*/orderBy),format.raw/*21.25*/(""" """),format.raw/*21.26*/("""header """),_display_(/*21.34*/if(scala.math.abs(currentOrderBy) == orderBy){/*21.81*/{if(currentOrderBy < 0) "glyphicon glyphicon-chevron-down" else "glyphicon glyphicon-chevron-up"}}),format.raw/*21.178*/("""">
    <a href=""""),_display_(/*22.15*/link(0, Some(orderBy))),format.raw/*22.37*/("""">"""),_display_(/*22.40*/title),format.raw/*22.45*/("""</a>
  </th>
""")))};def /*11.2*/link/*11.6*/(newPage: Int, newOrderBy: Option[Int] = None) = {{
  routes.Restricted.list(newPage, newOrderBy.map { orderBy =>
    if(orderBy == scala.math.abs(currentOrderBy)) -currentOrderBy else orderBy
  }.getOrElse(currentOrderBy), currentFilter)
}};
Seq[Any](format.raw/*4.137*/("""

"""),format.raw/*8.42*/("""
"""),format.raw/*9.42*/("""

"""),format.raw/*15.2*/("""

  """),format.raw/*19.39*/("""
"""),format.raw/*24.2*/("""

"""),_display_(/*26.2*/main("Employee-Self-Service")/*26.31*/ {_display_(Seq[Any](format.raw/*26.33*/("""


    """),format.raw/*29.5*/("""<!-- Begin page content -->
  <div class="container">
    <div class="page-header">
      <h3>
        You are logged in as """),_display_(/*33.31*/use),format.raw/*33.34*/(""" """),format.raw/*33.35*/("""/ """),_display_(/*33.38*/ema),format.raw/*33.41*/("""
      """),format.raw/*34.7*/("""</h3>
    </div>
    <div class="page-header">
      <h3>
      """),_display_(/*38.8*/Messages("employee.list.title", currentPage.total)),format.raw/*38.58*/("""
      """),format.raw/*39.7*/("""</h3>
    </div>

    """),_display_(/*42.6*/flash/*42.11*/.get("success").map/*42.30*/ { message =>_display_(Seq[Any](format.raw/*42.43*/("""
      """),format.raw/*43.7*/("""<div class="alert alert-dismissable alert-success">
        <button type="button" class="close" data-dismiss="alert">×</button>
        <strong>Well done!</strong> """),_display_(/*45.38*/message),format.raw/*45.45*/("""
      """),format.raw/*46.7*/("""</div>
    """)))}),format.raw/*47.6*/("""

    """),format.raw/*49.5*/("""<div id="actions">

      """),_display_(/*51.8*/helper/*51.14*/.form(action=routes.Restricted.list(), 'class -> "navbar-form navbar-left", 'role -> "search")/*51.108*/ {_display_(Seq[Any](format.raw/*51.110*/("""
        """),format.raw/*52.9*/("""<input type="search" id="searchbox" name="f" value=""""),_display_(/*52.62*/currentFilter),format.raw/*52.75*/("""" placeholder="Filter by employee name...">
        <input type="submit" id="searchsubmit" value="Filter by name" class="btn btn-primary btn-sm">
      """)))}),format.raw/*54.8*/("""
      """),format.raw/*55.7*/("""<a class="btn btn-success btn-sm pull-right" id="add" href=""""),_display_(/*55.68*/routes/*55.74*/.Restricted.create()),format.raw/*55.94*/("""">Add a new employee</a>
    </div>

    """),_display_(/*58.6*/Option(currentPage.items)/*58.31*/.filterNot(_.isEmpty).map/*58.56*/ { employees =>_display_(Seq[Any](format.raw/*58.71*/("""
    """),format.raw/*59.5*/("""<table class="table table-striped">
      <thead>
        <tr>
          """),_display_(/*62.12*/header(2, "Name")),format.raw/*62.29*/("""
          """),_display_(/*63.12*/header(3, "Address")),format.raw/*63.32*/("""
          """),_display_(/*64.12*/header(4, "Date of Birth")),format.raw/*64.38*/("""
          """),_display_(/*65.12*/header(5, "Joining Date")),format.raw/*65.37*/("""
          """),_display_(/*66.12*/header(6, "Designation")),format.raw/*66.36*/("""
        """),format.raw/*67.9*/("""</tr>
      </thead>
      <tbody>

      """),_display_(/*71.8*/employees/*71.17*/.map/*71.21*/ { employee =>_display_(Seq[Any](format.raw/*71.35*/("""
        """),format.raw/*72.9*/("""<tr>
          <td><a href=""""),_display_(/*73.25*/routes/*73.31*/.Restricted.edit(employee.ID)),format.raw/*73.60*/("""">"""),_display_(/*73.63*/employee/*73.71*/.NAME),format.raw/*73.76*/("""</a></td>
          <td>"""),_display_(/*74.16*/employee/*74.24*/.ADDRESS),format.raw/*74.32*/("""</td>
          <td>"""),_display_(/*75.16*/employee/*75.24*/.DOB.format("dd MMM yyyy")),format.raw/*75.50*/("""</td>
          <td>"""),_display_(/*76.16*/employee/*76.24*/.JOININGDATE.format("dd MMM yyyy")),format.raw/*76.58*/("""</td>
          <td>"""),_display_(/*77.16*/employee/*77.24*/.DESIGNATION),format.raw/*77.36*/("""</td>
        </tr>
      """)))}),format.raw/*79.8*/("""

      """),format.raw/*81.7*/("""</tbody>
    </table>
    <hr/>

    <ul class="pager" style="padding-bottom: 70px;">
      """),_display_(/*86.8*/currentPage/*86.19*/.prev.map/*86.28*/ { page =>_display_(Seq[Any](format.raw/*86.38*/("""
      """),format.raw/*87.7*/("""<li class="previous">
        <a href=""""),_display_(/*88.19*/link(page)),format.raw/*88.29*/("""">&larr; Previous</a>
      </li>
      """)))}/*90.8*/.getOrElse/*90.18*/ {_display_(Seq[Any](format.raw/*90.20*/("""
        """),format.raw/*91.9*/("""<li class="previous disabled">
          <a>&larr; Previous</a>
        </li>
      """)))}),format.raw/*94.8*/("""
      """),format.raw/*95.31*/("""
      """),format.raw/*96.117*/("""
      """),format.raw/*97.16*/("""
      """),_display_(/*98.8*/currentPage/*98.19*/.next.map/*98.28*/ { page =>_display_(Seq[Any](format.raw/*98.38*/("""
      """),format.raw/*99.7*/("""<li class="next">
        <a href=""""),_display_(/*100.19*/link(page)),format.raw/*100.29*/("""">Next &rarr;</a>
      </li>
      """)))}/*102.8*/.getOrElse/*102.18*/ {_display_(Seq[Any](format.raw/*102.20*/("""
        """),format.raw/*103.9*/("""<li class="next disabled">
          <a>Next &rarr;</a>
        </li>
      """)))}),format.raw/*106.8*/("""
    """),format.raw/*107.5*/("""</ul>
    """)))}/*108.6*/.getOrElse/*108.16*/ {_display_(Seq[Any](format.raw/*108.18*/("""
      """),format.raw/*109.7*/("""<div class="panel panel-default">
        <div class="panel-body">
          <em>Nothing to display</em>
        </div>
      </div>
    """)))}),format.raw/*114.6*/("""
  """),format.raw/*115.3*/("""</div>
""")))}),format.raw/*116.2*/("""

"""))}
  }

  def render(currentPage:Page[Employee],currentOrderBy:Int,currentFilter:String,use:String,ema:String,flash:play.api.mvc.Flash): play.twirl.api.HtmlFormat.Appendable = apply(currentPage,currentOrderBy,currentFilter,use,ema)(flash)

  def f:((Page[Employee],Int,String,String,String) => (play.api.mvc.Flash) => play.twirl.api.HtmlFormat.Appendable) = (currentPage,currentOrderBy,currentFilter,use,ema) => (flash) => apply(currentPage,currentOrderBy,currentFilter,use,ema)(flash)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Sun Oct 16 12:23:31 IRST 2016
                  SOURCE: D:/project/Lesson1/justplayscala/app/views/list.scala.html
                  HASH: e6eefc16ab28247c070456ca88e42790bb942a3a
                  MATRIX: 597->49|804->734|818->740|928->773|959->777|1001->792|1029->799|1058->800|1093->808|1148->855|1268->952|1313->970|1356->992|1386->995|1412->1000|1451->363|1463->367|1738->184|1769->315|1798->358|1829->611|1863->731|1892->1016|1923->1021|1961->1050|2001->1052|2038->1062|2194->1191|2218->1194|2247->1195|2277->1198|2301->1201|2336->1209|2431->1278|2502->1328|2537->1336|2589->1362|2603->1367|2631->1386|2682->1399|2717->1407|2911->1574|2939->1581|2974->1589|3017->1602|3052->1610|3107->1639|3122->1645|3226->1739|3267->1741|3304->1751|3384->1804|3418->1817|3603->1972|3638->1980|3726->2041|3741->2047|3782->2067|3853->2112|3887->2137|3921->2162|3974->2177|4007->2183|4111->2260|4149->2277|4189->2290|4230->2310|4270->2323|4317->2349|4357->2362|4403->2387|4443->2400|4488->2424|4525->2434|4598->2481|4616->2490|4629->2494|4681->2508|4718->2518|4775->2548|4790->2554|4840->2583|4870->2586|4887->2594|4913->2599|4966->2625|4983->2633|5012->2641|5061->2663|5078->2671|5125->2697|5174->2719|5191->2727|5246->2761|5295->2783|5312->2791|5345->2803|5404->2832|5441->2842|5565->2940|5585->2951|5603->2960|5651->2970|5686->2978|5754->3019|5785->3029|5846->3072|5865->3082|5905->3084|5942->3094|6060->3182|6096->3214|6133->3332|6169->3349|6204->3358|6224->3369|6242->3378|6290->3388|6325->3396|6390->3433|6422->3443|6480->3482|6500->3492|6541->3494|6579->3504|6690->3584|6724->3590|6755->3602|6775->3612|6816->3614|6852->3622|7026->3765|7058->3769|7098->3778
                  LINES: 20->4|22->20|22->20|24->20|25->21|25->21|25->21|25->21|25->21|25->21|25->21|26->22|26->22|26->22|26->22|28->11|28->11|33->4|35->8|36->9|38->15|40->19|41->24|43->26|43->26|43->26|46->29|50->33|50->33|50->33|50->33|50->33|51->34|55->38|55->38|56->39|59->42|59->42|59->42|59->42|60->43|62->45|62->45|63->46|64->47|66->49|68->51|68->51|68->51|68->51|69->52|69->52|69->52|71->54|72->55|72->55|72->55|72->55|75->58|75->58|75->58|75->58|76->59|79->62|79->62|80->63|80->63|81->64|81->64|82->65|82->65|83->66|83->66|84->67|88->71|88->71|88->71|88->71|89->72|90->73|90->73|90->73|90->73|90->73|90->73|91->74|91->74|91->74|92->75|92->75|92->75|93->76|93->76|93->76|94->77|94->77|94->77|96->79|98->81|103->86|103->86|103->86|103->86|104->87|105->88|105->88|107->90|107->90|107->90|108->91|111->94|112->95|113->96|114->97|115->98|115->98|115->98|115->98|116->99|117->100|117->100|119->102|119->102|119->102|120->103|123->106|124->107|125->108|125->108|125->108|126->109|131->114|132->115|133->116
                  -- GENERATED --
              */
          
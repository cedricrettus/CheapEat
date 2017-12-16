
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("CheapEat - Home")/*1.25*/ {_display_(Seq[Any](format.raw/*1.27*/("""

    """),format.raw/*3.5*/("""<script src=""""),_display_(/*3.19*/routes/*3.25*/.Assets.at("js/home.js")),format.raw/*3.49*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*4.19*/routes/*4.25*/.Assets.at("js/hbScript.js")),format.raw/*4.53*/("""" type="text/javascript"></script>


    """),_display_(/*7.6*/nav()),format.raw/*7.11*/("""

"""),_display_(/*9.2*/modals()),format.raw/*9.10*/("""


    """),format.raw/*12.5*/("""<div class="content">
                <div class="container">

                    """),_display_(/*15.22*/alerts()),format.raw/*15.30*/("""
                    """),format.raw/*16.21*/("""<h1 class="site-title">Angebote</h1>

                    <script id="angebote-template" type="text/x-handlebars-template">
                        """),format.raw/*19.25*/("""{"""),format.raw/*19.26*/("""{"""),format.raw/*19.27*/("""#each this"""),format.raw/*19.37*/("""}"""),format.raw/*19.38*/("""}"""),format.raw/*19.39*/("""
                        """),format.raw/*20.25*/("""<div class="card">
                            <div class="row">
                                <div class="col-md-3">
                                        <!-- <img class="card-img-top" src="assets/images/burger1.jpg" alt="Card image cap"> -->
                                    <div id="thumbnail-carousel"""),format.raw/*24.64*/("""{"""),format.raw/*24.65*/("""{"""),format.raw/*24.66*/("""@index"""),format.raw/*24.73*/("""}"""),format.raw/*24.74*/("""}"""),format.raw/*24.75*/("""" class="carousel slide" data-ride=false data-interval="3000">
                                        <div class="carousel-inner">
                                            """),format.raw/*26.45*/("""{"""),format.raw/*26.46*/("""{"""),format.raw/*26.47*/("""#each this.urls"""),format.raw/*26.62*/("""}"""),format.raw/*26.63*/("""}"""),format.raw/*26.64*/("""
                                            """),format.raw/*27.45*/("""{"""),format.raw/*27.46*/("""{"""),format.raw/*27.47*/("""#if @first"""),format.raw/*27.58*/("""}"""),format.raw/*27.59*/("""}"""),format.raw/*27.60*/("""
                                            """),format.raw/*28.45*/("""<div class="carousel-item active">
                                                <img class="d-block img-fluid mh-100 card-img-top" src="http://s3.fgoeldi.com/big/"""),format.raw/*29.131*/("""{"""),format.raw/*29.132*/("""{"""),format.raw/*29.133*/("""this"""),format.raw/*29.137*/("""}"""),format.raw/*29.138*/("""}"""),format.raw/*29.139*/("""" alt="Angebot Bild">
                                            </div>
                                            """),format.raw/*31.45*/("""{"""),format.raw/*31.46*/("""{"""),format.raw/*31.47*/("""else"""),format.raw/*31.51*/("""}"""),format.raw/*31.52*/("""}"""),format.raw/*31.53*/("""

                                            """),format.raw/*33.45*/("""<div class="carousel-item">
                                                <img class="d-block img-fluid mh-100 card-img-top" src="http://s3.fgoeldi.com/big/"""),format.raw/*34.131*/("""{"""),format.raw/*34.132*/("""{"""),format.raw/*34.133*/("""this"""),format.raw/*34.137*/("""}"""),format.raw/*34.138*/("""}"""),format.raw/*34.139*/("""" alt="Angebot Bild">
                                            </div>
                                            """),format.raw/*36.45*/("""{"""),format.raw/*36.46*/("""{"""),format.raw/*36.47*/("""/if"""),format.raw/*36.50*/("""}"""),format.raw/*36.51*/("""}"""),format.raw/*36.52*/("""
                                            """),format.raw/*37.45*/("""{"""),format.raw/*37.46*/("""{"""),format.raw/*37.47*/("""else"""),format.raw/*37.51*/("""}"""),format.raw/*37.52*/("""}"""),format.raw/*37.53*/("""
                                            """),format.raw/*38.45*/("""<div class="carousel-item active">
                                                <img class="d-block img-fluid mh-100 card-img-top" src="assets/images/burger1.jpg" alt="Angebot Bild">
                                            </div>
                                            """),format.raw/*41.45*/("""{"""),format.raw/*41.46*/("""{"""),format.raw/*41.47*/("""/each"""),format.raw/*41.52*/("""}"""),format.raw/*41.53*/("""}"""),format.raw/*41.54*/("""
                                        """),format.raw/*42.41*/("""</div>
                                        <a class="carousel-control-prev" href="#thumbnail-carousel"""),format.raw/*43.99*/("""{"""),format.raw/*43.100*/("""{"""),format.raw/*43.101*/("""@index"""),format.raw/*43.108*/("""}"""),format.raw/*43.109*/("""}"""),format.raw/*43.110*/("""" role="button" data-slide="prev">
                                            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                                            <span class="sr-only">Previous</span>
                                        </a>
                                        <a class="carousel-control-next" href="#thumbnail-carousel"""),format.raw/*47.99*/("""{"""),format.raw/*47.100*/("""{"""),format.raw/*47.101*/("""@index"""),format.raw/*47.108*/("""}"""),format.raw/*47.109*/("""}"""),format.raw/*47.110*/("""" role="button" data-slide="next">
                                            <span class="carousel-control-next-icon" aria-hidden="true"></span>
                                            <span class="sr-only">Next</span>
                                        </a>
                                    </div>
                                </div>
                                <div class="col-md-5">
                                    <div class="card-body">
                                        <h4 class="card-title"> """),format.raw/*55.65*/("""{"""),format.raw/*55.66*/("""{"""),format.raw/*55.67*/("""this.angebot.titel"""),format.raw/*55.85*/("""}"""),format.raw/*55.86*/("""}"""),format.raw/*55.87*/(""" """),format.raw/*55.88*/("""</h4>
                                        <h6 class="card-subtitle mb-2 text-muted"> """),format.raw/*56.84*/("""{"""),format.raw/*56.85*/("""{"""),format.raw/*56.86*/("""this.angebot.kueche"""),format.raw/*56.105*/("""}"""),format.raw/*56.106*/("""}"""),format.raw/*56.107*/(""" """),format.raw/*56.108*/("""</h6>
                                        <p class="card-text"> """),format.raw/*57.63*/("""{"""),format.raw/*57.64*/("""{"""),format.raw/*57.65*/("""this.angebot.beschreibung"""),format.raw/*57.90*/("""}"""),format.raw/*57.91*/("""}"""),format.raw/*57.92*/(""" """),format.raw/*57.93*/("""</p>
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="card-body">
                                        <p class="card-text no-margin"><span class="benutzername">"""),format.raw/*62.99*/("""{"""),format.raw/*62.100*/("""{"""),format.raw/*62.101*/("""this.benutzername"""),format.raw/*62.118*/("""}"""),format.raw/*62.119*/("""}"""),format.raw/*62.120*/("""</span> <span class="rating"><i class="fa fa-star" aria-hidden="true"></i>"""),format.raw/*62.194*/("""{"""),format.raw/*62.195*/("""{"""),format.raw/*62.196*/("""this.bewertung"""),format.raw/*62.210*/("""}"""),format.raw/*62.211*/("""}"""),format.raw/*62.212*/(""" """),format.raw/*62.213*/("""("""),format.raw/*62.214*/("""{"""),format.raw/*62.215*/("""{"""),format.raw/*62.216*/("""this.anzBewertung"""),format.raw/*62.233*/("""}"""),format.raw/*62.234*/("""}"""),format.raw/*62.235*/(""" """),format.raw/*62.236*/("""Bewertungen)</span></p>
                                        <p class="no-margin">Abholzeit: """),format.raw/*63.73*/("""{"""),format.raw/*63.74*/("""{"""),format.raw/*63.75*/("""this.angebot.datum"""),format.raw/*63.93*/("""}"""),format.raw/*63.94*/("""}"""),format.raw/*63.95*/(""" """),format.raw/*63.96*/("""um """),format.raw/*63.99*/("""{"""),format.raw/*63.100*/("""{"""),format.raw/*63.101*/("""this.angebot.zeit"""),format.raw/*63.118*/("""}"""),format.raw/*63.119*/("""}"""),format.raw/*63.120*/("""</p>
                                        <p class="no-margin">Ort: <span> """),format.raw/*64.74*/("""{"""),format.raw/*64.75*/("""{"""),format.raw/*64.76*/("""this.plz"""),format.raw/*64.84*/("""}"""),format.raw/*64.85*/("""}"""),format.raw/*64.86*/(""" """),format.raw/*64.87*/("""</span> </p>
                                        <p class="card-text"><strong class="preis">CHF """),format.raw/*65.88*/("""{"""),format.raw/*65.89*/("""{"""),format.raw/*65.90*/("""this.angebot.preis"""),format.raw/*65.108*/("""}"""),format.raw/*65.109*/("""}"""),format.raw/*65.110*/("""</strong>
                                            <span class="">Verfügbare Portionen: """),format.raw/*66.82*/("""{"""),format.raw/*66.83*/("""{"""),format.raw/*66.84*/("""this.angebot.mengeVerfuegbar"""),format.raw/*66.112*/("""}"""),format.raw/*66.113*/("""}"""),format.raw/*66.114*/("""</span></p>
                                        <button class="btn btn-primary bestellButton" data-id=""""),format.raw/*67.96*/("""{"""),format.raw/*67.97*/("""{"""),format.raw/*67.98*/("""this.angebot.id"""),format.raw/*67.113*/("""}"""),format.raw/*67.114*/("""}"""),format.raw/*67.115*/("""">Bestellen</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                        """),format.raw/*72.25*/("""{"""),format.raw/*72.26*/("""{"""),format.raw/*72.27*/("""/each"""),format.raw/*72.32*/("""}"""),format.raw/*72.33*/("""}"""),format.raw/*72.34*/("""
                    """),format.raw/*73.21*/("""</script>

                    <div class="cards-items angebote-cards" id="angebote-cards">

                    </div>
                </div>
    </div>

""")))}),format.raw/*81.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sat Dec 16 13:59:30 CET 2017
                  SOURCE: C:/dev/git/CheapEat/app/views/index.scala.html
                  HASH: 805b8d62fb1a2801c2390131afc847a2c7f141e9
                  MATRIX: 827->1|858->24|897->26|931->34|971->48|985->54|1029->78|1109->132|1123->138|1171->166|1241->211|1266->216|1296->221|1324->229|1361->239|1475->326|1504->334|1554->356|1733->507|1762->508|1791->509|1829->519|1858->520|1887->521|1941->547|2285->863|2314->864|2343->865|2377->872|2406->873|2435->874|2641->1052|2670->1053|2699->1054|2742->1069|2771->1070|2800->1071|2874->1117|2903->1118|2932->1119|2970->1130|2999->1131|3028->1132|3102->1178|3297->1344|3327->1345|3357->1346|3390->1350|3420->1351|3450->1352|3597->1471|3626->1472|3655->1473|3687->1477|3716->1478|3745->1479|3821->1527|4009->1686|4039->1687|4069->1688|4102->1692|4132->1693|4162->1694|4309->1813|4338->1814|4367->1815|4398->1818|4427->1819|4456->1820|4530->1866|4559->1867|4588->1868|4620->1872|4649->1873|4678->1874|4752->1920|5064->2204|5093->2205|5122->2206|5155->2211|5184->2212|5213->2213|5283->2255|5417->2361|5447->2362|5477->2363|5512->2370|5542->2371|5572->2372|5976->2748|6006->2749|6036->2750|6071->2757|6101->2758|6131->2759|6698->3298|6727->3299|6756->3300|6802->3318|6831->3319|6860->3320|6889->3321|7007->3411|7036->3412|7065->3413|7113->3432|7143->3433|7173->3434|7203->3435|7300->3504|7329->3505|7358->3506|7411->3531|7440->3532|7469->3533|7498->3534|7831->3839|7861->3840|7891->3841|7937->3858|7967->3859|7997->3860|8100->3934|8130->3935|8160->3936|8203->3950|8233->3951|8263->3952|8293->3953|8323->3954|8353->3955|8383->3956|8429->3973|8459->3974|8489->3975|8519->3976|8644->4073|8673->4074|8702->4075|8748->4093|8777->4094|8806->4095|8835->4096|8866->4099|8896->4100|8926->4101|8972->4118|9002->4119|9032->4120|9139->4199|9168->4200|9197->4201|9233->4209|9262->4210|9291->4211|9320->4212|9449->4313|9478->4314|9507->4315|9554->4333|9584->4334|9614->4335|9734->4427|9763->4428|9792->4429|9849->4457|9879->4458|9909->4459|10045->4567|10074->4568|10103->4569|10147->4584|10177->4585|10207->4586|10433->4784|10462->4785|10491->4786|10524->4791|10553->4792|10582->4793|10632->4815|10826->4979
                  LINES: 32->1|32->1|32->1|34->3|34->3|34->3|34->3|35->4|35->4|35->4|38->7|38->7|40->9|40->9|43->12|46->15|46->15|47->16|50->19|50->19|50->19|50->19|50->19|50->19|51->20|55->24|55->24|55->24|55->24|55->24|55->24|57->26|57->26|57->26|57->26|57->26|57->26|58->27|58->27|58->27|58->27|58->27|58->27|59->28|60->29|60->29|60->29|60->29|60->29|60->29|62->31|62->31|62->31|62->31|62->31|62->31|64->33|65->34|65->34|65->34|65->34|65->34|65->34|67->36|67->36|67->36|67->36|67->36|67->36|68->37|68->37|68->37|68->37|68->37|68->37|69->38|72->41|72->41|72->41|72->41|72->41|72->41|73->42|74->43|74->43|74->43|74->43|74->43|74->43|78->47|78->47|78->47|78->47|78->47|78->47|86->55|86->55|86->55|86->55|86->55|86->55|86->55|87->56|87->56|87->56|87->56|87->56|87->56|87->56|88->57|88->57|88->57|88->57|88->57|88->57|88->57|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|95->64|95->64|95->64|95->64|95->64|95->64|95->64|96->65|96->65|96->65|96->65|96->65|96->65|97->66|97->66|97->66|97->66|97->66|97->66|98->67|98->67|98->67|98->67|98->67|98->67|103->72|103->72|103->72|103->72|103->72|103->72|104->73|112->81
                  -- GENERATED --
              */
          
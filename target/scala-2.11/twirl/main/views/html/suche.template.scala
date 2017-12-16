
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object suche_Scope0 {
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

class suche extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("CheapEat - Home")/*1.25*/ {_display_(Seq[Any](format.raw/*1.27*/("""

    """),format.raw/*3.5*/("""<script src=""""),_display_(/*3.19*/routes/*3.25*/.Assets.at("js/hbScript.js")),format.raw/*3.53*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*4.19*/routes/*4.25*/.Assets.at("js/search.js")),format.raw/*4.51*/("""" type="text/javascript"></script>

    """),_display_(/*6.6*/nav()),format.raw/*6.11*/("""
    """),_display_(/*7.6*/modals()),format.raw/*7.14*/("""


    """),format.raw/*10.5*/("""<div class="content">
        <div class="container">
            """),_display_(/*12.14*/alerts()),format.raw/*12.22*/("""
            """),format.raw/*13.13*/("""<h1 class="site-title">Angebote</h1>
            <form id="filter-form">
                <input class="form-control" id="filter-datum" type="date">
                <small>Gib das gewünschte Abholdatum ein um die Suche einzuschränken</small>
            </form>

            <script id="angebote-template" type="text/x-handlebars-template">
                """),format.raw/*20.17*/("""{"""),format.raw/*20.18*/("""{"""),format.raw/*20.19*/("""#each this"""),format.raw/*20.29*/("""}"""),format.raw/*20.30*/("""}"""),format.raw/*20.31*/("""
                """),format.raw/*21.17*/("""<div class="card">
                    <div class="row">
                        <div class="col-md-3">
                                <!-- <img class="card-img-top" src="assets/images/burger1.jpg" alt="Card image cap"> -->
                            <div id="thumbnail-carousel"""),format.raw/*25.56*/("""{"""),format.raw/*25.57*/("""{"""),format.raw/*25.58*/("""@index"""),format.raw/*25.65*/("""}"""),format.raw/*25.66*/("""}"""),format.raw/*25.67*/("""" class="carousel slide" data-ride=false data-interval="3000">
                                <div class="carousel-inner">
                                    """),format.raw/*27.37*/("""{"""),format.raw/*27.38*/("""{"""),format.raw/*27.39*/("""#each this.urls"""),format.raw/*27.54*/("""}"""),format.raw/*27.55*/("""}"""),format.raw/*27.56*/("""
                                    """),format.raw/*28.37*/("""{"""),format.raw/*28.38*/("""{"""),format.raw/*28.39*/("""#if @first"""),format.raw/*28.50*/("""}"""),format.raw/*28.51*/("""}"""),format.raw/*28.52*/("""
                                    """),format.raw/*29.37*/("""<div class="carousel-item active">
                                        <img class="d-block img-fluid mh-100 card-img-top" src="http://s3.fgoeldi.com/big/"""),format.raw/*30.123*/("""{"""),format.raw/*30.124*/("""{"""),format.raw/*30.125*/("""this"""),format.raw/*30.129*/("""}"""),format.raw/*30.130*/("""}"""),format.raw/*30.131*/("""" alt="Angebot Bild">
                                    </div>
                                    """),format.raw/*32.37*/("""{"""),format.raw/*32.38*/("""{"""),format.raw/*32.39*/("""else"""),format.raw/*32.43*/("""}"""),format.raw/*32.44*/("""}"""),format.raw/*32.45*/("""

                                    """),format.raw/*34.37*/("""<div class="carousel-item">
                                        <img class="d-block img-fluid mh-100 card-img-top" src="http://s3.fgoeldi.com/big/"""),format.raw/*35.123*/("""{"""),format.raw/*35.124*/("""{"""),format.raw/*35.125*/("""this"""),format.raw/*35.129*/("""}"""),format.raw/*35.130*/("""}"""),format.raw/*35.131*/("""" alt="Angebot Bild">
                                    </div>
                                    """),format.raw/*37.37*/("""{"""),format.raw/*37.38*/("""{"""),format.raw/*37.39*/("""/if"""),format.raw/*37.42*/("""}"""),format.raw/*37.43*/("""}"""),format.raw/*37.44*/("""
                                    """),format.raw/*38.37*/("""{"""),format.raw/*38.38*/("""{"""),format.raw/*38.39*/("""else"""),format.raw/*38.43*/("""}"""),format.raw/*38.44*/("""}"""),format.raw/*38.45*/("""
                                    """),format.raw/*39.37*/("""<div class="carousel-item active">
                                        <img class="d-block img-fluid mh-100 card-img-top" src="assets/images/burger1.jpg" alt="Angebot Bild">
                                    </div>
                                    """),format.raw/*42.37*/("""{"""),format.raw/*42.38*/("""{"""),format.raw/*42.39*/("""/each"""),format.raw/*42.44*/("""}"""),format.raw/*42.45*/("""}"""),format.raw/*42.46*/("""
                                """),format.raw/*43.33*/("""</div>
                                <a class="carousel-control-prev" href="#thumbnail-carousel"""),format.raw/*44.91*/("""{"""),format.raw/*44.92*/("""{"""),format.raw/*44.93*/("""@index"""),format.raw/*44.100*/("""}"""),format.raw/*44.101*/("""}"""),format.raw/*44.102*/("""" role="button" data-slide="prev">
                                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                                    <span class="sr-only">Previous</span>
                                </a>
                                <a class="carousel-control-next" href="#thumbnail-carousel"""),format.raw/*48.91*/("""{"""),format.raw/*48.92*/("""{"""),format.raw/*48.93*/("""@index"""),format.raw/*48.100*/("""}"""),format.raw/*48.101*/("""}"""),format.raw/*48.102*/("""" role="button" data-slide="next">
                                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                                    <span class="sr-only">Next</span>
                                </a>
                            </div>
                        </div>
                        <div class="col-md-5">
                            <div class="card-body">
                                <h4 class="card-title"> """),format.raw/*56.57*/("""{"""),format.raw/*56.58*/("""{"""),format.raw/*56.59*/("""this.angebot.titel"""),format.raw/*56.77*/("""}"""),format.raw/*56.78*/("""}"""),format.raw/*56.79*/(""" """),format.raw/*56.80*/("""</h4>
                                <h6 class="card-subtitle mb-2 text-muted"> """),format.raw/*57.76*/("""{"""),format.raw/*57.77*/("""{"""),format.raw/*57.78*/("""this.angebot.kueche"""),format.raw/*57.97*/("""}"""),format.raw/*57.98*/("""}"""),format.raw/*57.99*/(""" """),format.raw/*57.100*/("""</h6>
                                <p class="card-text"> """),format.raw/*58.55*/("""{"""),format.raw/*58.56*/("""{"""),format.raw/*58.57*/("""this.angebot.beschreibung"""),format.raw/*58.82*/("""}"""),format.raw/*58.83*/("""}"""),format.raw/*58.84*/(""" """),format.raw/*58.85*/("""</p>
                            </div>
                        </div>
                        <div class="col-md-4">
                            <div class="card-body">
                                <p class="card-text no-margin"><span class="benutzername">"""),format.raw/*63.91*/("""{"""),format.raw/*63.92*/("""{"""),format.raw/*63.93*/("""this.benutzername"""),format.raw/*63.110*/("""}"""),format.raw/*63.111*/("""}"""),format.raw/*63.112*/("""</span> <span class="rating"><i class="fa fa-star" aria-hidden="true"></i>"""),format.raw/*63.186*/("""{"""),format.raw/*63.187*/("""{"""),format.raw/*63.188*/("""this.bewertung"""),format.raw/*63.202*/("""}"""),format.raw/*63.203*/("""}"""),format.raw/*63.204*/(""" """),format.raw/*63.205*/("""("""),format.raw/*63.206*/("""{"""),format.raw/*63.207*/("""{"""),format.raw/*63.208*/("""this.anzBewertung"""),format.raw/*63.225*/("""}"""),format.raw/*63.226*/("""}"""),format.raw/*63.227*/(""" """),format.raw/*63.228*/("""Bewertungen)</span></p>
                                <p class="no-margin">Abholzeit: """),format.raw/*64.65*/("""{"""),format.raw/*64.66*/("""{"""),format.raw/*64.67*/("""this.angebot.datum"""),format.raw/*64.85*/("""}"""),format.raw/*64.86*/("""}"""),format.raw/*64.87*/(""" """),format.raw/*64.88*/("""um """),format.raw/*64.91*/("""{"""),format.raw/*64.92*/("""{"""),format.raw/*64.93*/("""this.angebot.zeit"""),format.raw/*64.110*/("""}"""),format.raw/*64.111*/("""}"""),format.raw/*64.112*/("""</p>
                                <p class="no-margin">Ort: <span> """),format.raw/*65.66*/("""{"""),format.raw/*65.67*/("""{"""),format.raw/*65.68*/("""this.plz"""),format.raw/*65.76*/("""}"""),format.raw/*65.77*/("""}"""),format.raw/*65.78*/(""" """),format.raw/*65.79*/("""</span> </p>
                                <p class="card-text"><strong class="preis">CHF """),format.raw/*66.80*/("""{"""),format.raw/*66.81*/("""{"""),format.raw/*66.82*/("""this.angebot.preis"""),format.raw/*66.100*/("""}"""),format.raw/*66.101*/("""}"""),format.raw/*66.102*/("""</strong>
                                    <span class="">Verfügbare Portionen: """),format.raw/*67.74*/("""{"""),format.raw/*67.75*/("""{"""),format.raw/*67.76*/("""this.angebot.mengeVerfuegbar"""),format.raw/*67.104*/("""}"""),format.raw/*67.105*/("""}"""),format.raw/*67.106*/("""</span></p>
                                <button class="btn btn-primary bestellButton" data-id=""""),format.raw/*68.88*/("""{"""),format.raw/*68.89*/("""{"""),format.raw/*68.90*/("""this.angebot.id"""),format.raw/*68.105*/("""}"""),format.raw/*68.106*/("""}"""),format.raw/*68.107*/("""">Bestellen</button>
                            </div>
                        </div>
                    </div>
                </div>
                """),format.raw/*73.17*/("""{"""),format.raw/*73.18*/("""{"""),format.raw/*73.19*/("""/each"""),format.raw/*73.24*/("""}"""),format.raw/*73.25*/("""}"""),format.raw/*73.26*/("""
            """),format.raw/*74.13*/("""</script>
            <div class="cards-items angebote-cards" id="angebote-cards">

            </div>
        </div>
    </div>


""")))}),format.raw/*82.2*/("""
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
object suche extends suche_Scope0.suche
              /*
                  -- GENERATED --
                  DATE: Sat Dec 16 13:59:31 CET 2017
                  SOURCE: C:/dev/git/CheapEat/app/views/suche.scala.html
                  HASH: 67e9c520e4ef315b426f165ef9e39856dd67ea49
                  MATRIX: 827->1|858->24|897->26|931->34|971->48|985->54|1033->82|1113->136|1127->142|1173->168|1241->211|1266->216|1298->223|1326->231|1363->241|1459->310|1488->318|1530->332|1921->695|1950->696|1979->697|2017->707|2046->708|2075->709|2121->727|2433->1011|2462->1012|2491->1013|2525->1020|2554->1021|2583->1022|2773->1184|2802->1185|2831->1186|2874->1201|2903->1202|2932->1203|2998->1241|3027->1242|3056->1243|3094->1254|3123->1255|3152->1256|3218->1294|3405->1452|3435->1453|3465->1454|3498->1458|3528->1459|3558->1460|3689->1563|3718->1564|3747->1565|3779->1569|3808->1570|3837->1571|3905->1611|4085->1762|4115->1763|4145->1764|4178->1768|4208->1769|4238->1770|4369->1873|4398->1874|4427->1875|4458->1878|4487->1879|4516->1880|4582->1918|4611->1919|4640->1920|4672->1924|4701->1925|4730->1926|4796->1964|5084->2224|5113->2225|5142->2226|5175->2231|5204->2232|5233->2233|5295->2267|5421->2365|5450->2366|5479->2367|5514->2374|5544->2375|5574->2376|5946->2720|5975->2721|6004->2722|6039->2729|6069->2730|6099->2731|6602->3206|6631->3207|6660->3208|6706->3226|6735->3227|6764->3228|6793->3229|6903->3311|6932->3312|6961->3313|7008->3332|7037->3333|7066->3334|7096->3335|7185->3396|7214->3397|7243->3398|7296->3423|7325->3424|7354->3425|7383->3426|7676->3691|7705->3692|7734->3693|7780->3710|7810->3711|7840->3712|7943->3786|7973->3787|8003->3788|8046->3802|8076->3803|8106->3804|8136->3805|8166->3806|8196->3807|8226->3808|8272->3825|8302->3826|8332->3827|8362->3828|8479->3917|8508->3918|8537->3919|8583->3937|8612->3938|8641->3939|8670->3940|8701->3943|8730->3944|8759->3945|8805->3962|8835->3963|8865->3964|8964->4035|8993->4036|9022->4037|9058->4045|9087->4046|9116->4047|9145->4048|9266->4141|9295->4142|9324->4143|9371->4161|9401->4162|9431->4163|9543->4247|9572->4248|9601->4249|9658->4277|9688->4278|9718->4279|9846->4379|9875->4380|9904->4381|9948->4396|9978->4397|10008->4398|10194->4556|10223->4557|10252->4558|10285->4563|10314->4564|10343->4565|10385->4579|10555->4719
                  LINES: 32->1|32->1|32->1|34->3|34->3|34->3|34->3|35->4|35->4|35->4|37->6|37->6|38->7|38->7|41->10|43->12|43->12|44->13|51->20|51->20|51->20|51->20|51->20|51->20|52->21|56->25|56->25|56->25|56->25|56->25|56->25|58->27|58->27|58->27|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|60->29|61->30|61->30|61->30|61->30|61->30|61->30|63->32|63->32|63->32|63->32|63->32|63->32|65->34|66->35|66->35|66->35|66->35|66->35|66->35|68->37|68->37|68->37|68->37|68->37|68->37|69->38|69->38|69->38|69->38|69->38|69->38|70->39|73->42|73->42|73->42|73->42|73->42|73->42|74->43|75->44|75->44|75->44|75->44|75->44|75->44|79->48|79->48|79->48|79->48|79->48|79->48|87->56|87->56|87->56|87->56|87->56|87->56|87->56|88->57|88->57|88->57|88->57|88->57|88->57|88->57|89->58|89->58|89->58|89->58|89->58|89->58|89->58|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|96->65|96->65|96->65|96->65|96->65|96->65|96->65|97->66|97->66|97->66|97->66|97->66|97->66|98->67|98->67|98->67|98->67|98->67|98->67|99->68|99->68|99->68|99->68|99->68|99->68|104->73|104->73|104->73|104->73|104->73|104->73|105->74|113->82
                  -- GENERATED --
              */
          
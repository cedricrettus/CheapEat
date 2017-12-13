
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
                                <p class="card-text no-margin">"""),format.raw/*63.64*/("""{"""),format.raw/*63.65*/("""{"""),format.raw/*63.66*/("""this.benutzername"""),format.raw/*63.83*/("""}"""),format.raw/*63.84*/("""}"""),format.raw/*63.85*/(""" """),format.raw/*63.86*/("""<span class="rating">"""),format.raw/*63.107*/("""{"""),format.raw/*63.108*/("""{"""),format.raw/*63.109*/("""this.bewertung"""),format.raw/*63.123*/("""}"""),format.raw/*63.124*/("""}"""),format.raw/*63.125*/(""" """),format.raw/*63.126*/("""| """),format.raw/*63.128*/("""{"""),format.raw/*63.129*/("""{"""),format.raw/*63.130*/("""this.anzBewertung"""),format.raw/*63.147*/("""}"""),format.raw/*63.148*/("""}"""),format.raw/*63.149*/("""</span></p>
                                <p class="no-margin">Abholzeit: """),format.raw/*64.65*/("""{"""),format.raw/*64.66*/("""{"""),format.raw/*64.67*/("""this.angebot.datum"""),format.raw/*64.85*/("""}"""),format.raw/*64.86*/("""}"""),format.raw/*64.87*/(""" """),format.raw/*64.88*/("""um """),format.raw/*64.91*/("""{"""),format.raw/*64.92*/("""{"""),format.raw/*64.93*/("""this.angebot.zeit"""),format.raw/*64.110*/("""}"""),format.raw/*64.111*/("""}"""),format.raw/*64.112*/("""</p>
                                <p class="no-margin">Ort: <span> """),format.raw/*65.66*/("""{"""),format.raw/*65.67*/("""{"""),format.raw/*65.68*/("""this.plz"""),format.raw/*65.76*/("""}"""),format.raw/*65.77*/("""}"""),format.raw/*65.78*/(""" """),format.raw/*65.79*/("""</span> </p>
                                <p class="card-text"><strong class="preis">CHF """),format.raw/*66.80*/("""{"""),format.raw/*66.81*/("""{"""),format.raw/*66.82*/("""this.angebot.preis"""),format.raw/*66.100*/("""}"""),format.raw/*66.101*/("""}"""),format.raw/*66.102*/("""</strong>
                                    <span class="">Portionen: """),format.raw/*67.63*/("""{"""),format.raw/*67.64*/("""{"""),format.raw/*67.65*/("""this.angebot.menge"""),format.raw/*67.83*/("""}"""),format.raw/*67.84*/("""}"""),format.raw/*67.85*/("""</span></p>
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
                  DATE: Wed Dec 13 16:41:34 CET 2017
                  SOURCE: C:/dev/git/CheapEat/app/views/suche.scala.html
                  HASH: dd04b443a234daa22fca0e93c7fecac7a390b9cf
                  MATRIX: 827->1|858->24|897->26|931->34|971->48|985->54|1033->82|1113->136|1127->142|1173->168|1241->211|1266->216|1298->223|1326->231|1363->241|1459->310|1488->318|1530->332|1921->695|1950->696|1979->697|2017->707|2046->708|2075->709|2121->727|2433->1011|2462->1012|2491->1013|2525->1020|2554->1021|2583->1022|2773->1184|2802->1185|2831->1186|2874->1201|2903->1202|2932->1203|2998->1241|3027->1242|3056->1243|3094->1254|3123->1255|3152->1256|3218->1294|3405->1452|3435->1453|3465->1454|3498->1458|3528->1459|3558->1460|3689->1563|3718->1564|3747->1565|3779->1569|3808->1570|3837->1571|3905->1611|4085->1762|4115->1763|4145->1764|4178->1768|4208->1769|4238->1770|4369->1873|4398->1874|4427->1875|4458->1878|4487->1879|4516->1880|4582->1918|4611->1919|4640->1920|4672->1924|4701->1925|4730->1926|4796->1964|5084->2224|5113->2225|5142->2226|5175->2231|5204->2232|5233->2233|5295->2267|5421->2365|5450->2366|5479->2367|5514->2374|5544->2375|5574->2376|5946->2720|5975->2721|6004->2722|6039->2729|6069->2730|6099->2731|6602->3206|6631->3207|6660->3208|6706->3226|6735->3227|6764->3228|6793->3229|6903->3311|6932->3312|6961->3313|7008->3332|7037->3333|7066->3334|7096->3335|7185->3396|7214->3397|7243->3398|7296->3423|7325->3424|7354->3425|7383->3426|7649->3664|7678->3665|7707->3666|7752->3683|7781->3684|7810->3685|7839->3686|7889->3707|7919->3708|7949->3709|7992->3723|8022->3724|8052->3725|8082->3726|8113->3728|8143->3729|8173->3730|8219->3747|8249->3748|8279->3749|8384->3826|8413->3827|8442->3828|8488->3846|8517->3847|8546->3848|8575->3849|8606->3852|8635->3853|8664->3854|8710->3871|8740->3872|8770->3873|8869->3944|8898->3945|8927->3946|8963->3954|8992->3955|9021->3956|9050->3957|9171->4050|9200->4051|9229->4052|9276->4070|9306->4071|9336->4072|9437->4145|9466->4146|9495->4147|9541->4165|9570->4166|9599->4167|9727->4267|9756->4268|9785->4269|9829->4284|9859->4285|9889->4286|10075->4444|10104->4445|10133->4446|10166->4451|10195->4452|10224->4453|10266->4467|10436->4607
                  LINES: 32->1|32->1|32->1|34->3|34->3|34->3|34->3|35->4|35->4|35->4|37->6|37->6|38->7|38->7|41->10|43->12|43->12|44->13|51->20|51->20|51->20|51->20|51->20|51->20|52->21|56->25|56->25|56->25|56->25|56->25|56->25|58->27|58->27|58->27|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|60->29|61->30|61->30|61->30|61->30|61->30|61->30|63->32|63->32|63->32|63->32|63->32|63->32|65->34|66->35|66->35|66->35|66->35|66->35|66->35|68->37|68->37|68->37|68->37|68->37|68->37|69->38|69->38|69->38|69->38|69->38|69->38|70->39|73->42|73->42|73->42|73->42|73->42|73->42|74->43|75->44|75->44|75->44|75->44|75->44|75->44|79->48|79->48|79->48|79->48|79->48|79->48|87->56|87->56|87->56|87->56|87->56|87->56|87->56|88->57|88->57|88->57|88->57|88->57|88->57|88->57|89->58|89->58|89->58|89->58|89->58|89->58|89->58|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|95->64|96->65|96->65|96->65|96->65|96->65|96->65|96->65|97->66|97->66|97->66|97->66|97->66|97->66|98->67|98->67|98->67|98->67|98->67|98->67|99->68|99->68|99->68|99->68|99->68|99->68|104->73|104->73|104->73|104->73|104->73|104->73|105->74|113->82
                  -- GENERATED --
              */
          

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
            """),format.raw/*13.13*/("""<h1>Angebote</h1>
            <form id="filter-form">
                <input id="filter-datum" type="date">
                <small>Gib das gewünschte Abholdatum ein um die Suche einzuschränken</small>
            </form>

            <script id="angebote-template" type="text/x-handlebars-template">

                """),format.raw/*21.17*/("""{"""),format.raw/*21.18*/("""{"""),format.raw/*21.19*/("""#each this"""),format.raw/*21.29*/("""}"""),format.raw/*21.30*/("""}"""),format.raw/*21.31*/("""
                """),format.raw/*22.17*/("""<div class="card">
                    <div class="row">
                        <div class="col-md-3">
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
                        <div class="col-md-6">
                            <div class="card-body">
                                <h4 class="card-title"> """),format.raw/*56.57*/("""{"""),format.raw/*56.58*/("""{"""),format.raw/*56.59*/("""this.angebot.titel"""),format.raw/*56.77*/("""}"""),format.raw/*56.78*/("""}"""),format.raw/*56.79*/(""" """),format.raw/*56.80*/("""</h4>
                                <h6 class="card-subtitle mb-2 text-muted"> """),format.raw/*57.76*/("""{"""),format.raw/*57.77*/("""{"""),format.raw/*57.78*/("""this.angebot.kueche"""),format.raw/*57.97*/("""}"""),format.raw/*57.98*/("""}"""),format.raw/*57.99*/(""" """),format.raw/*57.100*/("""</h6>
                                <p class="card-text"> """),format.raw/*58.55*/("""{"""),format.raw/*58.56*/("""{"""),format.raw/*58.57*/("""this.angebot.beschreibung"""),format.raw/*58.82*/("""}"""),format.raw/*58.83*/("""}"""),format.raw/*58.84*/(""" """),format.raw/*58.85*/("""</p>
                            </div>
                        </div>
                        <div class="col-md-3">
                            <div class="card-body">
                                <p class="card-text">Username <span class="">Bewertung</span></p>
                                <p class="card-text">Ort: <span> """),format.raw/*64.66*/("""{"""),format.raw/*64.67*/("""{"""),format.raw/*64.68*/("""this.angebot.plz"""),format.raw/*64.84*/("""}"""),format.raw/*64.85*/("""}"""),format.raw/*64.86*/(""" """),format.raw/*64.87*/("""</span> </p>
                                <p class="card-text"><span class="preis">"""),format.raw/*65.74*/("""{"""),format.raw/*65.75*/("""{"""),format.raw/*65.76*/("""this.angebot.preis"""),format.raw/*65.94*/("""}"""),format.raw/*65.95*/("""}"""),format.raw/*65.96*/(""" """),format.raw/*65.97*/("""CHF</span>
                                    <span class="">Portionen: """),format.raw/*66.63*/("""{"""),format.raw/*66.64*/("""{"""),format.raw/*66.65*/("""this.angebot.menge"""),format.raw/*66.83*/("""}"""),format.raw/*66.84*/("""}"""),format.raw/*66.85*/("""</span></p>
                                <button class="btn btn-primary bestellButton" data-id=""""),format.raw/*67.88*/("""{"""),format.raw/*67.89*/("""{"""),format.raw/*67.90*/("""this.angebot.id"""),format.raw/*67.105*/("""}"""),format.raw/*67.106*/("""}"""),format.raw/*67.107*/("""">Bestellen</button>
                            </div>
                        </div>
                    </div>
                </div>
                """),format.raw/*72.17*/("""{"""),format.raw/*72.18*/("""{"""),format.raw/*72.19*/("""/each"""),format.raw/*72.24*/("""}"""),format.raw/*72.25*/("""}"""),format.raw/*72.26*/("""

            """),format.raw/*74.13*/("""</script>
            <div class="cards-items angebote-cards" id="angebote-cards">

            </div>
        </div>
    </div>





""")))}),format.raw/*85.2*/("""
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
                  DATE: Mon Dec 11 22:06:10 CET 2017
                  SOURCE: C:/dev/git/CheapEat/app/views/suche.scala.html
                  HASH: c0dfa549fe5190b3575e0894f80219938a12eaf3
                  MATRIX: 827->1|858->24|897->26|931->34|971->48|985->54|1033->82|1113->136|1127->142|1173->168|1241->211|1266->216|1298->223|1326->231|1363->241|1459->310|1488->318|1530->332|1883->657|1912->658|1941->659|1979->669|2008->670|2037->671|2083->689|2273->851|2302->852|2331->853|2365->860|2394->861|2423->862|2613->1024|2642->1025|2671->1026|2714->1041|2743->1042|2772->1043|2838->1081|2867->1082|2896->1083|2934->1094|2963->1095|2992->1096|3058->1134|3245->1292|3275->1293|3305->1294|3338->1298|3368->1299|3398->1300|3529->1403|3558->1404|3587->1405|3619->1409|3648->1410|3677->1411|3745->1451|3925->1602|3955->1603|3985->1604|4018->1608|4048->1609|4078->1610|4209->1713|4238->1714|4267->1715|4298->1718|4327->1719|4356->1720|4422->1758|4451->1759|4480->1760|4512->1764|4541->1765|4570->1766|4636->1804|4924->2064|4953->2065|4982->2066|5015->2071|5044->2072|5073->2073|5135->2107|5261->2205|5290->2206|5319->2207|5354->2214|5384->2215|5414->2216|5786->2560|5815->2561|5844->2562|5879->2569|5909->2570|5939->2571|6442->3046|6471->3047|6500->3048|6546->3066|6575->3067|6604->3068|6633->3069|6743->3151|6772->3152|6801->3153|6848->3172|6877->3173|6906->3174|6936->3175|7025->3236|7054->3237|7083->3238|7136->3263|7165->3264|7194->3265|7223->3266|7590->3605|7619->3606|7648->3607|7692->3623|7721->3624|7750->3625|7779->3626|7894->3713|7923->3714|7952->3715|7998->3733|8027->3734|8056->3735|8085->3736|8187->3810|8216->3811|8245->3812|8291->3830|8320->3831|8349->3832|8477->3932|8506->3933|8535->3934|8579->3949|8609->3950|8639->3951|8825->4109|8854->4110|8883->4111|8916->4116|8945->4117|8974->4118|9018->4134|9194->4280
                  LINES: 32->1|32->1|32->1|34->3|34->3|34->3|34->3|35->4|35->4|35->4|37->6|37->6|38->7|38->7|41->10|43->12|43->12|44->13|52->21|52->21|52->21|52->21|52->21|52->21|53->22|56->25|56->25|56->25|56->25|56->25|56->25|58->27|58->27|58->27|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|60->29|61->30|61->30|61->30|61->30|61->30|61->30|63->32|63->32|63->32|63->32|63->32|63->32|65->34|66->35|66->35|66->35|66->35|66->35|66->35|68->37|68->37|68->37|68->37|68->37|68->37|69->38|69->38|69->38|69->38|69->38|69->38|70->39|73->42|73->42|73->42|73->42|73->42|73->42|74->43|75->44|75->44|75->44|75->44|75->44|75->44|79->48|79->48|79->48|79->48|79->48|79->48|87->56|87->56|87->56|87->56|87->56|87->56|87->56|88->57|88->57|88->57|88->57|88->57|88->57|88->57|89->58|89->58|89->58|89->58|89->58|89->58|89->58|95->64|95->64|95->64|95->64|95->64|95->64|95->64|96->65|96->65|96->65|96->65|96->65|96->65|96->65|97->66|97->66|97->66|97->66|97->66|97->66|98->67|98->67|98->67|98->67|98->67|98->67|103->72|103->72|103->72|103->72|103->72|103->72|105->74|116->85
                  -- GENERATED --
              */
          
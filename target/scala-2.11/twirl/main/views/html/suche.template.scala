
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
            <script id="angebote-template" type="text/x-handlebars-template">

                """),format.raw/*16.17*/("""{"""),format.raw/*16.18*/("""{"""),format.raw/*16.19*/("""#each this"""),format.raw/*16.29*/("""}"""),format.raw/*16.30*/("""}"""),format.raw/*16.31*/("""
                """),format.raw/*17.17*/("""<div class="card">
                    <div class="row">
                        <div class="col-md-3">
                            <div id="thumbnail-carousel"""),format.raw/*20.56*/("""{"""),format.raw/*20.57*/("""{"""),format.raw/*20.58*/("""@index"""),format.raw/*20.65*/("""}"""),format.raw/*20.66*/("""}"""),format.raw/*20.67*/("""" class="carousel slide" data-ride=false data-interval="3000">
                                <div class="carousel-inner">
                                    """),format.raw/*22.37*/("""{"""),format.raw/*22.38*/("""{"""),format.raw/*22.39*/("""#each this.urls"""),format.raw/*22.54*/("""}"""),format.raw/*22.55*/("""}"""),format.raw/*22.56*/("""
                                    """),format.raw/*23.37*/("""{"""),format.raw/*23.38*/("""{"""),format.raw/*23.39*/("""#if @first"""),format.raw/*23.50*/("""}"""),format.raw/*23.51*/("""}"""),format.raw/*23.52*/("""
                                    """),format.raw/*24.37*/("""<div class="carousel-item active">
                                        <img class="d-block img-fluid mh-100 card-img-top" src="http://s3.fgoeldi.com/big/"""),format.raw/*25.123*/("""{"""),format.raw/*25.124*/("""{"""),format.raw/*25.125*/("""this"""),format.raw/*25.129*/("""}"""),format.raw/*25.130*/("""}"""),format.raw/*25.131*/("""" alt="Angebot Bild">
                                    </div>
                                    """),format.raw/*27.37*/("""{"""),format.raw/*27.38*/("""{"""),format.raw/*27.39*/("""else"""),format.raw/*27.43*/("""}"""),format.raw/*27.44*/("""}"""),format.raw/*27.45*/("""

                                    """),format.raw/*29.37*/("""<div class="carousel-item">
                                        <img class="d-block img-fluid mh-100 card-img-top" src="http://s3.fgoeldi.com/big/"""),format.raw/*30.123*/("""{"""),format.raw/*30.124*/("""{"""),format.raw/*30.125*/("""this"""),format.raw/*30.129*/("""}"""),format.raw/*30.130*/("""}"""),format.raw/*30.131*/("""" alt="Angebot Bild">
                                    </div>
                                    """),format.raw/*32.37*/("""{"""),format.raw/*32.38*/("""{"""),format.raw/*32.39*/("""/if"""),format.raw/*32.42*/("""}"""),format.raw/*32.43*/("""}"""),format.raw/*32.44*/("""
                                    """),format.raw/*33.37*/("""{"""),format.raw/*33.38*/("""{"""),format.raw/*33.39*/("""else"""),format.raw/*33.43*/("""}"""),format.raw/*33.44*/("""}"""),format.raw/*33.45*/("""
                                    """),format.raw/*34.37*/("""<div class="carousel-item active">
                                        <img class="d-block img-fluid mh-100 card-img-top" src="assets/images/burger1.jpg" alt="Angebot Bild">
                                    </div>
                                    """),format.raw/*37.37*/("""{"""),format.raw/*37.38*/("""{"""),format.raw/*37.39*/("""/each"""),format.raw/*37.44*/("""}"""),format.raw/*37.45*/("""}"""),format.raw/*37.46*/("""
                                """),format.raw/*38.33*/("""</div>
                                <a class="carousel-control-prev" href="#thumbnail-carousel"""),format.raw/*39.91*/("""{"""),format.raw/*39.92*/("""{"""),format.raw/*39.93*/("""@index"""),format.raw/*39.100*/("""}"""),format.raw/*39.101*/("""}"""),format.raw/*39.102*/("""" role="button" data-slide="prev">
                                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                                    <span class="sr-only">Previous</span>
                                </a>
                                <a class="carousel-control-next" href="#thumbnail-carousel"""),format.raw/*43.91*/("""{"""),format.raw/*43.92*/("""{"""),format.raw/*43.93*/("""@index"""),format.raw/*43.100*/("""}"""),format.raw/*43.101*/("""}"""),format.raw/*43.102*/("""" role="button" data-slide="next">
                                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                                    <span class="sr-only">Next</span>
                                </a>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="card-body">
                                <h4 class="card-title"> """),format.raw/*51.57*/("""{"""),format.raw/*51.58*/("""{"""),format.raw/*51.59*/("""this.angebot.titel"""),format.raw/*51.77*/("""}"""),format.raw/*51.78*/("""}"""),format.raw/*51.79*/(""" """),format.raw/*51.80*/("""</h4>
                                <h6 class="card-subtitle mb-2 text-muted"> """),format.raw/*52.76*/("""{"""),format.raw/*52.77*/("""{"""),format.raw/*52.78*/("""this.angebot.kueche"""),format.raw/*52.97*/("""}"""),format.raw/*52.98*/("""}"""),format.raw/*52.99*/(""" """),format.raw/*52.100*/("""</h6>
                                <p class="card-text"> """),format.raw/*53.55*/("""{"""),format.raw/*53.56*/("""{"""),format.raw/*53.57*/("""this.angebot.beschreibung"""),format.raw/*53.82*/("""}"""),format.raw/*53.83*/("""}"""),format.raw/*53.84*/(""" """),format.raw/*53.85*/("""</p>
                            </div>
                        </div>
                        <div class="col-md-3">
                            <div class="card-body">
                                <p class="card-text">Username <span class="">Bewertung</span></p>
                                <p class="card-text">Ort: <span> """),format.raw/*59.66*/("""{"""),format.raw/*59.67*/("""{"""),format.raw/*59.68*/("""this.angebot.plz"""),format.raw/*59.84*/("""}"""),format.raw/*59.85*/("""}"""),format.raw/*59.86*/(""" """),format.raw/*59.87*/("""</span> </p>
                                <p class="card-text"><span class="preis">"""),format.raw/*60.74*/("""{"""),format.raw/*60.75*/("""{"""),format.raw/*60.76*/("""this.angebot.preis"""),format.raw/*60.94*/("""}"""),format.raw/*60.95*/("""}"""),format.raw/*60.96*/(""" """),format.raw/*60.97*/("""CHF</span>
                                    <span class="">Portionen: """),format.raw/*61.63*/("""{"""),format.raw/*61.64*/("""{"""),format.raw/*61.65*/("""this.angebot.menge"""),format.raw/*61.83*/("""}"""),format.raw/*61.84*/("""}"""),format.raw/*61.85*/("""</span></p>
                                <button class="btn btn-primary bestellButton" data-id=""""),format.raw/*62.88*/("""{"""),format.raw/*62.89*/("""{"""),format.raw/*62.90*/("""this.angebot.id"""),format.raw/*62.105*/("""}"""),format.raw/*62.106*/("""}"""),format.raw/*62.107*/("""">Bestellen</button>
                            </div>
                        </div>
                    </div>
                </div>
                """),format.raw/*67.17*/("""{"""),format.raw/*67.18*/("""{"""),format.raw/*67.19*/("""/each"""),format.raw/*67.24*/("""}"""),format.raw/*67.25*/("""}"""),format.raw/*67.26*/("""

            """),format.raw/*69.13*/("""</script>
            <div class="cards-items angebote-cards" id="angebote-cards">

            </div>
        </div>
    </div>





""")))}),format.raw/*80.2*/("""
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
                  DATE: Sun Dec 10 21:02:35 CET 2017
                  SOURCE: C:/dev/git/CheapEat/app/views/suche.scala.html
                  HASH: 98979f8c7b4a267df5482892fa8e89c0609275be
                  MATRIX: 827->1|858->24|897->26|931->34|971->48|985->54|1033->82|1113->136|1127->142|1173->168|1241->211|1266->216|1298->223|1326->231|1363->241|1459->310|1488->318|1530->332|1674->448|1703->449|1732->450|1770->460|1799->461|1828->462|1874->480|2064->642|2093->643|2122->644|2156->651|2185->652|2214->653|2404->815|2433->816|2462->817|2505->832|2534->833|2563->834|2629->872|2658->873|2687->874|2725->885|2754->886|2783->887|2849->925|3036->1083|3066->1084|3096->1085|3129->1089|3159->1090|3189->1091|3320->1194|3349->1195|3378->1196|3410->1200|3439->1201|3468->1202|3536->1242|3716->1393|3746->1394|3776->1395|3809->1399|3839->1400|3869->1401|4000->1504|4029->1505|4058->1506|4089->1509|4118->1510|4147->1511|4213->1549|4242->1550|4271->1551|4303->1555|4332->1556|4361->1557|4427->1595|4715->1855|4744->1856|4773->1857|4806->1862|4835->1863|4864->1864|4926->1898|5052->1996|5081->1997|5110->1998|5145->2005|5175->2006|5205->2007|5577->2351|5606->2352|5635->2353|5670->2360|5700->2361|5730->2362|6233->2837|6262->2838|6291->2839|6337->2857|6366->2858|6395->2859|6424->2860|6534->2942|6563->2943|6592->2944|6639->2963|6668->2964|6697->2965|6727->2966|6816->3027|6845->3028|6874->3029|6927->3054|6956->3055|6985->3056|7014->3057|7381->3396|7410->3397|7439->3398|7483->3414|7512->3415|7541->3416|7570->3417|7685->3504|7714->3505|7743->3506|7789->3524|7818->3525|7847->3526|7876->3527|7978->3601|8007->3602|8036->3603|8082->3621|8111->3622|8140->3623|8268->3723|8297->3724|8326->3725|8370->3740|8400->3741|8430->3742|8616->3900|8645->3901|8674->3902|8707->3907|8736->3908|8765->3909|8809->3925|8985->4071
                  LINES: 32->1|32->1|32->1|34->3|34->3|34->3|34->3|35->4|35->4|35->4|37->6|37->6|38->7|38->7|41->10|43->12|43->12|44->13|47->16|47->16|47->16|47->16|47->16|47->16|48->17|51->20|51->20|51->20|51->20|51->20|51->20|53->22|53->22|53->22|53->22|53->22|53->22|54->23|54->23|54->23|54->23|54->23|54->23|55->24|56->25|56->25|56->25|56->25|56->25|56->25|58->27|58->27|58->27|58->27|58->27|58->27|60->29|61->30|61->30|61->30|61->30|61->30|61->30|63->32|63->32|63->32|63->32|63->32|63->32|64->33|64->33|64->33|64->33|64->33|64->33|65->34|68->37|68->37|68->37|68->37|68->37|68->37|69->38|70->39|70->39|70->39|70->39|70->39|70->39|74->43|74->43|74->43|74->43|74->43|74->43|82->51|82->51|82->51|82->51|82->51|82->51|82->51|83->52|83->52|83->52|83->52|83->52|83->52|83->52|84->53|84->53|84->53|84->53|84->53|84->53|84->53|90->59|90->59|90->59|90->59|90->59|90->59|90->59|91->60|91->60|91->60|91->60|91->60|91->60|91->60|92->61|92->61|92->61|92->61|92->61|92->61|93->62|93->62|93->62|93->62|93->62|93->62|98->67|98->67|98->67|98->67|98->67|98->67|100->69|111->80
                  -- GENERATED --
              */
          
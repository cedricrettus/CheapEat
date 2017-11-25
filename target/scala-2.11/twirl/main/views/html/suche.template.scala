
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

    <div class="jumbotron jumbotron-fluid">
        <div class="container">
            <img id="img-logo" src="/assets/images/logo.png">
        </div>
    </div>

    <nav class="navbar navbar-expand-md sticky-top navbar-light bg-light">
        <div class="container">
            <a class="navbar-brand" href="/">CheapEat</a>
            <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse justify-content-between" id="navbarNavAltMarkup">
                <form class="form-inline my-2 my-lg-0">
                    <button type="button" id="callModal" class="btn" data-toggle="modal" data-target="#exampleModal">
                        Angebot erstellen!
                    </button>
                </form>
                <form id="suche" class="form-inline my-2 my-lg-0" action="/search" >
                    <input class="form-control mr-sm-2" id="fieldPlz" type="text" name="plz" placeholder="PLZ" aria-label="Search">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit"><i class="fa fa-search" aria-hidden="true"></i></button>
                </form>
            </div>
        </div>
    </nav>

    """),_display_(/*32.6*/modals()),format.raw/*32.14*/("""


    """),format.raw/*35.5*/("""<div class="content">
        <div class="container">
            """),_display_(/*37.14*/alerts()),format.raw/*37.22*/("""
            """),format.raw/*38.13*/("""<h1>Angebote</h1>
            <script id="angebote-template" type="text/x-handlebars-template">

                """),format.raw/*41.17*/("""{"""),format.raw/*41.18*/("""{"""),format.raw/*41.19*/("""#each this"""),format.raw/*41.29*/("""}"""),format.raw/*41.30*/("""}"""),format.raw/*41.31*/("""
                """),format.raw/*42.17*/("""<div class="card">
                    <div class="row">
                        <div class="col-md-3">
                            <div id="thumbnail-carousel"""),format.raw/*45.56*/("""{"""),format.raw/*45.57*/("""{"""),format.raw/*45.58*/("""@index"""),format.raw/*45.65*/("""}"""),format.raw/*45.66*/("""}"""),format.raw/*45.67*/("""" class="carousel slide" data-ride=false data-interval="3000">
                                <div class="carousel-inner">
                                    """),format.raw/*47.37*/("""{"""),format.raw/*47.38*/("""{"""),format.raw/*47.39*/("""#each this.urls"""),format.raw/*47.54*/("""}"""),format.raw/*47.55*/("""}"""),format.raw/*47.56*/("""
                                    """),format.raw/*48.37*/("""{"""),format.raw/*48.38*/("""{"""),format.raw/*48.39*/("""#if @first"""),format.raw/*48.50*/("""}"""),format.raw/*48.51*/("""}"""),format.raw/*48.52*/("""
                                    """),format.raw/*49.37*/("""<div class="carousel-item active">
                                        <img class="d-block img-fluid mh-100 card-img-top" src="http://s3.fgoeldi.com/big/"""),format.raw/*50.123*/("""{"""),format.raw/*50.124*/("""{"""),format.raw/*50.125*/("""this"""),format.raw/*50.129*/("""}"""),format.raw/*50.130*/("""}"""),format.raw/*50.131*/("""" alt="Angebot Bild">
                                    </div>
                                    """),format.raw/*52.37*/("""{"""),format.raw/*52.38*/("""{"""),format.raw/*52.39*/("""else"""),format.raw/*52.43*/("""}"""),format.raw/*52.44*/("""}"""),format.raw/*52.45*/("""

                                    """),format.raw/*54.37*/("""<div class="carousel-item">
                                        <img class="d-block img-fluid mh-100 card-img-top" src="http://s3.fgoeldi.com/big/"""),format.raw/*55.123*/("""{"""),format.raw/*55.124*/("""{"""),format.raw/*55.125*/("""this"""),format.raw/*55.129*/("""}"""),format.raw/*55.130*/("""}"""),format.raw/*55.131*/("""" alt="Angebot Bild">
                                    </div>
                                    """),format.raw/*57.37*/("""{"""),format.raw/*57.38*/("""{"""),format.raw/*57.39*/("""/if"""),format.raw/*57.42*/("""}"""),format.raw/*57.43*/("""}"""),format.raw/*57.44*/("""
                                    """),format.raw/*58.37*/("""{"""),format.raw/*58.38*/("""{"""),format.raw/*58.39*/("""else"""),format.raw/*58.43*/("""}"""),format.raw/*58.44*/("""}"""),format.raw/*58.45*/("""
                                    """),format.raw/*59.37*/("""<div class="carousel-item active">
                                        <img class="d-block img-fluid mh-100 card-img-top" src="assets/images/burger1.jpg" alt="Angebot Bild">
                                    </div>
                                    """),format.raw/*62.37*/("""{"""),format.raw/*62.38*/("""{"""),format.raw/*62.39*/("""/each"""),format.raw/*62.44*/("""}"""),format.raw/*62.45*/("""}"""),format.raw/*62.46*/("""
                                """),format.raw/*63.33*/("""</div>
                                <a class="carousel-control-prev" href="#thumbnail-carousel"""),format.raw/*64.91*/("""{"""),format.raw/*64.92*/("""{"""),format.raw/*64.93*/("""@index"""),format.raw/*64.100*/("""}"""),format.raw/*64.101*/("""}"""),format.raw/*64.102*/("""" role="button" data-slide="prev">
                                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                                    <span class="sr-only">Previous</span>
                                </a>
                                <a class="carousel-control-next" href="#thumbnail-carousel"""),format.raw/*68.91*/("""{"""),format.raw/*68.92*/("""{"""),format.raw/*68.93*/("""@index"""),format.raw/*68.100*/("""}"""),format.raw/*68.101*/("""}"""),format.raw/*68.102*/("""" role="button" data-slide="next">
                                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                                    <span class="sr-only">Next</span>
                                </a>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="card-body">
                                <h4 class="card-title"> """),format.raw/*76.57*/("""{"""),format.raw/*76.58*/("""{"""),format.raw/*76.59*/("""this.angebot.titel"""),format.raw/*76.77*/("""}"""),format.raw/*76.78*/("""}"""),format.raw/*76.79*/(""" """),format.raw/*76.80*/("""</h4>
                                <h6 class="card-subtitle mb-2 text-muted"> """),format.raw/*77.76*/("""{"""),format.raw/*77.77*/("""{"""),format.raw/*77.78*/("""this.angebot.kueche"""),format.raw/*77.97*/("""}"""),format.raw/*77.98*/("""}"""),format.raw/*77.99*/(""" """),format.raw/*77.100*/("""</h6>
                                <p class="card-text"> """),format.raw/*78.55*/("""{"""),format.raw/*78.56*/("""{"""),format.raw/*78.57*/("""this.angebot.beschreibung"""),format.raw/*78.82*/("""}"""),format.raw/*78.83*/("""}"""),format.raw/*78.84*/(""" """),format.raw/*78.85*/("""</p>
                            </div>
                        </div>
                        <div class="col-md-3">
                            <div class="card-body">
                                <p class="card-text">Username <span class="">Bewertung</span></p>
                                <p class="card-text">Ort: <span> """),format.raw/*84.66*/("""{"""),format.raw/*84.67*/("""{"""),format.raw/*84.68*/("""this.angebot.plz"""),format.raw/*84.84*/("""}"""),format.raw/*84.85*/("""}"""),format.raw/*84.86*/(""" """),format.raw/*84.87*/("""</span> </p>
                                <p class="card-text"><span class="preis">"""),format.raw/*85.74*/("""{"""),format.raw/*85.75*/("""{"""),format.raw/*85.76*/("""this.angebot.preis"""),format.raw/*85.94*/("""}"""),format.raw/*85.95*/("""}"""),format.raw/*85.96*/(""" """),format.raw/*85.97*/("""CHF</span>
                                    <span class="">Portionen: """),format.raw/*86.63*/("""{"""),format.raw/*86.64*/("""{"""),format.raw/*86.65*/("""this.angebot.menge"""),format.raw/*86.83*/("""}"""),format.raw/*86.84*/("""}"""),format.raw/*86.85*/("""</span></p>
                                <button class="btn btn-primary bestellButton" data-id=""""),format.raw/*87.88*/("""{"""),format.raw/*87.89*/("""{"""),format.raw/*87.90*/("""this.angebot.id"""),format.raw/*87.105*/("""}"""),format.raw/*87.106*/("""}"""),format.raw/*87.107*/("""">Bestellen</button>
                            </div>
                        </div>
                    </div>
                </div>
                """),format.raw/*92.17*/("""{"""),format.raw/*92.18*/("""{"""),format.raw/*92.19*/("""/each"""),format.raw/*92.24*/("""}"""),format.raw/*92.25*/("""}"""),format.raw/*92.26*/("""

            """),format.raw/*94.13*/("""</script>
            <div class="cards-items angebote-cards" id="angebote-cards">

            </div>
        </div>
    </div>





""")))}),format.raw/*105.2*/("""
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
                  DATE: Sat Nov 25 15:33:01 CET 2017
                  SOURCE: C:/dev/git/CheapEat/app/views/suche.scala.html
                  HASH: 0fe7c71f762b0bbd54c518e5d468d51cecd1d2fd
                  MATRIX: 827->1|858->24|897->26|931->34|971->48|985->54|1033->82|1113->136|1127->142|1173->168|2703->1672|2732->1680|2769->1690|2865->1759|2894->1767|2936->1781|3080->1897|3109->1898|3138->1899|3176->1909|3205->1910|3234->1911|3280->1929|3470->2091|3499->2092|3528->2093|3562->2100|3591->2101|3620->2102|3810->2264|3839->2265|3868->2266|3911->2281|3940->2282|3969->2283|4035->2321|4064->2322|4093->2323|4131->2334|4160->2335|4189->2336|4255->2374|4442->2532|4472->2533|4502->2534|4535->2538|4565->2539|4595->2540|4726->2643|4755->2644|4784->2645|4816->2649|4845->2650|4874->2651|4942->2691|5122->2842|5152->2843|5182->2844|5215->2848|5245->2849|5275->2850|5406->2953|5435->2954|5464->2955|5495->2958|5524->2959|5553->2960|5619->2998|5648->2999|5677->3000|5709->3004|5738->3005|5767->3006|5833->3044|6121->3304|6150->3305|6179->3306|6212->3311|6241->3312|6270->3313|6332->3347|6458->3445|6487->3446|6516->3447|6551->3454|6581->3455|6611->3456|6983->3800|7012->3801|7041->3802|7076->3809|7106->3810|7136->3811|7639->4286|7668->4287|7697->4288|7743->4306|7772->4307|7801->4308|7830->4309|7940->4391|7969->4392|7998->4393|8045->4412|8074->4413|8103->4414|8133->4415|8222->4476|8251->4477|8280->4478|8333->4503|8362->4504|8391->4505|8420->4506|8787->4845|8816->4846|8845->4847|8889->4863|8918->4864|8947->4865|8976->4866|9091->4953|9120->4954|9149->4955|9195->4973|9224->4974|9253->4975|9282->4976|9384->5050|9413->5051|9442->5052|9488->5070|9517->5071|9546->5072|9674->5172|9703->5173|9732->5174|9776->5189|9806->5190|9836->5191|10022->5349|10051->5350|10080->5351|10113->5356|10142->5357|10171->5358|10215->5374|10392->5520
                  LINES: 32->1|32->1|32->1|34->3|34->3|34->3|34->3|35->4|35->4|35->4|63->32|63->32|66->35|68->37|68->37|69->38|72->41|72->41|72->41|72->41|72->41|72->41|73->42|76->45|76->45|76->45|76->45|76->45|76->45|78->47|78->47|78->47|78->47|78->47|78->47|79->48|79->48|79->48|79->48|79->48|79->48|80->49|81->50|81->50|81->50|81->50|81->50|81->50|83->52|83->52|83->52|83->52|83->52|83->52|85->54|86->55|86->55|86->55|86->55|86->55|86->55|88->57|88->57|88->57|88->57|88->57|88->57|89->58|89->58|89->58|89->58|89->58|89->58|90->59|93->62|93->62|93->62|93->62|93->62|93->62|94->63|95->64|95->64|95->64|95->64|95->64|95->64|99->68|99->68|99->68|99->68|99->68|99->68|107->76|107->76|107->76|107->76|107->76|107->76|107->76|108->77|108->77|108->77|108->77|108->77|108->77|108->77|109->78|109->78|109->78|109->78|109->78|109->78|109->78|115->84|115->84|115->84|115->84|115->84|115->84|115->84|116->85|116->85|116->85|116->85|116->85|116->85|116->85|117->86|117->86|117->86|117->86|117->86|117->86|118->87|118->87|118->87|118->87|118->87|118->87|123->92|123->92|123->92|123->92|123->92|123->92|125->94|136->105
                  -- GENERATED --
              */
          
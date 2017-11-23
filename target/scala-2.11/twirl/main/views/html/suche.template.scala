
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
                                <!-- <img class="card-img-top" src="assets/images/burger1.jpg" alt="Card image cap"> -->
                            <div id="thumbnail-carousel"""),format.raw/*46.56*/("""{"""),format.raw/*46.57*/("""{"""),format.raw/*46.58*/("""@index"""),format.raw/*46.65*/("""}"""),format.raw/*46.66*/("""}"""),format.raw/*46.67*/("""" class="carousel slide" data-ride=false data-interval="3000">
                                <div class="carousel-inner">
                                    """),format.raw/*48.37*/("""{"""),format.raw/*48.38*/("""{"""),format.raw/*48.39*/("""#each this.urls"""),format.raw/*48.54*/("""}"""),format.raw/*48.55*/("""}"""),format.raw/*48.56*/("""
                                    """),format.raw/*49.37*/("""{"""),format.raw/*49.38*/("""{"""),format.raw/*49.39*/("""#if @first"""),format.raw/*49.50*/("""}"""),format.raw/*49.51*/("""}"""),format.raw/*49.52*/("""
                                    """),format.raw/*50.37*/("""<div class="carousel-item active">
                                        <img class="d-block img-fluid mh-100 card-img-top" src="http://s3.fgoeldi.com/big/"""),format.raw/*51.123*/("""{"""),format.raw/*51.124*/("""{"""),format.raw/*51.125*/("""this"""),format.raw/*51.129*/("""}"""),format.raw/*51.130*/("""}"""),format.raw/*51.131*/("""" alt="Angebot Bild">
                                    </div>
                                    """),format.raw/*53.37*/("""{"""),format.raw/*53.38*/("""{"""),format.raw/*53.39*/("""else"""),format.raw/*53.43*/("""}"""),format.raw/*53.44*/("""}"""),format.raw/*53.45*/("""

                                    """),format.raw/*55.37*/("""<div class="carousel-item">
                                        <img class="d-block img-fluid mh-100 card-img-top" src="http://s3.fgoeldi.com/big/"""),format.raw/*56.123*/("""{"""),format.raw/*56.124*/("""{"""),format.raw/*56.125*/("""this"""),format.raw/*56.129*/("""}"""),format.raw/*56.130*/("""}"""),format.raw/*56.131*/("""" alt="Angebot Bild">
                                    </div>
                                    """),format.raw/*58.37*/("""{"""),format.raw/*58.38*/("""{"""),format.raw/*58.39*/("""/if"""),format.raw/*58.42*/("""}"""),format.raw/*58.43*/("""}"""),format.raw/*58.44*/("""
                                    """),format.raw/*59.37*/("""{"""),format.raw/*59.38*/("""{"""),format.raw/*59.39*/("""else"""),format.raw/*59.43*/("""}"""),format.raw/*59.44*/("""}"""),format.raw/*59.45*/("""
                                    """),format.raw/*60.37*/("""<div class="carousel-item active">
                                        <img class="d-block img-fluid mh-100 card-img-top" src="assets/images/burger1.jpg" alt="Angebot Bild">
                                    </div>
                                    """),format.raw/*63.37*/("""{"""),format.raw/*63.38*/("""{"""),format.raw/*63.39*/("""/each"""),format.raw/*63.44*/("""}"""),format.raw/*63.45*/("""}"""),format.raw/*63.46*/("""
                                """),format.raw/*64.33*/("""</div>
                                <a class="carousel-control-prev" href="#thumbnail-carousel"""),format.raw/*65.91*/("""{"""),format.raw/*65.92*/("""{"""),format.raw/*65.93*/("""@index"""),format.raw/*65.100*/("""}"""),format.raw/*65.101*/("""}"""),format.raw/*65.102*/("""" role="button" data-slide="prev">
                                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                                    <span class="sr-only">Previous</span>
                                </a>
                                <a class="carousel-control-next" href="#thumbnail-carousel"""),format.raw/*69.91*/("""{"""),format.raw/*69.92*/("""{"""),format.raw/*69.93*/("""@index"""),format.raw/*69.100*/("""}"""),format.raw/*69.101*/("""}"""),format.raw/*69.102*/("""" role="button" data-slide="next">
                                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                                    <span class="sr-only">Next</span>
                                </a>
                            </div>
                        </div>
                        <div class="col-md-6">
                            <div class="card-body">
                                <h4 class="card-title"> """),format.raw/*77.57*/("""{"""),format.raw/*77.58*/("""{"""),format.raw/*77.59*/("""this.angebot.titel"""),format.raw/*77.77*/("""}"""),format.raw/*77.78*/("""}"""),format.raw/*77.79*/(""" """),format.raw/*77.80*/("""</h4>
                                <h6 class="card-subtitle mb-2 text-muted"> """),format.raw/*78.76*/("""{"""),format.raw/*78.77*/("""{"""),format.raw/*78.78*/("""this.angebot.kueche"""),format.raw/*78.97*/("""}"""),format.raw/*78.98*/("""}"""),format.raw/*78.99*/(""" """),format.raw/*78.100*/("""</h6>
                                <p class="card-text"> """),format.raw/*79.55*/("""{"""),format.raw/*79.56*/("""{"""),format.raw/*79.57*/("""this.angebot.beschreibung"""),format.raw/*79.82*/("""}"""),format.raw/*79.83*/("""}"""),format.raw/*79.84*/(""" """),format.raw/*79.85*/("""</p>
                            </div>
                        </div>
                        <div class="col-md-3">
                            <div class="card-body">
                                <p class="card-text">Username <span class="">Bewertung</span></p>
                                <p class="card-text">Ort: <span> """),format.raw/*85.66*/("""{"""),format.raw/*85.67*/("""{"""),format.raw/*85.68*/("""this.angebot.plz"""),format.raw/*85.84*/("""}"""),format.raw/*85.85*/("""}"""),format.raw/*85.86*/(""" """),format.raw/*85.87*/("""</span> </p>
                                <p class="card-text"><span class="preis">"""),format.raw/*86.74*/("""{"""),format.raw/*86.75*/("""{"""),format.raw/*86.76*/("""this.angebot.preis"""),format.raw/*86.94*/("""}"""),format.raw/*86.95*/("""}"""),format.raw/*86.96*/(""" """),format.raw/*86.97*/("""CHF</span>
                                    <span class="">Portionen: """),format.raw/*87.63*/("""{"""),format.raw/*87.64*/("""{"""),format.raw/*87.65*/("""this.angebot.menge"""),format.raw/*87.83*/("""}"""),format.raw/*87.84*/("""}"""),format.raw/*87.85*/("""</span></p>
                                <button class="btn btn-primary bestellButton" data-id=""""),format.raw/*88.88*/("""{"""),format.raw/*88.89*/("""{"""),format.raw/*88.90*/("""this.angebot.id"""),format.raw/*88.105*/("""}"""),format.raw/*88.106*/("""}"""),format.raw/*88.107*/("""">Bestellen</button>
                            </div>
                        </div>
                    </div>
                </div>
                """),format.raw/*93.17*/("""{"""),format.raw/*93.18*/("""{"""),format.raw/*93.19*/("""/each"""),format.raw/*93.24*/("""}"""),format.raw/*93.25*/("""}"""),format.raw/*93.26*/("""

            """),format.raw/*95.13*/("""</script>
            <div class="cards-items angebote-cards" id="angebote-cards">

            </div>
        </div>
    </div>





""")))}),format.raw/*106.2*/("""
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
                  DATE: Thu Nov 23 22:35:28 CET 2017
                  SOURCE: C:/dev/git/CheapEat/app/views/suche.scala.html
                  HASH: 6045a768f55743bfc63decc83d5688e239542e4d
                  MATRIX: 827->1|858->24|897->26|931->34|971->48|985->54|1033->82|1113->136|1127->142|1173->168|2703->1672|2732->1680|2769->1690|2865->1759|2894->1767|2936->1781|3080->1897|3109->1898|3138->1899|3176->1909|3205->1910|3234->1911|3280->1929|3592->2213|3621->2214|3650->2215|3684->2222|3713->2223|3742->2224|3932->2386|3961->2387|3990->2388|4033->2403|4062->2404|4091->2405|4157->2443|4186->2444|4215->2445|4253->2456|4282->2457|4311->2458|4377->2496|4564->2654|4594->2655|4624->2656|4657->2660|4687->2661|4717->2662|4848->2765|4877->2766|4906->2767|4938->2771|4967->2772|4996->2773|5064->2813|5244->2964|5274->2965|5304->2966|5337->2970|5367->2971|5397->2972|5528->3075|5557->3076|5586->3077|5617->3080|5646->3081|5675->3082|5741->3120|5770->3121|5799->3122|5831->3126|5860->3127|5889->3128|5955->3166|6243->3426|6272->3427|6301->3428|6334->3433|6363->3434|6392->3435|6454->3469|6580->3567|6609->3568|6638->3569|6673->3576|6703->3577|6733->3578|7105->3922|7134->3923|7163->3924|7198->3931|7228->3932|7258->3933|7761->4408|7790->4409|7819->4410|7865->4428|7894->4429|7923->4430|7952->4431|8062->4513|8091->4514|8120->4515|8167->4534|8196->4535|8225->4536|8255->4537|8344->4598|8373->4599|8402->4600|8455->4625|8484->4626|8513->4627|8542->4628|8909->4967|8938->4968|8967->4969|9011->4985|9040->4986|9069->4987|9098->4988|9213->5075|9242->5076|9271->5077|9317->5095|9346->5096|9375->5097|9404->5098|9506->5172|9535->5173|9564->5174|9610->5192|9639->5193|9668->5194|9796->5294|9825->5295|9854->5296|9898->5311|9928->5312|9958->5313|10144->5471|10173->5472|10202->5473|10235->5478|10264->5479|10293->5480|10337->5496|10514->5642
                  LINES: 32->1|32->1|32->1|34->3|34->3|34->3|34->3|35->4|35->4|35->4|63->32|63->32|66->35|68->37|68->37|69->38|72->41|72->41|72->41|72->41|72->41|72->41|73->42|77->46|77->46|77->46|77->46|77->46|77->46|79->48|79->48|79->48|79->48|79->48|79->48|80->49|80->49|80->49|80->49|80->49|80->49|81->50|82->51|82->51|82->51|82->51|82->51|82->51|84->53|84->53|84->53|84->53|84->53|84->53|86->55|87->56|87->56|87->56|87->56|87->56|87->56|89->58|89->58|89->58|89->58|89->58|89->58|90->59|90->59|90->59|90->59|90->59|90->59|91->60|94->63|94->63|94->63|94->63|94->63|94->63|95->64|96->65|96->65|96->65|96->65|96->65|96->65|100->69|100->69|100->69|100->69|100->69|100->69|108->77|108->77|108->77|108->77|108->77|108->77|108->77|109->78|109->78|109->78|109->78|109->78|109->78|109->78|110->79|110->79|110->79|110->79|110->79|110->79|110->79|116->85|116->85|116->85|116->85|116->85|116->85|116->85|117->86|117->86|117->86|117->86|117->86|117->86|117->86|118->87|118->87|118->87|118->87|118->87|118->87|119->88|119->88|119->88|119->88|119->88|119->88|124->93|124->93|124->93|124->93|124->93|124->93|126->95|137->106
                  -- GENERATED --
              */
          
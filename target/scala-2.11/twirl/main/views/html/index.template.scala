
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
                <form id="suche" class="form-inline my-2 my-lg-0" action="/search">
                    <input class="form-control mr-sm-2" id="fieldPlz" type="text" name="plz" placeholder="PLZ" aria-label="Search">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit"><i class="fa fa-search" aria-hidden="true"></i></button>
                </form>
            </div>
        </div>
    </nav>

"""),_display_(/*32.2*/modals()),format.raw/*32.10*/("""


    """),format.raw/*35.5*/("""<div class="content">
                <div class="container">

                    """),_display_(/*38.22*/alerts()),format.raw/*38.30*/("""
                    """),format.raw/*39.21*/("""<h1>Angebote</h1>
                    <script id="angebote-template" type="text/x-handlebars-template">

                        """),format.raw/*42.25*/("""{"""),format.raw/*42.26*/("""{"""),format.raw/*42.27*/("""#each this"""),format.raw/*42.37*/("""}"""),format.raw/*42.38*/("""}"""),format.raw/*42.39*/("""
                        """),format.raw/*43.25*/("""<div class="card">
                            <div class="row">
                                <div class="col-md-3">
                                        <!-- <img class="card-img-top" src="assets/images/burger1.jpg" alt="Card image cap"> -->
                                    <div id="thumbnail-carousel"""),format.raw/*47.64*/("""{"""),format.raw/*47.65*/("""{"""),format.raw/*47.66*/("""@index"""),format.raw/*47.73*/("""}"""),format.raw/*47.74*/("""}"""),format.raw/*47.75*/("""" class="carousel slide" data-ride=false data-interval="3000">
                                        <div class="carousel-inner">
                                            """),format.raw/*49.45*/("""{"""),format.raw/*49.46*/("""{"""),format.raw/*49.47*/("""#each this.urls"""),format.raw/*49.62*/("""}"""),format.raw/*49.63*/("""}"""),format.raw/*49.64*/("""
                                            """),format.raw/*50.45*/("""{"""),format.raw/*50.46*/("""{"""),format.raw/*50.47*/("""#if @first"""),format.raw/*50.58*/("""}"""),format.raw/*50.59*/("""}"""),format.raw/*50.60*/("""
                                            """),format.raw/*51.45*/("""<div class="carousel-item active">
                                                <img class="d-block img-fluid mh-100 card-img-top" src="http://s3.fgoeldi.com/big/"""),format.raw/*52.131*/("""{"""),format.raw/*52.132*/("""{"""),format.raw/*52.133*/("""this"""),format.raw/*52.137*/("""}"""),format.raw/*52.138*/("""}"""),format.raw/*52.139*/("""" alt="Angebot Bild">
                                            </div>
                                            """),format.raw/*54.45*/("""{"""),format.raw/*54.46*/("""{"""),format.raw/*54.47*/("""else"""),format.raw/*54.51*/("""}"""),format.raw/*54.52*/("""}"""),format.raw/*54.53*/("""

                                            """),format.raw/*56.45*/("""<div class="carousel-item">
                                                <img class="d-block img-fluid mh-100 card-img-top" src="http://s3.fgoeldi.com/big/"""),format.raw/*57.131*/("""{"""),format.raw/*57.132*/("""{"""),format.raw/*57.133*/("""this"""),format.raw/*57.137*/("""}"""),format.raw/*57.138*/("""}"""),format.raw/*57.139*/("""" alt="Angebot Bild">
                                            </div>
                                            """),format.raw/*59.45*/("""{"""),format.raw/*59.46*/("""{"""),format.raw/*59.47*/("""/if"""),format.raw/*59.50*/("""}"""),format.raw/*59.51*/("""}"""),format.raw/*59.52*/("""
                                            """),format.raw/*60.45*/("""{"""),format.raw/*60.46*/("""{"""),format.raw/*60.47*/("""else"""),format.raw/*60.51*/("""}"""),format.raw/*60.52*/("""}"""),format.raw/*60.53*/("""
                                            """),format.raw/*61.45*/("""<div class="carousel-item active">
                                                <img class="d-block img-fluid mh-100 card-img-top" src="assets/images/burger1.jpg" alt="Angebot Bild">
                                            </div>
                                            """),format.raw/*64.45*/("""{"""),format.raw/*64.46*/("""{"""),format.raw/*64.47*/("""/each"""),format.raw/*64.52*/("""}"""),format.raw/*64.53*/("""}"""),format.raw/*64.54*/("""
                                        """),format.raw/*65.41*/("""</div>
                                        <a class="carousel-control-prev" href="#thumbnail-carousel"""),format.raw/*66.99*/("""{"""),format.raw/*66.100*/("""{"""),format.raw/*66.101*/("""@index"""),format.raw/*66.108*/("""}"""),format.raw/*66.109*/("""}"""),format.raw/*66.110*/("""" role="button" data-slide="prev">
                                            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                                            <span class="sr-only">Previous</span>
                                        </a>
                                        <a class="carousel-control-next" href="#thumbnail-carousel"""),format.raw/*70.99*/("""{"""),format.raw/*70.100*/("""{"""),format.raw/*70.101*/("""@index"""),format.raw/*70.108*/("""}"""),format.raw/*70.109*/("""}"""),format.raw/*70.110*/("""" role="button" data-slide="next">
                                            <span class="carousel-control-next-icon" aria-hidden="true"></span>
                                            <span class="sr-only">Next</span>
                                        </a>
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="card-body">
                                        <h4 class="card-title"> """),format.raw/*78.65*/("""{"""),format.raw/*78.66*/("""{"""),format.raw/*78.67*/("""this.angebot.titel"""),format.raw/*78.85*/("""}"""),format.raw/*78.86*/("""}"""),format.raw/*78.87*/(""" """),format.raw/*78.88*/("""</h4>
                                        <h6 class="card-subtitle mb-2 text-muted"> """),format.raw/*79.84*/("""{"""),format.raw/*79.85*/("""{"""),format.raw/*79.86*/("""this.angebot.kueche"""),format.raw/*79.105*/("""}"""),format.raw/*79.106*/("""}"""),format.raw/*79.107*/(""" """),format.raw/*79.108*/("""</h6>
                                        <p class="card-text"> """),format.raw/*80.63*/("""{"""),format.raw/*80.64*/("""{"""),format.raw/*80.65*/("""this.angebot.beschreibung"""),format.raw/*80.90*/("""}"""),format.raw/*80.91*/("""}"""),format.raw/*80.92*/(""" """),format.raw/*80.93*/("""</p>
                                    </div>
                                </div>
                                <div class="col-md-3">
                                    <div class="card-body">
                                        <p class="card-text">Username <span class="">Bewertung</span></p>
                                        <p class="card-text">Ort: <span> """),format.raw/*86.74*/("""{"""),format.raw/*86.75*/("""{"""),format.raw/*86.76*/("""this.angebot.plz"""),format.raw/*86.92*/("""}"""),format.raw/*86.93*/("""}"""),format.raw/*86.94*/(""" """),format.raw/*86.95*/("""</span> </p>
                                        <p class="card-text"><span class="preis">"""),format.raw/*87.82*/("""{"""),format.raw/*87.83*/("""{"""),format.raw/*87.84*/("""this.angebot.preis"""),format.raw/*87.102*/("""}"""),format.raw/*87.103*/("""}"""),format.raw/*87.104*/(""" """),format.raw/*87.105*/("""CHF</span>
                                            <span class="">Portionen: """),format.raw/*88.71*/("""{"""),format.raw/*88.72*/("""{"""),format.raw/*88.73*/("""this.angebot.menge"""),format.raw/*88.91*/("""}"""),format.raw/*88.92*/("""}"""),format.raw/*88.93*/("""</span></p>
                                        <button class="btn btn-primary bestellButton" data-id=""""),format.raw/*89.96*/("""{"""),format.raw/*89.97*/("""{"""),format.raw/*89.98*/("""this.angebot.id"""),format.raw/*89.113*/("""}"""),format.raw/*89.114*/("""}"""),format.raw/*89.115*/("""">Bestellen</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                        """),format.raw/*94.25*/("""{"""),format.raw/*94.26*/("""{"""),format.raw/*94.27*/("""/each"""),format.raw/*94.32*/("""}"""),format.raw/*94.33*/("""}"""),format.raw/*94.34*/("""

                    """),format.raw/*96.21*/("""</script>
                    <div class="cards-items angebote-cards" id="angebote-cards">

                    </div>
                </div>
    </div>





""")))}),format.raw/*107.2*/("""
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
                  DATE: Thu Nov 23 22:18:04 CET 2017
                  SOURCE: C:/dev/git/CheapEat/app/views/index.scala.html
                  HASH: eb737371c40bbe33567eda3559320f3f0409acff
                  MATRIX: 827->1|858->24|897->26|931->34|971->48|985->54|1029->78|1109->132|1123->138|1171->166|2696->1665|2725->1673|2762->1683|2876->1770|2905->1778|2955->1800|3115->1932|3144->1933|3173->1934|3211->1944|3240->1945|3269->1946|3323->1972|3667->2288|3696->2289|3725->2290|3759->2297|3788->2298|3817->2299|4023->2477|4052->2478|4081->2479|4124->2494|4153->2495|4182->2496|4256->2542|4285->2543|4314->2544|4352->2555|4381->2556|4410->2557|4484->2603|4679->2769|4709->2770|4739->2771|4772->2775|4802->2776|4832->2777|4979->2896|5008->2897|5037->2898|5069->2902|5098->2903|5127->2904|5203->2952|5391->3111|5421->3112|5451->3113|5484->3117|5514->3118|5544->3119|5691->3238|5720->3239|5749->3240|5780->3243|5809->3244|5838->3245|5912->3291|5941->3292|5970->3293|6002->3297|6031->3298|6060->3299|6134->3345|6446->3629|6475->3630|6504->3631|6537->3636|6566->3637|6595->3638|6665->3680|6799->3786|6829->3787|6859->3788|6894->3795|6924->3796|6954->3797|7358->4173|7388->4174|7418->4175|7453->4182|7483->4183|7513->4184|8080->4723|8109->4724|8138->4725|8184->4743|8213->4744|8242->4745|8271->4746|8389->4836|8418->4837|8447->4838|8495->4857|8525->4858|8555->4859|8585->4860|8682->4929|8711->4930|8740->4931|8793->4956|8822->4957|8851->4958|8880->4959|9295->5346|9324->5347|9353->5348|9397->5364|9426->5365|9455->5366|9484->5367|9607->5462|9636->5463|9665->5464|9712->5482|9742->5483|9772->5484|9802->5485|9912->5567|9941->5568|9970->5569|10016->5587|10045->5588|10074->5589|10210->5697|10239->5698|10268->5699|10312->5714|10342->5715|10372->5716|10598->5914|10627->5915|10656->5916|10689->5921|10718->5922|10747->5923|10799->5947|11000->6117
                  LINES: 32->1|32->1|32->1|34->3|34->3|34->3|34->3|35->4|35->4|35->4|63->32|63->32|66->35|69->38|69->38|70->39|73->42|73->42|73->42|73->42|73->42|73->42|74->43|78->47|78->47|78->47|78->47|78->47|78->47|80->49|80->49|80->49|80->49|80->49|80->49|81->50|81->50|81->50|81->50|81->50|81->50|82->51|83->52|83->52|83->52|83->52|83->52|83->52|85->54|85->54|85->54|85->54|85->54|85->54|87->56|88->57|88->57|88->57|88->57|88->57|88->57|90->59|90->59|90->59|90->59|90->59|90->59|91->60|91->60|91->60|91->60|91->60|91->60|92->61|95->64|95->64|95->64|95->64|95->64|95->64|96->65|97->66|97->66|97->66|97->66|97->66|97->66|101->70|101->70|101->70|101->70|101->70|101->70|109->78|109->78|109->78|109->78|109->78|109->78|109->78|110->79|110->79|110->79|110->79|110->79|110->79|110->79|111->80|111->80|111->80|111->80|111->80|111->80|111->80|117->86|117->86|117->86|117->86|117->86|117->86|117->86|118->87|118->87|118->87|118->87|118->87|118->87|118->87|119->88|119->88|119->88|119->88|119->88|119->88|120->89|120->89|120->89|120->89|120->89|120->89|125->94|125->94|125->94|125->94|125->94|125->94|127->96|138->107
                  -- GENERATED --
              */
          
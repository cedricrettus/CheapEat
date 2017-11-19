
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object test_Scope0 {
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

class test extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("CheapEat - Home")/*1.25*/ {_display_(Seq[Any](format.raw/*1.27*/("""


    """),format.raw/*4.5*/("""<script src=""""),_display_(/*4.19*/routes/*4.25*/.Assets.at("js/home.js")),format.raw/*4.49*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*5.19*/routes/*5.25*/.Assets.at("js/hbScript.js")),format.raw/*5.53*/("""" type="text/javascript"></script>

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
                <form id="suche" class="form-inline my-2 my-lg-0">
                    <input class="form-control mr-sm-2" id="fieldPlz" type="text" name="plz" placeholder="PLZ" aria-label="Search">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit" action="/search" formmethod="get"><i class="fa fa-search" aria-hidden="true"></i></button>
                </form>
            </div>
        </div>
    </nav>

    """),_display_(/*33.6*/modals()),format.raw/*33.14*/("""


    """),format.raw/*36.5*/("""<div class="content">
        <div class="container">
            <h1>Angebote</h1>
            <script id="angebote-template" type="text/x-handlebars-template">

                """),format.raw/*41.17*/("""{"""),format.raw/*41.18*/("""{"""),format.raw/*41.19*/("""#each this"""),format.raw/*41.29*/("""}"""),format.raw/*41.30*/("""}"""),format.raw/*41.31*/("""
                """),format.raw/*42.17*/("""<div class="card">
                    <div class="row">
                        <div class="col-md-3">
                            <!-- <img class="card-img-top" src="assets/images/burger1.jpg" alt="Card image cap"> -->
                            <div id="thumbnail-carousel"""),format.raw/*46.56*/("""{"""),format.raw/*46.57*/("""{"""),format.raw/*46.58*/("""@index"""),format.raw/*46.65*/("""}"""),format.raw/*46.66*/("""}"""),format.raw/*46.67*/("""" class="carousel slide" data-ride=false data-interval="3000">
                                <div class="carousel-inner">
                                    """),format.raw/*48.37*/("""{"""),format.raw/*48.38*/("""{"""),format.raw/*48.39*/("""#each this.urls"""),format.raw/*48.54*/("""}"""),format.raw/*48.55*/("""}"""),format.raw/*48.56*/("""
                                        """),format.raw/*49.41*/("""{"""),format.raw/*49.42*/("""{"""),format.raw/*49.43*/("""#if @first"""),format.raw/*49.54*/("""}"""),format.raw/*49.55*/("""}"""),format.raw/*49.56*/("""
                                            """),format.raw/*50.45*/("""<div class="carousel-item active">
                                                <img class="d-block img-fluid mh-100 card-img-top" src="http://s3.fgoeldi.com/big/"""),format.raw/*51.131*/("""{"""),format.raw/*51.132*/("""{"""),format.raw/*51.133*/("""this"""),format.raw/*51.137*/("""}"""),format.raw/*51.138*/("""}"""),format.raw/*51.139*/("""" alt="Angebot Bild">
                                            </div>
                                        """),format.raw/*53.41*/("""{"""),format.raw/*53.42*/("""{"""),format.raw/*53.43*/("""else"""),format.raw/*53.47*/("""}"""),format.raw/*53.48*/("""}"""),format.raw/*53.49*/("""
                                            """),format.raw/*54.45*/("""<div class="carousel-item">
                                                <img class="d-block img-fluid mh-100 card-img-top" src="http://s3.fgoeldi.com/big/"""),format.raw/*55.131*/("""{"""),format.raw/*55.132*/("""{"""),format.raw/*55.133*/("""this"""),format.raw/*55.137*/("""}"""),format.raw/*55.138*/("""}"""),format.raw/*55.139*/("""" alt="Angebot Bild">
                                            </div>
                                        """),format.raw/*57.41*/("""{"""),format.raw/*57.42*/("""{"""),format.raw/*57.43*/("""/if"""),format.raw/*57.46*/("""}"""),format.raw/*57.47*/("""}"""),format.raw/*57.48*/("""
                                        """),format.raw/*58.41*/("""{"""),format.raw/*58.42*/("""{"""),format.raw/*58.43*/("""else"""),format.raw/*58.47*/("""}"""),format.raw/*58.48*/("""}"""),format.raw/*58.49*/("""
                                        """),format.raw/*59.41*/("""<div class="carousel-item active">
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




""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object test extends test_Scope0.test
              /*
                  -- GENERATED --
                  DATE: Sun Nov 19 16:01:57 CET 2017
                  SOURCE: C:/dev/git/CheapEat/app/views/test.scala.html
                  HASH: 91a05c42707b14923112bb936fe9986a916e06b1
                  MATRIX: 825->1|856->24|895->26|931->36|971->50|985->56|1029->80|1109->134|1123->140|1171->168|2717->1688|2746->1696|2783->1706|2995->1890|3024->1891|3053->1892|3091->1902|3120->1903|3149->1904|3195->1922|3503->2202|3532->2203|3561->2204|3595->2211|3624->2212|3653->2213|3843->2375|3872->2376|3901->2377|3944->2392|3973->2393|4002->2394|4072->2436|4101->2437|4130->2438|4168->2449|4197->2450|4226->2451|4300->2497|4495->2663|4525->2664|4555->2665|4588->2669|4618->2670|4648->2671|4791->2786|4820->2787|4849->2788|4881->2792|4910->2793|4939->2794|5013->2840|5201->2999|5231->3000|5261->3001|5294->3005|5324->3006|5354->3007|5497->3122|5526->3123|5555->3124|5586->3127|5615->3128|5644->3129|5714->3171|5743->3172|5772->3173|5804->3177|5833->3178|5862->3179|5932->3221|6228->3489|6257->3490|6286->3491|6319->3496|6348->3497|6377->3498|6439->3532|6565->3630|6594->3631|6623->3632|6658->3639|6688->3640|6718->3641|7090->3985|7119->3986|7148->3987|7183->3994|7213->3995|7243->3996|7748->4473|7777->4474|7806->4475|7852->4493|7881->4494|7910->4495|7939->4496|8049->4578|8078->4579|8107->4580|8154->4599|8183->4600|8212->4601|8242->4602|8331->4663|8360->4664|8389->4665|8442->4690|8471->4691|8500->4692|8529->4693|8896->5032|8925->5033|8954->5034|8998->5050|9027->5051|9056->5052|9085->5053|9200->5140|9229->5141|9258->5142|9304->5160|9333->5161|9362->5162|9391->5163|9493->5237|9522->5238|9551->5239|9597->5257|9626->5258|9655->5259|9783->5359|9812->5360|9841->5361|9885->5376|9915->5377|9945->5378|10131->5536|10160->5537|10189->5538|10222->5543|10251->5544|10280->5545|10324->5561
                  LINES: 32->1|32->1|32->1|35->4|35->4|35->4|35->4|36->5|36->5|36->5|64->33|64->33|67->36|72->41|72->41|72->41|72->41|72->41|72->41|73->42|77->46|77->46|77->46|77->46|77->46|77->46|79->48|79->48|79->48|79->48|79->48|79->48|80->49|80->49|80->49|80->49|80->49|80->49|81->50|82->51|82->51|82->51|82->51|82->51|82->51|84->53|84->53|84->53|84->53|84->53|84->53|85->54|86->55|86->55|86->55|86->55|86->55|86->55|88->57|88->57|88->57|88->57|88->57|88->57|89->58|89->58|89->58|89->58|89->58|89->58|90->59|93->62|93->62|93->62|93->62|93->62|93->62|94->63|95->64|95->64|95->64|95->64|95->64|95->64|99->68|99->68|99->68|99->68|99->68|99->68|108->77|108->77|108->77|108->77|108->77|108->77|108->77|109->78|109->78|109->78|109->78|109->78|109->78|109->78|110->79|110->79|110->79|110->79|110->79|110->79|110->79|116->85|116->85|116->85|116->85|116->85|116->85|116->85|117->86|117->86|117->86|117->86|117->86|117->86|117->86|118->87|118->87|118->87|118->87|118->87|118->87|119->88|119->88|119->88|119->88|119->88|119->88|124->93|124->93|124->93|124->93|124->93|124->93|126->95
                  -- GENERATED --
              */
          

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

"""),_display_(/*33.2*/modals()),format.raw/*33.10*/("""


    """),format.raw/*36.5*/("""<div class="content">
                <div class="container">

                    """),_display_(/*39.22*/alerts()),format.raw/*39.30*/("""
                    """),format.raw/*40.21*/("""<h1>Angebote</h1>

                    <script id="angebote-template" type="text/x-handlebars-template">
                        """),format.raw/*43.25*/("""{"""),format.raw/*43.26*/("""{"""),format.raw/*43.27*/("""#each this"""),format.raw/*43.37*/("""}"""),format.raw/*43.38*/("""}"""),format.raw/*43.39*/("""
                        """),format.raw/*44.25*/("""<div class="card">
                            <div class="row">
                                <div class="col-md-3">
                                        <!-- <img class="card-img-top" src="assets/images/burger1.jpg" alt="Card image cap"> -->
                                    <div id="thumbnail-carousel"""),format.raw/*48.64*/("""{"""),format.raw/*48.65*/("""{"""),format.raw/*48.66*/("""@index"""),format.raw/*48.73*/("""}"""),format.raw/*48.74*/("""}"""),format.raw/*48.75*/("""" class="carousel slide" data-ride=false data-interval="3000">
                                        <div class="carousel-inner">
                                            """),format.raw/*50.45*/("""{"""),format.raw/*50.46*/("""{"""),format.raw/*50.47*/("""#each this.urls"""),format.raw/*50.62*/("""}"""),format.raw/*50.63*/("""}"""),format.raw/*50.64*/("""
                                            """),format.raw/*51.45*/("""{"""),format.raw/*51.46*/("""{"""),format.raw/*51.47*/("""#if @first"""),format.raw/*51.58*/("""}"""),format.raw/*51.59*/("""}"""),format.raw/*51.60*/("""
                                            """),format.raw/*52.45*/("""<div class="carousel-item active">
                                                <img class="d-block img-fluid mh-100 card-img-top" src="http://s3.fgoeldi.com/big/"""),format.raw/*53.131*/("""{"""),format.raw/*53.132*/("""{"""),format.raw/*53.133*/("""this"""),format.raw/*53.137*/("""}"""),format.raw/*53.138*/("""}"""),format.raw/*53.139*/("""" alt="Angebot Bild">
                                            </div>
                                            """),format.raw/*55.45*/("""{"""),format.raw/*55.46*/("""{"""),format.raw/*55.47*/("""else"""),format.raw/*55.51*/("""}"""),format.raw/*55.52*/("""}"""),format.raw/*55.53*/("""

                                            """),format.raw/*57.45*/("""<div class="carousel-item">
                                                <img class="d-block img-fluid mh-100 card-img-top" src="http://s3.fgoeldi.com/big/"""),format.raw/*58.131*/("""{"""),format.raw/*58.132*/("""{"""),format.raw/*58.133*/("""this"""),format.raw/*58.137*/("""}"""),format.raw/*58.138*/("""}"""),format.raw/*58.139*/("""" alt="Angebot Bild">
                                            </div>
                                            """),format.raw/*60.45*/("""{"""),format.raw/*60.46*/("""{"""),format.raw/*60.47*/("""/if"""),format.raw/*60.50*/("""}"""),format.raw/*60.51*/("""}"""),format.raw/*60.52*/("""
                                            """),format.raw/*61.45*/("""{"""),format.raw/*61.46*/("""{"""),format.raw/*61.47*/("""else"""),format.raw/*61.51*/("""}"""),format.raw/*61.52*/("""}"""),format.raw/*61.53*/("""
                                            """),format.raw/*62.45*/("""<div class="carousel-item active">
                                                <img class="d-block img-fluid mh-100 card-img-top" src="assets/images/burger1.jpg" alt="Angebot Bild">
                                            </div>
                                            """),format.raw/*65.45*/("""{"""),format.raw/*65.46*/("""{"""),format.raw/*65.47*/("""/each"""),format.raw/*65.52*/("""}"""),format.raw/*65.53*/("""}"""),format.raw/*65.54*/("""
                                        """),format.raw/*66.41*/("""</div>
                                        <a class="carousel-control-prev" href="#thumbnail-carousel"""),format.raw/*67.99*/("""{"""),format.raw/*67.100*/("""{"""),format.raw/*67.101*/("""@index"""),format.raw/*67.108*/("""}"""),format.raw/*67.109*/("""}"""),format.raw/*67.110*/("""" role="button" data-slide="prev">
                                            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                                            <span class="sr-only">Previous</span>
                                        </a>
                                        <a class="carousel-control-next" href="#thumbnail-carousel"""),format.raw/*71.99*/("""{"""),format.raw/*71.100*/("""{"""),format.raw/*71.101*/("""@index"""),format.raw/*71.108*/("""}"""),format.raw/*71.109*/("""}"""),format.raw/*71.110*/("""" role="button" data-slide="next">
                                            <span class="carousel-control-next-icon" aria-hidden="true"></span>
                                            <span class="sr-only">Next</span>
                                        </a>
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="card-body">
                                        <h4 class="card-title"> """),format.raw/*79.65*/("""{"""),format.raw/*79.66*/("""{"""),format.raw/*79.67*/("""this.angebot.titel"""),format.raw/*79.85*/("""}"""),format.raw/*79.86*/("""}"""),format.raw/*79.87*/(""" """),format.raw/*79.88*/("""</h4>
                                        <h6 class="card-subtitle mb-2 text-muted"> """),format.raw/*80.84*/("""{"""),format.raw/*80.85*/("""{"""),format.raw/*80.86*/("""this.angebot.kueche"""),format.raw/*80.105*/("""}"""),format.raw/*80.106*/("""}"""),format.raw/*80.107*/(""" """),format.raw/*80.108*/("""</h6>
                                        <p class="card-text"> """),format.raw/*81.63*/("""{"""),format.raw/*81.64*/("""{"""),format.raw/*81.65*/("""this.angebot.beschreibung"""),format.raw/*81.90*/("""}"""),format.raw/*81.91*/("""}"""),format.raw/*81.92*/(""" """),format.raw/*81.93*/("""</p>
                                    </div>
                                </div>
                                <div class="col-md-3">
                                    <div class="card-body">
                                        <p class="card-text">Username <span class="">Bewertung</span></p>
                                        <p class="card-text">Ort: <span> """),format.raw/*87.74*/("""{"""),format.raw/*87.75*/("""{"""),format.raw/*87.76*/("""this.angebot.plz"""),format.raw/*87.92*/("""}"""),format.raw/*87.93*/("""}"""),format.raw/*87.94*/(""" """),format.raw/*87.95*/("""</span> </p>
                                        <p class="card-text"><span class="preis">"""),format.raw/*88.82*/("""{"""),format.raw/*88.83*/("""{"""),format.raw/*88.84*/("""this.angebot.preis"""),format.raw/*88.102*/("""}"""),format.raw/*88.103*/("""}"""),format.raw/*88.104*/(""" """),format.raw/*88.105*/("""CHF</span>
                                            <span class="">Portionen: """),format.raw/*89.71*/("""{"""),format.raw/*89.72*/("""{"""),format.raw/*89.73*/("""this.angebot.menge"""),format.raw/*89.91*/("""}"""),format.raw/*89.92*/("""}"""),format.raw/*89.93*/("""</span></p>
                                        <button class="btn btn-primary bestellButton" data-id=""""),format.raw/*90.96*/("""{"""),format.raw/*90.97*/("""{"""),format.raw/*90.98*/("""this.angebot.id"""),format.raw/*90.113*/("""}"""),format.raw/*90.114*/("""}"""),format.raw/*90.115*/("""">Bestellen</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                        """),format.raw/*95.25*/("""{"""),format.raw/*95.26*/("""{"""),format.raw/*95.27*/("""/each"""),format.raw/*95.32*/("""}"""),format.raw/*95.33*/("""}"""),format.raw/*95.34*/("""
                    """),format.raw/*96.21*/("""</script>

                    <div class="cards-items angebote-cards" id="angebote-cards">

                    </div>
                </div>
    </div>

""")))}),format.raw/*104.2*/("""
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
                  DATE: Sat Nov 25 15:56:52 CET 2017
                  SOURCE: C:/dev/git/CheapEat/app/views/index.scala.html
                  HASH: 596284d9e7a28d71383ffe0ab9e944cc41fccf5b
                  MATRIX: 827->1|858->24|897->26|931->34|971->48|985->54|1029->78|1109->132|1123->138|1171->166|2698->1667|2727->1675|2764->1685|2878->1772|2907->1780|2957->1802|3117->1934|3146->1935|3175->1936|3213->1946|3242->1947|3271->1948|3325->1974|3669->2290|3698->2291|3727->2292|3761->2299|3790->2300|3819->2301|4025->2479|4054->2480|4083->2481|4126->2496|4155->2497|4184->2498|4258->2544|4287->2545|4316->2546|4354->2557|4383->2558|4412->2559|4486->2605|4681->2771|4711->2772|4741->2773|4774->2777|4804->2778|4834->2779|4981->2898|5010->2899|5039->2900|5071->2904|5100->2905|5129->2906|5205->2954|5393->3113|5423->3114|5453->3115|5486->3119|5516->3120|5546->3121|5693->3240|5722->3241|5751->3242|5782->3245|5811->3246|5840->3247|5914->3293|5943->3294|5972->3295|6004->3299|6033->3300|6062->3301|6136->3347|6448->3631|6477->3632|6506->3633|6539->3638|6568->3639|6597->3640|6667->3682|6801->3788|6831->3789|6861->3790|6896->3797|6926->3798|6956->3799|7360->4175|7390->4176|7420->4177|7455->4184|7485->4185|7515->4186|8082->4725|8111->4726|8140->4727|8186->4745|8215->4746|8244->4747|8273->4748|8391->4838|8420->4839|8449->4840|8497->4859|8527->4860|8557->4861|8587->4862|8684->4931|8713->4932|8742->4933|8795->4958|8824->4959|8853->4960|8882->4961|9297->5348|9326->5349|9355->5350|9399->5366|9428->5367|9457->5368|9486->5369|9609->5464|9638->5465|9667->5466|9714->5484|9744->5485|9774->5486|9804->5487|9914->5569|9943->5570|9972->5571|10018->5589|10047->5590|10076->5591|10212->5699|10241->5700|10270->5701|10314->5716|10344->5717|10374->5718|10600->5916|10629->5917|10658->5918|10691->5923|10720->5924|10749->5925|10799->5947|10994->6111
                  LINES: 32->1|32->1|32->1|34->3|34->3|34->3|34->3|35->4|35->4|35->4|64->33|64->33|67->36|70->39|70->39|71->40|74->43|74->43|74->43|74->43|74->43|74->43|75->44|79->48|79->48|79->48|79->48|79->48|79->48|81->50|81->50|81->50|81->50|81->50|81->50|82->51|82->51|82->51|82->51|82->51|82->51|83->52|84->53|84->53|84->53|84->53|84->53|84->53|86->55|86->55|86->55|86->55|86->55|86->55|88->57|89->58|89->58|89->58|89->58|89->58|89->58|91->60|91->60|91->60|91->60|91->60|91->60|92->61|92->61|92->61|92->61|92->61|92->61|93->62|96->65|96->65|96->65|96->65|96->65|96->65|97->66|98->67|98->67|98->67|98->67|98->67|98->67|102->71|102->71|102->71|102->71|102->71|102->71|110->79|110->79|110->79|110->79|110->79|110->79|110->79|111->80|111->80|111->80|111->80|111->80|111->80|111->80|112->81|112->81|112->81|112->81|112->81|112->81|112->81|118->87|118->87|118->87|118->87|118->87|118->87|118->87|119->88|119->88|119->88|119->88|119->88|119->88|119->88|120->89|120->89|120->89|120->89|120->89|120->89|121->90|121->90|121->90|121->90|121->90|121->90|126->95|126->95|126->95|126->95|126->95|126->95|127->96|135->104
                  -- GENERATED --
              */
          

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
            <ul id="angebote"></ul>
            <div class="cards-items" id="angebote-cards">

                <script id="angebote-template" type="text/x-handlebars-template">

                    """),format.raw/*44.21*/("""{"""),format.raw/*44.22*/("""{"""),format.raw/*44.23*/("""#objects"""),format.raw/*44.31*/("""}"""),format.raw/*44.32*/("""}"""),format.raw/*44.33*/("""
                    """),format.raw/*45.21*/("""<div class="card">
                        <div class="row">
                            <div class="col-md-3">
                                <img class="card-img-top" src="assets/images/burger1.jpg" alt="Card image cap">
                            </div>
                            <div class="col-md-6">
                                <div class="card-body">
                                    <h4 class="card-title"> """),format.raw/*52.61*/("""{"""),format.raw/*52.62*/("""{"""),format.raw/*52.63*/("""this.angebot.titel"""),format.raw/*52.81*/("""}"""),format.raw/*52.82*/("""}"""),format.raw/*52.83*/(""" """),format.raw/*52.84*/("""</h4>
                                    <h6 class="card-subtitle mb-2 text-muted"> """),format.raw/*53.80*/("""{"""),format.raw/*53.81*/("""{"""),format.raw/*53.82*/("""this.angebot.kueche"""),format.raw/*53.101*/("""}"""),format.raw/*53.102*/("""}"""),format.raw/*53.103*/(""" """),format.raw/*53.104*/("""</h6>
                                    <p class="card-text"> """),format.raw/*54.59*/("""{"""),format.raw/*54.60*/("""{"""),format.raw/*54.61*/("""this.angebot.beschreibung"""),format.raw/*54.86*/("""}"""),format.raw/*54.87*/("""}"""),format.raw/*54.88*/(""" """),format.raw/*54.89*/("""</p>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="card-body">
                                    <p class="card-text">Username <span class="">Bewertung</span></p>
                                    <p class="card-text">Ort: <span> """),format.raw/*60.70*/("""{"""),format.raw/*60.71*/("""{"""),format.raw/*60.72*/("""this.angebot.plz"""),format.raw/*60.88*/("""}"""),format.raw/*60.89*/("""}"""),format.raw/*60.90*/(""" """),format.raw/*60.91*/("""</span> </p>
                                    <p class="card-text"><span class="preis">"""),format.raw/*61.78*/("""{"""),format.raw/*61.79*/("""{"""),format.raw/*61.80*/("""this.angebot.preis"""),format.raw/*61.98*/("""}"""),format.raw/*61.99*/("""}"""),format.raw/*61.100*/(""" """),format.raw/*61.101*/("""CHF</span>
                                    <span class="">Portionen: """),format.raw/*62.63*/("""{"""),format.raw/*62.64*/("""{"""),format.raw/*62.65*/("""this.angebot.menge"""),format.raw/*62.83*/("""}"""),format.raw/*62.84*/("""}"""),format.raw/*62.85*/("""</span></p>
                                    <button class="btn btn-primary bestellButton" data-id=""""),format.raw/*63.92*/("""{"""),format.raw/*63.93*/("""{"""),format.raw/*63.94*/("""this.angebot.id"""),format.raw/*63.109*/("""}"""),format.raw/*63.110*/("""}"""),format.raw/*63.111*/("""">Bestellen</button>
                                </div>
                            </div>
                        </div>
                    </div>
                    """),format.raw/*68.21*/("""{"""),format.raw/*68.22*/("""{"""),format.raw/*68.23*/("""/objects"""),format.raw/*68.31*/("""}"""),format.raw/*68.32*/("""}"""),format.raw/*68.33*/("""

                """),format.raw/*70.17*/("""</script>


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
                  DATE: Sat Nov 18 16:50:59 CET 2017
                  SOURCE: C:/dev/git/CheapEat/app/views/test.scala.html
                  HASH: e46897d53140b78eea597b9067f5aa1a5bdacc2a
                  MATRIX: 825->1|856->24|895->26|931->36|971->50|985->56|1029->80|1109->134|1123->140|1171->168|2717->1688|2746->1696|2783->1706|3101->1996|3130->1997|3159->1998|3195->2006|3224->2007|3253->2008|3303->2030|3764->2463|3793->2464|3822->2465|3868->2483|3897->2484|3926->2485|3955->2486|4069->2572|4098->2573|4127->2574|4175->2593|4205->2594|4235->2595|4265->2596|4358->2661|4387->2662|4416->2663|4469->2688|4498->2689|4527->2690|4556->2691|4947->3054|4976->3055|5005->3056|5049->3072|5078->3073|5107->3074|5136->3075|5255->3166|5284->3167|5313->3168|5359->3186|5388->3187|5418->3188|5448->3189|5550->3263|5579->3264|5608->3265|5654->3283|5683->3284|5712->3285|5844->3389|5873->3390|5902->3391|5946->3406|5976->3407|6006->3408|6212->3586|6241->3587|6270->3588|6306->3596|6335->3597|6364->3598|6412->3618
                  LINES: 32->1|32->1|32->1|35->4|35->4|35->4|35->4|36->5|36->5|36->5|64->33|64->33|67->36|75->44|75->44|75->44|75->44|75->44|75->44|76->45|83->52|83->52|83->52|83->52|83->52|83->52|83->52|84->53|84->53|84->53|84->53|84->53|84->53|84->53|85->54|85->54|85->54|85->54|85->54|85->54|85->54|91->60|91->60|91->60|91->60|91->60|91->60|91->60|92->61|92->61|92->61|92->61|92->61|92->61|92->61|93->62|93->62|93->62|93->62|93->62|93->62|94->63|94->63|94->63|94->63|94->63|94->63|99->68|99->68|99->68|99->68|99->68|99->68|101->70
                  -- GENERATED --
              */
          
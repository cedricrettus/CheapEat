
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

                    <div class="card">
                        <div class="row">
                            <div class="col-md-3">
                                <img class="card-img-top" src="assets/images/burger1.jpg" alt="Card image cap">
                            </div>
                            <div class="col-md-6">
                                <div class="card-body">
                                    <h4 class="card-title"> """),format.raw/*51.61*/("""{"""),format.raw/*51.62*/("""{"""),format.raw/*51.63*/("""titel"""),format.raw/*51.68*/("""}"""),format.raw/*51.69*/("""}"""),format.raw/*51.70*/(""" """),format.raw/*51.71*/("""</h4>
                                    <h6 class="card-subtitle mb-2 text-muted"> """),format.raw/*52.80*/("""{"""),format.raw/*52.81*/("""{"""),format.raw/*52.82*/("""kueche"""),format.raw/*52.88*/("""}"""),format.raw/*52.89*/("""}"""),format.raw/*52.90*/(""" """),format.raw/*52.91*/("""</h6>
                                    <p class="card-text"> """),format.raw/*53.59*/("""{"""),format.raw/*53.60*/("""{"""),format.raw/*53.61*/("""beschreibung"""),format.raw/*53.73*/("""}"""),format.raw/*53.74*/("""}"""),format.raw/*53.75*/(""" """),format.raw/*53.76*/("""</p>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="card-body">
                                    <p class="card-text">Username <span class="">Bewertung</span></p>
                                    <p class="card-text">Ort: <span> """),format.raw/*59.70*/("""{"""),format.raw/*59.71*/("""{"""),format.raw/*59.72*/("""plz"""),format.raw/*59.75*/("""}"""),format.raw/*59.76*/("""}"""),format.raw/*59.77*/(""" """),format.raw/*59.78*/("""</span> </p>
                                    <p class="card-text"><span class="preis">"""),format.raw/*60.78*/("""{"""),format.raw/*60.79*/("""{"""),format.raw/*60.80*/("""preis"""),format.raw/*60.85*/("""}"""),format.raw/*60.86*/("""}"""),format.raw/*60.87*/(""" """),format.raw/*60.88*/("""CHF</span>
                                    <span class="">Portionen: """),format.raw/*61.63*/("""{"""),format.raw/*61.64*/("""{"""),format.raw/*61.65*/("""menge"""),format.raw/*61.70*/("""}"""),format.raw/*61.71*/("""}"""),format.raw/*61.72*/("""</span></p>
                                    <button class="btn btn-primary bestellButton" data-id=""""),format.raw/*62.92*/("""{"""),format.raw/*62.93*/("""{"""),format.raw/*62.94*/("""id"""),format.raw/*62.96*/("""}"""),format.raw/*62.97*/("""}"""),format.raw/*62.98*/("""">Bestellen</button>
                                </div>
                            </div>
                        </div>
                    </div>

                </script>


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
                  DATE: Sat Nov 18 09:23:58 CET 2017
                  SOURCE: C:/dev/git/CheapEat/app/views/test.scala.html
                  HASH: 71fb7388c538fe4b884ea2fc11132f52f6c51d60
                  MATRIX: 825->1|856->24|895->26|931->36|971->50|985->56|1029->80|1109->134|1123->140|1171->168|2717->1688|2746->1696|2783->1706|3534->2429|3563->2430|3592->2431|3625->2436|3654->2437|3683->2438|3712->2439|3826->2525|3855->2526|3884->2527|3918->2533|3947->2534|3976->2535|4005->2536|4098->2601|4127->2602|4156->2603|4196->2615|4225->2616|4254->2617|4283->2618|4674->2981|4703->2982|4732->2983|4763->2986|4792->2987|4821->2988|4850->2989|4969->3080|4998->3081|5027->3082|5060->3087|5089->3088|5118->3089|5147->3090|5249->3164|5278->3165|5307->3166|5340->3171|5369->3172|5398->3173|5530->3277|5559->3278|5588->3279|5618->3281|5647->3282|5676->3283
                  LINES: 32->1|32->1|32->1|35->4|35->4|35->4|35->4|36->5|36->5|36->5|64->33|64->33|67->36|82->51|82->51|82->51|82->51|82->51|82->51|82->51|83->52|83->52|83->52|83->52|83->52|83->52|83->52|84->53|84->53|84->53|84->53|84->53|84->53|84->53|90->59|90->59|90->59|90->59|90->59|90->59|90->59|91->60|91->60|91->60|91->60|91->60|91->60|91->60|92->61|92->61|92->61|92->61|92->61|92->61|93->62|93->62|93->62|93->62|93->62|93->62
                  -- GENERATED --
              */
          
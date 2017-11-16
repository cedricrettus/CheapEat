
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

class suche extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[java.util.List[models.Angebot],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(angebote: java.util.List[models.Angebot]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.44*/("""

"""),_display_(/*3.2*/main("CheapEat - Suche")/*3.26*/ {_display_(Seq[Any](format.raw/*3.28*/("""

    """),format.raw/*5.5*/("""<script src=""""),_display_(/*5.19*/routes/*5.25*/.Assets.at("js/home.js")),format.raw/*5.49*/("""" type="text/javascript"></script>

    <div class="jumbotron jumbotron-fluid">
        <div class="container">
            <h1 class="display-3">CheapEat</h1>
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
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit" action="/search" method="get"><i class="fa fa-search" aria-hidden="true"></i></button>
                </form>
            </div>
        </div>
    </nav>

"""),_display_(/*33.2*/modals()),format.raw/*33.10*/("""

    """),format.raw/*35.5*/("""<div class="content">
        <div class="container">
            <h1>Angebote</h1>
            <ul id="angebote"></ul>
            <div class="cards-items" id="angebote-cards">

                """),_display_(/*41.18*/for(angebot <- angebote) yield /*41.42*/{_display_(Seq[Any](format.raw/*41.43*/("""
                    """),format.raw/*42.21*/("""<div class="card">
                        <div class="row">
                            <div class="col-md-3">
                                <img class="card-img-top" src="assets/images/burger1.jpg" alt="Card image cap">
                            </div>
                            <div class="col-md-6">
                                <div class="card-body">
                                    <h4 class="card-title">"""),_display_(/*49.61*/angebot/*49.68*/.titel),format.raw/*49.74*/("""</h4>
                                    <h6 class="card-subtitle mb-2 text-muted">"""),_display_(/*50.80*/angebot/*50.87*/.kueche),format.raw/*50.94*/("""</h6>
                                    <p class="card-text">"""),_display_(/*51.59*/angebot/*51.66*/.beschreibung),format.raw/*51.79*/("""</p>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="card-body">
                                    <p class="card-text">Username <span class="">Bewertung</span></p>
                                    <p class="card-text">Ort: <span>"""),_display_(/*57.70*/angebot/*57.77*/.plz),format.raw/*57.81*/("""</span></p>
                                    <p class="card-text"><span class="preis">"""),_display_(/*58.79*/angebot/*58.86*/.preis),format.raw/*58.92*/(""" """),format.raw/*58.93*/("""CHF</span>
                                        <span class="">Portionen: """),_display_(/*59.68*/angebot/*59.75*/.menge),format.raw/*59.81*/("""</span></p>
                                    <button class="btn btn-primary bestellButton" data-id=""""),_display_(/*60.93*/angebot/*60.100*/.id),format.raw/*60.103*/("""">Bestellen</button>
                                </div>
                            </div>
                        </div>
                    </div>


                """)))}),format.raw/*67.18*/("""

            """),format.raw/*69.13*/("""</div>
        </div>
    </div>





""")))}),format.raw/*77.2*/("""
"""))
      }
    }
  }

  def render(angebote:java.util.List[models.Angebot]): play.twirl.api.HtmlFormat.Appendable = apply(angebote)

  def f:((java.util.List[models.Angebot]) => play.twirl.api.HtmlFormat.Appendable) = (angebote) => apply(angebote)

  def ref: this.type = this

}


}

/**/
object suche extends suche_Scope0.suche
              /*
                  -- GENERATED --
                  DATE: Thu Nov 16 09:07:17 CET 2017
                  SOURCE: C:/dev/git/CheapEat/app/views/suche.scala.html
                  HASH: 79f6893353a39c795130a8f402e7653fc4443ac9
                  MATRIX: 769->1|906->43|936->48|968->72|1007->74|1041->82|1081->96|1095->102|1139->126|2663->1624|2692->1632|2727->1640|2956->1842|2996->1866|3035->1867|3085->1889|3545->2322|3561->2329|3588->2335|3701->2421|3717->2428|3745->2435|3837->2500|3853->2507|3887->2520|4277->2883|4293->2890|4318->2894|4436->2985|4452->2992|4479->2998|4508->2999|4614->3078|4630->3085|4657->3091|4789->3196|4806->3203|4831->3206|5041->3385|5085->3401|5162->3448
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|36->5|36->5|36->5|64->33|64->33|66->35|72->41|72->41|72->41|73->42|80->49|80->49|80->49|81->50|81->50|81->50|82->51|82->51|82->51|88->57|88->57|88->57|89->58|89->58|89->58|89->58|90->59|90->59|90->59|91->60|91->60|91->60|98->67|100->69|108->77
                  -- GENERATED --
              */
          

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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[java.util.List[models.Angebot],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(angebote: java.util.List[models.Angebot]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.44*/("""

"""),_display_(/*3.2*/main("CheapEat - Home")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

    """),format.raw/*5.5*/("""<script src=""""),_display_(/*5.19*/routes/*5.25*/.Assets.at("js/home.js")),format.raw/*5.49*/("""" type="text/javascript"></script>

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

"""),_display_(/*33.2*/modals()),format.raw/*33.10*/("""


    """),format.raw/*36.5*/("""<div class="content">
                <div class="container">
                    <h1>Angebote</h1>
                    <ul id="angebote"></ul>
                    <div class="cards-items" id="angebote-cards">
                    """),_display_(/*41.22*/for(angebot <- angebote) yield /*41.46*/{_display_(Seq[Any](format.raw/*41.47*/("""
                        """),format.raw/*42.25*/("""<div class="card">
                            <div class="row">
                                <div class="col-md-3">
                                    <img class="card-img-top" src="assets/images/burger1.jpg" alt="Card image cap">
                                </div>
                                <div class="col-md-6">
                                    <div class="card-body">
                                        <h4 class="card-title">"""),_display_(/*49.65*/angebot/*49.72*/.titel),format.raw/*49.78*/("""</h4>
                                        <h6 class="card-subtitle mb-2 text-muted">"""),_display_(/*50.84*/angebot/*50.91*/.kueche),format.raw/*50.98*/("""</h6>
                                        <p class="card-text">"""),_display_(/*51.63*/angebot/*51.70*/.beschreibung),format.raw/*51.83*/("""</p>
                                    </div>
                                </div>
                                <div class="col-md-3">
                                    <div class="card-body">
                                        <p class="card-text">Username <span class="">Bewertung</span></p>
                                        <p class="card-text">Ort: <span>"""),_display_(/*57.74*/angebot/*57.81*/.plz),format.raw/*57.85*/("""</span></p>
                                        <p class="card-text"><span class="preis">"""),_display_(/*58.83*/angebot/*58.90*/.preis),format.raw/*58.96*/(""" """),format.raw/*58.97*/("""CHF</span>
                                            <span class="">Portionen: """),_display_(/*59.72*/angebot/*59.79*/.menge),format.raw/*59.85*/("""</span></p>
                                        <button class="btn btn-primary bestellButton" data-id=""""),_display_(/*60.97*/angebot/*60.104*/.id),format.raw/*60.107*/("""">Bestellen</button>
                                    </div>
                                </div>
                            </div>
                        </div>


                    """)))}),format.raw/*67.22*/("""

                    """),format.raw/*69.21*/("""</div>
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
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Nov 16 09:13:22 CET 2017
                  SOURCE: C:/dev/git/CheapEat/app/views/index.scala.html
                  HASH: 17309956a4d8b114f250fdd271f873c392f36df4
                  MATRIX: 769->1|906->43|936->48|967->71|1006->73|1040->81|1080->95|1094->101|1138->125|2680->1641|2709->1649|2746->1659|3009->1895|3049->1919|3088->1920|3142->1946|3630->2407|3646->2414|3673->2420|3790->2510|3806->2517|3834->2524|3930->2593|3946->2600|3980->2613|4394->3000|4410->3007|4435->3011|4557->3106|4573->3113|4600->3119|4629->3120|4739->3203|4755->3210|4782->3216|4918->3325|4935->3332|4960->3335|5190->3534|5242->3558|5327->3613
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|36->5|36->5|36->5|64->33|64->33|67->36|72->41|72->41|72->41|73->42|80->49|80->49|80->49|81->50|81->50|81->50|82->51|82->51|82->51|88->57|88->57|88->57|89->58|89->58|89->58|89->58|90->59|90->59|90->59|91->60|91->60|91->60|98->67|100->69|108->77
                  -- GENERATED --
              */
          
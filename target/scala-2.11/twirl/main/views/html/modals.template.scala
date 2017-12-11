
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object modals_Scope0 {
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

class modals extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!-- MODAL ANGEBOT ERSTELLEN -->

<div class="modal fade" id="angebotModal" tabindex="-1" role="dialog" aria-labelledby="angebotModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">CheapEat</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <div class="container-angebot">
                    """),_display_(/*14.22*/alerts()),format.raw/*14.30*/("""
                    """),format.raw/*15.21*/("""<h1>Angebot erstellen</h1>
                    <div class="panel panel-default">
                        <form method="POST" id="angebotForm" action="/angebote" enctype="multipart/form-data"> <!--  rouAngebotControllertion.getPerson() -->
                            <div class="form-group">
                                <label for="titel" >Titel: </label>
                                <input type="text" name="titel" class="form-control" />
                            </div>
                            <div class="form-group">
                                <label for="beschreibung" >Beschreibung: </label>
                                <input type="text" name="beschreibung" class="form-control" />
                            </div>
                            <div class="form-group">
                                <label for="email" >Kontakt Email: </label>
                                <input type="email" name="email" class="form-control" />
                            </div>
                            <div class="form-group">
                                <label for="zeit" >Zeit: </label>
                                <input type="text" name="zeit" class="form-control" />
                            </div>
                            <div class="form-group">
                                <label for="datum" >Datum: </label>
                                <input type="date" name="datum" class="form-control" />
                            </div>
                            <div class="form-group">
                                <label for="datum" >PLZ: </label>
                                <input type="number" name="plz" class="form-control" />
                            </div>
                            <div class="form-group">
                                <label for="kueche" >Küche: </label>
                                <input type="text" name="kueche" class="form-control" />
                            </div>
                            <div class="form-group">
                                <label for="menge" >Menge: </label>
                                <input type="text" name="menge" class="form-control" />
                            </div>
                            <div class="form-group">
                                <label for="preis" >Preis: </label>
                                <input type="text" name="preis" class="form-control" />
                            </div>
                            <div class="form-group">
                                <label for="bilder">Bilder: </label>
                                <input type="file" name="bilder" accept="image/*" multiple>

                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Abbrechen</button>
                <button id="angebotSubmit" type="submit" class="btn btn-primary">Angebot erstellen</button>
            </div>

        </div>
    </div>
</div>

    <!-- MODAL ANGEBOT BESTELLEN -->

<div class="modal fade" id="bestellenModal" tabindex="-1" role="dialog" aria-labelledby="bestellenModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">CheapEat</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <div class="container-angebot">
                    """),_display_(/*85.22*/alerts()),format.raw/*85.30*/("""
                    """),format.raw/*86.21*/("""<h1>Angebot bestellen</h1>
                    <div class="panel panel-default">
                        <form method="POST" id="bestellenForm" action="/bestellen"> <!--  rouAngebotControllertion.getPerson() -->
                            <div class="form-group">
                                <label for="email" >Menge </label>
                                <input id="bestellenMenge" type="email" name="email" class="form-control" />
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Abbrechen</button>
                <button id="bestellenSubmit" type="submit" class="btn btn-primary" data-id="">Bestellen!</button>
            </div>
        </div>
    </div>
</div>

    <!-- MODAL BEWERTUNG ABGEBEN -->

<div class="modal fade" id="bewertungModal" tabindex="-1" role="dialog" aria-labelledby="bewertungModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">CheapEat - Bewertung</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <div class="container-angebot">
                    """),_display_(/*118.22*/alerts()),format.raw/*118.30*/("""
                """),format.raw/*119.17*/("""<h1>Bewertung abgeben</h1>
                <p>Bewertung von 1 - 5 für diesen Benutzer abgeben</p>
                <div class="panel panel-default btn-bewertungen">
                    <button id="btn-bewertung-1" data-token="0">1</button>
                    <button id="btn-bewertung-2" data-token="0">2</button>
                    <button id="btn-bewertung-3" data-token="0">3</button>
                    <button id="btn-bewertung-4" data-token="0">4</button>
                    <button id="btn-bewertung-5" data-token="0">5</button>
                </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Abbrechen</button>
            </div>
        </div>
    </div>
</div>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object modals extends modals_Scope0.modals
              /*
                  -- GENERATED --
                  DATE: Mon Dec 11 16:45:18 CET 2017
                  SOURCE: C:/dev/git/CheapEat/app/views/modals.scala.html
                  HASH: fe6d6b53f88418ce5d374ca5508a4f7336b8c591
                  MATRIX: 829->0|1532->676|1561->684|1611->706|5497->4565|5526->4573|5576->4595|7206->6197|7236->6205|7283->6223
                  LINES: 32->1|45->14|45->14|46->15|116->85|116->85|117->86|149->118|149->118|150->119
                  -- GENERATED --
              */
          

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
            <form method="POST" id="angebotForm" action="#" enctype="multipart/form-data" novalidate> <!--  rouAngebotControllertion.getPerson() -->
            <div class="modal-body">
                <div class="container-angebot">
                    """),_display_(/*15.22*/alerts()),format.raw/*15.30*/("""
                    """),format.raw/*16.21*/("""<h1>Angebot erstellen</h1>
                    <div class="panel panel-default">
                        <p>Achtung! Um ein Angebot zu erstellen must du eingeloggt sein</p>

                            <div class="form-group">
                                <label for="titel" >Titel: </label>
                                <input id="titel" type="text" placeholder="Mein Angebot" name="titel" class="form-control" required/>
                                <div class="invalid-feedback">
                                    Bitte gebe einen Titel für dein Angebot ein.
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="beschreibung" >Beschreibung: </label>
                                <input id="beschreibung" type="text" placeholder="Beschreibung des Essens, Abholbedingungen" maxlength="255" name="beschreibung" class="form-control" required/>
                                <div class="invalid-feedback">
                                    Bitte gebe eine Beschreibung für dein Angebot ein.
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="zeitForm" >Abholzeit: </label>
                                <input id="zeitForm" type="time" name="zeitForm" class="form-control" required/>
                                <div class="invalid-feedback">
                                    Bitte gebe eine korrekte Abholzeit für dein Angebot ein.
                                </div>

                            </div>
                            <div class="form-group">
                                <label for="datum" >Abholdatum: </label>
                                <input id="datum" type="date" name="datum" class="form-control" required/>
                                <div class="invalid-feedback">
                                    Bitte gebe ein gültiges Datum für dein Angebot ein.
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="kueche" >Küche: </label>
                                <input id="kueche" type="text" name="kueche" placeholder="italienisch" class="form-control" required/>
                                <div class="invalid-feedback">
                                    Bitte gebe eine Küche für dein Angebot ein.
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="menge" >Anzahl zu verkaufende Portionen: </label>
                                <input id="menge" type="number" placeholder="1" name="menge" min="1" max="99" step="1" class="form-control" />
                            </div>
                            <div class="form-group">
                                <label for="preis" >Preis: </label>
                                <div class="input-group">

                                    <span class="input-group-addon">CHF</span>
                                    <input id="preis" type="number" name="preis" min="0.10" step="0.10" max="99.90" class="form-control" />
                                </div>
                                <div class="invalid-feedback">
                                    Bitte gebe einen korrekten Preis ein.
                                </div>
                            </div>
                            <div class="form-group">
                                <label for="bilder">Bilder: </label>
                                <input class="form-control-file" id="bilder" type="file" name="bilder" accept="image/*" multiple>
                                <small class="form-text text-muted">Du kannst mehrere Bilder zu deinem Angebot hinzufügen um dein Essen zu zeigen.</small>
                            </div>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Abbrechen</button>
                <button id="angebotSubmit" type="submit" class="btn btn-primary">Angebot erstellen</button>
            </div>
            </form>


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
            <form method="POST" id="bestellenForm" action="#" novalidate>
            <div class="modal-body">
                <div class="container-angebot">
                    """),_display_(/*104.22*/alerts()),format.raw/*104.30*/("""
                    """),format.raw/*105.21*/("""<h1>Angebot bestellen</h1>
                    <div class="panel panel-default">
                            <div class="form-group">
                                <label for="email" >Menge </label>
                                <input id="bestellenMenge" type="number" name="menge" min="1" max="99" step="1" class="form-control" required/>
                                <div class="invalid-feedback">
                                    Gib eine korrekte Bestellmenge an!
                                </div>
                            </div>
                        </div>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Abbrechen</button>
                <button id="bestellenSubmit" type="submit" class="btn btn-primary" data-id="">Bestellen!</button>
            </div>
            </form>
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
                    """),_display_(/*139.22*/alerts()),format.raw/*139.30*/("""
                """),format.raw/*140.17*/("""<h1>Bewertung abgeben</h1>
                <p>Bewertung von 1 - 5 für diesen Benutzer abgeben</p>
                <div class="panel panel-default btn-bewertungen">
                    <button class="btn btn-secondary" id="btn-bewertung-1" data-token="0">1</button>
                    <button class="btn btn-secondary" id="btn-bewertung-2" data-token="0">2</button>
                    <button class="btn btn-secondary" id="btn-bewertung-3" data-token="0">3</button>
                    <button class="btn btn-secondary" id="btn-bewertung-4" data-token="0">4</button>
                    <button class="btn btn-secondary" id="btn-bewertung-5" data-token="0">5</button>
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
                  DATE: Sat Dec 16 14:13:01 CET 2017
                  SOURCE: C:/dev/git/CheapEat/app/views/modals.scala.html
                  HASH: 2043e15c5929a5943e5091972fa51edc0e155054
                  MATRIX: 829->0|1682->826|1711->834|1761->856|7036->6103|7066->6111|7117->6133|8818->7806|8848->7814|8895->7832
                  LINES: 32->1|46->15|46->15|47->16|135->104|135->104|136->105|170->139|170->139|171->140
                  -- GENERATED --
              */
          
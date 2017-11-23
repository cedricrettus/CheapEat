
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
                    <h1>Angebot erstellen</h1>
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
                    <h1>Angebot bestellen</h1>
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
                  DATE: Thu Nov 23 22:38:16 CET 2017
                  SOURCE: C:/dev/git/CheapEat/app/views/modals.scala.html
                  HASH: 719755afc6646dac99d2a4789a846c0a0b90bc00
                  MATRIX: 829->0
                  LINES: 32->1
                  -- GENERATED --
              */
          

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


    """),_display_(/*7.6*/nav()),format.raw/*7.11*/("""

"""),_display_(/*9.2*/modals()),format.raw/*9.10*/("""


    """),format.raw/*12.5*/("""<div class="content">
                <div class="container">

                    """),_display_(/*15.22*/alerts()),format.raw/*15.30*/("""
                    """),format.raw/*16.21*/("""<h1>Angebote</h1>

                    <script id="angebote-template" type="text/x-handlebars-template">
                        """),format.raw/*19.25*/("""{"""),format.raw/*19.26*/("""{"""),format.raw/*19.27*/("""#each this"""),format.raw/*19.37*/("""}"""),format.raw/*19.38*/("""}"""),format.raw/*19.39*/("""
                        """),format.raw/*20.25*/("""<div class="card">
                            <div class="row">
                                <div class="col-md-3">
                                        <!-- <img class="card-img-top" src="assets/images/burger1.jpg" alt="Card image cap"> -->
                                    <div id="thumbnail-carousel"""),format.raw/*24.64*/("""{"""),format.raw/*24.65*/("""{"""),format.raw/*24.66*/("""@index"""),format.raw/*24.73*/("""}"""),format.raw/*24.74*/("""}"""),format.raw/*24.75*/("""" class="carousel slide" data-ride=false data-interval="3000">
                                        <div class="carousel-inner">
                                            """),format.raw/*26.45*/("""{"""),format.raw/*26.46*/("""{"""),format.raw/*26.47*/("""#each this.urls"""),format.raw/*26.62*/("""}"""),format.raw/*26.63*/("""}"""),format.raw/*26.64*/("""
                                            """),format.raw/*27.45*/("""{"""),format.raw/*27.46*/("""{"""),format.raw/*27.47*/("""#if @first"""),format.raw/*27.58*/("""}"""),format.raw/*27.59*/("""}"""),format.raw/*27.60*/("""
                                            """),format.raw/*28.45*/("""<div class="carousel-item active">
                                                <img class="d-block img-fluid mh-100 card-img-top" src="http://s3.fgoeldi.com/big/"""),format.raw/*29.131*/("""{"""),format.raw/*29.132*/("""{"""),format.raw/*29.133*/("""this"""),format.raw/*29.137*/("""}"""),format.raw/*29.138*/("""}"""),format.raw/*29.139*/("""" alt="Angebot Bild">
                                            </div>
                                            """),format.raw/*31.45*/("""{"""),format.raw/*31.46*/("""{"""),format.raw/*31.47*/("""else"""),format.raw/*31.51*/("""}"""),format.raw/*31.52*/("""}"""),format.raw/*31.53*/("""

                                            """),format.raw/*33.45*/("""<div class="carousel-item">
                                                <img class="d-block img-fluid mh-100 card-img-top" src="http://s3.fgoeldi.com/big/"""),format.raw/*34.131*/("""{"""),format.raw/*34.132*/("""{"""),format.raw/*34.133*/("""this"""),format.raw/*34.137*/("""}"""),format.raw/*34.138*/("""}"""),format.raw/*34.139*/("""" alt="Angebot Bild">
                                            </div>
                                            """),format.raw/*36.45*/("""{"""),format.raw/*36.46*/("""{"""),format.raw/*36.47*/("""/if"""),format.raw/*36.50*/("""}"""),format.raw/*36.51*/("""}"""),format.raw/*36.52*/("""
                                            """),format.raw/*37.45*/("""{"""),format.raw/*37.46*/("""{"""),format.raw/*37.47*/("""else"""),format.raw/*37.51*/("""}"""),format.raw/*37.52*/("""}"""),format.raw/*37.53*/("""
                                            """),format.raw/*38.45*/("""<div class="carousel-item active">
                                                <img class="d-block img-fluid mh-100 card-img-top" src="assets/images/burger1.jpg" alt="Angebot Bild">
                                            </div>
                                            """),format.raw/*41.45*/("""{"""),format.raw/*41.46*/("""{"""),format.raw/*41.47*/("""/each"""),format.raw/*41.52*/("""}"""),format.raw/*41.53*/("""}"""),format.raw/*41.54*/("""
                                        """),format.raw/*42.41*/("""</div>
                                        <a class="carousel-control-prev" href="#thumbnail-carousel"""),format.raw/*43.99*/("""{"""),format.raw/*43.100*/("""{"""),format.raw/*43.101*/("""@index"""),format.raw/*43.108*/("""}"""),format.raw/*43.109*/("""}"""),format.raw/*43.110*/("""" role="button" data-slide="prev">
                                            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                                            <span class="sr-only">Previous</span>
                                        </a>
                                        <a class="carousel-control-next" href="#thumbnail-carousel"""),format.raw/*47.99*/("""{"""),format.raw/*47.100*/("""{"""),format.raw/*47.101*/("""@index"""),format.raw/*47.108*/("""}"""),format.raw/*47.109*/("""}"""),format.raw/*47.110*/("""" role="button" data-slide="next">
                                            <span class="carousel-control-next-icon" aria-hidden="true"></span>
                                            <span class="sr-only">Next</span>
                                        </a>
                                    </div>
                                </div>
                                <div class="col-md-5">
                                    <div class="card-body">
                                        <h4 class="card-title"> """),format.raw/*55.65*/("""{"""),format.raw/*55.66*/("""{"""),format.raw/*55.67*/("""this.angebot.titel"""),format.raw/*55.85*/("""}"""),format.raw/*55.86*/("""}"""),format.raw/*55.87*/(""" """),format.raw/*55.88*/("""</h4>
                                        <h6 class="card-subtitle mb-2 text-muted"> """),format.raw/*56.84*/("""{"""),format.raw/*56.85*/("""{"""),format.raw/*56.86*/("""this.angebot.kueche"""),format.raw/*56.105*/("""}"""),format.raw/*56.106*/("""}"""),format.raw/*56.107*/(""" """),format.raw/*56.108*/("""</h6>
                                        <p class="card-text"> """),format.raw/*57.63*/("""{"""),format.raw/*57.64*/("""{"""),format.raw/*57.65*/("""this.angebot.beschreibung"""),format.raw/*57.90*/("""}"""),format.raw/*57.91*/("""}"""),format.raw/*57.92*/(""" """),format.raw/*57.93*/("""</p>
                                    </div>
                                </div>
                                <div class="col-md-4">
                                    <div class="card-body">
                                        <p class="card-text">"""),format.raw/*62.62*/("""{"""),format.raw/*62.63*/("""{"""),format.raw/*62.64*/("""this.benutzername"""),format.raw/*62.81*/("""}"""),format.raw/*62.82*/("""}"""),format.raw/*62.83*/(""" """),format.raw/*62.84*/("""<span class="rating">"""),format.raw/*62.105*/("""{"""),format.raw/*62.106*/("""{"""),format.raw/*62.107*/("""this.bewertung"""),format.raw/*62.121*/("""}"""),format.raw/*62.122*/("""}"""),format.raw/*62.123*/(""" """),format.raw/*62.124*/("""| """),format.raw/*62.126*/("""{"""),format.raw/*62.127*/("""{"""),format.raw/*62.128*/("""this.anzBewertung"""),format.raw/*62.145*/("""}"""),format.raw/*62.146*/("""}"""),format.raw/*62.147*/("""</span></p>
                                        <p>Abholzeit: """),format.raw/*63.55*/("""{"""),format.raw/*63.56*/("""{"""),format.raw/*63.57*/("""this.angebot.datum"""),format.raw/*63.75*/("""}"""),format.raw/*63.76*/("""}"""),format.raw/*63.77*/(""" """),format.raw/*63.78*/("""um """),format.raw/*63.81*/("""{"""),format.raw/*63.82*/("""{"""),format.raw/*63.83*/("""this.angebot.zeit"""),format.raw/*63.100*/("""}"""),format.raw/*63.101*/("""}"""),format.raw/*63.102*/("""</p>
                                        <p>Ort: <span> """),format.raw/*64.56*/("""{"""),format.raw/*64.57*/("""{"""),format.raw/*64.58*/("""this.plz"""),format.raw/*64.66*/("""}"""),format.raw/*64.67*/("""}"""),format.raw/*64.68*/(""" """),format.raw/*64.69*/("""</span> </p>
                                        <p class="card-text"><strong class="preis">CHF """),format.raw/*65.88*/("""{"""),format.raw/*65.89*/("""{"""),format.raw/*65.90*/("""this.angebot.preis"""),format.raw/*65.108*/("""}"""),format.raw/*65.109*/("""}"""),format.raw/*65.110*/("""</strong>
                                            <span class="">Portionen: """),format.raw/*66.71*/("""{"""),format.raw/*66.72*/("""{"""),format.raw/*66.73*/("""this.angebot.menge"""),format.raw/*66.91*/("""}"""),format.raw/*66.92*/("""}"""),format.raw/*66.93*/("""</span></p>
                                        <button class="btn btn-primary bestellButton" data-id=""""),format.raw/*67.96*/("""{"""),format.raw/*67.97*/("""{"""),format.raw/*67.98*/("""this.angebot.id"""),format.raw/*67.113*/("""}"""),format.raw/*67.114*/("""}"""),format.raw/*67.115*/("""">Bestellen</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                        """),format.raw/*72.25*/("""{"""),format.raw/*72.26*/("""{"""),format.raw/*72.27*/("""/each"""),format.raw/*72.32*/("""}"""),format.raw/*72.33*/("""}"""),format.raw/*72.34*/("""
                    """),format.raw/*73.21*/("""</script>

                    <div class="cards-items angebote-cards" id="angebote-cards">

                    </div>
                </div>
    </div>

""")))}),format.raw/*81.2*/("""
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
                  DATE: Mon Dec 11 21:57:06 CET 2017
                  SOURCE: C:/dev/git/CheapEat/app/views/index.scala.html
                  HASH: 935a2ab994b899c18a9a30680f072c0ad0996d0b
                  MATRIX: 827->1|858->24|897->26|931->34|971->48|985->54|1029->78|1109->132|1123->138|1171->166|1241->211|1266->216|1296->221|1324->229|1361->239|1475->326|1504->334|1554->356|1714->488|1743->489|1772->490|1810->500|1839->501|1868->502|1922->528|2266->844|2295->845|2324->846|2358->853|2387->854|2416->855|2622->1033|2651->1034|2680->1035|2723->1050|2752->1051|2781->1052|2855->1098|2884->1099|2913->1100|2951->1111|2980->1112|3009->1113|3083->1159|3278->1325|3308->1326|3338->1327|3371->1331|3401->1332|3431->1333|3578->1452|3607->1453|3636->1454|3668->1458|3697->1459|3726->1460|3802->1508|3990->1667|4020->1668|4050->1669|4083->1673|4113->1674|4143->1675|4290->1794|4319->1795|4348->1796|4379->1799|4408->1800|4437->1801|4511->1847|4540->1848|4569->1849|4601->1853|4630->1854|4659->1855|4733->1901|5045->2185|5074->2186|5103->2187|5136->2192|5165->2193|5194->2194|5264->2236|5398->2342|5428->2343|5458->2344|5493->2351|5523->2352|5553->2353|5957->2729|5987->2730|6017->2731|6052->2738|6082->2739|6112->2740|6679->3279|6708->3280|6737->3281|6783->3299|6812->3300|6841->3301|6870->3302|6988->3392|7017->3393|7046->3394|7094->3413|7124->3414|7154->3415|7184->3416|7281->3485|7310->3486|7339->3487|7392->3512|7421->3513|7450->3514|7479->3515|7775->3783|7804->3784|7833->3785|7878->3802|7907->3803|7936->3804|7965->3805|8015->3826|8045->3827|8075->3828|8118->3842|8148->3843|8178->3844|8208->3845|8239->3847|8269->3848|8299->3849|8345->3866|8375->3867|8405->3868|8500->3935|8529->3936|8558->3937|8604->3955|8633->3956|8662->3957|8691->3958|8722->3961|8751->3962|8780->3963|8826->3980|8856->3981|8886->3982|8975->4043|9004->4044|9033->4045|9069->4053|9098->4054|9127->4055|9156->4056|9285->4157|9314->4158|9343->4159|9390->4177|9420->4178|9450->4179|9559->4260|9588->4261|9617->4262|9663->4280|9692->4281|9721->4282|9857->4390|9886->4391|9915->4392|9959->4407|9989->4408|10019->4409|10245->4607|10274->4608|10303->4609|10336->4614|10365->4615|10394->4616|10444->4638|10638->4802
                  LINES: 32->1|32->1|32->1|34->3|34->3|34->3|34->3|35->4|35->4|35->4|38->7|38->7|40->9|40->9|43->12|46->15|46->15|47->16|50->19|50->19|50->19|50->19|50->19|50->19|51->20|55->24|55->24|55->24|55->24|55->24|55->24|57->26|57->26|57->26|57->26|57->26|57->26|58->27|58->27|58->27|58->27|58->27|58->27|59->28|60->29|60->29|60->29|60->29|60->29|60->29|62->31|62->31|62->31|62->31|62->31|62->31|64->33|65->34|65->34|65->34|65->34|65->34|65->34|67->36|67->36|67->36|67->36|67->36|67->36|68->37|68->37|68->37|68->37|68->37|68->37|69->38|72->41|72->41|72->41|72->41|72->41|72->41|73->42|74->43|74->43|74->43|74->43|74->43|74->43|78->47|78->47|78->47|78->47|78->47|78->47|86->55|86->55|86->55|86->55|86->55|86->55|86->55|87->56|87->56|87->56|87->56|87->56|87->56|87->56|88->57|88->57|88->57|88->57|88->57|88->57|88->57|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|93->62|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|94->63|95->64|95->64|95->64|95->64|95->64|95->64|95->64|96->65|96->65|96->65|96->65|96->65|96->65|97->66|97->66|97->66|97->66|97->66|97->66|98->67|98->67|98->67|98->67|98->67|98->67|103->72|103->72|103->72|103->72|103->72|103->72|104->73|112->81
                  -- GENERATED --
              */
          
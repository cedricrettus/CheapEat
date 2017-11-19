
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
                <form id="suche" class="form-inline my-2 my-lg-0">
                    <input class="form-control mr-sm-2" id="fieldPlz" type="text" name="plz" placeholder="PLZ" aria-label="Search">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit" action="" formmethod="get"><i class="fa fa-search" aria-hidden="true"></i></button>
                </form>
            </div>
        </div>
    </nav>

"""),_display_(/*32.2*/modals()),format.raw/*32.10*/("""


    """),format.raw/*35.5*/("""<div class="content">
                <div class="container">
                    <h1>Angebote</h1>
                    <script id="angebote-template" type="text/x-handlebars-template">

                        """),format.raw/*40.25*/("""{"""),format.raw/*40.26*/("""{"""),format.raw/*40.27*/("""#each this"""),format.raw/*40.37*/("""}"""),format.raw/*40.38*/("""}"""),format.raw/*40.39*/("""
                        """),format.raw/*41.25*/("""<div class="card">
                            <div class="row">
                                <div class="col-md-3">
                                        <!-- <img class="card-img-top" src="assets/images/burger1.jpg" alt="Card image cap"> -->
                                    <div id="thumbnail-carousel"""),format.raw/*45.64*/("""{"""),format.raw/*45.65*/("""{"""),format.raw/*45.66*/("""@index"""),format.raw/*45.73*/("""}"""),format.raw/*45.74*/("""}"""),format.raw/*45.75*/("""" class="carousel slide" data-ride=false data-interval="3000">
                                        <div class="carousel-inner">
                                            """),format.raw/*47.45*/("""{"""),format.raw/*47.46*/("""{"""),format.raw/*47.47*/("""#each this.urls"""),format.raw/*47.62*/("""}"""),format.raw/*47.63*/("""}"""),format.raw/*47.64*/("""
                                            """),format.raw/*48.45*/("""{"""),format.raw/*48.46*/("""{"""),format.raw/*48.47*/("""#if @first"""),format.raw/*48.58*/("""}"""),format.raw/*48.59*/("""}"""),format.raw/*48.60*/("""
                                            """),format.raw/*49.45*/("""<div class="carousel-item active">
                                                <img class="d-block img-fluid mh-100 card-img-top" src="http://s3.fgoeldi.com/big/"""),format.raw/*50.131*/("""{"""),format.raw/*50.132*/("""{"""),format.raw/*50.133*/("""this"""),format.raw/*50.137*/("""}"""),format.raw/*50.138*/("""}"""),format.raw/*50.139*/("""" alt="Angebot Bild">
                                            </div>
                                            """),format.raw/*52.45*/("""{"""),format.raw/*52.46*/("""{"""),format.raw/*52.47*/("""else"""),format.raw/*52.51*/("""}"""),format.raw/*52.52*/("""}"""),format.raw/*52.53*/("""

                                            """),format.raw/*54.45*/("""<div class="carousel-item">
                                                <img class="d-block img-fluid mh-100 card-img-top" src="http://s3.fgoeldi.com/big/"""),format.raw/*55.131*/("""{"""),format.raw/*55.132*/("""{"""),format.raw/*55.133*/("""this"""),format.raw/*55.137*/("""}"""),format.raw/*55.138*/("""}"""),format.raw/*55.139*/("""" alt="Angebot Bild">
                                            </div>
                                            """),format.raw/*57.45*/("""{"""),format.raw/*57.46*/("""{"""),format.raw/*57.47*/("""/if"""),format.raw/*57.50*/("""}"""),format.raw/*57.51*/("""}"""),format.raw/*57.52*/("""
                                            """),format.raw/*58.45*/("""{"""),format.raw/*58.46*/("""{"""),format.raw/*58.47*/("""else"""),format.raw/*58.51*/("""}"""),format.raw/*58.52*/("""}"""),format.raw/*58.53*/("""
                                            """),format.raw/*59.45*/("""<div class="carousel-item active">
                                                <img class="d-block img-fluid mh-100 card-img-top" src="assets/images/burger1.jpg" alt="Angebot Bild">
                                            </div>
                                            """),format.raw/*62.45*/("""{"""),format.raw/*62.46*/("""{"""),format.raw/*62.47*/("""/each"""),format.raw/*62.52*/("""}"""),format.raw/*62.53*/("""}"""),format.raw/*62.54*/("""
                                        """),format.raw/*63.41*/("""</div>
                                        <a class="carousel-control-prev" href="#thumbnail-carousel"""),format.raw/*64.99*/("""{"""),format.raw/*64.100*/("""{"""),format.raw/*64.101*/("""@index"""),format.raw/*64.108*/("""}"""),format.raw/*64.109*/("""}"""),format.raw/*64.110*/("""" role="button" data-slide="prev">
                                            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                                            <span class="sr-only">Previous</span>
                                        </a>
                                        <a class="carousel-control-next" href="#thumbnail-carousel"""),format.raw/*68.99*/("""{"""),format.raw/*68.100*/("""{"""),format.raw/*68.101*/("""@index"""),format.raw/*68.108*/("""}"""),format.raw/*68.109*/("""}"""),format.raw/*68.110*/("""" role="button" data-slide="next">
                                            <span class="carousel-control-next-icon" aria-hidden="true"></span>
                                            <span class="sr-only">Next</span>
                                        </a>
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="card-body">
                                        <h4 class="card-title"> """),format.raw/*76.65*/("""{"""),format.raw/*76.66*/("""{"""),format.raw/*76.67*/("""this.angebot.titel"""),format.raw/*76.85*/("""}"""),format.raw/*76.86*/("""}"""),format.raw/*76.87*/(""" """),format.raw/*76.88*/("""</h4>
                                        <h6 class="card-subtitle mb-2 text-muted"> """),format.raw/*77.84*/("""{"""),format.raw/*77.85*/("""{"""),format.raw/*77.86*/("""this.angebot.kueche"""),format.raw/*77.105*/("""}"""),format.raw/*77.106*/("""}"""),format.raw/*77.107*/(""" """),format.raw/*77.108*/("""</h6>
                                        <p class="card-text"> """),format.raw/*78.63*/("""{"""),format.raw/*78.64*/("""{"""),format.raw/*78.65*/("""this.angebot.beschreibung"""),format.raw/*78.90*/("""}"""),format.raw/*78.91*/("""}"""),format.raw/*78.92*/(""" """),format.raw/*78.93*/("""</p>
                                    </div>
                                </div>
                                <div class="col-md-3">
                                    <div class="card-body">
                                        <p class="card-text">Username <span class="">Bewertung</span></p>
                                        <p class="card-text">Ort: <span> """),format.raw/*84.74*/("""{"""),format.raw/*84.75*/("""{"""),format.raw/*84.76*/("""this.angebot.plz"""),format.raw/*84.92*/("""}"""),format.raw/*84.93*/("""}"""),format.raw/*84.94*/(""" """),format.raw/*84.95*/("""</span> </p>
                                        <p class="card-text"><span class="preis">"""),format.raw/*85.82*/("""{"""),format.raw/*85.83*/("""{"""),format.raw/*85.84*/("""this.angebot.preis"""),format.raw/*85.102*/("""}"""),format.raw/*85.103*/("""}"""),format.raw/*85.104*/(""" """),format.raw/*85.105*/("""CHF</span>
                                            <span class="">Portionen: """),format.raw/*86.71*/("""{"""),format.raw/*86.72*/("""{"""),format.raw/*86.73*/("""this.angebot.menge"""),format.raw/*86.91*/("""}"""),format.raw/*86.92*/("""}"""),format.raw/*86.93*/("""</span></p>
                                        <button class="btn btn-primary bestellButton" data-id=""""),format.raw/*87.96*/("""{"""),format.raw/*87.97*/("""{"""),format.raw/*87.98*/("""this.angebot.id"""),format.raw/*87.113*/("""}"""),format.raw/*87.114*/("""}"""),format.raw/*87.115*/("""">Bestellen</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                        """),format.raw/*92.25*/("""{"""),format.raw/*92.26*/("""{"""),format.raw/*92.27*/("""/each"""),format.raw/*92.32*/("""}"""),format.raw/*92.33*/("""}"""),format.raw/*92.34*/("""

                    """),format.raw/*94.21*/("""</script>
                    <div class="cards-items angebote-cards" id="angebote-cards">

                    </div>
                </div>
    </div>





""")))}),format.raw/*105.2*/("""
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
                  DATE: Sun Nov 19 18:25:01 CET 2017
                  SOURCE: C:/dev/git/CheapEat/app/views/index.scala.html
                  HASH: 18d7298296b53f89229cba2b812929692b86ef70
                  MATRIX: 827->1|858->24|897->26|931->34|971->48|985->54|1029->78|1109->132|1123->138|1171->166|2706->1675|2735->1683|2772->1693|3016->1909|3045->1910|3074->1911|3112->1921|3141->1922|3170->1923|3224->1949|3568->2265|3597->2266|3626->2267|3660->2274|3689->2275|3718->2276|3924->2454|3953->2455|3982->2456|4025->2471|4054->2472|4083->2473|4157->2519|4186->2520|4215->2521|4253->2532|4282->2533|4311->2534|4385->2580|4580->2746|4610->2747|4640->2748|4673->2752|4703->2753|4733->2754|4880->2873|4909->2874|4938->2875|4970->2879|4999->2880|5028->2881|5104->2929|5292->3088|5322->3089|5352->3090|5385->3094|5415->3095|5445->3096|5592->3215|5621->3216|5650->3217|5681->3220|5710->3221|5739->3222|5813->3268|5842->3269|5871->3270|5903->3274|5932->3275|5961->3276|6035->3322|6347->3606|6376->3607|6405->3608|6438->3613|6467->3614|6496->3615|6566->3657|6700->3763|6730->3764|6760->3765|6795->3772|6825->3773|6855->3774|7259->4150|7289->4151|7319->4152|7354->4159|7384->4160|7414->4161|7981->4700|8010->4701|8039->4702|8085->4720|8114->4721|8143->4722|8172->4723|8290->4813|8319->4814|8348->4815|8396->4834|8426->4835|8456->4836|8486->4837|8583->4906|8612->4907|8641->4908|8694->4933|8723->4934|8752->4935|8781->4936|9196->5323|9225->5324|9254->5325|9298->5341|9327->5342|9356->5343|9385->5344|9508->5439|9537->5440|9566->5441|9613->5459|9643->5460|9673->5461|9703->5462|9813->5544|9842->5545|9871->5546|9917->5564|9946->5565|9975->5566|10111->5674|10140->5675|10169->5676|10213->5691|10243->5692|10273->5693|10499->5891|10528->5892|10557->5893|10590->5898|10619->5899|10648->5900|10700->5924|10901->6094
                  LINES: 32->1|32->1|32->1|34->3|34->3|34->3|34->3|35->4|35->4|35->4|63->32|63->32|66->35|71->40|71->40|71->40|71->40|71->40|71->40|72->41|76->45|76->45|76->45|76->45|76->45|76->45|78->47|78->47|78->47|78->47|78->47|78->47|79->48|79->48|79->48|79->48|79->48|79->48|80->49|81->50|81->50|81->50|81->50|81->50|81->50|83->52|83->52|83->52|83->52|83->52|83->52|85->54|86->55|86->55|86->55|86->55|86->55|86->55|88->57|88->57|88->57|88->57|88->57|88->57|89->58|89->58|89->58|89->58|89->58|89->58|90->59|93->62|93->62|93->62|93->62|93->62|93->62|94->63|95->64|95->64|95->64|95->64|95->64|95->64|99->68|99->68|99->68|99->68|99->68|99->68|107->76|107->76|107->76|107->76|107->76|107->76|107->76|108->77|108->77|108->77|108->77|108->77|108->77|108->77|109->78|109->78|109->78|109->78|109->78|109->78|109->78|115->84|115->84|115->84|115->84|115->84|115->84|115->84|116->85|116->85|116->85|116->85|116->85|116->85|116->85|117->86|117->86|117->86|117->86|117->86|117->86|118->87|118->87|118->87|118->87|118->87|118->87|123->92|123->92|123->92|123->92|123->92|123->92|125->94|136->105
                  -- GENERATED --
              */
          
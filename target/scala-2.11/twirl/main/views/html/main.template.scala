
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png")),format.raw/*9.97*/("""">

        <!---<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">-->
        <link rel="stylesheet" href=""""),_display_(/*12.39*/routes/*12.45*/.Assets.at("css/bootstrap.css")),format.raw/*12.76*/("""">
        <link rel="stylesheet" href=""""),_display_(/*13.39*/routes/*13.45*/.Assets.at("css/style.css")),format.raw/*13.72*/("""">
        <link rel="stylesheet" href=""""),_display_(/*14.39*/routes/*14.45*/.Assets.at("css/mobile.css")),format.raw/*14.73*/("""">
        <link rel="manifest" href=""""),_display_(/*15.37*/routes/*15.43*/.Assets.at("manifest.json")),format.raw/*15.70*/(""">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src=""""),_display_(/*17.23*/routes/*17.29*/.Assets.at("js/jquery-3.2.1.js")),format.raw/*17.61*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*18.23*/routes/*18.29*/.Assets.at("js/handlebars-v4.0.11.js")),format.raw/*18.67*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*19.23*/routes/*19.29*/.Assets.at("js/hbScript.js")),format.raw/*19.57*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*20.23*/routes/*20.29*/.Assets.at("js/main.js")),format.raw/*20.53*/("""" type="text/javascript"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
    </head>
    <body>
        """),_display_(/*25.10*/content),format.raw/*25.17*/("""
    """),format.raw/*26.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Wed Dec 20 09:18:58 CET 2017
                  SOURCE: C:/dev/git/CheapEat/app/views/main.scala.html
                  HASH: 4e15bca5c01b20694c833bda55c20933bdfd61ac
                  MATRIX: 748->1|873->31|903->35|984->90|1009->95|1181->241|1195->247|1247->279|1441->446|1456->452|1508->483|1577->525|1592->531|1640->558|1709->600|1724->606|1773->634|1840->674|1855->680|1903->707|2071->848|2086->854|2139->886|2224->944|2239->950|2298->988|2383->1046|2398->1052|2447->1080|2532->1138|2547->1144|2592->1168|3120->1669|3148->1676|3181->1682
                  LINES: 27->1|32->1|34->3|38->7|38->7|40->9|40->9|40->9|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|56->25|56->25|57->26
                  -- GENERATED --
              */
          
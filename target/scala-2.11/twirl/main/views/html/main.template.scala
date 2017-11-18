
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

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">
        <link rel="stylesheet" href=""""),_display_(/*12.39*/routes/*12.45*/.Assets.at("css/style.css")),format.raw/*12.72*/("""">
        <link rel="stylesheet" href=""""),_display_(/*13.39*/routes/*13.45*/.Assets.at("css/mobile.css")),format.raw/*13.73*/("""">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src=""""),_display_(/*15.23*/routes/*15.29*/.Assets.at("js/jquery-3.2.1.js")),format.raw/*15.61*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*16.23*/routes/*16.29*/.Assets.at("js/functions.js")),format.raw/*16.58*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*17.23*/routes/*17.29*/.Assets.at("js/handlebars-v4.0.11.js")),format.raw/*17.67*/("""" type="text/javascript"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
    </head>
    <body>
        """),_display_(/*22.10*/content),format.raw/*22.17*/("""
    """),format.raw/*23.5*/("""</body>
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
                  DATE: Sat Nov 18 09:17:05 CET 2017
                  SOURCE: C:/dev/git/CheapEat/app/views/main.scala.html
                  HASH: 9b1c0b8c024459a7913150f304c5fdd47ed3268c
                  MATRIX: 748->1|873->31|903->35|984->90|1009->95|1181->241|1195->247|1247->279|1433->438|1448->444|1496->471|1565->513|1580->519|1629->547|1798->689|1813->695|1866->727|1951->785|1966->791|2016->820|2101->878|2116->884|2175->922|2703->1423|2731->1430|2764->1436
                  LINES: 27->1|32->1|34->3|38->7|38->7|40->9|40->9|40->9|43->12|43->12|43->12|44->13|44->13|44->13|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|53->22|53->22|54->23
                  -- GENERATED --
              */
          
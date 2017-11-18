
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/dev/git/CheapEat/conf/routes
// @DATE:Sat Nov 18 16:35:14 CET 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:12
  class ReverseBestellungController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:12
    def addBestellung: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BestellungController.addBestellung",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "bestellung"})
        }
      """
    )
  
    // @LINE:13
    def getBestellung: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BestellungController.getBestellung",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bestellung"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseAngebotController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def addAngebot: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AngebotController.addAngebot",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "angebote"})
        }
      """
    )
  
    // @LINE:8
    def getAngeboteList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AngebotController.getAngeboteList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "angebote/all"})
        }
      """
    )
  
    // @LINE:15
    def test: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AngebotController.test",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test"})
        }
      """
    )
  
    // @LINE:9
    def getAngebote: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AngebotController.getAngebote",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "angebote/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:11
    def sucheAngebot: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AngebotController.sucheAngebot",
      """
        function(plz0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search" + _qS([(plz0 == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("plz", plz0))])})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AngebotController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:20
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:17
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:17
    def imageUpload: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.imageUpload",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "upload"})
        }
      """
    )
  
  }


}

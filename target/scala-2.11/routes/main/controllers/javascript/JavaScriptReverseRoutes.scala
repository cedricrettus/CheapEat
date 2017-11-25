
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/dev/git/CheapEat/conf/routes
// @DATE:Sat Nov 25 15:42:26 CET 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:61
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:61
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:31
  class ReverseAuthentication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:32
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Authentication.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:31
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Authentication.authenticate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:20
  class ReverseProfile(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def getOrdersSell: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Profile.getOrdersSell",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "me/anfragen"})
        }
      """
    )
  
    // @LINE:28
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Profile.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
        }
      """
    )
  
    // @LINE:22
    def getOffers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Profile.getOffers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "me/angebote"})
        }
      """
    )
  
    // @LINE:20
    def getOrdersBuy: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Profile.getOrdersBuy",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "me/bestellungen"})
        }
      """
    )
  
  }

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
  
    // @LINE:14
    def getBestellung: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BestellungController.getBestellung",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bestellung"})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseAngebotController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def searchOffers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AngebotController.searchOffers",
      """
        function(plz0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("plz", plz0)})
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
  
    // @LINE:7
    def addOffer: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AngebotController.addOffer",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "angebote"})
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
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def imageUpload: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.imageUpload",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "upload"})
        }
      """
    )
  
    // @LINE:16
    def test: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.test",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test"})
        }
      """
    )
  
    // @LINE:10
    def search: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.search",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:30
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }


}

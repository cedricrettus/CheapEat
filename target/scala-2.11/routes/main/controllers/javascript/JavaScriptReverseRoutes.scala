
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/dev/git/CheapEat/conf/routes
// @DATE:Mon Dec 11 16:45:18 CET 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:47
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:47
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:34
  class ReverseAuthentication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:35
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Authentication.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:34
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Authentication.authenticate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:17
  class ReverseProfile(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def getOffers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Profile.getOffers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "me/angebote"})
        }
      """
    )
  
    // @LINE:27
    def rateOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Profile.rateOrder",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "bestellung/bewertung/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:20
    def acceptRequest: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Profile.acceptRequest",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "me/anfragen/accept/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:18
    def getRequests: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Profile.getRequests",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "me/anfragen"})
        }
      """
    )
  
    // @LINE:19
    def denyRequest: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Profile.denyRequest",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "me/anfragen/deny/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:17
    def getOrders: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Profile.getOrders",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "me/bestellungen"})
        }
      """
    )
  
    // @LINE:31
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Profile.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
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
  
    // @LINE:15
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
  
    // @LINE:11
    def searchOffers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AngebotController.searchOffers",
      """
        function(plz0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("plz", plz0)})
        }
      """
    )
  
    // @LINE:24
    def getUserRating: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AngebotController.getUserRating",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "benutzer/bewertung/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id0)})
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

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
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
  
    // @LINE:33
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:39
  class ReverseSignup(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def confirm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Signup.confirm",
      """
        function(confirmToken0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "confirm/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("confirmToken", encodeURIComponent(confirmToken0))})
        }
      """
    )
  
    // @LINE:40
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Signup.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:39
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Signup.create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
  }


}


// @GENERATOR:play-routes-compiler
// @SOURCE:C:/dev/git/CheapEat/conf/routes
// @DATE:Sun Dec 17 14:58:56 CET 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_5: controllers.Application,
  // @LINE:7
  AngebotController_6: controllers.AngebotController,
  // @LINE:12
  BestellungController_0: controllers.BestellungController,
  // @LINE:17
  Profile_3: controllers.Profile,
  // @LINE:34
  Authentication_2: controllers.Authentication,
  // @LINE:39
  Signup_1: controllers.Signup,
  // @LINE:47
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_5: controllers.Application,
    // @LINE:7
    AngebotController_6: controllers.AngebotController,
    // @LINE:12
    BestellungController_0: controllers.BestellungController,
    // @LINE:17
    Profile_3: controllers.Profile,
    // @LINE:34
    Authentication_2: controllers.Authentication,
    // @LINE:39
    Signup_1: controllers.Signup,
    // @LINE:47
    Assets_4: controllers.Assets
  ) = this(errorHandler, Application_5, AngebotController_6, BestellungController_0, Profile_3, Authentication_2, Signup_1, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_5, AngebotController_6, BestellungController_0, Profile_3, Authentication_2, Signup_1, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """angebote""", """controllers.AngebotController.addOffer()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """angebote/all""", """controllers.AngebotController.getAngeboteList()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """angebote/""" + "$" + """id<[^/]+>""", """controllers.AngebotController.getAngebote(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search""", """controllers.Application.search()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search/""" + "$" + """plz<[^/]+>""", """controllers.AngebotController.searchOffers(plz:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bestellung""", """controllers.BestellungController.addBestellung()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bestellung""", """controllers.BestellungController.getBestellung()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """me/bestellungen""", """controllers.Profile.getOrders()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """me/anfragen""", """controllers.Profile.getRequests()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """me/anfragen/""" + "$" + """id<[^/]+>/deny""", """controllers.Profile.denyRequest(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """me/anfragen/""" + "$" + """id<[^/]+>/accept""", """controllers.Profile.acceptRequest(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """me/angebote""", """controllers.Profile.getOffers()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """benutzer/""" + "$" + """id<[^/]+>/bewertung""", """controllers.AngebotController.getUserRating(id:Int)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bestellung/""" + "$" + """id<[^/]+>/bewertung""", """controllers.Profile.rateOrder(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.Profile.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Application.login()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Authentication.authenticate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.Authentication.logout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.Signup.create()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.Signup.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """confirm/""" + "$" + """confirmToken<[^/]+>""", """controllers.Signup.confirm(confirmToken:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_5.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_AngebotController_addOffer1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("angebote")))
  )
  private[this] lazy val controllers_AngebotController_addOffer1_invoker = createInvoker(
    AngebotController_6.addOffer(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AngebotController",
      "addOffer",
      Nil,
      "POST",
      """""",
      this.prefix + """angebote"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_AngebotController_getAngeboteList2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("angebote/all")))
  )
  private[this] lazy val controllers_AngebotController_getAngeboteList2_invoker = createInvoker(
    AngebotController_6.getAngeboteList(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AngebotController",
      "getAngeboteList",
      Nil,
      "GET",
      """""",
      this.prefix + """angebote/all"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_AngebotController_getAngebote3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("angebote/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AngebotController_getAngebote3_invoker = createInvoker(
    AngebotController_6.getAngebote(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AngebotController",
      "getAngebote",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """angebote/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_search4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_Application_search4_invoker = createInvoker(
    Application_5.search(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "search",
      Nil,
      "GET",
      """""",
      this.prefix + """search"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_AngebotController_searchOffers5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search/"), DynamicPart("plz", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AngebotController_searchOffers5_invoker = createInvoker(
    AngebotController_6.searchOffers(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AngebotController",
      "searchOffers",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """search/""" + "$" + """plz<[^/]+>"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_BestellungController_addBestellung6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bestellung")))
  )
  private[this] lazy val controllers_BestellungController_addBestellung6_invoker = createInvoker(
    BestellungController_0.addBestellung(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BestellungController",
      "addBestellung",
      Nil,
      "POST",
      """""",
      this.prefix + """bestellung"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_BestellungController_getBestellung7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bestellung")))
  )
  private[this] lazy val controllers_BestellungController_getBestellung7_invoker = createInvoker(
    BestellungController_0.getBestellung(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BestellungController",
      "getBestellung",
      Nil,
      "GET",
      """ TODO bestellung bereitstellen nach id""",
      this.prefix + """bestellung"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Profile_getOrders8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("me/bestellungen")))
  )
  private[this] lazy val controllers_Profile_getOrders8_invoker = createInvoker(
    Profile_3.getOrders(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Profile",
      "getOrders",
      Nil,
      "GET",
      """""",
      this.prefix + """me/bestellungen"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Profile_getRequests9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("me/anfragen")))
  )
  private[this] lazy val controllers_Profile_getRequests9_invoker = createInvoker(
    Profile_3.getRequests(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Profile",
      "getRequests",
      Nil,
      "GET",
      """""",
      this.prefix + """me/anfragen"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Profile_denyRequest10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("me/anfragen/"), DynamicPart("id", """[^/]+""",true), StaticPart("/deny")))
  )
  private[this] lazy val controllers_Profile_denyRequest10_invoker = createInvoker(
    Profile_3.denyRequest(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Profile",
      "denyRequest",
      Seq(classOf[Int]),
      "POST",
      """""",
      this.prefix + """me/anfragen/""" + "$" + """id<[^/]+>/deny"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Profile_acceptRequest11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("me/anfragen/"), DynamicPart("id", """[^/]+""",true), StaticPart("/accept")))
  )
  private[this] lazy val controllers_Profile_acceptRequest11_invoker = createInvoker(
    Profile_3.acceptRequest(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Profile",
      "acceptRequest",
      Seq(classOf[Int]),
      "POST",
      """""",
      this.prefix + """me/anfragen/""" + "$" + """id<[^/]+>/accept"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Profile_getOffers12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("me/angebote")))
  )
  private[this] lazy val controllers_Profile_getOffers12_invoker = createInvoker(
    Profile_3.getOffers(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Profile",
      "getOffers",
      Nil,
      "GET",
      """""",
      this.prefix + """me/angebote"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_AngebotController_getUserRating13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("benutzer/"), DynamicPart("id", """[^/]+""",true), StaticPart("/bewertung")))
  )
  private[this] lazy val controllers_AngebotController_getUserRating13_invoker = createInvoker(
    AngebotController_6.getUserRating(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AngebotController",
      "getUserRating",
      Seq(classOf[Int]),
      "GET",
      """Bewertung""",
      this.prefix + """benutzer/""" + "$" + """id<[^/]+>/bewertung"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Profile_rateOrder14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bestellung/"), DynamicPart("id", """[^/]+""",true), StaticPart("/bewertung")))
  )
  private[this] lazy val controllers_Profile_rateOrder14_invoker = createInvoker(
    Profile_3.rateOrder(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Profile",
      "rateOrder",
      Seq(classOf[Int]),
      "POST",
      """Bestellung wird bewertet -> benutzer hinter der bestellung wird bewertung zugewiesen""",
      this.prefix + """bestellung/""" + "$" + """id<[^/]+>/bewertung"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Profile_index15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_Profile_index15_invoker = createInvoker(
    Profile_3.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Profile",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """profile"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_Application_login16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_login16_invoker = createInvoker(
    Application_5.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_Authentication_authenticate17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Authentication_authenticate17_invoker = createInvoker(
    Authentication_2.authenticate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Authentication",
      "authenticate",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_Authentication_logout18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Authentication_logout18_invoker = createInvoker(
    Authentication_2.logout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Authentication",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_Signup_create19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_Signup_create19_invoker = createInvoker(
    Signup_1.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Signup",
      "create",
      Nil,
      "GET",
      """# Einen neun Benutzer registrieren""",
      this.prefix + """signup"""
    )
  )

  // @LINE:40
  private[this] lazy val controllers_Signup_save20_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_Signup_save20_invoker = createInvoker(
    Signup_1.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Signup",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_Signup_confirm21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("confirm/"), DynamicPart("confirmToken", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Signup_confirm21_invoker = createInvoker(
    Signup_1.confirm(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Signup",
      "confirm",
      Seq(classOf[String]),
      "GET",
      """
# Wenn der Benutzer das Bestätigungsmail anklickt, wird der Token überprüft und der neue Benutzer bestätigt""",
      this.prefix + """confirm/""" + "$" + """confirmToken<[^/]+>"""
    )
  )

  // @LINE:47
  private[this] lazy val controllers_Assets_at22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at22_invoker = createInvoker(
    Assets_4.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_5.index())
      }
  
    // @LINE:7
    case controllers_AngebotController_addOffer1_route(params) =>
      call { 
        controllers_AngebotController_addOffer1_invoker.call(AngebotController_6.addOffer())
      }
  
    // @LINE:8
    case controllers_AngebotController_getAngeboteList2_route(params) =>
      call { 
        controllers_AngebotController_getAngeboteList2_invoker.call(AngebotController_6.getAngeboteList())
      }
  
    // @LINE:9
    case controllers_AngebotController_getAngebote3_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_AngebotController_getAngebote3_invoker.call(AngebotController_6.getAngebote(id))
      }
  
    // @LINE:10
    case controllers_Application_search4_route(params) =>
      call { 
        controllers_Application_search4_invoker.call(Application_5.search())
      }
  
    // @LINE:11
    case controllers_AngebotController_searchOffers5_route(params) =>
      call(params.fromPath[Int]("plz", None)) { (plz) =>
        controllers_AngebotController_searchOffers5_invoker.call(AngebotController_6.searchOffers(plz))
      }
  
    // @LINE:12
    case controllers_BestellungController_addBestellung6_route(params) =>
      call { 
        controllers_BestellungController_addBestellung6_invoker.call(BestellungController_0.addBestellung())
      }
  
    // @LINE:15
    case controllers_BestellungController_getBestellung7_route(params) =>
      call { 
        controllers_BestellungController_getBestellung7_invoker.call(BestellungController_0.getBestellung())
      }
  
    // @LINE:17
    case controllers_Profile_getOrders8_route(params) =>
      call { 
        controllers_Profile_getOrders8_invoker.call(Profile_3.getOrders())
      }
  
    // @LINE:18
    case controllers_Profile_getRequests9_route(params) =>
      call { 
        controllers_Profile_getRequests9_invoker.call(Profile_3.getRequests())
      }
  
    // @LINE:19
    case controllers_Profile_denyRequest10_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_Profile_denyRequest10_invoker.call(Profile_3.denyRequest(id))
      }
  
    // @LINE:20
    case controllers_Profile_acceptRequest11_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_Profile_acceptRequest11_invoker.call(Profile_3.acceptRequest(id))
      }
  
    // @LINE:21
    case controllers_Profile_getOffers12_route(params) =>
      call { 
        controllers_Profile_getOffers12_invoker.call(Profile_3.getOffers())
      }
  
    // @LINE:24
    case controllers_AngebotController_getUserRating13_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_AngebotController_getUserRating13_invoker.call(AngebotController_6.getUserRating(id))
      }
  
    // @LINE:27
    case controllers_Profile_rateOrder14_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_Profile_rateOrder14_invoker.call(Profile_3.rateOrder(id))
      }
  
    // @LINE:31
    case controllers_Profile_index15_route(params) =>
      call { 
        controllers_Profile_index15_invoker.call(Profile_3.index())
      }
  
    // @LINE:33
    case controllers_Application_login16_route(params) =>
      call { 
        controllers_Application_login16_invoker.call(Application_5.login())
      }
  
    // @LINE:34
    case controllers_Authentication_authenticate17_route(params) =>
      call { 
        controllers_Authentication_authenticate17_invoker.call(Authentication_2.authenticate())
      }
  
    // @LINE:35
    case controllers_Authentication_logout18_route(params) =>
      call { 
        controllers_Authentication_logout18_invoker.call(Authentication_2.logout())
      }
  
    // @LINE:39
    case controllers_Signup_create19_route(params) =>
      call { 
        controllers_Signup_create19_invoker.call(Signup_1.create())
      }
  
    // @LINE:40
    case controllers_Signup_save20_route(params) =>
      call { 
        controllers_Signup_save20_invoker.call(Signup_1.save())
      }
  
    // @LINE:43
    case controllers_Signup_confirm21_route(params) =>
      call(params.fromPath[String]("confirmToken", None)) { (confirmToken) =>
        controllers_Signup_confirm21_invoker.call(Signup_1.confirm(confirmToken))
      }
  
    // @LINE:47
    case controllers_Assets_at22_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at22_invoker.call(Assets_4.at(path, file))
      }
  }
}

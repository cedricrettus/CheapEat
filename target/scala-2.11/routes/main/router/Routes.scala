
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/dev/git/CheapEat/conf/routes
// @DATE:Sun Nov 26 17:52:32 CET 2017

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
  // @LINE:20
  Profile_2: controllers.Profile,
  // @LINE:31
  Authentication_1: controllers.Authentication,
  // @LINE:41
  Signup_4: controllers.account.Signup,
  // @LINE:61
  Assets_3: controllers.Assets,
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
    // @LINE:20
    Profile_2: controllers.Profile,
    // @LINE:31
    Authentication_1: controllers.Authentication,
    // @LINE:41
    Signup_4: controllers.account.Signup,
    // @LINE:61
    Assets_3: controllers.Assets
  ) = this(errorHandler, Application_5, AngebotController_6, BestellungController_0, Profile_2, Authentication_1, Signup_4, Assets_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_5, AngebotController_6, BestellungController_0, Profile_2, Authentication_1, Signup_4, Assets_3, prefix)
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """test""", """controllers.Application.test()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """upload""", """controllers.Application.imageUpload()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """me/bestellungen""", """controllers.Profile.getOrders()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """me/anfragen""", """controllers.Profile.getRequests()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """me/angebote""", """controllers.Profile.getOffers()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.Profile.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Application.login()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Authentication.authenticate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.Authentication.logout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.account.Signup.create()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.account.Signup.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """confirm/""" + "$" + """confirmToken<[^/]+>""", """controllers.account.Signup.confirm(confirmToken:String)"""),
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

  // @LINE:14
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
      """ TODO prüfen wird nicht benötigt glaube ich""",
      this.prefix + """bestellung"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Application_test8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("test")))
  )
  private[this] lazy val controllers_Application_test8_invoker = createInvoker(
    Application_5.test(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "test",
      Nil,
      "GET",
      """""",
      this.prefix + """test"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Application_imageUpload9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("upload")))
  )
  private[this] lazy val controllers_Application_imageUpload9_invoker = createInvoker(
    Application_5.imageUpload(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "imageUpload",
      Nil,
      "GET",
      """""",
      this.prefix + """upload"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Profile_getOrders10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("me/bestellungen")))
  )
  private[this] lazy val controllers_Profile_getOrders10_invoker = createInvoker(
    Profile_2.getOrders(),
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

  // @LINE:21
  private[this] lazy val controllers_Profile_getRequests11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("me/anfragen")))
  )
  private[this] lazy val controllers_Profile_getRequests11_invoker = createInvoker(
    Profile_2.getRequests(),
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

  // @LINE:22
  private[this] lazy val controllers_Profile_getOffers12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("me/angebote")))
  )
  private[this] lazy val controllers_Profile_getOffers12_invoker = createInvoker(
    Profile_2.getOffers(),
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

  // @LINE:28
  private[this] lazy val controllers_Profile_index13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_Profile_index13_invoker = createInvoker(
    Profile_2.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Profile",
      "index",
      Nil,
      "GET",
      """ Home page
GET     /                           controllers.Application.index()""",
      this.prefix + """profile"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Application_login14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_login14_invoker = createInvoker(
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

  // @LINE:31
  private[this] lazy val controllers_Authentication_authenticate15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Authentication_authenticate15_invoker = createInvoker(
    Authentication_1.authenticate(),
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

  // @LINE:32
  private[this] lazy val controllers_Authentication_logout16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Authentication_logout16_invoker = createInvoker(
    Authentication_1.logout(),
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

  // @LINE:41
  private[this] lazy val controllers_account_Signup_create17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_account_Signup_create17_invoker = createInvoker(
    Signup_4.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Signup",
      "create",
      Nil,
      "GET",
      """
GET     /settings                   controllers.account.settings.Index.index()
GET     /settings/password          controllers.account.settings.Password.index()
POST    /settings/password          controllers.account.settings.Password.runPassword()
GET     /settings/email             controllers.account.settings.Email.index()
POST    /settings/email             controllers.account.settings.Email.runEmail()

# Registers the user, sending an email to confirm the account.""",
      this.prefix + """signup"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_account_Signup_save18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_account_Signup_save18_invoker = createInvoker(
    Signup_4.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Signup",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_account_Signup_confirm19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("confirm/"), DynamicPart("confirmToken", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_Signup_confirm19_invoker = createInvoker(
    Signup_4.confirm(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Signup",
      "confirm",
      Seq(classOf[String]),
      "GET",
      """
# Wenn der Benutzer das Bestätigungsm""",
      this.prefix + """confirm/""" + "$" + """confirmToken<[^/]+>"""
    )
  )

  // @LINE:61
  private[this] lazy val controllers_Assets_at20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at20_invoker = createInvoker(
    Assets_3.at(fakeValue[String], fakeValue[String]),
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
  
    // @LINE:14
    case controllers_BestellungController_getBestellung7_route(params) =>
      call { 
        controllers_BestellungController_getBestellung7_invoker.call(BestellungController_0.getBestellung())
      }
  
    // @LINE:16
    case controllers_Application_test8_route(params) =>
      call { 
        controllers_Application_test8_invoker.call(Application_5.test())
      }
  
    // @LINE:18
    case controllers_Application_imageUpload9_route(params) =>
      call { 
        controllers_Application_imageUpload9_invoker.call(Application_5.imageUpload())
      }
  
    // @LINE:20
    case controllers_Profile_getOrders10_route(params) =>
      call { 
        controllers_Profile_getOrders10_invoker.call(Profile_2.getOrders())
      }
  
    // @LINE:21
    case controllers_Profile_getRequests11_route(params) =>
      call { 
        controllers_Profile_getRequests11_invoker.call(Profile_2.getRequests())
      }
  
    // @LINE:22
    case controllers_Profile_getOffers12_route(params) =>
      call { 
        controllers_Profile_getOffers12_invoker.call(Profile_2.getOffers())
      }
  
    // @LINE:28
    case controllers_Profile_index13_route(params) =>
      call { 
        controllers_Profile_index13_invoker.call(Profile_2.index())
      }
  
    // @LINE:30
    case controllers_Application_login14_route(params) =>
      call { 
        controllers_Application_login14_invoker.call(Application_5.login())
      }
  
    // @LINE:31
    case controllers_Authentication_authenticate15_route(params) =>
      call { 
        controllers_Authentication_authenticate15_invoker.call(Authentication_1.authenticate())
      }
  
    // @LINE:32
    case controllers_Authentication_logout16_route(params) =>
      call { 
        controllers_Authentication_logout16_invoker.call(Authentication_1.logout())
      }
  
    // @LINE:41
    case controllers_account_Signup_create17_route(params) =>
      call { 
        controllers_account_Signup_create17_invoker.call(Signup_4.create())
      }
  
    // @LINE:42
    case controllers_account_Signup_save18_route(params) =>
      call { 
        controllers_account_Signup_save18_invoker.call(Signup_4.save())
      }
  
    // @LINE:45
    case controllers_account_Signup_confirm19_route(params) =>
      call(params.fromPath[String]("confirmToken", None)) { (confirmToken) =>
        controllers_account_Signup_confirm19_invoker.call(Signup_4.confirm(confirmToken))
      }
  
    // @LINE:61
    case controllers_Assets_at20_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at20_invoker.call(Assets_3.at(path, file))
      }
  }
}

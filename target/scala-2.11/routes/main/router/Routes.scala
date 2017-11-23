
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/dev/git/CheapEat/conf/routes
// @DATE:Thu Nov 23 11:28:14 CET 2017

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
  // @LINE:23
  Profile_2: controllers.Profile,
  // @LINE:25
  Authentication_1: controllers.Authentication,
  // @LINE:35
  Signup_4: controllers.account.Signup,
  // @LINE:55
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
    // @LINE:23
    Profile_2: controllers.Profile,
    // @LINE:25
    Authentication_1: controllers.Authentication,
    // @LINE:35
    Signup_4: controllers.account.Signup,
    // @LINE:55
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
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """angebote""", """controllers.AngebotController.addAngebot()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """angebote/all""", """controllers.AngebotController.getAngeboteList()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """angebote/""" + "$" + """id<[^/]+>""", """controllers.AngebotController.getAngebote(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search""", """controllers.AngebotController.sucheAngebot(plz:Int ?= 0)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bestellung""", """controllers.BestellungController.addBestellung()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bestellung""", """controllers.BestellungController.getBestellung()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """test""", """controllers.Application.test()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """upload""", """controllers.Application.imageUpload()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.Profile.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Authentication.authenticate()"""),
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
  private[this] lazy val controllers_AngebotController_addAngebot1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("angebote")))
  )
  private[this] lazy val controllers_AngebotController_addAngebot1_invoker = createInvoker(
    AngebotController_6.addAngebot(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AngebotController",
      "addAngebot",
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

  // @LINE:11
  private[this] lazy val controllers_AngebotController_sucheAngebot4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_AngebotController_sucheAngebot4_invoker = createInvoker(
    AngebotController_6.sucheAngebot(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AngebotController",
      "sucheAngebot",
      Seq(classOf[Int]),
      "GET",
      """GET     /suche                       controllers.AngebotControllerroller.suchePlz(plz:Int ?= 0)""",
      this.prefix + """search"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_BestellungController_addBestellung5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bestellung")))
  )
  private[this] lazy val controllers_BestellungController_addBestellung5_invoker = createInvoker(
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

  // @LINE:13
  private[this] lazy val controllers_BestellungController_getBestellung6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("bestellung")))
  )
  private[this] lazy val controllers_BestellungController_getBestellung6_invoker = createInvoker(
    BestellungController_0.getBestellung(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BestellungController",
      "getBestellung",
      Nil,
      "GET",
      """""",
      this.prefix + """bestellung"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Application_test7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("test")))
  )
  private[this] lazy val controllers_Application_test7_invoker = createInvoker(
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

  // @LINE:17
  private[this] lazy val controllers_Application_imageUpload8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("upload")))
  )
  private[this] lazy val controllers_Application_imageUpload8_invoker = createInvoker(
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

  // @LINE:23
  private[this] lazy val controllers_Profile_index9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_Profile_index9_invoker = createInvoker(
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

  // @LINE:25
  private[this] lazy val controllers_Authentication_authenticate10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Authentication_authenticate10_invoker = createInvoker(
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

  // @LINE:35
  private[this] lazy val controllers_account_Signup_create11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_account_Signup_create11_invoker = createInvoker(
    Signup_4.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Signup",
      "create",
      Nil,
      "GET",
      """GET     /logout                     controllers.Application.logout()

GET     /settings                   controllers.account.settings.Index.index()
GET     /settings/password          controllers.account.settings.Password.index()
POST    /settings/password          controllers.account.settings.Password.runPassword()
GET     /settings/email             controllers.account.settings.Email.index()
POST    /settings/email             controllers.account.settings.Email.runEmail()

# Registers the user, sending an email to confirm the account.""",
      this.prefix + """signup"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_account_Signup_save12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_account_Signup_save12_invoker = createInvoker(
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

  // @LINE:39
  private[this] lazy val controllers_account_Signup_confirm13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("confirm/"), DynamicPart("confirmToken", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_Signup_confirm13_invoker = createInvoker(
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

  // @LINE:55
  private[this] lazy val controllers_Assets_at14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at14_invoker = createInvoker(
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
    case controllers_AngebotController_addAngebot1_route(params) =>
      call { 
        controllers_AngebotController_addAngebot1_invoker.call(AngebotController_6.addAngebot())
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
  
    // @LINE:11
    case controllers_AngebotController_sucheAngebot4_route(params) =>
      call(params.fromQuery[Int]("plz", Some(0))) { (plz) =>
        controllers_AngebotController_sucheAngebot4_invoker.call(AngebotController_6.sucheAngebot(plz))
      }
  
    // @LINE:12
    case controllers_BestellungController_addBestellung5_route(params) =>
      call { 
        controllers_BestellungController_addBestellung5_invoker.call(BestellungController_0.addBestellung())
      }
  
    // @LINE:13
    case controllers_BestellungController_getBestellung6_route(params) =>
      call { 
        controllers_BestellungController_getBestellung6_invoker.call(BestellungController_0.getBestellung())
      }
  
    // @LINE:15
    case controllers_Application_test7_route(params) =>
      call { 
        controllers_Application_test7_invoker.call(Application_5.test())
      }
  
    // @LINE:17
    case controllers_Application_imageUpload8_route(params) =>
      call { 
        controllers_Application_imageUpload8_invoker.call(Application_5.imageUpload())
      }
  
    // @LINE:23
    case controllers_Profile_index9_route(params) =>
      call { 
        controllers_Profile_index9_invoker.call(Profile_2.index())
      }
  
    // @LINE:25
    case controllers_Authentication_authenticate10_route(params) =>
      call { 
        controllers_Authentication_authenticate10_invoker.call(Authentication_1.authenticate())
      }
  
    // @LINE:35
    case controllers_account_Signup_create11_route(params) =>
      call { 
        controllers_account_Signup_create11_invoker.call(Signup_4.create())
      }
  
    // @LINE:36
    case controllers_account_Signup_save12_route(params) =>
      call { 
        controllers_account_Signup_save12_invoker.call(Signup_4.save())
      }
  
    // @LINE:39
    case controllers_account_Signup_confirm13_route(params) =>
      call(params.fromPath[String]("confirmToken", None)) { (confirmToken) =>
        controllers_account_Signup_confirm13_invoker.call(Signup_4.confirm(confirmToken))
      }
  
    // @LINE:55
    case controllers_Assets_at14_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at14_invoker.call(Assets_3.at(path, file))
      }
  }
}

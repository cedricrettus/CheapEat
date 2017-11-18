
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/dev/git/CheapEat/conf/routes
// @DATE:Sat Nov 18 09:17:03 CET 2017

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
  AngebotController_3: controllers.AngebotController,
  // @LINE:12
  BestellungController_0: controllers.BestellungController,
  // @LINE:17
  Application_2: controllers.Application,
  // @LINE:20
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    AngebotController_3: controllers.AngebotController,
    // @LINE:12
    BestellungController_0: controllers.BestellungController,
    // @LINE:17
    Application_2: controllers.Application,
    // @LINE:20
    Assets_1: controllers.Assets
  ) = this(errorHandler, AngebotController_3, BestellungController_0, Application_2, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, AngebotController_3, BestellungController_0, Application_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.AngebotController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """angebote""", """controllers.AngebotController.addAngebot()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """angebote/all""", """controllers.AngebotController.getAngeboteList()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """angebote/""" + "$" + """id<[^/]+>""", """controllers.AngebotController.getAngebote(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search""", """controllers.AngebotController.sucheAngebot(plz:Int ?= 0)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bestellung""", """controllers.BestellungController.addBestellung()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """bestellung""", """controllers.BestellungController.getBestellung()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """test""", """controllers.BestellungController.test()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """upload""", """controllers.Application.imageUpload()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_AngebotController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_AngebotController_index0_invoker = createInvoker(
    AngebotController_3.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AngebotController",
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
    AngebotController_3.addAngebot(),
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
    AngebotController_3.getAngeboteList(),
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
    AngebotController_3.getAngebote(fakeValue[Int]),
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
    AngebotController_3.sucheAngebot(fakeValue[Int]),
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
  private[this] lazy val controllers_BestellungController_test7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("test")))
  )
  private[this] lazy val controllers_BestellungController_test7_invoker = createInvoker(
    BestellungController_0.test(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BestellungController",
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
    Application_2.imageUpload(),
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
  private[this] lazy val controllers_Assets_at9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at9_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
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
    case controllers_AngebotController_index0_route(params) =>
      call { 
        controllers_AngebotController_index0_invoker.call(AngebotController_3.index())
      }
  
    // @LINE:7
    case controllers_AngebotController_addAngebot1_route(params) =>
      call { 
        controllers_AngebotController_addAngebot1_invoker.call(AngebotController_3.addAngebot())
      }
  
    // @LINE:8
    case controllers_AngebotController_getAngeboteList2_route(params) =>
      call { 
        controllers_AngebotController_getAngeboteList2_invoker.call(AngebotController_3.getAngeboteList())
      }
  
    // @LINE:9
    case controllers_AngebotController_getAngebote3_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_AngebotController_getAngebote3_invoker.call(AngebotController_3.getAngebote(id))
      }
  
    // @LINE:11
    case controllers_AngebotController_sucheAngebot4_route(params) =>
      call(params.fromQuery[Int]("plz", Some(0))) { (plz) =>
        controllers_AngebotController_sucheAngebot4_invoker.call(AngebotController_3.sucheAngebot(plz))
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
    case controllers_BestellungController_test7_route(params) =>
      call { 
        controllers_BestellungController_test7_invoker.call(BestellungController_0.test())
      }
  
    // @LINE:17
    case controllers_Application_imageUpload8_route(params) =>
      call { 
        controllers_Application_imageUpload8_invoker.call(Application_2.imageUpload())
      }
  
    // @LINE:20
    case controllers_Assets_at9_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at9_invoker.call(Assets_1.at(path, file))
      }
  }
}

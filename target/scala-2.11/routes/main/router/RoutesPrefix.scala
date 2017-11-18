
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/dev/git/CheapEat/conf/routes
// @DATE:Sat Nov 18 09:17:03 CET 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}

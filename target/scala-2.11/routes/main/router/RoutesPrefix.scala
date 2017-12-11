
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/dev/git/CheapEat/conf/routes
// @DATE:Mon Dec 11 16:45:18 CET 2017


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

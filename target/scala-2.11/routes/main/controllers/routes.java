
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/dev/git/CheapEat/conf/routes
// @DATE:Fri Dec 01 11:51:24 CET 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAuthentication Authentication = new controllers.ReverseAuthentication(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseProfile Profile = new controllers.ReverseProfile(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseBestellungController BestellungController = new controllers.ReverseBestellungController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAngebotController AngebotController = new controllers.ReverseAngebotController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAuthentication Authentication = new controllers.javascript.ReverseAuthentication(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseProfile Profile = new controllers.javascript.ReverseProfile(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseBestellungController BestellungController = new controllers.javascript.ReverseBestellungController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAngebotController AngebotController = new controllers.javascript.ReverseAngebotController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
  }

}

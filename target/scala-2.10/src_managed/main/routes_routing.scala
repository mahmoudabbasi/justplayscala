// @SOURCE:D:/project/Lesson1/justplayscala/conf/routes
// @HASH:c861d092282712d9e90a2aec1c0ccf86f3bd9258
// @DATE:Sun Oct 09 13:31:13 IRST 2016


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:9
private[this] lazy val controllers_Authentication_login1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Authentication_login1_invoker = createInvoker(
controllers.Authentication.login,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "login", Nil,"GET", """ Authentication""", Routes.prefix + """login"""))
        

// @LINE:10
private[this] lazy val controllers_Authentication_authenticate2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Authentication_authenticate2_invoker = createInvoker(
controllers.Authentication.authenticate,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
        

// @LINE:11
private[this] lazy val controllers_Authentication_logout3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
private[this] lazy val controllers_Authentication_logout3_invoker = createInvoker(
controllers.Authentication.logout,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
        

// @LINE:14
private[this] lazy val controllers_Restricted_index4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("restricted"))))
private[this] lazy val controllers_Restricted_index4_invoker = createInvoker(
controllers.Restricted.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Restricted", "index", Nil,"GET", """ Restricted content""", Routes.prefix + """restricted"""))
        

// @LINE:17
private[this] lazy val controllers_Assets_versioned5_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_versioned5_invoker = createInvoker(
controllers.Assets.versioned(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "versioned", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Authentication.login"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Authentication.authenticate"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Authentication.logout"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """restricted""","""controllers.Restricted.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.versioned(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index)
   }
}
        

// @LINE:9
case controllers_Authentication_login1_route(params) => {
   call { 
        controllers_Authentication_login1_invoker.call(controllers.Authentication.login)
   }
}
        

// @LINE:10
case controllers_Authentication_authenticate2_route(params) => {
   call { 
        controllers_Authentication_authenticate2_invoker.call(controllers.Authentication.authenticate)
   }
}
        

// @LINE:11
case controllers_Authentication_logout3_route(params) => {
   call { 
        controllers_Authentication_logout3_invoker.call(controllers.Authentication.logout)
   }
}
        

// @LINE:14
case controllers_Restricted_index4_route(params) => {
   call { 
        controllers_Restricted_index4_invoker.call(controllers.Restricted.index)
   }
}
        

// @LINE:17
case controllers_Assets_versioned5_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_versioned5_invoker.call(controllers.Assets.versioned(path, file))
   }
}
        
}

}
     
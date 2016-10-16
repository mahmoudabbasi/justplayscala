// @SOURCE:D:/project/Lesson1/justplayscala/conf/routes
// @HASH:f75f4714a5cd4fc714e00f2b6228ecd1eb8fcfcb
// @DATE:Sun Oct 16 11:50:25 IRST 2016


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
        

// @LINE:10
private[this] lazy val controllers_Restricted_index11_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("restricted"))))
private[this] lazy val controllers_Restricted_index11_invoker = createInvoker(
controllers.Restricted.index1,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Restricted", "index1", Nil,"GET", """ Restricted content""", Routes.prefix + """restricted"""))
        

// @LINE:11
private[this] lazy val controllers_Restricted_save2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employees/save"))))
private[this] lazy val controllers_Restricted_save2_invoker = createInvoker(
controllers.Restricted.save,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Restricted", "save", Nil,"POST", """""", Routes.prefix + """employees/save"""))
        

// @LINE:12
private[this] lazy val controllers_Restricted_list3_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employees"))))
private[this] lazy val controllers_Restricted_list3_invoker = createInvoker(
controllers.Restricted.list(fakeValue[Int], fakeValue[Int], fakeValue[String], fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Restricted", "list", Seq(classOf[Int], classOf[Int], classOf[String], classOf[String], classOf[String]),"GET", """""", Routes.prefix + """employees"""))
        

// @LINE:13
private[this] lazy val controllers_Restricted_create4_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employees/new"))))
private[this] lazy val controllers_Restricted_create4_invoker = createInvoker(
controllers.Restricted.create,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Restricted", "create", Nil,"GET", """""", Routes.prefix + """employees/new"""))
        

// @LINE:14
private[this] lazy val controllers_Restricted_save5_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employees/save"))))
private[this] lazy val controllers_Restricted_save5_invoker = createInvoker(
controllers.Restricted.save,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Restricted", "save", Nil,"POST", """""", Routes.prefix + """employees/save"""))
        

// @LINE:15
private[this] lazy val controllers_Restricted_edit6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employees/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Restricted_edit6_invoker = createInvoker(
controllers.Restricted.edit(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Restricted", "edit", Seq(classOf[Long]),"GET", """""", Routes.prefix + """employees/$id<[^/]+>"""))
        

// @LINE:16
private[this] lazy val controllers_Restricted_update7_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employees/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Restricted_update7_invoker = createInvoker(
controllers.Restricted.update(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Restricted", "update", Seq(classOf[Long]),"POST", """""", Routes.prefix + """employees/$id<[^/]+>"""))
        

// @LINE:17
private[this] lazy val controllers_Restricted_delete8_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("employees/"),DynamicPart("id", """[^/]+""",true),StaticPart("/delete"))))
private[this] lazy val controllers_Restricted_delete8_invoker = createInvoker(
controllers.Restricted.delete(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Restricted", "delete", Seq(classOf[Long]),"POST", """""", Routes.prefix + """employees/$id<[^/]+>/delete"""))
        

// @LINE:21
private[this] lazy val controllers_Authentication_login9_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Authentication_login9_invoker = createInvoker(
controllers.Authentication.login,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "login", Nil,"GET", """ Authentication""", Routes.prefix + """login"""))
        

// @LINE:22
private[this] lazy val controllers_Authentication_authenticate10_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
private[this] lazy val controllers_Authentication_authenticate10_invoker = createInvoker(
controllers.Authentication.authenticate,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
        

// @LINE:23
private[this] lazy val controllers_Authentication_logout11_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
private[this] lazy val controllers_Authentication_logout11_invoker = createInvoker(
controllers.Authentication.logout,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
        

// @LINE:24
private[this] lazy val controllers_Authentication_create12_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("create"))))
private[this] lazy val controllers_Authentication_create12_invoker = createInvoker(
controllers.Authentication.create,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "create", Nil,"GET", """""", Routes.prefix + """create"""))
        

// @LINE:25
private[this] lazy val controllers_Authentication_authenticate113_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("createuser"))))
private[this] lazy val controllers_Authentication_authenticate113_invoker = createInvoker(
controllers.Authentication.authenticate1,
HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "authenticate1", Nil,"POST", """""", Routes.prefix + """createuser"""))
        

// @LINE:26
private[this] lazy val controllers_successed_index14_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("success"))))
private[this] lazy val controllers_successed_index14_invoker = createInvoker(
controllers.successed.index,
HandlerDef(this.getClass.getClassLoader, "", "controllers.successed", "index", Nil,"GET", """""", Routes.prefix + """success"""))
        

// @LINE:33
private[this] lazy val controllers_Assets_versioned15_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_versioned15_invoker = createInvoker(
controllers.Assets.versioned(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "versioned", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """restricted""","""controllers.Restricted.index1"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employees/save""","""controllers.Restricted.save"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employees""","""controllers.Restricted.list(p:Int ?= 0, s:Int ?= 2, f:String ?= "" , u:String ?= "" , e:String ?= "" )"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employees/new""","""controllers.Restricted.create"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employees/save""","""controllers.Restricted.save"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employees/$id<[^/]+>""","""controllers.Restricted.edit(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employees/$id<[^/]+>""","""controllers.Restricted.update(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """employees/$id<[^/]+>/delete""","""controllers.Restricted.delete(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Authentication.login"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Authentication.authenticate"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Authentication.logout"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """create""","""controllers.Authentication.create"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """createuser""","""controllers.Authentication.authenticate1"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """success""","""controllers.successed.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.versioned(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
        

// @LINE:10
case controllers_Restricted_index11_route(params) => {
   call { 
        controllers_Restricted_index11_invoker.call(controllers.Restricted.index1)
   }
}
        

// @LINE:11
case controllers_Restricted_save2_route(params) => {
   call { 
        controllers_Restricted_save2_invoker.call(controllers.Restricted.save)
   }
}
        

// @LINE:12
case controllers_Restricted_list3_route(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[Int]("s", Some(2)), params.fromQuery[String]("f", Some("" )), params.fromQuery[String]("u", Some("" )), params.fromQuery[String]("e", Some("" ))) { (p, s, f, u, e) =>
        controllers_Restricted_list3_invoker.call(controllers.Restricted.list(p, s, f, u, e))
   }
}
        

// @LINE:13
case controllers_Restricted_create4_route(params) => {
   call { 
        controllers_Restricted_create4_invoker.call(controllers.Restricted.create)
   }
}
        

// @LINE:14
case controllers_Restricted_save5_route(params) => {
   call { 
        controllers_Restricted_save5_invoker.call(controllers.Restricted.save)
   }
}
        

// @LINE:15
case controllers_Restricted_edit6_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Restricted_edit6_invoker.call(controllers.Restricted.edit(id))
   }
}
        

// @LINE:16
case controllers_Restricted_update7_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Restricted_update7_invoker.call(controllers.Restricted.update(id))
   }
}
        

// @LINE:17
case controllers_Restricted_delete8_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Restricted_delete8_invoker.call(controllers.Restricted.delete(id))
   }
}
        

// @LINE:21
case controllers_Authentication_login9_route(params) => {
   call { 
        controllers_Authentication_login9_invoker.call(controllers.Authentication.login)
   }
}
        

// @LINE:22
case controllers_Authentication_authenticate10_route(params) => {
   call { 
        controllers_Authentication_authenticate10_invoker.call(controllers.Authentication.authenticate)
   }
}
        

// @LINE:23
case controllers_Authentication_logout11_route(params) => {
   call { 
        controllers_Authentication_logout11_invoker.call(controllers.Authentication.logout)
   }
}
        

// @LINE:24
case controllers_Authentication_create12_route(params) => {
   call { 
        controllers_Authentication_create12_invoker.call(controllers.Authentication.create)
   }
}
        

// @LINE:25
case controllers_Authentication_authenticate113_route(params) => {
   call { 
        controllers_Authentication_authenticate113_invoker.call(controllers.Authentication.authenticate1)
   }
}
        

// @LINE:26
case controllers_successed_index14_route(params) => {
   call { 
        controllers_successed_index14_invoker.call(controllers.successed.index)
   }
}
        

// @LINE:33
case controllers_Assets_versioned15_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_versioned15_invoker.call(controllers.Assets.versioned(path, file))
   }
}
        
}

}
     
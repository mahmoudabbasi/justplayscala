// @SOURCE:D:/project/Lesson1/justplayscala/conf/routes
// @HASH:f75f4714a5cd4fc714e00f2b6228ecd1eb8fcfcb
// @DATE:Sun Oct 16 11:50:25 IRST 2016

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset

import Router.queryString


// @LINE:33
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:6
package controllers {

// @LINE:33
class ReverseAssets {


// @LINE:33
def versioned(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
class ReverseAuthentication {


// @LINE:24
def create(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "create")
}
                        

// @LINE:23
def logout(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                        

// @LINE:25
def authenticate1(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "createuser")
}
                        

// @LINE:22
def authenticate(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                        

// @LINE:21
def login(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                        

}
                          

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
class ReverseRestricted {


// @LINE:17
def delete(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "employees/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                        

// @LINE:12
def list(p:Int = 0, s:Int = 2, f:String = "" , u:String = "" , e:String = "" ): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "employees" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == 2) None else Some(implicitly[QueryStringBindable[Int]].unbind("s", s)), if(f == "" ) None else Some(implicitly[QueryStringBindable[String]].unbind("f", f)), if(u == "" ) None else Some(implicitly[QueryStringBindable[String]].unbind("u", u)), if(e == "" ) None else Some(implicitly[QueryStringBindable[String]].unbind("e", e)))))
}
                        

// @LINE:13
def create(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "employees/new")
}
                        

// @LINE:15
def edit(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "employees/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:16
def update(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "employees/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:14
// @LINE:11
def save(): Call = {
   () match {
// @LINE:11
case ()  =>
  import ReverseRouteContext.empty
  Call("POST", _prefix + { _defaultPrefix } + "employees/save")
                                         
   }
}
                                                

// @LINE:10
def index1(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "restricted")
}
                        

}
                          

// @LINE:6
class ReverseApplication {


// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          

// @LINE:26
class Reversesuccessed {


// @LINE:26
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "success")
}
                        

}
                          
}
                  


// @LINE:33
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:33
class ReverseAssets {


// @LINE:33
def versioned : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.versioned",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
class ReverseAuthentication {


// @LINE:24
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Authentication.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "create"})
      }
   """
)
                        

// @LINE:23
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Authentication.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:25
def authenticate1 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Authentication.authenticate1",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createuser"})
      }
   """
)
                        

// @LINE:22
def authenticate : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Authentication.authenticate",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

// @LINE:21
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Authentication.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        

}
              

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
class ReverseRestricted {


// @LINE:17
def delete : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Restricted.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employees/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:12
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Restricted.list",
   """
      function(p,s,f,u,e) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employees" + _qS([(p == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == null ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("s", s)), (f == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("f", f)), (u == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("u", u)), (e == null ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("e", e))])})
      }
   """
)
                        

// @LINE:13
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Restricted.create",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employees/new"})
      }
   """
)
                        

// @LINE:15
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Restricted.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "employees/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:16
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Restricted.update",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employees/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:14
// @LINE:11
def save : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Restricted.save",
   """
      function() {
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employees/save"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "employees/save"})
      }
      }
   """
)
                        

// @LINE:10
def index1 : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Restricted.index1",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "restricted"})
      }
   """
)
                        

}
              

// @LINE:6
class ReverseApplication {


// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              

// @LINE:26
class Reversesuccessed {


// @LINE:26
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.successed.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "success"})
      }
   """
)
                        

}
              
}
        


// @LINE:33
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:6
package controllers.ref {


// @LINE:33
class ReverseAssets {


// @LINE:33
def versioned(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.versioned(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "versioned", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:21
class ReverseAuthentication {


// @LINE:24
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Authentication.create(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "create", Seq(), "GET", """""", _prefix + """create""")
)
                      

// @LINE:23
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Authentication.logout(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:25
def authenticate1(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Authentication.authenticate1(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "authenticate1", Seq(), "POST", """""", _prefix + """createuser""")
)
                      

// @LINE:22
def authenticate(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Authentication.authenticate(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "authenticate", Seq(), "POST", """""", _prefix + """login""")
)
                      

// @LINE:21
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Authentication.login(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Authentication", "login", Seq(), "GET", """ Authentication""", _prefix + """login""")
)
                      

}
                          

// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
class ReverseRestricted {


// @LINE:17
def delete(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Restricted.delete(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Restricted", "delete", Seq(classOf[Long]), "POST", """""", _prefix + """employees/$id<[^/]+>/delete""")
)
                      

// @LINE:12
def list(p:Int, s:Int, f:String, u:String, e:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Restricted.list(p, s, f, u, e), HandlerDef(this.getClass.getClassLoader, "", "controllers.Restricted", "list", Seq(classOf[Int], classOf[Int], classOf[String], classOf[String], classOf[String]), "GET", """""", _prefix + """employees""")
)
                      

// @LINE:13
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Restricted.create(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Restricted", "create", Seq(), "GET", """""", _prefix + """employees/new""")
)
                      

// @LINE:15
def edit(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Restricted.edit(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Restricted", "edit", Seq(classOf[Long]), "GET", """""", _prefix + """employees/$id<[^/]+>""")
)
                      

// @LINE:16
def update(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Restricted.update(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Restricted", "update", Seq(classOf[Long]), "POST", """""", _prefix + """employees/$id<[^/]+>""")
)
                      

// @LINE:11
def save(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Restricted.save(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Restricted", "save", Seq(), "POST", """""", _prefix + """employees/save""")
)
                      

// @LINE:10
def index1(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Restricted.index1(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Restricted", "index1", Seq(), "GET", """ Restricted content""", _prefix + """restricted""")
)
                      

}
                          

// @LINE:6
class ReverseApplication {


// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          

// @LINE:26
class Reversesuccessed {


// @LINE:26
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.successed.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.successed", "index", Seq(), "GET", """""", _prefix + """success""")
)
                      

}
                          
}
        
    
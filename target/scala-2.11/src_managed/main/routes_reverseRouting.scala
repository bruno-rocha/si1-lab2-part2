// @SOURCE:/home/brunovr/Documentos/SI1/si1-lab2-part2/conf/routes
// @HASH:12b5a87deae045a3545f7e31fed0ec0c3be1e0a6
// @DATE:Fri Feb 13 15:05:45 BRT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:14
class ReverseAssets {


// @LINE:14
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:8
def desacompanhaSerie(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "serie/desacompanha/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:11
def setOpcaoRecomendacao(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "serie/opcao/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:10
def assisteEpisodio(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "episodio/assiste/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:9
def cancelaEpisodio(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "episodio/cancela/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

// @LINE:7
def acompanhaSerie(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "serie/acompanha/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

}
                          
}
                  


// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:14
class ReverseAssets {


// @LINE:14
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:8
def desacompanhaSerie : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.desacompanhaSerie",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "serie/desacompanha/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:11
def setOpcaoRecomendacao : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.setOpcaoRecomendacao",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "serie/opcao/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:10
def assisteEpisodio : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.assisteEpisodio",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "episodio/assiste/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:9
def cancelaEpisodio : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.cancelaEpisodio",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "episodio/cancela/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:7
def acompanhaSerie : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.acompanhaSerie",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "serie/acompanha/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

}
              
}
        


// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:14
class ReverseAssets {


// @LINE:14
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:8
def desacompanhaSerie(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.desacompanhaSerie(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "desacompanhaSerie", Seq(classOf[Long]), "POST", """""", _prefix + """serie/desacompanha/$id<[^/]+>""")
)
                      

// @LINE:11
def setOpcaoRecomendacao(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.setOpcaoRecomendacao(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "setOpcaoRecomendacao", Seq(classOf[Long]), "POST", """""", _prefix + """serie/opcao/$id<[^/]+>""")
)
                      

// @LINE:10
def assisteEpisodio(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.assisteEpisodio(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "assisteEpisodio", Seq(classOf[Long]), "POST", """""", _prefix + """episodio/assiste/$id<[^/]+>""")
)
                      

// @LINE:9
def cancelaEpisodio(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.cancelaEpisodio(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "cancelaEpisodio", Seq(classOf[Long]), "POST", """""", _prefix + """episodio/cancela/$id<[^/]+>""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:7
def acompanhaSerie(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.acompanhaSerie(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "acompanhaSerie", Seq(classOf[Long]), "POST", """""", _prefix + """serie/acompanha/$id<[^/]+>""")
)
                      

}
                          
}
        
    
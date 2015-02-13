// @SOURCE:/home/brunovr/Documentos/SI1/si1-lab2-part2/conf/routes
// @HASH:12b5a87deae045a3545f7e31fed0ec0c3be1e0a6
// @DATE:Fri Feb 13 15:05:45 BRT 2015


import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

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
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_Application_acompanhaSerie1_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serie/acompanha/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Application_acompanhaSerie1_invoker = createInvoker(
controllers.Application.acompanhaSerie(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "acompanhaSerie", Seq(classOf[Long]),"POST", """""", Routes.prefix + """serie/acompanha/$id<[^/]+>"""))
        

// @LINE:8
private[this] lazy val controllers_Application_desacompanhaSerie2_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serie/desacompanha/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Application_desacompanhaSerie2_invoker = createInvoker(
controllers.Application.desacompanhaSerie(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "desacompanhaSerie", Seq(classOf[Long]),"POST", """""", Routes.prefix + """serie/desacompanha/$id<[^/]+>"""))
        

// @LINE:9
private[this] lazy val controllers_Application_cancelaEpisodio3_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("episodio/cancela/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Application_cancelaEpisodio3_invoker = createInvoker(
controllers.Application.cancelaEpisodio(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "cancelaEpisodio", Seq(classOf[Long]),"POST", """""", Routes.prefix + """episodio/cancela/$id<[^/]+>"""))
        

// @LINE:10
private[this] lazy val controllers_Application_assisteEpisodio4_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("episodio/assiste/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Application_assisteEpisodio4_invoker = createInvoker(
controllers.Application.assisteEpisodio(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "assisteEpisodio", Seq(classOf[Long]),"POST", """""", Routes.prefix + """episodio/assiste/$id<[^/]+>"""))
        

// @LINE:11
private[this] lazy val controllers_Application_setOpcaoRecomendacao5_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("serie/opcao/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Application_setOpcaoRecomendacao5_invoker = createInvoker(
controllers.Application.setOpcaoRecomendacao(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "setOpcaoRecomendacao", Seq(classOf[Long]),"POST", """""", Routes.prefix + """serie/opcao/$id<[^/]+>"""))
        

// @LINE:14
private[this] lazy val controllers_Assets_at6_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at6_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serie/acompanha/$id<[^/]+>""","""controllers.Application.acompanhaSerie(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serie/desacompanha/$id<[^/]+>""","""controllers.Application.desacompanhaSerie(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """episodio/cancela/$id<[^/]+>""","""controllers.Application.cancelaEpisodio(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """episodio/assiste/$id<[^/]+>""","""controllers.Application.assisteEpisodio(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """serie/opcao/$id<[^/]+>""","""controllers.Application.setOpcaoRecomendacao(id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:7
case controllers_Application_acompanhaSerie1_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_acompanhaSerie1_invoker.call(controllers.Application.acompanhaSerie(id))
   }
}
        

// @LINE:8
case controllers_Application_desacompanhaSerie2_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_desacompanhaSerie2_invoker.call(controllers.Application.desacompanhaSerie(id))
   }
}
        

// @LINE:9
case controllers_Application_cancelaEpisodio3_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_cancelaEpisodio3_invoker.call(controllers.Application.cancelaEpisodio(id))
   }
}
        

// @LINE:10
case controllers_Application_assisteEpisodio4_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_assisteEpisodio4_invoker.call(controllers.Application.assisteEpisodio(id))
   }
}
        

// @LINE:11
case controllers_Application_setOpcaoRecomendacao5_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_setOpcaoRecomendacao5_invoker.call(controllers.Application.setOpcaoRecomendacao(id))
   }
}
        

// @LINE:14
case controllers_Assets_at6_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at6_invoker.call(controllers.Assets.at(path, file))
   }
}
        
}

}
     
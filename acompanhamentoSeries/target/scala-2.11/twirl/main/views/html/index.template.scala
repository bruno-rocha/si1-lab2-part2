
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Serie],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(series: List[Serie]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.23*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
<head lang="pt">
	<meta charset="utf-8">
    <title>Onde eu parei?</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*9.50*/routes/*9.56*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*9.99*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*10.50*/routes/*10.56*/.Assets.at("stylesheets/main.css")),format.raw/*10.90*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*11.55*/routes/*11.61*/.Assets.at("images/favicon.png")),format.raw/*11.93*/("""">
    <script src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
    <script src=""""),_display_(/*13.19*/routes/*13.25*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*13.67*/(""""></script>        
    <script src=""""),_display_(/*14.19*/routes/*14.25*/.Assets.at("javascripts/bootstrap.js")),format.raw/*14.63*/(""""></script>        
    <script src=""""),_display_(/*15.19*/routes/*15.25*/.Assets.at("javascripts/hello.js")),format.raw/*15.59*/(""""></script>        
</head>
<body>
	<div id="bg" class="container col-md-12">
		<div id="header" class="page-header">
			<div class="container">
                <div class="navbar-header">
                    <h1>Siga Séries</h1>
                </div>
            </div>
		</div>
		<div class="col-md-6">
		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">Todas as séries</h4>
			</div>
			<div class="panel-body">
				<ul class="list-group">
				"""),_display_(/*33.6*/for(serie <- series) yield /*33.26*/{_display_(Seq[Any](format.raw/*33.27*/("""
					"""),_display_(/*34.7*/if(!serie.isAcompanhada())/*34.33*/{_display_(Seq[Any](format.raw/*34.34*/("""
					"""),format.raw/*35.6*/("""<li class="list-group-item">
						<form class="badge" action=""""),_display_(/*36.36*/routes/*36.42*/.Application.acompanhaSerie(serie.getId())),format.raw/*36.84*/("""" method="post">
							<button type="submit" class="close">&#43;</button>
						</form>
						<span class="badge">"""),_display_(/*39.28*/serie/*39.33*/.getQtdTemporadas()),format.raw/*39.52*/(""" """),format.raw/*39.53*/("""temporadas</span>
						<h5 data-toggle="collapse" data-target="#temporadas"""),_display_(/*40.59*/serie/*40.64*/.getId()),format.raw/*40.72*/("""">"""),_display_(/*40.75*/serie/*40.80*/.getNome()),format.raw/*40.90*/("""</h5>
					</li>
					<div class="collapse" id="temporadas"""),_display_(/*42.43*/serie/*42.48*/.getId()),format.raw/*42.56*/("""">
					"""),_display_(/*43.7*/for(temporada <- serie.getTemporadas()) yield /*43.46*/{_display_(Seq[Any](format.raw/*43.47*/("""
						"""),format.raw/*44.7*/("""<li class="list-group-item" data-toggle="collapse" data-target="#episodios"""),_display_(/*44.82*/temporada/*44.91*/.getId()),format.raw/*44.99*/("""">
							<span class="badge">"""),_display_(/*45.29*/temporada/*45.38*/.getQtdEpisodios()),format.raw/*45.56*/(""" """),format.raw/*45.57*/("""eps</span>
							<strong>Temporada """),_display_(/*46.27*/temporada/*46.36*/.getNumero()),format.raw/*46.48*/("""</strong></li>
						<div class="collapse" id="episodios"""),_display_(/*47.43*/temporada/*47.52*/.getId()),format.raw/*47.60*/("""">
						"""),_display_(/*48.8*/for(ep <- temporada.getEpisodios()) yield /*48.43*/{_display_(Seq[Any](format.raw/*48.44*/("""
							"""),format.raw/*49.8*/("""<li class="list-group-item">"""),_display_(/*49.37*/ep/*49.39*/.getNumero()),format.raw/*49.51*/(""" """),format.raw/*49.52*/("""- """),_display_(/*49.55*/ep/*49.57*/.getNome()),format.raw/*49.67*/("""</li>
						""")))}),format.raw/*50.8*/("""
						"""),format.raw/*51.7*/("""</div>
					""")))}),format.raw/*52.7*/("""
					"""),format.raw/*53.6*/("""</div>
					""")))}),format.raw/*54.7*/("""
				""")))}),format.raw/*55.6*/("""
				"""),format.raw/*56.5*/("""</ul>
			</div>
		</div>
		</div>
		
		<div class="col-md-6">
		<div class="panel panel-default">
			<div class="panel-heading">
				<h4 class="panel-title">Séries que eu acompanho</h4>
			</div>
			<div class="panel-body">
				<ul class="list-group">
				"""),_display_(/*68.6*/for(serie <- series) yield /*68.26*/{_display_(Seq[Any](format.raw/*68.27*/("""
					"""),_display_(/*69.7*/if(serie.isAcompanhada())/*69.32*/{_display_(Seq[Any](format.raw/*69.33*/("""
					"""),format.raw/*70.6*/("""<li class="list-group-item">
						<form class="badge" action=""""),_display_(/*71.36*/routes/*71.42*/.Application.desacompanhaSerie(serie.getId())),format.raw/*71.87*/("""" method="post">
							<button type="submit" class="close">&#8722;</button>
						</form>
						<h5 data-toggle="collapse" data-target="#temporadas"""),_display_(/*74.59*/serie/*74.64*/.getId()),format.raw/*74.72*/("""">"""),_display_(/*74.75*/serie/*74.80*/.getNome()),format.raw/*74.90*/("""</h5>						
					</li>
					<div class="collapse" id="temporadas"""),_display_(/*76.43*/serie/*76.48*/.getId()),format.raw/*76.56*/("""">
						<li class="list-group-item">
							<h4 class="panel-title"><strong>Como pretende que o sistema recomende seus episódios?</strong></h4>
							<br>
							<form action=""""),_display_(/*80.23*/routes/*80.29*/.Application.setOpcaoRecomendacao(serie.getId())),format.raw/*80.77*/("""" method="post">
								<li class="list-group-item">
								<input type="radio" name="opcao" id="opcao1"
								value="1" checked> Opção 1 - Recomende o mais recente que não vi
								</li>
								<li class="list-group-item">
								<input type="radio" name="opcao" id="opcao2"
								value="2"> Opção 2 - Recomende o mais antigo
								</li>
								<li class="list-group-item">
								<input type="radio" name="opcao" id="opcao2"
								value="3"> Opção 3 - Indique o mais antigo, mas não indique nenhum depois do qual eu já tenha visto 3 ou mais episódios
								</li>
								<br>
								<input class="btn btn-default" type="submit" value="Atualizar" />
							</form>
							<br>
							<h5>Atualmente você está usando a <strong>"""),_display_(/*97.51*/serie/*97.56*/.getOpcaoRecomendacao.toString),format.raw/*97.86*/("""</strong></h5>
						</li>
					"""),_display_(/*99.7*/for(temporada <- serie.getTemporadas()) yield /*99.46*/{_display_(Seq[Any](format.raw/*99.47*/("""
						"""),_display_(/*100.8*/if(temporada.getStatus == -1)/*100.37*/{_display_(Seq[Any](format.raw/*100.38*/("""
							"""),format.raw/*101.8*/("""<li class="list-group-item yellow-bg" data-toggle="collapse" data-target="#episodios"""),_display_(/*101.93*/temporada/*101.102*/.getId()),format.raw/*101.110*/("""">
								<strong>Temporada """),_display_(/*102.28*/temporada/*102.37*/.getNumero()),format.raw/*102.49*/("""</strong></li>
							<div class="collapse" id="episodios"""),_display_(/*103.44*/temporada/*103.53*/.getId()),format.raw/*103.61*/("""">
						""")))}),format.raw/*104.8*/("""
						"""),_display_(/*105.8*/if(temporada.getStatus == 0)/*105.36*/{_display_(Seq[Any](format.raw/*105.37*/("""
							"""),format.raw/*106.8*/("""<li class="list-group-item blue-bg" data-toggle="collapse" data-target="#episodios"""),_display_(/*106.91*/temporada/*106.100*/.getId()),format.raw/*106.108*/("""">
								<strong>Temporada """),_display_(/*107.28*/temporada/*107.37*/.getNumero()),format.raw/*107.49*/("""</strong></li>
							<div class="collapse" id="episodios"""),_display_(/*108.44*/temporada/*108.53*/.getId()),format.raw/*108.61*/("""">
						""")))}),format.raw/*109.8*/("""
						"""),_display_(/*110.8*/if(temporada.getStatus == 1)/*110.36*/{_display_(Seq[Any](format.raw/*110.37*/("""
							"""),format.raw/*111.8*/("""<li class="list-group-item green-bg" data-toggle="collapse" data-target="#episodios"""),_display_(/*111.92*/temporada/*111.101*/.getId()),format.raw/*111.109*/("""">
								<strong>Temporada """),_display_(/*112.28*/temporada/*112.37*/.getNumero()),format.raw/*112.49*/("""</strong></li>
							<div class="collapse" id="episodios"""),_display_(/*113.44*/temporada/*113.53*/.getId()),format.raw/*113.61*/("""">
						""")))}),format.raw/*114.8*/("""
						"""),_display_(/*115.8*/for(ep <- temporada.getEpisodios()) yield /*115.43*/{_display_(Seq[Any](format.raw/*115.44*/("""
							"""),_display_(/*116.9*/if(ep.isAssistido)/*116.27*/{_display_(Seq[Any](format.raw/*116.28*/("""
								"""),format.raw/*117.9*/("""<li class="list-group-item lightgreen-bg">"""),_display_(/*117.52*/ep/*117.54*/.getNumero()),format.raw/*117.66*/(""" """),format.raw/*117.67*/("""- """),_display_(/*117.70*/ep/*117.72*/.getNome()),format.raw/*117.82*/("""
									"""),format.raw/*118.10*/("""<form class="badge" action=""""),_display_(/*118.39*/routes/*118.45*/.Application.cancelaEpisodio(ep.getId())),format.raw/*118.85*/("""" method="post">
										<button type="submit" class="close">&times;</button>
									</form>
								</li>
							""")))}/*122.9*/else/*122.13*/{_display_(Seq[Any](format.raw/*122.14*/("""
								"""),format.raw/*123.9*/("""<li class="list-group-item">"""),_display_(/*123.38*/ep/*123.40*/.getNumero()),format.raw/*123.52*/(""" """),format.raw/*123.53*/("""- """),_display_(/*123.56*/ep/*123.58*/.getNome()),format.raw/*123.68*/("""
								"""),format.raw/*124.9*/("""<form class="badge" action=""""),_display_(/*124.38*/routes/*124.44*/.Application.assisteEpisodio(ep.getId())),format.raw/*124.84*/("""" method="post">
										<button type="submit" class="close">&#10003;</button>
									</form>
								</li>										
							""")))}),format.raw/*128.9*/("""
						""")))}),format.raw/*129.8*/("""

						"""),_display_(/*131.8*/if(temporada.getProximoEpisodio(serie.getOpcaoRecomendacao) != null)/*131.76*/{_display_(Seq[Any](format.raw/*131.77*/("""
							"""),format.raw/*132.8*/("""<li class="list-group-item"><strong>Próximo:</strong> """),_display_(/*132.63*/temporada/*132.72*/.getProximoEpisodio(serie.getOpcaoRecomendacao)),format.raw/*132.119*/("""</li>
						""")))}),format.raw/*133.8*/("""
						"""),format.raw/*134.7*/("""</div>
					""")))}),format.raw/*135.7*/("""
					"""),format.raw/*136.6*/("""</div>
					""")))}),format.raw/*137.7*/("""
				""")))}),format.raw/*138.6*/("""
				"""),format.raw/*139.5*/("""</ul>
			</div>
		</div>
			<ul class="list-group">
				<li class="list-group-item"><strong>Legenda</strong></li>
				<li class="list-group-item blue-bg"> Pelo menos um episódio assistido.</li>
				<li class="list-group-item green-bg"> Último episódio assistido.</li>
				<li class="list-group-item yellow-bg"> Nenhum episódio assistido.</li>
			</ul>
		</div>
	
	</div>


</body>
</html>
"""))}
  }

  def render(series:List[Serie]): play.twirl.api.HtmlFormat.Appendable = apply(series)

  def f:((List[Serie]) => play.twirl.api.HtmlFormat.Appendable) = (series) => apply(series)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Fri Feb 13 13:13:23 GMT-03:00 2015
                  SOURCE: C:/Users/Bruno/Documents/GitHub/si1-lab2-part2/acompanhamentoSeries/app/views/index.scala.html
                  HASH: 7c142c825a445d065aafd3c050e90ab14669a625
                  MATRIX: 728->1|837->22|867->26|1047->180|1061->186|1124->229|1204->282|1219->288|1274->322|1359->380|1374->386|1427->418|1549->513|1564->519|1627->561|1693->600|1708->606|1767->644|1833->683|1848->689|1903->723|2440->1234|2476->1254|2515->1255|2549->1263|2584->1289|2623->1290|2657->1297|2749->1362|2764->1368|2827->1410|2973->1529|2987->1534|3027->1553|3056->1554|3160->1631|3174->1636|3203->1644|3233->1647|3247->1652|3278->1662|3366->1723|3380->1728|3409->1736|3445->1746|3500->1785|3539->1786|3574->1794|3676->1869|3694->1878|3723->1886|3782->1918|3800->1927|3839->1945|3868->1946|3933->1984|3951->1993|3984->2005|4069->2063|4087->2072|4116->2080|4153->2091|4204->2126|4243->2127|4279->2136|4335->2165|4346->2167|4379->2179|4408->2180|4438->2183|4449->2185|4480->2195|4524->2209|4559->2217|4603->2231|4637->2238|4681->2252|4718->2259|4751->2265|5046->2534|5082->2554|5121->2555|5155->2563|5189->2588|5228->2589|5262->2596|5354->2661|5369->2667|5435->2712|5614->2864|5628->2869|5657->2877|5687->2880|5701->2885|5732->2895|5826->2962|5840->2967|5869->2975|6079->3158|6094->3164|6163->3212|6954->3976|6968->3981|7019->4011|7080->4046|7135->4085|7174->4086|7210->4095|7249->4124|7289->4125|7326->4134|7439->4219|7459->4228|7490->4236|7549->4267|7568->4276|7602->4288|7689->4347|7708->4356|7738->4364|7780->4375|7816->4384|7854->4412|7894->4413|7931->4422|8042->4505|8062->4514|8093->4522|8152->4553|8171->4562|8205->4574|8292->4633|8311->4642|8341->4650|8383->4661|8419->4670|8457->4698|8497->4699|8534->4708|8646->4792|8666->4801|8697->4809|8756->4840|8775->4849|8809->4861|8896->4920|8915->4929|8945->4937|8987->4948|9023->4957|9075->4992|9115->4993|9152->5003|9180->5021|9220->5022|9258->5032|9329->5075|9341->5077|9375->5089|9405->5090|9436->5093|9448->5095|9480->5105|9520->5116|9577->5145|9593->5151|9655->5191|9797->5314|9811->5318|9851->5319|9889->5329|9946->5358|9958->5360|9992->5372|10022->5373|10053->5376|10065->5378|10097->5388|10135->5398|10192->5427|10208->5433|10270->5473|10435->5607|10475->5616|10513->5627|10591->5695|10631->5696|10668->5705|10751->5760|10770->5769|10840->5816|10885->5830|10921->5838|10966->5852|11001->5859|11046->5873|11084->5880|11118->5886
                  LINES: 26->1|29->1|31->3|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|61->33|61->33|61->33|62->34|62->34|62->34|63->35|64->36|64->36|64->36|67->39|67->39|67->39|67->39|68->40|68->40|68->40|68->40|68->40|68->40|70->42|70->42|70->42|71->43|71->43|71->43|72->44|72->44|72->44|72->44|73->45|73->45|73->45|73->45|74->46|74->46|74->46|75->47|75->47|75->47|76->48|76->48|76->48|77->49|77->49|77->49|77->49|77->49|77->49|77->49|77->49|78->50|79->51|80->52|81->53|82->54|83->55|84->56|96->68|96->68|96->68|97->69|97->69|97->69|98->70|99->71|99->71|99->71|102->74|102->74|102->74|102->74|102->74|102->74|104->76|104->76|104->76|108->80|108->80|108->80|125->97|125->97|125->97|127->99|127->99|127->99|128->100|128->100|128->100|129->101|129->101|129->101|129->101|130->102|130->102|130->102|131->103|131->103|131->103|132->104|133->105|133->105|133->105|134->106|134->106|134->106|134->106|135->107|135->107|135->107|136->108|136->108|136->108|137->109|138->110|138->110|138->110|139->111|139->111|139->111|139->111|140->112|140->112|140->112|141->113|141->113|141->113|142->114|143->115|143->115|143->115|144->116|144->116|144->116|145->117|145->117|145->117|145->117|145->117|145->117|145->117|145->117|146->118|146->118|146->118|146->118|150->122|150->122|150->122|151->123|151->123|151->123|151->123|151->123|151->123|151->123|151->123|152->124|152->124|152->124|152->124|156->128|157->129|159->131|159->131|159->131|160->132|160->132|160->132|160->132|161->133|162->134|163->135|164->136|165->137|166->138|167->139
                  -- GENERATED --
              */
          

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
                    <h1 id="title">Siga Séries</h1>
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
                  DATE: Fri Feb 13 19:27:53 GMT-03:00 2015
                  SOURCE: C:/Users/Bruno/Documents/GitHub/si1-lab2-part2/app/views/index.scala.html
                  HASH: d638f48fe4e567ec34cc3f347a8f65ea50d36cfd
                  MATRIX: 728->1|837->22|867->26|1047->180|1061->186|1124->229|1204->282|1219->288|1274->322|1359->380|1374->386|1427->418|1549->513|1564->519|1627->561|1693->600|1708->606|1767->644|1833->683|1848->689|1903->723|2451->1245|2487->1265|2526->1266|2560->1274|2595->1300|2634->1301|2668->1308|2760->1373|2775->1379|2838->1421|2984->1540|2998->1545|3038->1564|3067->1565|3171->1642|3185->1647|3214->1655|3244->1658|3258->1663|3289->1673|3377->1734|3391->1739|3420->1747|3456->1757|3511->1796|3550->1797|3585->1805|3687->1880|3705->1889|3734->1897|3793->1929|3811->1938|3850->1956|3879->1957|3944->1995|3962->2004|3995->2016|4080->2074|4098->2083|4127->2091|4164->2102|4215->2137|4254->2138|4290->2147|4346->2176|4357->2178|4390->2190|4419->2191|4449->2194|4460->2196|4491->2206|4535->2220|4570->2228|4614->2242|4648->2249|4692->2263|4729->2270|4762->2276|5057->2545|5093->2565|5132->2566|5166->2574|5200->2599|5239->2600|5273->2607|5365->2672|5380->2678|5446->2723|5625->2875|5639->2880|5668->2888|5698->2891|5712->2896|5743->2906|5837->2973|5851->2978|5880->2986|6090->3169|6105->3175|6174->3223|6965->3987|6979->3992|7030->4022|7091->4057|7146->4096|7185->4097|7221->4106|7260->4135|7300->4136|7337->4145|7450->4230|7470->4239|7501->4247|7560->4278|7579->4287|7613->4299|7700->4358|7719->4367|7749->4375|7791->4386|7827->4395|7865->4423|7905->4424|7942->4433|8053->4516|8073->4525|8104->4533|8163->4564|8182->4573|8216->4585|8303->4644|8322->4653|8352->4661|8394->4672|8430->4681|8468->4709|8508->4710|8545->4719|8657->4803|8677->4812|8708->4820|8767->4851|8786->4860|8820->4872|8907->4931|8926->4940|8956->4948|8998->4959|9034->4968|9086->5003|9126->5004|9163->5014|9191->5032|9231->5033|9269->5043|9340->5086|9352->5088|9386->5100|9416->5101|9447->5104|9459->5106|9491->5116|9531->5127|9588->5156|9604->5162|9666->5202|9808->5325|9822->5329|9862->5330|9900->5340|9957->5369|9969->5371|10003->5383|10033->5384|10064->5387|10076->5389|10108->5399|10146->5409|10203->5438|10219->5444|10281->5484|10446->5618|10486->5627|10524->5638|10602->5706|10642->5707|10679->5716|10762->5771|10781->5780|10851->5827|10896->5841|10932->5849|10977->5863|11012->5870|11057->5884|11095->5891|11129->5897
                  LINES: 26->1|29->1|31->3|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|61->33|61->33|61->33|62->34|62->34|62->34|63->35|64->36|64->36|64->36|67->39|67->39|67->39|67->39|68->40|68->40|68->40|68->40|68->40|68->40|70->42|70->42|70->42|71->43|71->43|71->43|72->44|72->44|72->44|72->44|73->45|73->45|73->45|73->45|74->46|74->46|74->46|75->47|75->47|75->47|76->48|76->48|76->48|77->49|77->49|77->49|77->49|77->49|77->49|77->49|77->49|78->50|79->51|80->52|81->53|82->54|83->55|84->56|96->68|96->68|96->68|97->69|97->69|97->69|98->70|99->71|99->71|99->71|102->74|102->74|102->74|102->74|102->74|102->74|104->76|104->76|104->76|108->80|108->80|108->80|125->97|125->97|125->97|127->99|127->99|127->99|128->100|128->100|128->100|129->101|129->101|129->101|129->101|130->102|130->102|130->102|131->103|131->103|131->103|132->104|133->105|133->105|133->105|134->106|134->106|134->106|134->106|135->107|135->107|135->107|136->108|136->108|136->108|137->109|138->110|138->110|138->110|139->111|139->111|139->111|139->111|140->112|140->112|140->112|141->113|141->113|141->113|142->114|143->115|143->115|143->115|144->116|144->116|144->116|145->117|145->117|145->117|145->117|145->117|145->117|145->117|145->117|146->118|146->118|146->118|146->118|150->122|150->122|150->122|151->123|151->123|151->123|151->123|151->123|151->123|151->123|151->123|152->124|152->124|152->124|152->124|156->128|157->129|159->131|159->131|159->131|160->132|160->132|160->132|160->132|161->133|162->134|163->135|164->136|165->137|166->138|167->139
                  -- GENERATED --
              */
          

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
                  DATE: Fri Feb 13 15:05:46 BRT 2015
                  SOURCE: /home/brunovr/Documentos/SI1/si1-lab2-part2/app/views/index.scala.html
                  HASH: 54e5319f5e860eacd7cf0e2b350a92555d199f50
                  MATRIX: 728->1|837->22|865->24|1039->172|1053->178|1116->221|1195->273|1210->279|1265->313|1349->370|1364->376|1417->408|1537->501|1552->507|1615->549|1680->587|1695->593|1754->631|1819->669|1834->675|1889->709|2408->1202|2444->1222|2483->1223|2516->1230|2551->1256|2590->1257|2623->1263|2714->1327|2729->1333|2792->1375|2935->1491|2949->1496|2989->1515|3018->1516|3121->1592|3135->1597|3164->1605|3194->1608|3208->1613|3239->1623|3325->1682|3339->1687|3368->1695|3403->1704|3458->1743|3497->1744|3531->1751|3633->1826|3651->1835|3680->1843|3738->1874|3756->1883|3795->1901|3824->1902|3888->1939|3906->1948|3939->1960|4023->2017|4041->2026|4070->2034|4106->2044|4157->2079|4196->2080|4231->2088|4287->2117|4298->2119|4331->2131|4360->2132|4390->2135|4401->2137|4432->2147|4475->2160|4509->2167|4552->2180|4585->2186|4628->2199|4664->2205|4696->2210|4979->2467|5015->2487|5054->2488|5087->2495|5121->2520|5160->2521|5193->2527|5284->2591|5299->2597|5365->2642|5541->2791|5555->2796|5584->2804|5614->2807|5628->2812|5659->2822|5751->2887|5765->2892|5794->2900|6000->3079|6015->3085|6084->3133|6858->3880|6872->3885|6923->3915|6982->3948|7037->3987|7076->3988|7111->3996|7150->4025|7190->4026|7226->4034|7339->4119|7359->4128|7390->4136|7448->4166|7467->4175|7501->4187|7587->4245|7606->4254|7636->4262|7677->4272|7712->4280|7750->4308|7790->4309|7826->4317|7937->4400|7957->4409|7988->4417|8046->4447|8065->4456|8099->4468|8185->4526|8204->4535|8234->4543|8275->4553|8310->4561|8348->4589|8388->4590|8424->4598|8536->4682|8556->4691|8587->4699|8645->4729|8664->4738|8698->4750|8784->4808|8803->4817|8833->4825|8874->4835|8909->4843|8961->4878|9001->4879|9037->4888|9065->4906|9105->4907|9142->4916|9213->4959|9225->4961|9259->4973|9289->4974|9320->4977|9332->4979|9364->4989|9403->4999|9460->5028|9476->5034|9538->5074|9676->5193|9690->5197|9730->5198|9767->5207|9824->5236|9836->5238|9870->5250|9900->5251|9931->5254|9943->5256|9975->5266|10012->5275|10069->5304|10085->5310|10147->5350|10308->5480|10347->5488|10383->5497|10461->5565|10501->5566|10537->5574|10620->5629|10639->5638|10709->5685|10753->5698|10788->5705|10832->5718|10866->5724|10910->5737|10947->5743|10980->5748
                  LINES: 26->1|29->1|31->3|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|61->33|61->33|61->33|62->34|62->34|62->34|63->35|64->36|64->36|64->36|67->39|67->39|67->39|67->39|68->40|68->40|68->40|68->40|68->40|68->40|70->42|70->42|70->42|71->43|71->43|71->43|72->44|72->44|72->44|72->44|73->45|73->45|73->45|73->45|74->46|74->46|74->46|75->47|75->47|75->47|76->48|76->48|76->48|77->49|77->49|77->49|77->49|77->49|77->49|77->49|77->49|78->50|79->51|80->52|81->53|82->54|83->55|84->56|96->68|96->68|96->68|97->69|97->69|97->69|98->70|99->71|99->71|99->71|102->74|102->74|102->74|102->74|102->74|102->74|104->76|104->76|104->76|108->80|108->80|108->80|125->97|125->97|125->97|127->99|127->99|127->99|128->100|128->100|128->100|129->101|129->101|129->101|129->101|130->102|130->102|130->102|131->103|131->103|131->103|132->104|133->105|133->105|133->105|134->106|134->106|134->106|134->106|135->107|135->107|135->107|136->108|136->108|136->108|137->109|138->110|138->110|138->110|139->111|139->111|139->111|139->111|140->112|140->112|140->112|141->113|141->113|141->113|142->114|143->115|143->115|143->115|144->116|144->116|144->116|145->117|145->117|145->117|145->117|145->117|145->117|145->117|145->117|146->118|146->118|146->118|146->118|150->122|150->122|150->122|151->123|151->123|151->123|151->123|151->123|151->123|151->123|151->123|152->124|152->124|152->124|152->124|156->128|157->129|159->131|159->131|159->131|160->132|160->132|160->132|160->132|161->133|162->134|163->135|164->136|165->137|166->138|167->139
                  -- GENERATED --
              */
          
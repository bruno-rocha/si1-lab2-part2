package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity(name="Temporada")
public class Temporada {
	@Transient
	private final int COMPLETA = 1;
	@Transient
	private final int INCOMPLETA = 0;
	@Transient
	private final int TOTALINCOMPLETA = -1;
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column
	private int numero;
	@Column
	private int status;
	@Column
	private int qtdEpisodios;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Serie serie;

    @OrderBy("numero")
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="TEMP_EPS")
	private List<Episodio> episodios;

	public Temporada() {
		status = -1;
		episodios = new ArrayList<>();
		qtdEpisodios = episodios.size();
	}
	
	public Temporada(int num, Serie serie){
		this();
		this.numero = num;
		this.serie = serie;
	}
	
	public void addEpisodio(Episodio ep){
		episodios.add(ep);
		qtdEpisodios++;
	}

	public Long getId() {
		return id;
	}

	private void setId(Long id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public List<Episodio> getEpisodios() {
		return episodios;
	}

	public void setEpisodios(List<Episodio> episodios) {
		this.episodios = episodios;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Serie getSerie() {
		return serie;
	}

	public void setSerie(Serie serie) {
		this.serie = serie;
	}
	
	public Episodio getEpisodio(int num){
		return episodios.get(num-1);
	}

	public int getQtdEpisodios() {
		return qtdEpisodios;
	}

	public void setQtdEpisodios(int qtdEpisodios) {
		this.qtdEpisodios = qtdEpisodios;
	}

	public String getProximoEpisodio(Recomendacao opcao){
		return opcao.getProximoEpisodio(this);
	}
	
	public int verificaStatus(){
		int cont = 0;
		
		for (Episodio ep : episodios) {
			if(ep.isAssistido()){
				cont += 1;
			}
		}
		
		if(cont == 0){
			status = TOTALINCOMPLETA;
		}
		if(cont > 0) {
			status = INCOMPLETA;
		}
		if(cont == qtdEpisodios || episodios.get(qtdEpisodios-1).isAssistido()) {
			status = COMPLETA;
		}
		return status;
	}
	
	
}

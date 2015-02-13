package models;

import javax.persistence.Entity;
import java.util.List;

/**
 * Created by Bruno on 11/02/2015.
 */
@Entity
public class RecomendaEpApos3 extends Recomendacao{
    private final int LIMITE = 3;
    @Override
    public String getProximoEpisodio(Temporada temporada){
        List<Episodio> episodios = temporada.getEpisodios();

        String result = episodios.get(0).getNumero() + " - " + episodios.get(0).getNome();
        int proxEp = -1;
        int aux = 0;
        boolean flag = false;
        for (int i = 0; i <= temporada.getQtdEpisodios() - 1; i++) {
            if(!episodios.get(i).isAssistido() && flag == false) {
                proxEp = i;
                flag = true;
                result = episodios.get(proxEp).getNumero() + " - " + episodios.get(proxEp).getNome();
            }else if (episodios.get(i).isAssistido() && flag == true){
                aux++;
            }
            if (aux == LIMITE){
                proxEp = -1;
                aux = 0;
                flag = false;
            }
        }
        if (proxEp == -1){
            return null;
        }
        return result;
    }

    @Override
    public String toString() {
        return "opção de recomendação 3";
    }
}


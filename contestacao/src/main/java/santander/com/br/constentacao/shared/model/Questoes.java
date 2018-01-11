package santander.com.br.constentacao.shared.model;

import java.util.ArrayList;

/**
 * Created by cledson.alves on 10/01/2018.
 */

public class Questoes {
    String descricao;
    String dica;
   ArrayList<Respostas> respostas;


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDica() {
        return dica;
    }

    public void setDica(String dica) {
        this.dica = dica;
    }

    public ArrayList<Respostas> getRespostas() {
        return respostas;
    }

    public void setRespostas(ArrayList<Respostas> respostas) {
        this.respostas = respostas;
    }
}

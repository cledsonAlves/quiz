package santander.com.br.constentacao.shared.model;

import java.util.ArrayList;

/**
 * Created by cledson.alves on 10/01/2018.
 */

public class Quiz {
    int codigo;
    String descricao;
    ArrayList<Questoes> questoes;


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList<Questoes> getQuestoes() {
        return questoes;
    }

    public void setQuestoes(ArrayList<Questoes> questoes) {
        this.questoes = questoes;
    }
}

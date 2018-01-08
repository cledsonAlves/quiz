package santander.com.br.constentacao.shared.model;

import java.util.List;

/**
 * Created by cledson.alves on 28/12/2017.
 */

public class QuizEntity {
    int id;
    String description;
    List<Questions> questions;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public List<Questions> getQuestions() {
        return questions;
    }
    public void setQuestions(List<Questions> questions) {
        this.questions = questions;
    }


}
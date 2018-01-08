package santander.com.br.archreferencia.shared.model.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cledson.alves on 19/12/2017.
 */

public class Quiz {
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

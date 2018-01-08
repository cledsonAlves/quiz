package santander.com.br.archreferencia.shared.model.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cledson.alves on 19/12/2017.
 */

public class Answers {
    int id;
    String description;
    String hint;
    List<NextQuestion> nextquestion;


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

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public List<NextQuestion> getNextquestion() {
        return nextquestion;
    }

    public void setNextquestion(List<NextQuestion> nextquestion) {
        this.nextquestion = nextquestion;
    }


}

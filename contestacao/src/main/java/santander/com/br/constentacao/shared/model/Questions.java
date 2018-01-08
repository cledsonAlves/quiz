package santander.com.br.constentacao.shared.model;

import java.util.List;

/**
 * Created by cledson.alves on 19/12/2017.
 */

public class Questions {
    int id;
    String description;
    String hint;
    List<Answers> answers;


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

    public List<Answers> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answers> answers) {
        this.answers = answers;
    }


}
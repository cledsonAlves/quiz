package santander.com.br.constentacao.features.quiz.model;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import santander.com.br.constentacao.R;
import santander.com.br.constentacao.shared.model.QuizEntity;

/**
 * Created by cledson.alves on 22/12/2017.
 */

public class QuizProvider {
    private Context context;

    public QuizProvider(Context context) {
        this.context = context;
    }


    /**
     * TODO Mock JSON pasta Asset
     */
    public QuizEntity getMockJson() throws IOException {
        InputStream is = context.getResources().openRawResource(R.raw.quiz);
        Writer writer = new StringWriter();
        char[] buffer = new char[1024];
        try {
            Reader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            int n;
            while ((n = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, n);
            }
        } finally {
            is.close();
        }
        Gson gson = new Gson();
        String jsonString = writer.toString();

        return new GsonBuilder().create().fromJson(jsonString, QuizEntity.class);


    }

}

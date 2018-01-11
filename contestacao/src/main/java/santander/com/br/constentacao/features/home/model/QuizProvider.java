package santander.com.br.constentacao.features.home.model;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

import santander.com.br.constentacao.R;
import santander.com.br.constentacao.shared.model.Questoes;
import santander.com.br.constentacao.shared.model.Quiz;
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
    public Quiz getMockJson()  {
        InputStream is = context.getResources().openRawResource(R.raw.resp);
        Writer writer = new StringWriter();
        char[] buffer = new char[1024];
        try {
            Reader reader = null;
            try {
                reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            int n;
            try {
                while ((n = reader.read(buffer)) != -1) {
                    writer.write(buffer, 0, n);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Gson gson = new Gson();
        String jsonString = writer.toString();
        return new GsonBuilder().create().fromJson(jsonString, Quiz.class);


    }

}

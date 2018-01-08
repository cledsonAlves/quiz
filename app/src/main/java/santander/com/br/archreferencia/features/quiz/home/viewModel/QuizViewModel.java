package santander.com.br.archreferencia.features.quiz.home.viewModel;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import santander.com.br.archreferencia.R;
import santander.com.br.archreferencia.features.quiz.home.model.QuizProvider;
import santander.com.br.archreferencia.features.quiz.home.view.QuizFragment;
import santander.com.br.archreferencia.features.quiz.home.view.adapter.AnswersFragment;
import santander.com.br.archreferencia.features.quiz.home.view.adapter.QuizCardAdapter;
import santander.com.br.archreferencia.shared.model.entity.Questions;
import santander.com.br.archreferencia.shared.model.entity.Quiz;
import santander.com.br.constentacao.shared.ConstentacaoRouter;

/**
 * Created by cledson.alves on 22/12/2017.
 */

public class QuizViewModel {
    private View view;
    private Activity activity;
    private TextView titulo;
    private RecyclerView listaQuiz;
    private Button btnConstentar;




    public QuizViewModel(Activity activity) throws IOException {
        this.activity = activity;
        initComponentes();


    }



    private void initComponentes() throws IOException {
        this.titulo = activity.findViewById(R.id.txt_titulo);
        this.listaQuiz = activity.findViewById(R.id.quiz_lista_questions);
        this.btnConstentar = activity.findViewById(R.id.button_constentar);




        listaQuiz.setLayoutManager(new LinearLayoutManager(activity));
        listaQuiz.setItemAnimator(new DefaultItemAnimator());
        listaQuiz.setNestedScrollingEnabled(false);


        QuizProvider pv = new QuizProvider(activity.getApplicationContext());
        Quiz quiz = pv.getMockJson();


        Log.i("###Total",""+ quiz.getQuestions().get(0));

        List<Questions> questions;
        questions = new ArrayList<Questions>();

        questions.add(quiz.getQuestions().get(3));

        listaQuiz.setAdapter(new QuizCardAdapter(activity.getApplicationContext(),questions));


    }
}

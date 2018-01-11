package santander.com.br.constentacao.features.home.viewModel;

import android.app.Activity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;
import java.util.ArrayList;

import santander.com.br.constentacao.R;
import santander.com.br.constentacao.features.home.model.QuizProvider;
import santander.com.br.constentacao.features.home.view.adapter.QuizMotivoAdapter;
import santander.com.br.constentacao.shared.model.Questions;
import santander.com.br.constentacao.shared.model.Questoes;
import santander.com.br.constentacao.shared.model.Quiz;
import santander.com.br.constentacao.shared.model.Respostas;
import santander.com.br.constentacao.shared.utils.Utils;

/**
 * Created by cledson.alves on 22/12/2017.
 */

public class QuizViewModel {
    private View view;
    private Activity activity;
    private TextView titulo;
    private RecyclerView listaRespostas;
    private ArrayList<Questoes> questoes;
    private Quiz quiz;



    public QuizViewModel(Activity activity) {
        this.activity = activity;
        initComponentes();

    }

    public void initComponentes(){
        titulo = activity.findViewById(R.id.titulo_questao);
        listaRespostas = activity.findViewById(R.id.respostas);

        /** TODO mock lendo json **/
        QuizProvider provider  = new QuizProvider(activity);
        quiz= provider.getMockJson();
        questoes = quiz.getQuestoes();
        titulo.setText(questoes.get(0).getDescricao());

        listaRespostas.setLayoutManager(new LinearLayoutManager(activity));
        listaRespostas.setItemAnimator(new DefaultItemAnimator());
        listaRespostas.setNestedScrollingEnabled(false);
        listaRespostas.setAdapter(new QuizMotivoAdapter(activity,questoes.get(0).getRespostas()));

    }


}

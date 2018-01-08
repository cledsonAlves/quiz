package santander.com.br.archreferencia.features.quiz.home.view;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.io.IOException;

import santander.com.br.archreferencia.R;
import santander.com.br.archreferencia.features.quiz.home.model.QuizProvider;
import santander.com.br.archreferencia.features.quiz.home.view.adapter.AnswersCardAdapter;
import santander.com.br.archreferencia.features.quiz.home.view.adapter.QuizCardAdapter;
import santander.com.br.archreferencia.shared.model.entity.Quiz;

/**
 * Created by cledson.alves on 27/12/2017.
 */

public class QuizFragment extends Fragment {
    private RecyclerView listaQuiz;

    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.main_fragment_lista, container, false);

        QuizProvider pv = new QuizProvider(view.getContext());
        Quiz quiz = null;
        try {
            quiz = pv.getMockJson();
        } catch (IOException e) {
            e.printStackTrace();
        }


        this.listaQuiz = view.findViewById(R.id.quiz_lista_questions);

        listaQuiz.setLayoutManager(new LinearLayoutManager(view.getContext()));
        listaQuiz.setItemAnimator(new DefaultItemAnimator());
        listaQuiz.setNestedScrollingEnabled(false);

        listaQuiz.setAdapter(new QuizCardAdapter(view.getContext().getApplicationContext(),quiz.getQuestions()));

        return view;
    }


}

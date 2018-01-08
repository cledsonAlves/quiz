package santander.com.br.constentacao.features.home.view;

import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

import santander.com.br.constentacao.R;
import santander.com.br.constentacao.features.home.model.QuizProvider;
import santander.com.br.constentacao.shared.ConstentacaoRouter;
import santander.com.br.constentacao.shared.model.QuizEntity;
import santander.com.br.constentacao.shared.view.CoreActivity;

/**
 * Created by cledson.alves on 28/12/2017.
 */

public class QuizActivity extends CoreActivity {
    private TextView txtTitulo;
    private TextView txtQuestion;
    private TextView txtQuestion2;
    private RadioGroup rgQuiz, rg2;
    private RadioButton r1, r2, r3;
    private Button btn;

    QuizEntity entity = null;
    private LinearLayout layout_quiz;
    private LinearLayout layout_botao;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity);
        getSupportActionBar().setTitle(getResources().getString(R.string.contestar_compra));
        initComponentes();


    }

    public void initComponentes() {
        QuizProvider quiz = new QuizProvider(this);

        try {
            entity = quiz.getMockJson();
        } catch (IOException e) {
            e.printStackTrace();
        }

        btn = findViewById(R.id.button_constentar);

        txtTitulo = this.findViewById(R.id.txt_titulo);
        txtQuestion = this.findViewById(R.id.txt_question);
        txtQuestion2 = this.findViewById(R.id.txt_question2);
        layout_quiz = this.findViewById(R.id.layout_quiz);
        layout_botao = this.findViewById(R.id.rodape);
        r1 = this.findViewById(R.id.r1);    r2 = this.findViewById(R.id.r2);    r3 = this.findViewById(R.id.r3);

        txtTitulo.setText(entity.getDescription());
        txtQuestion.setText(entity.getQuestions().get(0).getDescription());

        rgQuiz = findViewById(R.id.rg_question);
        rg2 = findViewById(R.id.rg2);

        rgQuiz.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                View v = findViewById(R.id.view);
                switch (i) {
                    case 1:
                        layout_quiz.setVisibility(View.VISIBLE);
                        txtQuestion2.setText(entity.getQuestions().get(i).getDescription());
                        r1.setText(entity.getQuestions().get(i).getAnswers().get(0).getDescription());
                        r2.setText(entity.getQuestions().get(i).getAnswers().get(1).getDescription());
                        r3.setText(entity.getQuestions().get(i).getAnswers().get(2).getDescription());
                        rg2.clearCheck();

                        btn.setEnabled(false);
                        v.setVisibility(View.VISIBLE);

                        break;
                    case 2:
                        v.setVisibility(View.VISIBLE);
                        layout_quiz.setVisibility(View.VISIBLE);
                        txtQuestion2.setText(entity.getQuestions().get(i).getDescription());
                        r1.setText(entity.getQuestions().get(i).getAnswers().get(0).getDescription());
                        r2.setText(entity.getQuestions().get(i).getAnswers().get(1).getDescription());
                        r3.setText(entity.getQuestions().get(i).getAnswers().get(2).getDescription());
                        rg2.clearCheck();
                        btn.setEnabled(false);
                        break;
                }
            }
        });

        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                btn.setEnabled(true);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConstentacaoRouter.getInstance().goResumoContestacao(getApplicationContext());
            }
        });


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
}

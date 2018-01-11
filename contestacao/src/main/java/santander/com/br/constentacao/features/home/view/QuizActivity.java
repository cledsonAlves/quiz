package santander.com.br.constentacao.features.home.view;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import santander.com.br.constentacao.R;
import santander.com.br.constentacao.features.home.viewModel.QuizViewModel;
import santander.com.br.constentacao.shared.model.Quiz;
import santander.com.br.constentacao.shared.model.QuizEntity;
import santander.com.br.constentacao.shared.utils.Utils;
import santander.com.br.constentacao.shared.view.CoreActivity;

/**
 * Created by cledson.alves on 28/12/2017.
 */

public class QuizActivity extends CoreActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.motivo_activity);
        getSupportActionBar().setTitle(getResources().getString(R.string.contestar_compra));
        new QuizViewModel(this);



    }

}

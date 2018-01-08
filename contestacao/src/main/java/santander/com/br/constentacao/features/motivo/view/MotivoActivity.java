package santander.com.br.constentacao.features.motivo.view;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import santander.com.br.constentacao.R;
import santander.com.br.constentacao.features.home.view.adapter.QuizMotivoAdapter;
import santander.com.br.constentacao.shared.ConstentacaoRouter;
import santander.com.br.constentacao.shared.utils.Utils;
import santander.com.br.constentacao.shared.view.CoreActivity;

/**
 * Created by cledson.alves on 04/01/2018.
 */

public class MotivoActivity extends CoreActivity {
    private RecyclerView listaMotivos;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.motivo_activity);

    }

}

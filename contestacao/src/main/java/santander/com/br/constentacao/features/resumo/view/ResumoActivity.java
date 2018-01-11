package santander.com.br.constentacao.features.resumo.view;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Layout;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import santander.com.br.constentacao.R;
import santander.com.br.constentacao.shared.utils.Utils;
import santander.com.br.constentacao.shared.view.CoreActivity;

/**
 * Created by cledson.alves on 02/01/2018.
 */

public class ResumoActivity extends CoreActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parecer_usuario);

        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.containsKey("params")) {

        }


    }

}

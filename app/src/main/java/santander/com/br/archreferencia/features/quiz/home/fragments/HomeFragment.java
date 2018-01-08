package santander.com.br.archreferencia.features.quiz.home.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import santander.com.br.archreferencia.R;
import santander.com.br.constentacao.shared.utils.Utils;


/**
 * Created by cledson.alves on 06/09/2017.
 */

public class HomeFragment extends Fragment {
    private RelativeLayout rl,r2;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main, container, false);

        Button btn = view.findViewById(R.id.contestar);
        rl =  view.findViewById(R.id.load);
        r2 = view.findViewById(R.id.main_home);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rl.setVisibility(View.VISIBLE);
                r2.setVisibility(View.GONE);
                Utils.mock(rl, r2, 2000);

            }
        });


        return view;

    }
}

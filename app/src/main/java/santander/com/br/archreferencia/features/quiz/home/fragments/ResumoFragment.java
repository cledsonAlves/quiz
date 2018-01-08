package santander.com.br.archreferencia.features.quiz.home.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import santander.com.br.archreferencia.R;
import santander.com.br.constentacao.features.home.view.adapter.QuizMotivoAdapter;
import santander.com.br.constentacao.shared.utils.Utils;


/**
 * Created by cledson.alves on 06/09/2017.
 */

public class ResumoFragment extends Fragment {


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.resumo_activity, container, false);


        return view;


    }
}

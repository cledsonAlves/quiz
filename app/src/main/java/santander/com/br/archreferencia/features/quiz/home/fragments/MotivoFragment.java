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

public class MotivoFragment extends Fragment {
    private RecyclerView listaMotivos;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.motivo_activity, container, false);

        listaMotivos = view.findViewById(santander.com.br.constentacao.R.id.lista_motivos);
        listaMotivos.setLayoutManager(new LinearLayoutManager(view.getContext()));
        listaMotivos.setItemAnimator(new DefaultItemAnimator());
        listaMotivos.setNestedScrollingEnabled(false);
        listaMotivos.setAdapter(new QuizMotivoAdapter(view.getContext(), Utils.mockMotivos()));


        return view;

    }
}

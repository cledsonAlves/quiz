package santander.com.br.archreferencia.features.quiz.home.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import santander.com.br.archreferencia.R;
import santander.com.br.archreferencia.shared.model.entity.Answers;

/**
 * Created by cledson.alves on 22/12/2017.
 */

public class AnswersCardAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Answers> lista;
    private Context context;
    private int mSelectedPosition = -1;
    private RadioButton mSelectedRB;
    RadioButton rb;


    public AnswersCardAdapter(Context context, List<Answers> lista) {
        this.lista = lista;
        this.context = context;



    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        RadioGroup radioGroup;

        public ViewHolder(View itemView) {
            super(itemView);
            radioGroup = itemView.findViewById(R.id.group_me);

        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new AnswersCardAdapter.ViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_card_answers, parent, false));
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {

            rb = new RadioButton(holder.itemView.getContext());
            rb.setText(lista.get(position).getDescription());
            rb.setTag(lista.get(position).getId());
            rb.setId(position);
            ((ViewHolder) holder).radioGroup.addView(rb);

        ((ViewHolder) holder).radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                   Log.i("###",""+ rb.getTag());

            }
        });



    }



    @Override
    public int getItemCount() {
        return lista.size();
    }
}

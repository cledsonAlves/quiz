package santander.com.br.archreferencia.features.quiz.home.view.adapter;

import android.app.FragmentManager;
import android.content.Context;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import java.util.List;
import santander.com.br.archreferencia.R;
import santander.com.br.archreferencia.shared.model.entity.Answers;
import santander.com.br.archreferencia.shared.model.entity.Questions;

/**
 * Created by cledson.alves on 22/12/2017.
 */

public class QuizCardAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Questions> listaQuestions;
    private Context context;


    public QuizCardAdapter(Context context, List<Questions> lista) {
        this.listaQuestions = lista;
        this.context = context;

    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView txt_question;
        RecyclerView listaAnswers;

        public ViewHolder(View itemView) {
            super(itemView);
            txt_question =  itemView.findViewById(R.id.txt_question);
            listaAnswers =  itemView.findViewById(R.id.lista_answers);

        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new QuizCardAdapter.ViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.layout, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder) holder).txt_question.setText(listaQuestions.get(position).getDescription().toString());
        ((ViewHolder) holder).listaAnswers.setLayoutManager(new LinearLayoutManager(context));
        ((ViewHolder) holder).listaAnswers.setItemAnimator(new DefaultItemAnimator());
        ((ViewHolder) holder).listaAnswers.setNestedScrollingEnabled(false);

        ((ViewHolder) holder).listaAnswers.setAdapter(new AnswersCardAdapter(context, listaQuestions.get(position).getAnswers()));


    }

    @Override
    public int getItemCount() {
        return listaQuestions.size();
    }
}

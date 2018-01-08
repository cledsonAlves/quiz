package santander.com.br.constentacao.features.home.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

import santander.com.br.constentacao.R;
import santander.com.br.constentacao.shared.ConstentacaoRouter;

/**
 * Created by cledson.alves on 22/12/2017.
 */

public class QuizMotivoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<String> listaMotivos;
    private Context context;


    public QuizMotivoAdapter(Context context, List<String> lista) {
        this.listaMotivos = lista;
        this.context = context;

    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView descricaoMotivo;
        RelativeLayout layout;

        public ViewHolder(View itemView) {
            super(itemView);
            descricaoMotivo = itemView.findViewById(R.id.descricao_motivo);
            layout = itemView.findViewById(R.id.layout);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new QuizMotivoAdapter.ViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.content_motivos, parent, false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
         ((ViewHolder) holder).descricaoMotivo.setText(listaMotivos.get(position).toString());
        ((ViewHolder) holder).layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // ConstentacaoRouter.getInstance().goHome(context);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listaMotivos.size();
    }
}

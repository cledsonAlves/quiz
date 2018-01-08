package santander.com.br.constentacao.shared;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import santander.com.br.constentacao.features.home.view.QuizActivity;
import santander.com.br.constentacao.features.motivo.view.MotivoActivity;
import santander.com.br.constentacao.features.resumo.view.ResumoActivity;

/**
 * Created by cledson.alves on 28/12/2017.
 */

public class ConstentacaoRouter {
    private static ConstentacaoRouter instance;


    private ConstentacaoRouter() {
        super();
    }

    public static synchronized ConstentacaoRouter getInstance() {
        if (instance == null) {
            instance = new ConstentacaoRouter();
        }
        return instance;
    }

    public void goHome(final Context context) {
        final Intent i = getBundledIntent(context, QuizActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);

    }

    public void goMotivoContestacao(final Context context) {
        final Intent i = getBundledIntent(context, MotivoActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);

    }

    public void goResumoContestacao(final Context context) {
        final Intent i = getBundledIntent(context, ResumoActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);

    }
    private Intent getBundledIntent(final Context context, final Class<?> clazz) {
        final Bundle b = new Bundle();
        final Intent i = new Intent(context, clazz);
        return i;
    }



}

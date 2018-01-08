package santander.com.br.archreferencia.shared;

import android.util.Log;

import santander.com.br.archreferencia.ConstentacaoRouterInterface;

/**
 * Created by cledson.alves on 19/12/2017.
 */

public class ConstentacaoRouter {

    private static ConstentacaoRouter instance;


    public static synchronized ConstentacaoRouter getInstance() {
        if (instance == null) {
            instance = new ConstentacaoRouter();
        }
        return instance;
    }

}

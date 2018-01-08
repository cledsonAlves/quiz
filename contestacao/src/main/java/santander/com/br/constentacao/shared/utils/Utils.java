package santander.com.br.constentacao.shared.utils;

import android.os.Handler;
import android.view.View;
import android.widget.RelativeLayout;

import java.util.ArrayList;

/**
 * Created by cledson.alves on 02/01/2018.
 */

public class Utils {

    public static void mock(final RelativeLayout layout,final RelativeLayout r2, int timer){
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                layout.setVisibility(View.GONE);
                r2.setVisibility(View.VISIBLE);
            }
        }, timer);
    }


    public static ArrayList<String> mockMotivos(){
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Não reconheço essa compra");lista.add("Compra duplicada");lista.add("Divergência no valor ou no numero de parcelas");
        lista.add("Compra cancelada");lista.add("Arrependimento");lista.add("Mercadoria com defeito ou divergência no serviço prestado");
        lista.add("Mercadoria não recebida ou serviço não prestado");lista.add("Compras pagas por outros meios");
        return lista;
    }

}

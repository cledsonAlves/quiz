package santander.com.br.archreferencia.features.quiz.home.view;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import santander.com.br.archreferencia.R;
import santander.com.br.archreferencia.features.quiz.home.fragments.BloqueioFragment;
import santander.com.br.archreferencia.features.quiz.home.fragments.ContestaSucessoFragment;
import santander.com.br.archreferencia.features.quiz.home.fragments.HomeFragment;
import santander.com.br.archreferencia.features.quiz.home.fragments.MotivoFragment;
import santander.com.br.archreferencia.features.quiz.home.fragments.NegativasFragment;
import santander.com.br.archreferencia.features.quiz.home.fragments.NegativasTwoFragment;
import santander.com.br.archreferencia.features.quiz.home.fragments.ParecerUsuarioFragment;
import santander.com.br.archreferencia.features.quiz.home.fragments.RemissaoFragment;
import santander.com.br.archreferencia.features.quiz.home.fragments.ResumoErroFragment;
import santander.com.br.archreferencia.features.quiz.home.fragments.ResumoFragment;
import santander.com.br.constentacao.shared.view.CoreActivity;

/**
 * Created by cledson.alves on 22/12/2017.
 */

public class HomeActivity extends CoreActivity {
    private Button btnConstentar;
    private FragmentManager fm;
    private FragmentTransaction ft;
    private MotivoFragment mv = new MotivoFragment();
    private int tag = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);
        View view = findViewById(R.id.include);


        getSupportActionBar().setTitle(" Detalhes da compra");

        fm = getSupportFragmentManager();
        // Abre uma transação e adiciona
        ft = fm.beginTransaction();
        ft.add(R.id.container,new HomeFragment());
        ft.commit();

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setupFragments(tag);
                tag = tag+1;
                if (tag > 8){
                    tag = 0;
                }


                Log.i("##","tag : "+ tag);



            }
        });



    }

    private void setupFragments(int tag) {
        switch (tag) {

            case 0:
                ft = fm.beginTransaction();
                ft.replace(R.id.container, new HomeFragment());
                ft.commit();

                break;
            case 1:
                ft = fm.beginTransaction();
                ft.replace(R.id.container, new MotivoFragment());
                getSupportActionBar().setTitle("Contestar compra");
                ft.commit();

                break;
            case 2:
                ft = fm.beginTransaction();
                ft.replace(R.id.container, new NegativasFragment());
                getSupportActionBar().setTitle("Contestar compra");
                ft.commit();
                break;


            case 3:
                ft = fm.beginTransaction();
                ft.replace(R.id.container, new NegativasTwoFragment());
                getSupportActionBar().setTitle("Contestar compra");
                ft.commit();
                break;



            case 4:
                ft = fm.beginTransaction();
                ft.replace(R.id.container, new ParecerUsuarioFragment());
                getSupportActionBar().setTitle("Contestar compra");
                ft.commit();
                break;



            case 5:
                ft = fm.beginTransaction();
                ft.replace(R.id.container, new BloqueioFragment());
                getSupportActionBar().setTitle("Bloqueio de cartão");
                ft.commit();

                break;

            case 6:
                ft = fm.beginTransaction();
                ft.replace(R.id.container, new ResumoFragment());
                getSupportActionBar().setTitle("Contestar compra");
                ft.commit();
                break;


            case 7:
                ft = fm.beginTransaction();
                ft.replace(R.id.container, new ResumoErroFragment());
                getSupportActionBar().setTitle("Contestar compra");
                ft.commit();

                break;


            case 8:
                ft = fm.beginTransaction();
                ft.replace(R.id.container, new ContestaSucessoFragment());
                getSupportActionBar().setTitle("Compra contestada ");
                ft.commit();
                break;



        }

    }
}

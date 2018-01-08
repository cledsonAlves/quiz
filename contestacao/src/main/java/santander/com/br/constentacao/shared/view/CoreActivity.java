package santander.com.br.constentacao.shared.view;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import santander.com.br.constentacao.R;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

/**
 * Created by cledson.alves on 02/01/2018.
 */

public class CoreActivity  extends AppCompatActivity{

    @Override @SuppressWarnings("All")
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/SF-UI-Text-Light.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );

        //getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
      //  getSupportActionBar().hide();



    }
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

}

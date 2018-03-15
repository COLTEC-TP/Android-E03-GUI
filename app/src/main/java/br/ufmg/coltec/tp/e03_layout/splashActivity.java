package br.ufmg.coltec.tp.e03_layout;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

public class splashActivity extends Activity {

    private static int tempo = 5000; //Em milissegundos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
            }
        }, tempo);

    }
}

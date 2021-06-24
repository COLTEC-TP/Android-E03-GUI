package br.ufmg.coltec.tp.e03_layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreenActivity extends Activity {

    //variável que  determina tempo de duração do carregamento
    private static int splash_time = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //chamando o layout da página
        setContentView(R.layout.activity_splash_screen);

        //instancioando objeto Handdler
        //chamando método postDelayed, que recebe a callback run(), do objeto Runnable
        //essa callback será responsável por executar a mudança quando acabar o tempo de delay
        //consultar documentação: https://developer.android.com/reference/android/os/Handler
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(
                        SplashScreenActivity.this, MainActivity.class
                );
                startActivity(intent);
                finish();
            }
        }, splash_time);
    }
}

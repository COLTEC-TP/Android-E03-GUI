package br.ufmg.coltec.tp.e03_layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_splash = findViewById(R.id.splash);
        Button btn_not = findViewById(R.id.noticia);
        Button btn_tempo = findViewById(R.id.tempo);
        Button btn_form = findViewById(R.id.formulario);

        btn_splash.setText("splash-screen");
        btn_not.setText("noticia");
        btn_tempo.setText("previsão do tempo");
        btn_form.setText("formulario");

        btn_splash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activitySplash = new Intent(MainActivity.this, Splash.class);
                startActivity(activitySplash);
            }
        });

        btn_not.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityNot = new Intent(MainActivity.this, Noticia.class);
                startActivity(activityNot);
            }
        });

        btn_tempo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityTempo = new Intent(MainActivity.this, Tempo.class);
                startActivity(activityTempo);
            }
        });

        btn_form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activityForm = new Intent(MainActivity.this, Formulario.class);
                startActivity(activityForm);
            }
        });
    }
}

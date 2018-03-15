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

        Button btnSplash = findViewById(R.id.btn_splash);
        Button btnNoticia = findViewById(R.id.btn_noticia);
        Button btnPrevisao = findViewById(R.id.btn_previsao);
        Button btnForm = findViewById(R.id.btn_form);

        btnSplash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SplashScreenActivity.class);
                startActivity(intent);
            }
        });

        btnNoticia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NoticiasActivity.class);
                startActivity(intent);
            }
        });

        btnPrevisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this, PrevisaoActivity.class);
               startActivity(intent);
            }
        });

        btnForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FormularioActivity.class);
                startActivity(intent);
            }
        });


    }
}

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

        Button botaoNoticia = findViewById(R.id.noticia);
        Button botaoPrevisao = findViewById(R.id.previsao);
        Button botaoFormulario = findViewById(R.id.formulario);

        Intent intent = new Intent(MainActivity.this, splashActivity.class);
        startActivity(intent);


        botaoNoticia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, noticiaActivity.class);
                startActivity(intent);
            }
        }
        );

        botaoPrevisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, previsaoActivity.class);
                startActivity(intent);
            }
        }
        );

        botaoFormulario.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent = new Intent(MainActivity.this, formularioActivity.class);
                 startActivity(intent);
             }
         }
        );




    }
}

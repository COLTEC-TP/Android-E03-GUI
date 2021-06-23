package br.ufmg.coltec.tp.e03_layout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button noticia = this.findViewById(R.id.btn_noticia);
        Button previsaoTempo = this.findViewById(R.id.btn_previsao_tempo);
        Button formulario = this.findViewById(R.id.btn_formulario);

        noticia.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, NoticiaActivity.class);
            startActivity(intent);
        });
        previsaoTempo.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, PrevisaoTempoActivity.class);
            startActivity(intent);
        });
        formulario.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, FormularioActivity.class);
            startActivity(intent);
        });


    }
}

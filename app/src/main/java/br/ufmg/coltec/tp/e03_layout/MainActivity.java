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

        Button btnsplash = findViewById(R.id.btnsplash);
        Button btnnoticia = findViewById(R.id.btnnoticia);
        Button btnprevisao = findViewById(R.id.btnprevisao);
        final Button btnformulario = findViewById(R.id.btnformulario);

        btnsplash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentsplash = new Intent(MainActivity.this, SplashActivity.class);
                startActivity(intentsplash);
            }
        });

        btnnoticia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentnoticia = new Intent(MainActivity.this, NoticiaActivity.class);
                startActivity(intentnoticia);
            }
        });

        btnprevisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentprevisao = new Intent(MainActivity.this, PrevisaoActivity.class);
                startActivity(intentprevisao);
            }
        });

        btnformulario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentformulario = new Intent(MainActivity.this, FormularioActivity.class);
                startActivity(intentformulario);
            }
        });

    }
}

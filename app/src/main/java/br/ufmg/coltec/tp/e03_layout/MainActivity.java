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

        final Intent splashScreen = new Intent(MainActivity.this, SplashScreen.class);
        //startActivity(splashScreen);

        final Intent noticia = new Intent(MainActivity.this, Noticia.class);
        final Intent tempo = new Intent(MainActivity.this, PrevisaoDoTempo.class);
        final Intent formulario = new Intent(MainActivity.this, Formulario.class);

        Button button = findViewById(R.id.btnNoticia);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(noticia);
            }
        });
        Button button2 = findViewById(R.id.btnTempo);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(tempo);
            }
        });
        Button button3 = findViewById(R.id.btnFormulario);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(formulario);
            }
        });
    }
}

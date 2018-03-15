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

        Button buttons = findViewById(R.id.Botaos);
        Button buttonn = findViewById(R.id.Botaon);
        Button buttonp = findViewById(R.id.Botaop);
        Button buttonf = findViewById(R.id.Botaof);

        buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SplashScreenActivity.class);
                startActivity(intent);
            }
        });

        buttonn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,noticiaActivity.class);
                startActivity(intent);
            }
        });

        buttonp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,PrevisaoTempoActivity.class);
                startActivity(intent);
            }
        });

        buttonf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,formularioActivity.class);
                startActivity(intent);
            }
        });

    }
}

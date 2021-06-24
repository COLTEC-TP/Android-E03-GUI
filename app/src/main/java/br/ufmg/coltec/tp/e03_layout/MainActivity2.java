package br.ufmg.coltec.tp.e03_layout;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btn_previsao = findViewById(R.id.btn_previsao_main);
        Button btn_comentarios = findViewById(R.id.btn_comentarios_main);

        btn_previsao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, PrevisaoTempoActivity.class);
                startActivity(intent);
            }
        });


        btn_comentarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, DialogActivity.class);
                startActivity(intent);
            }
        });

    }
}
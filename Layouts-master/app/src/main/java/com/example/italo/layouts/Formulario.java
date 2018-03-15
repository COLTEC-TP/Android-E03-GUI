package com.example.italo.layouts;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Formulario extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        Button Bformulario = (Button) findViewById(R.id.Bforulario);

        Bformulario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Formulario.this, "Formulario Preenchido", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}

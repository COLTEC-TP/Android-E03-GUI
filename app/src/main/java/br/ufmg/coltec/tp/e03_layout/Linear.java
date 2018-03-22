package br.ufmg.coltec.tp.e03_layout;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Linear extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);

        Button enviar = findViewById(R.id.enviar);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(Linear.this, "Formulario enviado com sucesso", Toast.LENGTH_LONG);
                toast.show();
                Intent intent = new Intent(Linear.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
package br.ufmg.coltec.tp.e03_layout;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class formularioActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(this);

        alertBuilder.setTitle(R.string.form_espere);
        alertBuilder.setMessage(R.string.form_msg);

        alertBuilder.setPositiveButton(R.string.form_sim, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getBaseContext(), R.string.form_msgS, Toast.LENGTH_LONG).show();
            }
        });

        alertBuilder.setNegativeButton(R.string.form_nao, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getBaseContext(), R.string.form_msgN, Toast.LENGTH_LONG).show();
            }
        });

        final AlertDialog dialog = alertBuilder.create();

        Button bEnviar = findViewById(R.id.botao);

        bEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.show();
            }
        });
    }
}

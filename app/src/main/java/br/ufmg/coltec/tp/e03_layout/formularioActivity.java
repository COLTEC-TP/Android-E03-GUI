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
        alertBuilder.setTitle(R.string.FORMULARIO_submit);
        alertBuilder.setMessage(R.string.FORMULARIO_areYouSure);

        alertBuilder.setPositiveButton(R.string.FORMULARIO_PositiveButton, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getBaseContext(), R.string.FORMULARIO_MensagemEnviado, Toast.LENGTH_LONG).show();
            }
        });

        alertBuilder.setNegativeButton(R.string.FORMULARIO_NegativeButton, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getBaseContext(), R.string.FORMULARIO_MensagemNaoEnviada, Toast.LENGTH_LONG).show();
            }
        });

        final AlertDialog dialog = alertBuilder.create();
        Button enviar = findViewById(R.id.botaoEnviar);
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.show();
            }
        }
        );
    }
}

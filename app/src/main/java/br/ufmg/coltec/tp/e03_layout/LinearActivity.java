package br.ufmg.coltec.tp.e03_layout;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LinearActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);

        Button Enviar = (Button) findViewById(R.id.botaoEnviar);

        Enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder alertBuilder = new AlertDialog.Builder(LinearActivity.this);

                alertBuilder.setTitle(R.string.cuidado);
                alertBuilder.setMessage(R.string.pergunta);

                alertBuilder.setPositiveButton(R.string.sim, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getBaseContext(), R.string.confirma, Toast.LENGTH_LONG).show();
                    }
                });

                alertBuilder.setNegativeButton(R.string.cancela, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getBaseContext(), R.string.confirmaDados, Toast.LENGTH_LONG).show();
                    }
                });

                AlertDialog dialog = alertBuilder.create();
                dialog.show();
            }
        });
    }
}

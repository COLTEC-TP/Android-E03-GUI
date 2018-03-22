package br.ufmg.coltec.tp.e03_layout;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FormActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        final AlertDialog.Builder alertBuilder = new AlertDialog.Builder(this);
        Button enviar = findViewById(R.id.submit);

        alertBuilder.setIcon(R.drawable.ic_launcher_foreground);
        alertBuilder.setTitle(getResources().getText(R.string.send));
        alertBuilder.setMessage(getResources().getText(R.string.sure));
        alertBuilder.setPositiveButton(getResources().getText(R.string.sim), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getBaseContext(), getResources().getText(R.string.enviado), Toast.LENGTH_LONG).show();
            }
        });

        alertBuilder.setNegativeButton(getResources().getText(R.string.nao), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getBaseContext(), getResources().getText(R.string.voltando), Toast.LENGTH_LONG).show();
            }
        });

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog dialog = alertBuilder.create();
                dialog.show();
            }
            });
        }
    }

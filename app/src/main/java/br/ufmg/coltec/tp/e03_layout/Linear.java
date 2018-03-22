package br.ufmg.coltec.tp.e03_layout;

import android.app.AlertDialog;
import android.content.DialogInterface;
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
                AlertDialog.Builder alertbuilder = new AlertDialog.Builder(Linear.this);

                alertbuilder.setTitle("Confirmação");
                alertbuilder.setMessage("Confirma o comentário?");

                alertbuilder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getBaseContext(), "Comentário enviado", Toast.LENGTH_SHORT).show();
                    }
                });

                alertbuilder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getBaseContext(), "O comentário foi cancelado", Toast.LENGTH_SHORT).show();
                    }
                });

                AlertDialog dialog = alertbuilder.create();
                dialog.show();

            }
        });

    }
}
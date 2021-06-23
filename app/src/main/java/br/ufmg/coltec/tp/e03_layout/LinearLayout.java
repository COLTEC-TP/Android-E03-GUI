package br.ufmg.coltec.tp.e03_layout;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class LinearLayout extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        Button buttonSend = findViewById(R.id.btnSend);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Confirmação");
        builder.setMessage("Você tem certeza que quer enviar o formulário?");

        builder.setPositiveButton("Concordo", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(LinearLayout.this, "Envio confirmado!", Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("Discordo", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(LinearLayout.this, "Envio cancelado!", Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog dialog = builder.create();

        buttonSend.setOnClickListener(view -> {
            dialog.show();
        });
    }
}
package br.ufmg.coltec.tp.e03_layout;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FormularioActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        Button btnenviar = findViewById(R.id.btnenviar);

        btnenviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder alertBuilder = new AlertDialog.Builder(FormularioActivity.this);

                alertBuilder.setIcon(R.drawable.ic_launcher_foreground);
                alertBuilder.setTitle("Confirmação!");
                alertBuilder.setMessage("Confirmar envio?");

                alertBuilder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(FormularioActivity.this, "Formulário enviado", Toast.LENGTH_SHORT).show();
                    }
                });
                alertBuilder.setNegativeButton("Não", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(FormularioActivity.this, "Refaça o formulário", Toast.LENGTH_SHORT).show();
                    }
                });

                AlertDialog dialog = alertBuilder.create();
                dialog.show();

            }
        });

    }
}

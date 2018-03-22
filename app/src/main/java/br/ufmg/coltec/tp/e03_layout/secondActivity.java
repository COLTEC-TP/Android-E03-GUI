package br.ufmg.coltec.tp.e03_layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class secondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final EditText txtnome = findViewById(R.id.txt_nome);
        final EditText txtemail = findViewById(R.id.txt_email);
        final EditText txtcoment = findViewById(R.id.txt_coment);
        Button btnsub = findViewById(R.id.txt_sub);
        final AlertDialog.Builder alertBuilder = new AlertDialog.Builder(this);

        alertBuilder.setIcon(R.drawable.ic_launcher_foreground);
        alertBuilder.setTitle("Enviar mensagem");
        alertBuilder.setMessage("Você tem certeza?");

        alertBuilder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getBaseContext(), "Mensagem enviada", Toast.LENGTH_LONG).show();
            }
        });

        alertBuilder.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getBaseContext(), "Mensagem cancelada", Toast.LENGTH_LONG).show();
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog dialog = alertBuilder.create();
                dialog.show();
            }
        });
    }
}


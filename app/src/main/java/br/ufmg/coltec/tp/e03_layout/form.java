package br.ufmg.coltec.tp.e03_layout;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class form extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        Button btn = findViewById(R.id.envia);
        //alerta
        final AlertDialog.Builder alerta = new AlertDialog.Builder(this);
        //alerta textos
        alerta.setTitle(getResources().getText(R.string.confirmação));
        alerta.setMessage(getResources().getText(R.string.confirmaTxt));
        //butões do alerta
        alerta.setPositiveButton(getResources().getText(R.string.sim), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getBaseContext(), getResources().getText(R.string.envio), Toast.LENGTH_LONG).show();
            }
        });
        alerta.setNegativeButton(getResources().getText(R.string.nao), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getBaseContext(), getResources().getText(R.string.cancelamento), Toast.LENGTH_LONG).show();
            }
        });


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog dialog = alerta.create();
                dialog.show();

            }
        });
    }
}

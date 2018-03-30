package br.ufmg.coltec.tp.e03_layout;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.net.sip.SipSession;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Formulario extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        Button btn_enviar = findViewById(R.id.enviar);

        btn_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder confirmar = alerta(
                        getResources().getString(R.string.submit),
                        getResources().getString(R.string.confirm));
                confirmar.show();
            }
        });
    }

    private AlertDialog.Builder alerta(String title, String msg) {
        String positive = getResources().getString(R.string.positive),
                negative = getResources().getString(R.string.negative);
        return new AlertDialog.Builder(this)
                .setTitle(title)
                .setMessage(msg)
                .setPositiveButton(positive, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Formulario.this,
                                getResources().getString(R.string.rate_ok),
                                Toast.LENGTH_SHORT)
                                .show();
                        finish();
                    }
                })
                .setNegativeButton(negative, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Formulario.this,
                                getResources().getString(R.string.rate_canceled),
                                Toast.LENGTH_SHORT)
                                .show();
                    }
                });
    }
}

package br.ufmg.coltec.tp.e03_layout;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FormActivity extends Activity {
    @BindView(R.id.submit_form_btn)
    Button submitForm;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        ButterKnife.bind(this);

        final AlertDialog.Builder alertBuilder = new AlertDialog.Builder(this);

        submitForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertBuilder.setIcon(R.drawable.ic_check_black_24dp);
                alertBuilder.setTitle("Confirmação");
                alertBuilder.setMessage("Tem certeza que quer continuar?");

                alertBuilder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getBaseContext(), "Obrigado pelo comentário!", Toast.LENGTH_LONG).show();
                    }
                });

                alertBuilder.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getBaseContext(), "Comentário Cancelado!", Toast.LENGTH_LONG).show();
                    }
                });

                AlertDialog dialog = alertBuilder.create();
                dialog.show();
            }
        });

    }
}

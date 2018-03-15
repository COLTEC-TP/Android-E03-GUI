package br.ufmg.coltec.tp.e03_layout;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FormularioActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        Button btn = findViewById(R.id.btn_enviar);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertBuilder = new AlertDialog.Builder(FormularioActivity.this);

                alertBuilder.setIcon(R.drawable.ic_launcher_foreground);
                alertBuilder.setTitle("Adicionando Comentário");
                alertBuilder.setMessage("Você tem certeza?");

                alertBuilder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getBaseContext(), "Comentário adicionado", Toast.LENGTH_LONG).show();
                    }
                });

                alertBuilder.setNegativeButton("Não", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getBaseContext(), "Comentário não foi adicionado", Toast.LENGTH_LONG).show();
                    }
                });

                AlertDialog dialog = alertBuilder.create();
                dialog.show();
            }
        });
    }

}

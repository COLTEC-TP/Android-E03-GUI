package br.ufmg.coltec.tp.e03_layout;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class LinearActivity extends AppCompatActivity {

    Button send;
    EditText name, email, coment;
    RadioGroup note;
    AlertDialog.Builder alertBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);

        name = findViewById(R.id.edtName);
        email = findViewById(R.id.edtEmail);
        coment = findViewById(R.id.edtComent);
        note = findViewById(R.id.rgNote);
        send = findViewById(R.id.btnSend);
    }
    public void send(View view){

        alertBuilder = new AlertDialog.Builder(this);

        alertBuilder.setTitle(R.string.dlg_Title);
        alertBuilder.setMessage(R.string.dlg_Message);

        alertBuilder.setPositiveButton(R.string.dlg_Positive, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getBaseContext(), R.string.txt_Positive, Toast.LENGTH_LONG).show();
                name.setText("");
                email.setText("");
                coment.setText("");
                note.clearCheck();
            }
        });
        alertBuilder.setNegativeButton(R.string.dlg_Negative, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getBaseContext(), R.string.txt_Negative, Toast.LENGTH_LONG).show();
                name.setText("");
                email.setText("");
                coment.setText("");
                note.clearCheck();
            }
        });
        AlertDialog dialog = alertBuilder.create();
        dialog.show();
    }
}
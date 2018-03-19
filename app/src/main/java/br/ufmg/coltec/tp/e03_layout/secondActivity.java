package br.ufmg.coltec.tp.e03_layout;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class secondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        final EditText txtnome = findViewById(R.id.txt_nome);
        final EditText txtemail = findViewById(R.id.txt_email);
        final EditText txtcoment = findViewById(R.id.txt_coment);
    }
}


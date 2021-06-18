package br.ufmg.coltec.tp.e03_layout;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import static android.view.Gravity.TOP;

public class FormActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        Button btnSend = this.findViewById(R.id.form_btn_send);

        btnSend.setOnClickListener(view -> {
            Toast toast = Toast.makeText(FormActivity.this, R.string.form_toast, Toast.LENGTH_SHORT);
            toast.setGravity(TOP, 0, 200);
            toast.show();
        });
    }
}
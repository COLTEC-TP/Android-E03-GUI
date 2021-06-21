package br.ufmg.coltec.tp.e03_layout;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import static android.view.Gravity.BOTTOM;

public class FormActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        Button btnSend = this.findViewById(R.id.form_btn_send);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle(R.string.form_dialog_title);
        builder.setMessage(R.string.form_dialog_text);
        builder.setIcon(R.drawable.ic_launcher_background);
        builder.setPositiveButton(R.string.form_dialog_yes, (dialogInterface, i) -> {
            Toast toast = Toast.makeText(FormActivity.this, R.string.form_toast_yes, Toast.LENGTH_SHORT);
            toast.setGravity(BOTTOM, 0, 200);
            toast.show();
        });
        builder.setNegativeButton(R.string.form_dialog_no, (dialogInterface, i) -> {
            Toast toast = Toast.makeText(FormActivity.this, R.string.form_toast_no, Toast.LENGTH_SHORT);
            toast.setGravity(BOTTOM, 0, 200);
            toast.show();
        });
        AlertDialog dialog = builder.create();

        btnSend.setOnClickListener(view -> {
            dialog.show();
        });
    }
}
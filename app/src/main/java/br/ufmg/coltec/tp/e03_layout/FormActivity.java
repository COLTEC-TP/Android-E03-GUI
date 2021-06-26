package br.ufmg.coltec.tp.e03_layout;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class FormActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        final Button btn_breaking_news = findViewById(R.id.btn_submit);
        btn_breaking_news.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(FormActivity.this);
                alertDialog.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton){
                                Intent intent = new Intent(FormActivity.this, FormActivity.class);
                                startActivity(intent);
                                finish();
                            }
                        });
                alertDialog.setTitle("Submit");
                alertDialog.setMessage("Are you sure you want to send this form?");
                alertDialog.create();
                alertDialog.show();
            }
        });
    }
}

package br.ufmg.coltec.tp.e03_layout;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import static android.view.View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;

public class FormularioActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        EditText editText = findViewById(R.id.txt_edit);
        editText.setFilters( new InputFilter[]{ new MinMaxFilter( "1" , "5" )}) ;
    }
}
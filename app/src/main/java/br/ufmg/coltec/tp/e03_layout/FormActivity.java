package br.ufmg.coltec.tp.e03_layout;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.NumberPicker;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FormActivity extends Activity {
    @BindView(R.id.np)
    NumberPicker np;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        ButterKnife.bind(this);
        np.setMinValue(1);
        np.setMaxValue(5);
    }
}

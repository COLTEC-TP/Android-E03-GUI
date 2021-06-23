package br.ufmg.coltec.tp.e03_layout;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnFrame, btnRelative, btnTable, btnLinear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFrame = findViewById(R.id.btnFrame);
        btnRelative = findViewById(R.id.btnRelative);
        btnTable = findViewById(R.id.btnTable);
        btnLinear = findViewById(R.id.btnLinear);

    }

    public void frameActivity (View view){
        Intent intent = new Intent (MainActivity.this, FrameActivity.class);
        startActivity(intent);
    }
    public void relativeActivity (View view){
        Intent intent = new Intent (MainActivity.this, RelativeActivity.class);
        startActivity(intent);
    }
    public void tableActivity (View view){
        Intent intent = new Intent (MainActivity.this, TableActivity.class);
        startActivity(intent);
    }
    public void linearActivity (View view){
        Intent intent = new Intent (MainActivity.this, LinearActivity.class);
        startActivity(intent);
    }



}

package br.ufmg.coltec.tp.e03_layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button frameLayout = findViewById(R.id.buttonFrameLayout);

        frameLayout.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, FrameLayout.class);
            startActivity(intent);
        });

    }
}

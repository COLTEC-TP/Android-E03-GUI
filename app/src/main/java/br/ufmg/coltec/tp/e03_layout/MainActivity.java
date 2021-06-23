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
        Button relativeLayout = findViewById(R.id.buttonRelativeLayout);
        Button tableLayout = findViewById(R.id.buttonTableLayout);
        Button linearLayout = findViewById(R.id.buttonLinearLayout);

        frameLayout.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, FrameLayout.class);
            startActivity(intent);
        });

        relativeLayout.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, RelativeLayout.class);
            startActivity(intent);
        });

        tableLayout.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, TableLayout.class);
            startActivity(intent);
        });

        linearLayout.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, LinearLayout.class);
            startActivity(intent);
        });
    }
}

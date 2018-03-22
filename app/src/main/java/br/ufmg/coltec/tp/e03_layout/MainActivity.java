package br.ufmg.coltec.tp.e03_layout;


        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

        import static android.content.ContentValues.TAG;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnform = findViewById(R.id.txt_form);
        Button btnprev = findViewById(R.id.txt_prev);
        Button btnnot = findViewById(R.id.txt_not);
        Button btnsplash = findViewById(R.id.txt_splash);


        btnform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, secondActivity.class);

                startActivity(intent);

            }
        });

        btnsplash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, thirdActivity.class);

                startActivity(intent);

            }
        });

        btnnot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, fourthActivity.class);

                startActivity(intent);

            }
        });

        btnprev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, fifithActivity.class);

                startActivity(intent);

            }
        });

    }
}

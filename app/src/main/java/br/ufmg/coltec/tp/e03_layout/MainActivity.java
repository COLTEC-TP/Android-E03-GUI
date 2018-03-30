package br.ufmg.coltec.tp.e03_layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final Button weather = findViewById(R.id.weather);
        weather.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, Weather.class);
                startActivity(intent1);
            }

        });

        final Button form = findViewById(R.id.form);
        form.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, Form.class);
                startActivity(intent2);
            }

        });

        final Button splash = findViewById(R.id.splash);
        splash.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this, SplashScreen.class);
                startActivity(intent3);
            }

        });


        final Button news = findViewById(R.id.news);
        news.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent4 = new Intent(MainActivity.this, News.class);
                startActivity(intent4);
            }

        });

    }
}

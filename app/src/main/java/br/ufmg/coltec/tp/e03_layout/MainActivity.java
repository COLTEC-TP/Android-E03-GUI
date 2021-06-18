package br.ufmg.coltec.tp.e03_layout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNews = this.findViewById(R.id.btn_news);
        Button btnWeather = this.findViewById(R.id.btn_weather);
        Button btnForm = this.findViewById(R.id.btn_form);

        btnNews.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, NewsActivity.class);
            startActivity(intent);
        });
        btnWeather.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, WeatherActivity.class);
            startActivity(intent);
        });
        btnForm.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, FormActivity.class);
            startActivity(intent);
        });


    }
}

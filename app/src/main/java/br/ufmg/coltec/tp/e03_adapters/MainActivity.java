package br.ufmg.coltec.tp.e03_adapters;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.lista);
        listView.setAdapter(new PlaceAdapter(this.getBaseContext()));
    }
}

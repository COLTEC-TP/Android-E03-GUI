package br.ufmg.coltec.tp.e03_adapters;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //ligar listview e adapter
        ListView PlaceListView = findViewById(R.id.placeView);
        PlaceListView.setAdapter(new MyAdapter(this));

    }
}

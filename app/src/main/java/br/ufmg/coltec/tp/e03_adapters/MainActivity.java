package br.ufmg.coltec.tp.e03_adapters;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place("Coliseu", R.drawable.coliseu, 14000.0, 4.7,
                " É um anfiteatro oval localizado no centro da cidade de Roma, capital da Itália."));
        places.add(new Place("Machu Picchu", R.drawable.machu_picchu, 2000.0, 4.8,
                "É uma cidade pré-colombiana bem conservada, localizada no topo de uma montanha, " +
                        "a 2400 metros de altitude"));
        places.add(new Place("Cristo Redentor", R.drawable.cristo_redentor, 462.0,4.7,
                "É uma estátua art " +
                "déco que retrata Jesus Cristo, localizada no topo do morro do Corcovado"));
        places.add(new Place("Muralha da China", R.drawable.muralha_china, 24000.0, 4.2,
                "Grande Muralha da China é uma série de fortificações feitas de pedra, " +
                        "tijolo, terra compactada, madeira e outros materiais"));
        places.add(new Place("Taj Mahal", R.drawable.taj_mahal, 20000.0, 4.6,
                "É um mausoléu situado em Agra, na Índia, sendo o mais conhecido" +
                        " dos monumentos do país."));

        PlaceAdapter itemsAdapter = new PlaceAdapter(MainActivity.this, places);
        ListView listView = (ListView) findViewById(R.id.place_list);
        listView.setAdapter(itemsAdapter);

    }
}

package br.ufmg.coltec.tp.e03_adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends BaseAdapter {
    private ArrayList<Place> places;
    private Context context;

    public PlaceAdapter(Context context){
        this.context = context;
        this.places = new ArrayList<>();
        Place place1 = new Place("Belo Horizonte", "Capital de Minas Gerais", R.drawable.ic_launcher_background, (double) 0, (float) 4.0);
        Place place2 = new Place("Salvador", "Capital do estado da Bahia", R.drawable.ic_launcher_background, (double) 1405, (float) 4.9);
        Place place3 = new Place("Ouro Preto", "Cidade histórica", R.drawable.ic_launcher_background, (double) 101, (float) 3.8);
        Place place4 = new Place("Guarapari", "Praia do mineiro", R.drawable.ic_launcher_background, (double) 534, (float) 3.2);
        Place place5 = new Place("Foz do Iguaçu", "Cidade turística conhecida pelas Cataratas do Iguaçu", R.drawable.ic_launcher_background, (double) 1476, (float) 4.8);

        places.add(place1);
        places.add(place2);
        places.add(place3);
        places.add(place4);
        places.add(place5);
    }

    @Override
    public int getCount() {
        return this.places.size();
    }

    @Override
    public Object getItem(int i) {
        return this.places.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Place place = this.places.get(i);
        View placeView = LayoutInflater.from(this.context).inflate(R.layout.list_item_place, viewGroup, false);

        TextView nome = placeView.findViewById(R.id.txt_place_name);
        TextView descricao = placeView.findViewById(R.id.txt_place_description);
        ImageView imagem = placeView.findViewById(R.id.img_place_photo);
        RatingBar nota = placeView.findViewById(R.id.rating);
        TextView distancia = placeView.findViewById(R.id.txt_place_distance);

        nome.setText(place.getName());
        descricao.setText(place.getDescription());
        imagem.setImageResource(place.getPhotoId());
        nota.setRating(place.getRate());
        distancia.setText(String.format("%s KM", place.getDistance()));

        return placeView;
    }
}

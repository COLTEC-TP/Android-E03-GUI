package br.ufmg.coltec.tp.e03_adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends BaseAdapter {

    private ArrayList<Place> places;
    private Context context;

    public PlaceAdapter(Context context){
        this.context = context;
        places = new ArrayList<>();
        this.places.add(new Place("Ouro Preto", R.drawable.ic_launcher_foreground,100.0, "Cidade histórica mais importante de Minas Gerais", 5.0));
        this.places.add(new Place("Belo Horizonte", R.drawable.ic_launcher_foreground,0.0, "Capital mineira", 4.0));
        this.places.add(new Place("Betim", R.drawable.ic_launcher_foreground,100000.0, "Cidade em Minas Gerais mais longe de Belo Horizonte", 2.2));
        this.places.add(new Place("Sabará", R.drawable.ic_launcher_foreground,20.0, "Cidade histórica localizada na região metropolitana de BH", 4.0));
        this.places.add(new Place("Salinas", R.drawable.ic_launcher_foreground,450.0, "Cidade conhecida pela produção de Cachaça", 4.5));
        this.places.add(new Place("Diamantina", R.drawable.ic_launcher_foreground,100.0, "Cidade histórica de Minas Gerais conhecida pela exploração de diamantes", 5.0));
        this.places.add(new Place("Mariana", R.drawable.ic_launcher_foreground,120.0, "Primeira cidade e primeira capital de Minas Gerais", 5.0));
    }

    @Override
    public int getCount() {
        return this.places.size();
    }

    @Override
    public Object getItem(int position) {
        return this.places.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup container) {
        Place place = this.places.get(position);

        convertView = LayoutInflater.from(this.context).inflate(R.layout.list_item_place, container, false);

        ImageView imgPlace = convertView.findViewById(R.id.img_place_photo);
        TextView txtName = convertView.findViewById(R.id.txt_place_name);
        TextView txtDescription = convertView.findViewById(R.id.txt_place_description);
        TextView txtDistance = convertView.findViewById(R.id.txt_place_distance);
        RatingBar ratPlace = convertView.findViewById(R.id.rating_place);

        imgPlace.setImageResource(place.getPhotoId());
        txtName.setText(place.getName());
        txtDescription.setText(place.getDescription());
        txtDistance.setText(String.format("%s", place.getDistance()) + " km");
        ratPlace.setRating(Float.parseFloat(place.getRate().toString()));

        return convertView;
    }
}

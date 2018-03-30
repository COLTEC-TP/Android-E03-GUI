package br.ufmg.coltec.tp.e03_adapters;

import android.view.LayoutInflater;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by riversong on 28/03/18.
 */

public class PlaceAdapter extends BaseAdapter{

    // lista que conterá a linguagens a serem exibidas
    private ArrayList<Place> places;
    private Context context;

    public PlaceAdapter(Context context) {
        this.context = context;
        places = new ArrayList<>();

        this.places.add(new Place("Belo Horizonte", R.mipmap.belo_horizonte, 0.6, 3.6));
        this.places.add(new Place("Fortaleza", R.mipmap.fortaleza, 10000.0, 2.5));
        this.places.add(new Place("Curitiba", R.mipmap.curitiba, 6000.0, 5.0));
        this.places.add(new Place("Campinas", R.mipmap.campinas, 1400.0, 4.5));


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

        View newView = LayoutInflater.from(this.context).inflate(R.layout.list_item_place, viewGroup, false);

        ImageView img = newView.findViewById(R.id.img_place_photo);
        TextView txt_placeName = newView.findViewById(R.id.txt_place_name);
        TextView txt_placeDistance = newView.findViewById(R.id.txt_place_distance);
        RatingBar ratingBar = newView.findViewById(R.id.ratingBar);

        txt_placeName.setText(place.getName());
        txt_placeDistance.setText(place.getDistance().toString() + "Km");
        ratingBar.setRating(place.getRate().floatValue());
        img.setImageResource(place.getPhotoId());

        return newView;

    }
}

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

import br.ufmg.coltec.tp.e03_adapters.Place;
import br.ufmg.coltec.tp.e03_adapters.R;

public class PlaceAdapter extends BaseAdapter {

    private ArrayList<Place> places;
    private Context context;

    public PlaceAdapter(Context context){
        this.context = context;
        this.places = new ArrayList<>();
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

        ImageView photoPlace = newView.findViewById(R.id.img_place_photo);
        TextView namePlace = newView.findViewById(R.id.img_place_photo);
        TextView textPlaceName = newView.findViewById(R.id.txt_place_name);
        RatingBar placeEvaluation = newView.findViewById(R.id.txt_place_name);
        TextView placeLocation = newView.findViewById(R.id.img_place_photo);

        photoPlace.setImageResource(place.getPhotoId());
        namePlace.setText(place.getName());
        textPlaceName.setText(place.getName());
        placeEvaluation.setRating(place.getRate());
        placeLocation.setText(place.getDistance());

        return newView;
    }
}


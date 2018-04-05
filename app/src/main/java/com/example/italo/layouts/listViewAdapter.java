package com.example.italo.layouts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import java.util.ArrayList;

import br.ufmg.coltec.tp.e03_adapters.R;


public class listViewAdapter extends BaseAdapter {
    private ArrayList<Place> places;
    private Context context;

    public listViewAdapter(Context context) {
        this.context = context;
        places = new ArrayList<>();
        places.add(new Place("São Paulo", "pogchamp", 123, 4.0, 3));
        places.add(new Place("Rio de Janeiro", "pogchamp", 321, 2.0, 5));
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

        // recupera  campos do item

        ImageView image = newView .findViewById(R.id.img_place_photo);
        TextView name = newView.findViewById(R.id.txt_place_name);
        TextView description = newView.findViewById(R.id.txt_place_description);
        RatingBar ratingBar = newView.findViewById(R.id.rating_bar);
        TextView distance = newView.findViewById(R.id.txt_place_distance);

        // define value cada campo

        image.setImageResource(R.drawable.ic_launcher_background);
        name.setText(place.getName());
        description.setText(place.getDescription());
        distance.setText(place.getDistance().toString());
        ratingBar.setRating(place.getRate());

        return newView;
    }
}

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
        places.add(new Place("São Paulo", "Proximo", R.drawable.ic_launcher_background, 120.0, 3));
        places.add(new Place("Rio de Janeiro", "Proximo", R.drawable.ic_launcher_background, 150.0, 4));
        places.add(new Place("Salvador", "Proximo", R.drawable.ic_launcher_background, 110.0, 4));
        places.add(new Place("Belo Horizonte", "Posição Atual", R.drawable.ic_launcher_background, 0.0, 5));
        places.add(new Place("Acre", "Longe", R.drawable.ic_launcher_background, 222.0, 2));
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

        // Recupera

        ImageView image = newView .findViewById(R.id.img_place_photo);
        TextView name = newView.findViewById(R.id.txt_place_name);
        TextView description = newView.findViewById(R.id.txt_place_description);
        RatingBar ratingBar = newView.findViewById(R.id.rating_bar);
        TextView distance = newView.findViewById(R.id.txt_place_distance);

        // Define value

        image.setImageResource(R.drawable.ic_launcher_background);
        name.setText(place.getName());
        description.setText(place.getDescription());
        distance.setText(place.getDistance().toString());
        ratingBar.setRating(place.getRate());

        return newView;
    }
}

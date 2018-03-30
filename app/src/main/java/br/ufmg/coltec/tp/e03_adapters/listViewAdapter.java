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

/**
 * Created by João Gabriel on 29/03/2018.
 */

public class listViewAdapter extends BaseAdapter {
    private ArrayList<Place> places;
    private Context context;

    public listViewAdapter(Context context) {
        this.context = context;
        places = new ArrayList<>();
        places.add(new Place("BH", "eh legal", 123, 4.0, 3));
        places.add(new Place("Belzonte", "eh doido", 321, 2.0, 5));
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

        // recupera a view do adapter que será customizada
        View newView = LayoutInflater.from(this.context).inflate(R.layout.list_item_place, viewGroup, false);

        // recupera cada um dos campos do item
        ImageView image = newView .findViewById(R.id.img_place_photo);
        TextView name = newView.findViewById(R.id.txt_place_name);
        TextView description = newView.findViewById(R.id.txt_place_description);
        RatingBar ratingBar = newView.findViewById(R.id.rating_bar);
        TextView distance = newView.findViewById(R.id.txt_place_distance);

        // define o valor de cada um dos campos
        image.setImageResource(R.drawable.ic_launcher_background);
        name.setText(place.getName());
        description.setText(place.getDescription());
        distance.setText(place.getDistance().toString());
        ratingBar.setRating(place.getRate());

        return newView;
    }
}

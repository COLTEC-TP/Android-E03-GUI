package com.example.a2016951707.android_e03_gui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import java.util.ArrayList;


import java.util.ArrayList;


class listViewAdapter extends BaseAdapter {
    private ArrayList<Place> places;
    private Context context;

    public listViewAdapter(Context context) {
        this.context = context;
        places = new ArrayList<>();
        places.add(new Place("Firelink",  R.drawable.firelink,1.0,4.5,"Nearby Treasure Trove - From the bonfire, go though an arched door opposite of the tree."));
        places.add(new Place("Anor Londo", R.drawable.norlondo,8.0,4.0,"Anor Londo is the legendary city of the gods. It was the throne of the Great Lord Gwyn and his brave knights."));
        places.add(new Place("Undead Burg", R.drawable.undeadburg,3.0,3.5,"At the top of the stairs are two Hollows. After you have dealt with them, look left."));
        places.add(new Place("Sen's Fortress", R.drawable.senfortress,4.0,1.0,"One of the biggest tricks to making this area a lot easier is luring its rather tough guardians into their own traps."));



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



        View newView = LayoutInflater.from(this.context).inflate(R.layout.activity_lista_lugares, viewGroup, false);

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
        ratingBar.setRating(place.getRate().floatValue());

        return newView;
    }
}
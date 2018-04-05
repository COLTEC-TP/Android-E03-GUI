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
 * Created by a2016951669 on 05/04/18.
 */

public class MainAdapter extends BaseAdapter {
//lista que conterá a linguagens a serem exibidas
    private ArrayList<Place> places;
    private Context context;

    public MainAdapter(Context context){
        this.context = context;
        this.places = new ArrayList<>();
        Place place1 = new Place("lugar",R.drawable.ic_launcher_background, "lugar legal", 5.6 ,0.0);
        this.places.add(place1);

    }
    @Override
    public int getCount(){
        return this.places.size();
    }
    @Override
    public  Object getItem(int i){
        return this.places.get(i);
    }
    @Override
    public long getItemId(int i){
        return i;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup){
        Place currentPlace = this.places.get(i);

        //        Recupera a view do adapter que será custumizada
        View newView = LayoutInflater.from(this.context).inflate(R.layout.list_item_place, viewGroup, false);

        //        Recupera cada um dos campos do item
        ImageView lblPhoto = newView.findViewById(R.id.img_place_photo);
        TextView lblNome = newView.findViewById(R.id.txt_place_name);
        TextView lblDescription = newView.findViewById(R.id.txt_place_description);
        TextView lblDistance = newView.findViewById(R.id.txt_place_distance);
        RatingBar lblStar = newView.findViewById(R.id.ratin_star);

//        Define o valor de cada um dos campos
        lblNome.setText(currentPlace.getName());
        lblDescription.setText(currentPlace.getDescription());
        lblDistance.setText(currentPlace.getDistance().toString() + " km");
        lblStar.setRating(currentPlace.getRate().floatValue());
        lblPhoto.setImageDrawable(this.context.getDrawable(currentPlace.getPhotoId()));

        return newView;
    }
}

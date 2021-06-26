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
 * Created by jemaf on 07/03/18.
 */
public class Place {

    private String name;        // nome do local
    private Integer photoId;    // id da foto do local
    private Integer distance;    // distância (em km)
    private Float rate;        // nota (1 a 5)

    /**
     * Construtor
     * @param name nome do local
     * @param photoId ID da foto do local (Retirado do R.drawable)
     * @param distance Distância do local em KM
     * @param rate Nota do local (1 a 5)
     */
    public Place(String name, Integer photoId, Integer distance, Float rate) {
        this.name = name;
        this.photoId = photoId;
        this.distance = distance;
        this.rate = rate;
    }

    /**
     * Construtor padrão
     */
    public Place() {
        this(null, null, null, null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhotoId() {
        return photoId;
    }

    public void setPhotoName(Integer photoId) {
        this.photoId = photoId;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public static class PlaceAdapter extends BaseAdapter{

        private ArrayList<Place> places;
        private Context context;

        public PlaceAdapter(Context context){
            this.context = context;
            places = new ArrayList<>();
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
}




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
        this.places = new ArrayList<>();
        //String name, Integer photoId, Double distance, Double rate
        this.places.add(new Place("Torre Eiffel", R.drawable.ic_torre_eiffel, 25.0, 5.0, "A torre, que é o edifício mais alto da cidade, é o monumento pago mais visitado do mundo, com milhões de pessoas frequentando-o anualmente. foi construída como o arco de entrada da Exposição Universal de 1889."));
        this.places.add(new Place("Deserto do Atacama", R.drawable.ic_atacama, 5000.0, 4.5, "Deserto de Atacama está localizado na região norte do Chile até a fronteira com o Peru. Com cerca de 1 000 km de extensão, é considerado o deserto mais alto do mundo."));
        this.places.add(new Place("Estádio Santiago Bernabéu", R.drawable.ic_bernabeu, 100000.0, 5.0, "O Estádio Santiago Bernabéu é um estádio de futebol localizado em Madrid, na Espanha, de propriedade do Real Madrid. Localizado no lugar do antigo estádio do Real Madrid, o Estádio Charmatín, o Santiago Bernabéu foi projetado por Luis Alemany Soler e Manuel Muñoz Monasterio."));
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

        TextView placeName = placeView.findViewById(R.id.txt_place_name);
        ImageView placeImage = placeView.findViewById(R.id.img_place_photo);
        TextView placeDescription = placeView.findViewById(R.id.txt_place_description);
        RatingBar placeRating = placeView.findViewById(R.id.rating);
        TextView placeDistance = placeView.findViewById(R.id.txt_place_distance);

        placeName.setText(place.getName());
        placeImage.setImageResource(place.getPhotoId());
        placeDescription.setText(place.getDescription());
        placeImage.setMaxHeight(5);
        placeImage.setMaxWidth(5);
        placeRating.setRating(place.getRate().floatValue());
        placeDistance.setText(place.getDistance().toString() + " KM");

        return placeView;
    }
}

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
import java.util.List;

public class PlaceAdapter extends BaseAdapter {

    private Context context;
    private List<Place> placeList;

    public PlaceAdapter(Context context) {
        this.context = context;
        this.placeList = new ArrayList<>();
        this.placeList.add(new Place("Belo Horizonte", "Capital de Minas Gerais", R.drawable.ic_launcher_background, 0.0, 4.3f));
        this.placeList.add(new Place("Contagem", "Região Metropolitana 1", R.drawable.ic_launcher_background, 17.12, 3.5f));
        this.placeList.add(new Place("Betim", "Região Metropolitana 2", R.drawable.ic_launcher_background, 31.1, 3.7f));
    }

    @Override
    public int getCount() {
        return this.placeList.size();
    }

    @Override
    public Object getItem(int i) {
        return this.placeList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        Place currentPlace = this.placeList.get(i);

        View placeView = LayoutInflater.from(this.context).inflate(R.layout.list_item_place, viewGroup, false);

        ImageView imgPlace = placeView.findViewById(R.id.img_place_photo);
        TextView lblName = placeView.findViewById(R.id.txt_place_name);
        TextView lblDescription = placeView.findViewById(R.id.txt_place_description);
        RatingBar rtgRate = placeView.findViewById(R.id.rtg_bar_rate);
        TextView lblDistance = placeView.findViewById(R.id.txt_place_distance);

        imgPlace.setImageResource(currentPlace.getPhotoId());
        lblName.setText(currentPlace.getName());
        lblDescription.setText(currentPlace.getDescription());
        rtgRate.setRating(currentPlace.getRate());
        lblDistance.setText(currentPlace.getDistance() + "Km");

        return placeView;
    }
}

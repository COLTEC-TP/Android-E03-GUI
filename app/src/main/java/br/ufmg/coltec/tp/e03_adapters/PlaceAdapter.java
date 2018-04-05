package br.ufmg.coltec.tp.e03_adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by a2016952827 on 27/03/18.
 */

public class PlaceAdapter extends BaseAdapter {

    private final Context context;
    private ArrayList<Place> lugares;

    public PlaceAdapter(Context context){
        this.context = context;
        lugares = new ArrayList<>();

        lugares.add(new Place("Lugar 1", R.drawable.ic_launcher_background,10.0, 5.0, "Descrição 1"));
        lugares.add(new Place("Lugar 2", R.drawable.ic_launcher_background,20.0, 4.0, "Descrição 2"));
        lugares.add(new Place("Lugar 3", R.drawable.ic_launcher_background,15.0, 4.5, "Descrição 3"));
        lugares.add(new Place("Lugar 4", R.drawable.ic_launcher_background,35.0, 3.0, "Descrição 4"));
        lugares.add(new Place("Lugar 5", R.drawable.ic_launcher_background,40.0, 2.0, "Descrição 5"));
        lugares.add(new Place("Lugar 6", R.drawable.ic_launcher_background,17.0, 1.5, "Descrição 6"));
    }

    @Override
    public int getCount() {
        return this.lugares.size();
    }

    @Override
    public Object getItem(int i) {
        return this.lugares.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Place lugar = this.lugares.get(i);

        View newView = LayoutInflater.from(this.context).inflate(R.layout.list_item_place, viewGroup, false);

        ImageView image = newView.findViewById(R.id.img_place_photo);
        TextView nome = newView.findViewById(R.id.txt_place_name);
        TextView description = newView.findViewById(R.id.txt_place_description);
        TextView distance = newView.findViewById(R.id.txt_place_distance);
        RatingBar avaliacao = newView.findViewById(R.id.rating);

        image.setImageDrawable(this.context.getDrawable(lugar.getPhotoId()));
        nome.setText(lugar.getName());
        distance.setText(lugar.getDistance().toString()+" Km");
        avaliacao.setRating(lugar.getRate().floatValue());
        description.setText(lugar.getDescription());

        return newView;
    }
}

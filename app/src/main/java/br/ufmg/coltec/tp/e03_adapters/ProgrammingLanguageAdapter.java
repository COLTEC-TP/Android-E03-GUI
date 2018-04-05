package br.ufmg.coltec.tp.e03_adapters;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class ProgrammingLanguageAdapter extends BaseAdapter {

    private ArrayList<Place> languages;
    private Context context;

    public ProgrammingLanguageAdapter(Context context) {

        Place lugar1 = new Place("Minas Gerais", "Um belo Estado, cheio de serras, cachoeiras, e claro, muita cachaça.", R.mipmap.minas, 100.0 , 5.0);
        Place lugar2 = new Place("Brasíia", "A capital do Brasil, um distrito bem reto, toda planejada, suja pela corrupção.", R.mipmap.brasilia, 150.5, 1.0);
        Place lugar3 = new Place("São Paulo", "Um estado Mais popular do Brasil, com a maior cidade do mundo em termos de tamanho.", R.mipmap.saopaulo, 200.0, 5.0);
        Place lugar4 = new Place("Rio de Janeiro", "Um estado cheio de praias lindas e uma natureza fenomenal.", R.mipmap.rio, 250.0, 5.0);
        Place lugar5 = new Place("Espirito Santo", "Um estado com ótimos climas, belas praias, porém Bem mais precária que os outros estados.", R.mipmap.espirito, 90.5, 3.0);

        this.context = context;
        languages = new ArrayList<>();
        languages.add(lugar1);
        languages.add(lugar2);
        languages.add(lugar3);
        languages.add(lugar4);
        languages.add(lugar5);
    }

    @Override
    public int getCount() {
        return this.languages.size();
    }

    @Override
    public Object getItem(int i) {
        return this.languages.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Place currentLanguage = this.languages.get(i);

        View newView = LayoutInflater.from(this.context).inflate(R.layout.list_item_place, viewGroup, false);

        TextView lblName = newView.findViewById(R.id.txt_place_name);
        TextView lblDiscription = newView.findViewById(R.id.txt_place_description);
        ImageView lblPhoto = newView.findViewById(R.id.img_place_photo);
        TextView lblDistance = newView.findViewById(R.id.txt_place_distance);
        RatingBar lblRate = newView.findViewById(R.id.rate);


        lblName.setText(currentLanguage.getName());
        lblDiscription.setText(currentLanguage.getDiscription());
        lblPhoto.setImageDrawable(this.context.getDrawable(Place.getPhotoId()));
        lblDistance.setText(currentLanguage.getDistance().toString());
        lblRate.setRating(currentLanguage.getRate().floatValue());


        return newView;
    }
}

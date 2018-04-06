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
 * Created by Guilherme Assis on 05/04/2018.
 */

public class MyAdapter extends BaseAdapter {

    private ArrayList<Place> lugar;
    private Context context;

    public MyAdapter(Context context) {
        this.context = context;
        lugar = new ArrayList<>();

        lugar.add(new Place("Floresta", "Floresta Aleatoria", R.drawable.imagem, 1000.0, 0.0));
        lugar.add(new Place("Fernando de Noronha", "Uma bela ilha!", R.drawable.noronha, 1000.0, 0.5));
        lugar.add(new Place("Floresta Amazonica", "Uma grande floresta", R.drawable.amazonia, 1000.0, 1.0));
        lugar.add(new Place("Dunas", "Dunas de Genipabu!", R.drawable.dunas, 1000.0, 1.5));
        lugar.add(new Place("Cataratas do Iguaçu", "Fica no parque Nacional do Iguaçu", R.drawable.cataratas, 1000.0, 2.0));
        lugar.add(new Place("Chapada Diamantina", "Um lugar incrivel!", R.drawable.diamantina, 1000.0, 2.5));
        lugar.add(new Place("Porto de Galinhas", "Cheio de Tartarugas!!", R.drawable.galinhas, 1000.0, 3.0));
        lugar.add(new Place("Gruta", "Gruta da lagoa azul", R.drawable.gruta, 1000.0, 3.5));
        lugar.add(new Place("Jalapão", "Parque Nacional do Jalapao", R.drawable.jalapao, 1000.0, 4.0));
        lugar.add(new Place("Lencois Maranhenses", "Um lugar magnifico!", R.drawable.lencois, 1000.0, 4.5));



    }
    @Override
    public int getCount() {
        return this.lugar.size();
    }
    @Override
    public Object getItem(int i) {
        return this.lugar.get(i);
    }
    @Override
    public long getItemId(int i) {
        return i;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        Place verLugar = this.lugar.get(i);
        View newView = LayoutInflater.from(this.context).inflate(R.layout.list_item_place, viewGroup, false);
        TextView distancia = newView.findViewById(R.id.txt_place_distance);
        TextView descricao = newView.findViewById(R.id.txt_place_description);
        ImageView foto = newView.findViewById(R.id.img_place_photo);
        TextView nome = newView.findViewById(R.id.txt_place_name);
        RatingBar avaliacao = newView.findViewById(R.id.avaliacao);

        descricao.setText(verLugar.getDescricao());
        avaliacao.setRating(verLugar.getRate().floatValue());
        nome.setText(verLugar.getName());
        foto.setImageResource(verLugar.getPhotoId());
        distancia.setText(verLugar.getDistance().toString());

        return newView;
    }
}

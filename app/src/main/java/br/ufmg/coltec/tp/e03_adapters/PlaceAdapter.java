package br.ufmg.coltec.tp.e03_adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends BaseAdapter {
    private ArrayList<Place> places;
    private Context context;

    public PlaceAdapter(Context context){
        this.context = context;
        this.places = new ArrayList<>();
        places.add(new Place("Machu Picchu", "Cidade histórica do povo Inca", R.drawable.ic_machu_picchu, 3133.98, 4.f));
        places.add(new Place("Alhambra", "Palácio árabe na cidade de Granada, ESP.", R.drawable.ic_alhambra, 7626.22, 5.f));
        places.add(new Place("Bariloche", "Cidade turística ao sudoeste da Argentina", R.drawable.ic_bariloche, 3498.84, 4.f));
        places.add(new Place("Coliseu", "Lugar de grandes espetáculos na época do Império Romano", R.drawable.ic_coliseu, 9318.41, 5.f));
        places.add(new Place("Muralha da China", "Simplesmente a maior muralha do mundo!", R.drawable.ic_muralha_china, 17105.55, 3.5f));
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

        TextView name = placeView.findViewById(R.id.txt_place_name);
        TextView description = placeView.findViewById(R.id.txt_place_description);
        ImageView image = placeView.findViewById(R.id.img_place_photo);
        RatingBar rating = placeView.findViewById(R.id.rating_bar);
        TextView distance = placeView.findViewById(R.id.txt_place_distance);

        name.setText(place.getName());
        description.setText(place.getDescription());
        image.setImageResource(place.getPhotoId());
        rating.setRating(place.getRate());
        distance.setText(String.format("%s KM", place.getDistance()));

        return placeView;
    }
}

package br.ufmg.coltec.tp.e03_adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

/**
 * Created by Germano Barcelos on 22/03/2018.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter (Context context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_item_place, parent, false);
        }

        Place currentPlace = getItem(position);


        ImageView photoImageView = (ImageView) convertView
                                                    .findViewById(R.id.img_place_photo);

        if (currentPlace.hasImage()) {
            photoImageView.setImageResource(currentPlace.getPhotoId());
            photoImageView.setVisibility(View.VISIBLE);
        } else {
            photoImageView.setVisibility(View.GONE);
        }

        TextView nameTextView = (TextView) convertView
                                                    .findViewById(R.id.txt_place_name);
        nameTextView.setText(currentPlace.getName());

        TextView descriptionTextView = (TextView) convertView
                                                    .findViewById(R.id.txt_place_description);
        descriptionTextView.setText(currentPlace.getDescription());

        TextView distanceTextView = (TextView) convertView
                                                    .findViewById(R.id.txt_place_distance);
        String distance = String.valueOf(currentPlace.getDistance()) + "KM";
        distanceTextView.setText(distance);

        RatingBar marksRatingBar = (RatingBar) convertView
                                                    .findViewById(R.id.rating_bar_marks_place);
        marksRatingBar.setRating(currentPlace.getRate().floatValue());

        return convertView;
    }
}

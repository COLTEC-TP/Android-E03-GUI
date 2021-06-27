package br.ufmg.coltec.tp.e03_adapters;

import android.widget.ListAdapter;

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

}




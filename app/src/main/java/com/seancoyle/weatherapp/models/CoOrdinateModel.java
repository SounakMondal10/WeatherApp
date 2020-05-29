package com.seancoyle.weatherapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CoOrdinateModel {

    @SerializedName("lon")
    @Expose
    private double lon;

    @SerializedName("lat")
    @Expose
    private double lat;


    public CoOrdinateModel() {
    }

    public CoOrdinateModel(double lon, double lat) {
        this.lon = lon;
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }
}

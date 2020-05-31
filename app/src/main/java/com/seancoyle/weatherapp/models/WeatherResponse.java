package com.seancoyle.weatherapp.models;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverter;
import androidx.room.TypeConverters;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.seancoyle.weatherapp.persistence.ListConverter;

import java.util.ArrayList;
import java.util.List;

@Entity(tableName = "weatherResponse")
public class WeatherResponse {

    @PrimaryKey (autoGenerate = true)
    long weatherResponseId;

    @SerializedName("cod")
    @Expose
    @ColumnInfo(name ="cod")
    private String cod;

    @SerializedName("message")
    @Expose
    @ColumnInfo(name ="message")
    private Long message;

    @SerializedName("cnt")
    @Expose
    @ColumnInfo(name ="cnt")
    private Long cnt;

    @SerializedName("list")
    @Expose
    @ColumnInfo(name ="list")
    @TypeConverters(ListConverter.class)
    private List<WeatherList> results;

    @SerializedName("city")
    @Expose
    @Ignore
    private City city;

    /**
     * No args constructor for use in serialization
     *
     */
    public WeatherResponse() {
    }

    public WeatherResponse(String cod, Long message, Long cnt, List<WeatherList> results, City city) {
        this.cod = cod;
        this.message = message;
        this.cnt = cnt;
        this.results = results;
        this.city = city;
    }



    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public Long getMessage() {
        return message;
    }

    public void setMessage(Long message) {
        this.message = message;
    }

    public Long getCnt() {
        return cnt;
    }

    public void setCnt(Long cnt) {
        this.cnt = cnt;
    }

    public List<WeatherList> getResults() {
        return results;
    }

    public void setResults(List<WeatherList> results) {
        this.results = results;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }


    @Override
    public String toString() {
        return "WeatherResponse{" +
                "cod='" + cod + '\'' +
                ", message=" + message +
                ", cnt=" + cnt +
                ", results=" + results +
                ", city=" + city +
                '}';
    }
}


package com.seancoyle.weatherapp.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity(tableName = "clouds")
public class Clouds {

    @PrimaryKey(autoGenerate = true)
    long cloudsId;

    @SerializedName("all")
    @Expose
    @ColumnInfo(name ="all")
    private int all;

    public Clouds() {
    }

    public Clouds(int all) {
        this.all = all;
    }

    public int getAll() {
        return all;
    }

    public void setAll(int all) {
        this.all = all;
    }

    @Override
    public String toString() {
        return "Clouds{" +
                "all=" + all +
                '}';
    }
}

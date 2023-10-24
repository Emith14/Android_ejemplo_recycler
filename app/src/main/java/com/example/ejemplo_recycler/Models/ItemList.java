package com.example.ejemplo_recycler.Models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ItemList implements Serializable {
    private String artist;

    private  int imgResource;

    private static Map<String, String> artistCustomDescriptions = new HashMap<>();

    public  ItemList(String artist, int imgResource){
        this.artist=artist;
        this.imgResource=imgResource;
    }

    public String getArtist(){
        return artist;
    }
    public String getDescription() {

        return artistCustomDescriptions.getOrDefault(artist, "Descripción por defecto");
    }

    public int getImgResource() {
        return imgResource;
    }

    public void setCustomDescription(String customDescription) {

        artistCustomDescriptions.put(artist, customDescription);
    }
}

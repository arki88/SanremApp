package arki.it.sanremoapp;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Songs {

    private String nome;
    private String artist;


    public Songs(){}
    public Songs(JSONObject songsJson) {
        try {
            nome = songsJson.getString("name");
            artist = songsJson.getString("artista");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public static ArrayList<Songs> getSongsListFromJson(JSONArray jsonArray){
        ArrayList<Songs> songs = new ArrayList<>();
        for (int i = 0; i<jsonArray.length();i++) {
            try {
                JSONObject songsJson = jsonArray.getJSONObject(i);
                songs.add(new Songs(songsJson));
            } catch (JSONException e) {
                e.printStackTrace();
            }


        }
        return songs;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



}
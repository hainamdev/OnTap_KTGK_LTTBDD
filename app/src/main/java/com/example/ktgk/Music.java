package com.example.ktgk;

public class Music {
    private String id;
    private int image;
    private String nameSong;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Music(String id, int image, String nameSong, String name) {
        this.id = id;
        this.image = image;
        this.nameSong = nameSong;
        this.name = name;
    }
}

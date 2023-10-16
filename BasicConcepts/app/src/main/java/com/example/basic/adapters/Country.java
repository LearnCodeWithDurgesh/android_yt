package com.example.basic.adapters;

import com.example.basic.R;

public class Country {

    private int countryId;
    private String name;

    private String about;

    private int image;

    public Country(int countryId, String name, String about) {
        this.countryId = countryId;
        this.name = name;
        this.about = about;
        image = R.drawable.in;
    }

    public Country(int countryId, String name, String about, int image) {
        this.countryId = countryId;
        this.name = name;
        this.about = about;
        this.image = image;
    }

    public Country() {

    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

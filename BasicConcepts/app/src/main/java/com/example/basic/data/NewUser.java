package com.example.basic.data;

public class NewUser {

    private String name;
    private int id;

    private String email;

    private String about;


    public NewUser(String name, int id, String email, String about) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.about = about;
    }

    public NewUser() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}

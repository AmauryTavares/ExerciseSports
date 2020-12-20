package com.example.exercisesports;

public class Time {

    private int id;
    private String name;
    private int strength;
    private int hash_name;
    private String image_path;

    public Time (int id, String name, int strength, int hash_name, String image_path) {
        this.id = id;
        this.name = name;
        this.strength = strength;
        this.hash_name = hash_name;
        this.image_path = image_path;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHash_name() {
        return hash_name;
    }

    public void setHash_name(int hash_name) {
        this.hash_name = hash_name;
    }

    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }

    public void calculateHashName() {
        String nameLower = this.name.toLowerCase().replace(" ", "");

        for (int i = 0; i < nameLower.length(); i++) {
            this.hash_name += nameLower.charAt(i) - 97;
        }
    }
}

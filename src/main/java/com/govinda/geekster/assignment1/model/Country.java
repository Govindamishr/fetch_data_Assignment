package com.govinda.geekster.assignment1.model;



public class Country {
    private String country_id;
    private double probability;

    public Country(){

    }

    public Country(String country_id, double probability) {
        this.country_id = country_id;
        this.probability = probability;
    }

    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }

    public double getProbability() {
        return probability;
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }
}

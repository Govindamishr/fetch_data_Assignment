package com.govinda.geekster.assignment1.service;

import com.govinda.geekster.assignment1.model.Country;

import java.util.List;


public class Assignment {

    private List<Country> country;
    private String name;

    public Assignment(){

    }

    public Assignment(List<Country> country, String name) {
        this.country = country;
        this.name = name;
    }

    public List<Country> getCountry() {
        return country;
    }

    public void setCountry(List<Country> country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

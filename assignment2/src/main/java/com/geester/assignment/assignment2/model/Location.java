package com.geester.assignment.assignment2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Location {

    private String postCode;
    private String country;
    private String countryAbbreviation;
    private List<Place> places;

}

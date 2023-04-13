package com.geester.assignment.assignment2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Place {
    private String placeName;
    private String longitude;
    private String state;
    private String stateAbbreviation;
    private String latitude;
}

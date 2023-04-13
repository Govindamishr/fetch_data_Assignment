package com.govinda.geekster.assignment1.rest;

import com.govinda.geekster.assignment1.model.Country;
import com.govinda.geekster.assignment1.service.Assignment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class CountryController {


    @GetMapping("/geekster")

    public Assignment getAssignment() {
        // Create an instance of the Assignment class and set the data
        Assignment assignment = new Assignment();
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("GH", 0.224));
        countries.add(new Country("PH", 0.084));
        countries.add(new Country("NG", 0.073));
        countries.add(new Country("US", 0.061));
        countries.add(new Country("NE", 0.034));
        assignment.setCountry(countries);
        assignment.setName("nathaniel");

        return assignment;
    }





}

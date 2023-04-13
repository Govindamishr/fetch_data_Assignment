package com.geester.assignment.assignment2.rest;

import com.geester.assignment.assignment2.model.Location;
import com.geester.assignment.assignment2.model.Place;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController

public class LocationController {
    @GetMapping("/location")
    public Location getLocationData() {
        // Fetch the data from the source (e.g., API call or database)
        // In this case, you can use the data provided in the JSON input
        Location location = new Location();
        location.setPostCode("33162");
        location.setCountry("United States");
        location.setCountryAbbreviation("US");

        Place place = new Place();
        place.setPlaceName("Miami");
        place.setLongitude("-80.183");
        place.setState("Florida");
        place.setStateAbbreviation("FL");
        place.setLatitude("25.9286");

        List<Place> places = new ArrayList<>();
        places.add(place);

        location.setPlaces(places);

        return location;
    }


}

package com.laval.projet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laval.projet.models.ExtractedData;
import com.laval.projet.services.BikerouteService;
import com.laval.projet.services.RestaurantService;

@RestController
public class ExtractedDataController {

    @Autowired
    private RestaurantService restaurantService;

    @Autowired
    private BikerouteService bikerouteService;

    @GetMapping("/extracted_data")
    public ExtractedData getExtractedData() {
        bikerouteService.loadBikeroutes();
        return new ExtractedData(restaurantService.getNbRestaurants(), bikerouteService.getNbPistesCyclables());
    }

}

package com.laval.projet.controllers;

import com.laval.projet.models.TransformedData;
import com.laval.projet.services.BikerouteService;
import com.laval.projet.services.RestaurantCategoryService;
import com.laval.projet.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransformedDataController {

    @Autowired
    private BikerouteService bikerouteService;

    @Autowired
    private RestaurantService restaurantService;

    @Autowired
    private RestaurantCategoryService restaurantCategoryService;

    @GetMapping("/transformed_data")
    public TransformedData getTransformedData(){
        restaurantService.loadRestaurants();
        bikerouteService.loadBikeroutes();
        restaurantCategoryService.loadRestaurantcategories();

        TransformedData transformedData = new TransformedData();
        transformedData.setRestaurants(restaurantService.getNbRestaurantPerCategories());
        transformedData.setLongueurCyclable(bikerouteService.getLongueurCyclable());

   
        return transformedData;
    }

}

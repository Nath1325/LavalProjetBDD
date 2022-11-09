package com.laval.projet.controllers;

import java.util.List;

import com.laval.projet.dto.RestaurantCategoryDTO;
import com.laval.projet.services.RestaurantCategoryService;
import com.laval.projet.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laval.projet.models.Restaurant;

@RestController
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @Autowired
    private RestaurantCategoryService restaurantCategoryService;

    @GetMapping("/restaurants")    
    public List<Restaurant> list() {
        return restaurantService.findAll();
    }
   
}

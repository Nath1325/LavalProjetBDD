package com.laval.projet.controllers;

import com.laval.projet.models.Restaurant;
import com.laval.projet.repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {
    @Autowired
    RestaurantRepository restaurantRepository;

    @GetMapping("/restaurants")
    public List<Restaurant> list() {
        return restaurantRepository.findAll();
    }

}

package com.laval.projet.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.laval.projet.models.Restaurant;
import com.laval.projet.repositories.RestaurantRepository;
import com.laval.projet.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/restaurants")
    public List<Restaurant> list() {
        return restaurantService.findAll();
    }


}

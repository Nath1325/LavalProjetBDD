package com.laval.projet.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.laval.projet.models.Restaurant;
import com.laval.projet.repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    @PostConstruct
    private void loadRestaurants() {
        ObjectMapper objectMapper = new ObjectMapper();

        List<Restaurant> restaurants = null;
        try {
            restaurants = Arrays.asList(objectMapper.readValue(Paths
                    .get("src/main/resources/restaurants.json")
                    .toFile(), Restaurant[].class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        restaurantRepository.saveAll(restaurants);
    }

    public List<Restaurant> findAll(){
        return restaurantRepository.findAll();
    }

}

package com.laval.projet.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.laval.projet.dto.RestaurantDTO;
import com.laval.projet.mapper.RestaurantMapper;
import com.laval.projet.models.Restaurant;
import com.laval.projet.repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    @PostConstruct
    private void loadRestaurants() {

        //if DB is not empty, then do not fetch new data
        if (this.getNbRestaurants() != 0 ) return;

        //JSON to DTO Object
        ObjectMapper objectMapper = new ObjectMapper();

        List<RestaurantDTO> restaurantDTOS = null;
        try {
            restaurantDTOS = Arrays.asList(objectMapper.readValue(Paths
                    .get("src/main/resources/restaurants.json")
                    .toFile(), RestaurantDTO[].class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //DTO to model

        List<Restaurant> restaurants = new ArrayList<>();
        RestaurantMapper restaurantMapper = new RestaurantMapper();

        for (RestaurantDTO restaurantDTO : restaurantDTOS){
            restaurants.add(restaurantMapper.convertToRestaurant(restaurantDTO));
        }

        restaurantRepository.saveAll(restaurants);
    }

    public List<Restaurant> findAll(){
        return restaurantRepository.findAll();
    }

    public long getNbRestaurants(){
        return restaurantRepository.count();
    }

}

package com.laval.projet.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.laval.projet.dto.RestaurantDTO;
import com.laval.projet.mapper.RestaurantMapper;
import com.laval.projet.models.Restaurant;
import com.laval.projet.models.RestaurantCategory;
import com.laval.projet.repositories.RestaurantCategoryRepository;
import com.laval.projet.repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Autowired
    private RestaurantCategoryRepository restaurantCategoryRepository;


    public void loadRestaurants() {

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

    public HashMap<String, Integer> getNbRestaurantPerCategories(){
        HashMap<String,Integer> nbRestaurantPerCategories = new HashMap<>();

        //For each restaurant
        for (Restaurant restaurant : restaurantRepository.findAll()){
            //For each category
            for (RestaurantCategory restaurantCategory : restaurantCategoryRepository.findAll()){
                //if this category is in restaurant, then increment corresponding category
                if (restaurant.getCategories().contains(String.valueOf(restaurantCategory.getId()))){
                    nbRestaurantPerCategories.merge(restaurantCategoryRepository.findById(restaurantCategory.getId())
                            .get().getNom(),1,Integer::sum);
                }
            }
        }

        return nbRestaurantPerCategories;
    }

    public long getNbRestaurants(){
        return restaurantRepository.count();
    }

}

package com.laval.projet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laval.project.dto.RestaurantDto;
import com.laval.projet.services.Servicemap;

@RestController
public class RestaurantController {

    @Autowired
    private Servicemap serviceMap;

   // @GetMapping("/restaurants")
    @GetMapping(value = "/restaurant") 
    public List<RestaurantDto> list() {
    	System.out.println("DTODTO DTO");
    	System.out.println("hellooo restuarant");
    	 List <RestaurantDto> restaurantDtoList = serviceMap.getAllRestaurants();
    	System.out.println("restaurantDtoList>>okok>>>"+restaurantDtoList);
        return restaurantDtoList;
    }
    @GetMapping(value = "/listrestaurants") 
    public String  listRestaurants() {

    	 return "helloooo";
    }
}

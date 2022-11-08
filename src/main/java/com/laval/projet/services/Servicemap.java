/**
 * 
 */
package com.laval.projet.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laval.project.dto.RestaurantDto;
import com.laval.projet.models.Restaurant;

import mapper.Mapper;

@Service
public class Servicemap {
	@Autowired
	RestaurantService restaurantService;
	@Autowired
	Mapper mapper ;
	
	public List<RestaurantDto> getAllRestaurants() {
		
		List<RestaurantDto>restaurantDtoList=new ArrayList<>();
		
		for (Restaurant restaurant :restaurantService.findAll()) {
			
		    //convert the restaurantDto
		RestaurantDto restaurantDto =mapper.convertToRestaurantDto(restaurant);
		
		restaurantDtoList.add(restaurantDto);
		}
		
		return restaurantDtoList;
        
    }
	
	
}

/**
 * 
 */
package com.laval.projet.graph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.laval.projet.graph.models.RestaurantNode;
import com.laval.projet.graph.repositories.RestaurantGraphRepository;
import com.laval.projet.models.Restaurant;

/**
 * @author Faustin
 *
 */
public class RestaurantGraphServiceImpl implements RestaurantGraphService {
	
	   @Autowired
	    private RestaurantGraphRepository restaurantGraphRepository;

	@Override
	public Restaurant saveRestaurantNode(Restaurant restaurant) {
		restaurantGraphRepository.save(restaurant);
		return restaurant;
	}

	@Override
	public List<Restaurant> fetchRestaurantNodeList() {
		List<Restaurant> restaurants=restaurantGraphRepository.findAll();
		return restaurants;
	}

}

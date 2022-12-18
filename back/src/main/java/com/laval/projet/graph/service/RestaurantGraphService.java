/**
 * 
 */
package com.laval.projet.graph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laval.projet.graph.repositories.RestaurantGraphRepository;
import com.laval.projet.models.Restaurant;

/**
 * @author Faustin
 *
 */
@Service
public class RestaurantGraphService {

	@Autowired
	private RestaurantGraphRepository restaurantGraphRepository;

	public Restaurant saveRestaurantNode(Restaurant restaurant) {
		restaurantGraphRepository.save(restaurant);
		return restaurant;
	}

	public List<Restaurant> fetchRestaurantNodeList() {
		List<Restaurant> restaurants = restaurantGraphRepository.findAll();
		return restaurants;
	}
}

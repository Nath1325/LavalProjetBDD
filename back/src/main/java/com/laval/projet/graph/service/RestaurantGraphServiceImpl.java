/**
 * 
 */
package com.laval.projet.graph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laval.projet.graph.models.RestaurantNode;
import com.laval.projet.graph.repositories.RestaurantGraphRepository;
import com.laval.projet.models.Restaurant;

@Service
public class RestaurantGraphServiceImpl implements RestaurantGraphService {

	@Autowired
	private RestaurantGraphRepository restaurantGraphRepository;

	@Override
	public RestaurantNode saveRestaurantNode(RestaurantNode restaurantNode) {
		restaurantGraphRepository.save(restaurantNode);
		return restaurantNode;
	}

	@Override
	public List<RestaurantNode> fetchRestaurantNodeList() {
		List<RestaurantNode> restaurants = restaurantGraphRepository.findAll();
		return restaurants;
	}
}

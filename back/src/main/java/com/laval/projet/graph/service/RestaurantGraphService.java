package com.laval.projet.graph.service;

import java.util.List;

import com.laval.projet.models.Restaurant;

public interface RestaurantGraphService {

	// Save operation
   public  Restaurant saveRestaurantNode(Restaurant restaurantNode);
   
   // Read operation
   List<Restaurant> fetchRestaurantNodeList();
	

}

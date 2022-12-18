package com.laval.projet.graph.utils;

import java.util.List;

import com.laval.projet.graph.service.RestaurantGraphService;
import com.laval.projet.models.Restaurant;

public class RestaurantNodeGraphUtil {
	private static  RestaurantGraphService restaurantGraphService;

	public static void loadRestaurantGraph(List<Restaurant> restaurants) {

		for (Restaurant restaurant :restaurants) {
		
			//restaurantGraphService.saveRestaurantNode(restaurant);			

		}

	}

}

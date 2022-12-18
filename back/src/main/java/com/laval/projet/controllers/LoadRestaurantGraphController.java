/**
 * 
 */
package com.laval.projet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laval.projet.graph.service.RestaurantGraphService;
import com.laval.projet.models.Restaurant;

@RestController
public class LoadRestaurantGraphController {

	@Autowired
	private RestaurantGraphService restaurantGraphService;

	@GetMapping("/loadRestaurant")
	public void loadRestaurantGraph() {
		System.out.println("helloo");		
		//get  a list of restaurants to be loaded in Graph databse
		List<Restaurant> restaurants = null;

		for (Restaurant  restaurant : restaurants) {
			restaurantGraphService.saveRestaurantNode(restaurant);

		}

	}
}

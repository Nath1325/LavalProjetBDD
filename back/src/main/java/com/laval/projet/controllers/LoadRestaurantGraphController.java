/**
 * 
 */
package com.laval.projet.controllers;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laval.projet.graph.models.RestaurantNode;
import com.laval.projet.graph.service.RestaurantGraphService;
import com.laval.projet.models.Restaurant;
import com.laval.projet.services.RestaurantService;

@RestController
public class LoadRestaurantGraphController {
	@Autowired
	private RestaurantGraphService restaurantGraphService ;
	@Autowired
    private RestaurantService restaurantService;

	@GetMapping("/loadRestaurant")
	public void loadRestaurantGraph() {
		System.out.println("helloo");		
		//get  a list of restaurants to be loaded in Graph databse
		List<Restaurant> restaurants = restaurantService.findAll();		

		for (Restaurant  restaurant : restaurants) {	
			
			RestaurantNode restaurantNode=new RestaurantNode();
			BeanUtils.copyProperties(restaurant, restaurantNode);
			
			restaurantGraphService.saveRestaurantNode(restaurantNode);

		}
	}
}

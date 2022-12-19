package com.laval.projet.graph.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.laval.projet.graph.models.RestaurantNode;
@Service
public interface RestaurantGraphService {
	
	
	public RestaurantNode saveRestaurantNode(RestaurantNode restaurantNode);

	public List<RestaurantNode> fetchRestaurantNodeList() ;

}

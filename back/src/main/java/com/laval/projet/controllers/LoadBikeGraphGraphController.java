package com.laval.projet.controllers;
/**
 * 
 */

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laval.projet.graph.models.BikerouteNode;
import com.laval.projet.graph.service.BikerouteGraphService;
import com.laval.projet.models.Bikeroute;
import com.laval.projet.services.BikerouteService;

@RestController
public class LoadBikeGraphGraphController {
	@Autowired
	private BikerouteGraphService bikerouteGraphService ;
	@Autowired	
	private BikerouteService bikerouteService ;  

	@GetMapping("/loadBikeRoute")
	public void loadBikeRouteGraph() {
		System.out.println("helloo");		
		//get  a list ofbikeRoute  to be loaded in Graph databse
		List<Bikeroute> bikeRoutes = bikerouteService.findAll();		

		for (Bikeroute  bikeRoute : bikeRoutes) {	
			
			BikerouteNode bikeRouteNode=new BikerouteNode();
			BeanUtils.copyProperties(bikeRoute, bikeRouteNode);
			
			bikerouteGraphService.saveBikeRouteNode(bikeRouteNode);

		}
	}
}

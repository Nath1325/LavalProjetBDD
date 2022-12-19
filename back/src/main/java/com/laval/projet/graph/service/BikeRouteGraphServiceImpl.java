package com.laval.projet.graph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laval.projet.graph.models.BikerouteNode;
import com.laval.projet.graph.repositories.BikeRouteGraphRepository;
@Service
public class BikeRouteGraphServiceImpl implements BikerouteGraphService {
	@Autowired
	private BikeRouteGraphRepository bikeRouteGraphRepository;

	@Override
	public BikerouteNode saveBikeRouteNode(BikerouteNode bikerouteNode) {
		bikeRouteGraphRepository.save(bikerouteNode);
		return bikerouteNode;
	}

	@Override
	public List<BikerouteNode> fetchBikeRouiteNodeList() {
		List<BikerouteNode> bikeRouteNodes = bikeRouteGraphRepository.findAll();
		return bikeRouteNodes;
	}

}

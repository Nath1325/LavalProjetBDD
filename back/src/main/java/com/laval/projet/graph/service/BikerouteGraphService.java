package com.laval.projet.graph.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.laval.projet.graph.models.BikerouteNode;
@Service
public interface BikerouteGraphService{
	
	public BikerouteNode saveBikeRouteNode(BikerouteNode bikerouteNode);

	public List<BikerouteNode> fetchBikeRouiteNodeList() ;
	

}

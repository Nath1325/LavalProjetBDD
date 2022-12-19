package com.laval.projet.graph.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.laval.projet.graph.models.BikerouteNode;
@Repository
public interface BikeRouteGraphRepository extends Neo4jRepository<BikerouteNode, Double>{

}

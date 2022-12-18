package com.laval.projet.graph.repositories;



import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.laval.projet.models.Restaurant;

@Repository
public interface RestaurantGraphRepository extends Neo4jRepository<Restaurant,Double>{
	

}
package com.laval.projet.repositories;

import com.laval.projet.models.Restaurant;
import com.laval.projet.models.nodes.RestaurantNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface RestaurantNeo4jRepository extends Neo4jRepository<RestaurantNode,Long> {

}

package com.laval.projet.repositories;

import com.laval.projet.models.Bikeroute;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikerouteRepository extends MongoRepository<Bikeroute,Double> {
	
}
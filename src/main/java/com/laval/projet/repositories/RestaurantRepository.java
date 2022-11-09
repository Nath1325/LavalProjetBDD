package com.laval.projet.repositories;

import com.laval.projet.models.Restaurant;
import org.springframework.data.mongodb.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends MongoRepository<Restaurant,Double> {
}

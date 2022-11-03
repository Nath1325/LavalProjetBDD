package com.laval.projet.repositories;

import com.laval.projet.models.Restaurant;
import org.springframework.data.mongodb.repository.*;

public interface RestaurantRepository extends MongoRepository<Restaurant,Integer> {
}

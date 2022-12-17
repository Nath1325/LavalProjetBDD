/**
 * 
 */
package com.laval.projet.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.laval.projet.models.RestaurantCategory;


public interface RestaurantCategoryRepository extends MongoRepository<RestaurantCategory, Integer> {

}

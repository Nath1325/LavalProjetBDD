/**
 * 
 */
package com.laval.projet.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.laval.projet.models.RestaurantCategory;

/**
 * @author Faustin
 *
 */
public interface RestaurantCategRepository extends MongoRepository<RestaurantCategory, Integer> {

}

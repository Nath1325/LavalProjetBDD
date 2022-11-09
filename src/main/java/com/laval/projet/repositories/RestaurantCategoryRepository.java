/**
 * 
 */
package com.laval.projet.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.laval.projet.models.RestaurantCategory;
import org.springframework.stereotype.Repository;

/**
 * @author Faustin
 *
 */
@Repository
public interface RestaurantCategoryRepository extends MongoRepository<RestaurantCategory, Integer> {

}

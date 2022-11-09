/**
 * 
 */
package com.laval.projet.mapper;

import com.laval.projet.dto.RestaurantCategoryDto;
import com.laval.projet.models.RestaurantCategory;

/**
 * @author Faustin
 *
 */
public class RestaurantCategoryMappper {
	
	public RestaurantCategory convertToBikeRoute(RestaurantCategoryDto restaurantCategoryDto) {
		RestaurantCategory restaurantCateg=new RestaurantCategory();

		restaurantCateg.setId(restaurantCategoryDto.getId());
		restaurantCateg.setNom(restaurantCategoryDto.getNom());
		restaurantCateg.setParentId(restaurantCategoryDto.getParentId());
        return restaurantCateg;
    }

}

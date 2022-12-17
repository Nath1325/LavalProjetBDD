/**
 * 
 */
package com.laval.projet.mapper;

import com.laval.projet.models.Bikeroute;
import com.laval.projet.models.Restaurant;
import com.laval.projet.dto.RestaurantDTO;
import com.laval.projet.dto.BikerouteDTO;

/**
 * @author Faustin
 *
 */
public class RestaurantMapper {
	
	 public Restaurant convertToRestaurant(RestaurantDTO restaurantDTO) {
		 Restaurant restaurant = new Restaurant();
		 restaurant.setId(restaurantDTO.getId());
		 restaurant.setNom(restaurantDTO.getNom());
		 restaurant.setLatitude(restaurantDTO.getLatitude());
		 restaurant.setLongitude(restaurantDTO.getLongitude());
		 restaurant.setRue(restaurantDTO.getRue());
		 restaurant.setArrondissement(restaurantDTO.getArrondissement());
		 restaurant.setCodePostal(restaurantDTO.getCodePostal());
		 restaurant.setSiteWeb(restaurantDTO.getSiteWeb());
		 restaurant.setCategories(restaurantDTO.getCategories());
	     return restaurant;
	 }


	 public RestaurantDTO convertToRestaurantDTO(Restaurant restaurant) {
		 RestaurantDTO restaurantDTO = new RestaurantDTO();

		 restaurantDTO.setNom(restaurant.getNom());
		 restaurantDTO.setSiteWeb(restaurant.getSiteWeb());
		 restaurantDTO.setNumeroCivique(restaurant.getNumeroCivique());

		 restaurantDTO.setNumeroCivique(restaurant.getNumeroCivique());
		 restaurantDTO.setCodePostal(restaurant.getCodePostal());
		 restaurantDTO.setVille(restaurant.getVille());
		 restaurantDTO.setRue(restaurant.getRue());

	     return restaurantDTO;

	 }
}
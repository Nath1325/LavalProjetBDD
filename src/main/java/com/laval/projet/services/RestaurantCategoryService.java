/**
 * 
 */
package com.laval.projet.services;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.laval.projet.dto.RestaurantCategoryDto;
import com.laval.projet.repositories.RestaurantCategRepository;


/**
 * @author Faustin
 *
 */
public class RestaurantCategoryService {	
	   @Autowired
	    private RestaurantCategRepository restaurantCategRepository;
	   
	   private void loadRestaurantcategories() {

	        //if DB is not empty, then do not fetch new data
	        if (this.getNbersResturantcategories() != 0 ) return;
	        
	        //JSON to DTO Object
	        ObjectMapper objectMapper = new ObjectMapper();

	        List<RestaurantCategoryDto> restCategoryDtoS = null;
	        try {
	        	restCategoryDtoS = Arrays.asList(objectMapper.readValue(Paths
	                    .get("src/main/resources/restaurantscategories.json")
	                    .toFile(), RestaurantCategoryDto[].class));
	        } catch (IOException e) {
	            throw new RuntimeException(e);
	        }

	        //DTO to model
		   
		   
		   
		   
	   }   
	   
	   public long getNbersResturantcategories(){
	        return this.restaurantCategRepository.count();
	    }
	 
	   

	   
	    

}

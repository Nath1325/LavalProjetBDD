/**
 * 
 */
package com.laval.projet.services;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.laval.projet.mapper.RestaurantCategoryMappper;
import com.laval.projet.models.RestaurantCategory;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.laval.projet.dto.RestaurantCategoryDTO;
import com.laval.projet.repositories.RestaurantCategoryRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;


/**
 * @author Faustin
 *
 */
@Service
public class RestaurantCategoryService {	
	   @Autowired
	    private RestaurantCategoryRepository restaurantCategoryRepository;

	   @PostConstruct
	   private void loadRestaurantcategories() {

	        //if DB is not empty, then do not fetch new data
	        if (this.getNbersResturantcategories() != 0 ) return;
	        
	        //JSON to DTO Object
	        ObjectMapper objectMapper = new ObjectMapper();

	        List<RestaurantCategoryDTO> restCategoryDtoS = null;
	        try {
	        	restCategoryDtoS = Arrays.asList(objectMapper.readValue(Paths
	                    .get("src/main/resources/restaurantscategories.json")
	                    .toFile(), RestaurantCategoryDTO[].class));
	        } catch (IOException e) {
	            throw new RuntimeException(e);
	        }

	        //DTO to model
		   List<RestaurantCategory> restaurantCategories = new ArrayList<>();
		   RestaurantCategoryMappper restaurantCategoryMappper = new RestaurantCategoryMappper();

		   for (RestaurantCategoryDTO restaurantCategoryDTO : restCategoryDtoS){
			   restaurantCategories.add(restaurantCategoryMappper.convertToModel(restaurantCategoryDTO));
		   }

		   restaurantCategoryRepository.saveAll(restaurantCategories);
	   }
	   
	   public long getNbersResturantcategories(){
	        return this.restaurantCategoryRepository.count();
	    }
	 
	   

	   
	    

}

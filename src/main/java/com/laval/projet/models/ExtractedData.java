package com.laval.projet.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ExtractedData {
    private long nbRestaurants;
    private long nbSegments;
	/**
	 * @param nbRestaurants
	 * @param nbSegments
	 */
	public ExtractedData(long nbRestaurants, long nbSegments) {
		super();
		
		this.nbRestaurants = nbRestaurants;
		this.nbSegments = nbSegments;
	}
	
    
    
    
}

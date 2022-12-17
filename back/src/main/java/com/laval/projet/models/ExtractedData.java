package com.laval.projet.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExtractedData {
    private long nbRestaurants;
    private long nbSegments;

	public ExtractedData(long nbRestaurants, long nbSegments) {
		this.nbRestaurants = nbRestaurants;
		this.nbSegments = nbSegments;
	}
	
    
    
    
}

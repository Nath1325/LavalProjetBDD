/**
 * 
 */
package com.laval.projet.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bikeroute {

	private Double id;
	private  String type;
	private Properties properties;
	private Geometry geometry;

}

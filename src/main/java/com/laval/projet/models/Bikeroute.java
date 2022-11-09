/**
 * 
 */
package com.laval.projet.models;

import com.laval.projet.dto.GeometryDTO;
import com.laval.projet.dto.PropertiesDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

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

/**
 * 
 */
package com.laval.projet.models;

import com.laval.projet.dto.GeometryDTO;
import com.laval.projet.dto.PropertiesDTO;
import org.springframework.data.annotation.Id;

/**
 * @author Faustin
 *
 */
public class Bikeroute {

	private Double id;
	private  String type;
	private Properties properties;
	private Geometry geometry;


	public void setId(Double id) {
		this.id = id;
	}

	public Double getId() {
		return id;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public Geometry getGeometry() {
		return geometry;
	}
	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}
	
	
	
	
}

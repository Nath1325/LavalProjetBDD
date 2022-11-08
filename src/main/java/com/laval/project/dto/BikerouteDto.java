/**
 * 
 */
package com.laval.project.dto;

import com.laval.projet.models.Geometry;
import com.laval.projet.models.Properties;

/**
 * @author Faustin
 *
 */
public class BikerouteDto {
	private  String type;
	private  Properties properties;
	private  Geometry geometry;
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

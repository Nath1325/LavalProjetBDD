package com.laval.projet.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BikerouteDTO {
    public String type;
    public PropertiesDTO propertiesDTO;
    public GeometryDTO geometryDTO;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public PropertiesDTO getProperties() {
		return propertiesDTO;
	}
	public void setProperties(PropertiesDTO propertiesDTO) {
		this.propertiesDTO = propertiesDTO;
	}
	public GeometryDTO getGeometry() {
		return geometryDTO;
	}
	public void setGeometry(GeometryDTO geometryDTO) {
		this.geometryDTO = geometryDTO;
	}
}
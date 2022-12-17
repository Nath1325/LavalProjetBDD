package com.laval.projet.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@NoArgsConstructor
public class BikerouteDTO {
	@JsonProperty("type")
    public String type;
	@JsonProperty("properties")
    public PropertiesDTO propertiesDTO;
	@JsonProperty("geometry")
    public GeometryDTO geometryDTO;
}
package com.laval.projet.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.laval.projet.dto.BikerouteDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PistesCyclablesRootDTO {
    @JsonProperty("features")
    public ArrayList<BikerouteDTO> features;

	public BikerouteDTO[] getFeatures() {
		// TODO Auto-generated method stub
		return null;
	}
}





package com.laval.projet.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PropertiesDTO {
    @JsonProperty("NOM")
    public String nOM;
    @JsonProperty("OBJECTID")
    public Double oBJECTID;
    @JsonProperty("SHAPE__Length")
    public float sHAPE__Length;
}
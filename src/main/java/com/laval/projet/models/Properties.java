package com.laval.projet.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Properties {

    @JsonProperty("nom")
    private String nom;

    @JsonProperty("SHAPE__Length")
    private double shapeLenght;
}

package com.laval.projet.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Geometry {

    @JsonProperty("type")
    public String type;

    @JsonProperty("coordinates")
    public ArrayList<ArrayList<ArrayList<Double>>> coordinates;

}

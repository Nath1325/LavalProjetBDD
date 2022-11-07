package com.laval.projet.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PistesCyclablesRoot {
    @JsonProperty("features")
    public ArrayList<Bikeroute> features;
}

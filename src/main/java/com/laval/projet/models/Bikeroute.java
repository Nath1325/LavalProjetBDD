package com.laval.projet.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Bikeroute {
    public String type;
    public Properties properties;
    public Geometry geometry;
}
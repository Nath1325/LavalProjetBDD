package com.laval.projet.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Properties{
    public String name;
    @JsonProperty("NOM")
    public String nOM;
    @JsonProperty("OBJECTID")
    public int oBJECTID;
    @JsonProperty("SHAPE__Length")
    public double sHAPE__Length;
}
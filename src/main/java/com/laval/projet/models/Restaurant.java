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
public class Restaurant {

    @JsonProperty("ID")
    private Double id;
    @JsonProperty("Nom")
    private String nom;
    @JsonProperty("SiteWeb")
    private String siteWeb;
    @JsonProperty("NumeroCivique")
    private String numeroCivique;
    @JsonProperty("Rue")
    private String rue;
    @JsonProperty("CodePostal")
    private String codePostal;
    @JsonProperty("Arrondissement")
    private String arrondissement;
    @JsonProperty("Ville")
    private String ville;
    @JsonProperty("Latitude")
    private String latitude;
    @JsonProperty("Longitude")
    private String longitude;
    @JsonProperty("NumeroTelephone")
    private String numeroTelephone;

    public Restaurant(){}
}

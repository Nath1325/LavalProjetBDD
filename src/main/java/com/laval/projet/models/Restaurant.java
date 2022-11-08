/**
 * 
 */
package com.laval.projet.models;

import org.springframework.data.annotation.Id;

/**
 * @author Faustin
 *
 */
public class Restaurant {

    private Double id;
    private String nom;
   
    private String siteWeb;
  
    private String numeroCivique;
   
    private String rue;
   
    private String codePostal;
  
    private String arrondissement;
    
    private String ville;
   
    private String latitude;
   
    private String longitude;
 
    private String numeroTelephone;

	public Double getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSiteWeb() {
		return siteWeb;
	}

	public void setSiteWeb(String siteWeb) {
		this.siteWeb = siteWeb;
	}

	public String getNumeroCivique() {
		return numeroCivique;
	}

	public void setNumeroCivique(String numeroCivique) {
		this.numeroCivique = numeroCivique;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getArrondissement() {
		return arrondissement;
	}

	public void setArrondissement(String arrondissement) {
		this.arrondissement = arrondissement;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getNumeroTelephone() {
		return numeroTelephone;
	}

	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}

	public void setId(Double id) {
		this.id = id;
	}
}

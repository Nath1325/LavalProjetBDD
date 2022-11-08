/**
 * 
 */
package com.laval.project.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Faustin
 *
 */
public class RestaurantDto {
	    @JsonProperty("Nom")
	    private String nom;
	    @JsonProperty("SiteWeb")
	    private String siteWeb;
	    @JsonProperty("NumeroCivique")
	    private String numeroCivique;
	    @JsonProperty("Rue")
	    private String rue;
	    
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
	
	

}

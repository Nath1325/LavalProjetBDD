/**
 * 
 */
package com.laval.projet.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Faustin
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RestaurantCategoryDTO {
	@JsonProperty("ID")
	private  int id;
	@JsonProperty("Nom")
	private String nom;
	@JsonProperty("ParentID")
	private String parentId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

}

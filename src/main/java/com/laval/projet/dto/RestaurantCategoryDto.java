/**
 * 
 */
package com.laval.projet.dto;

/**
 * @author Faustin
 *
 */
public class RestaurantCategoryDto {
	private  String id;
	private String nom;
	private String parentId;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
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

/**
 * 
 */
package com.laval.projet.graph.models;

import com.laval.projet.models.Geometry;
import com.laval.projet.models.Properties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BikerouteNode {
	private Double id;
	private  String type;
	private Properties properties;
	private Geometry geometry;
}
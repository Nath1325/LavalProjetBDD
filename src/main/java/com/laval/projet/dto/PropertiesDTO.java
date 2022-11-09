package com.laval.projet.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PropertiesDTO {
    @JsonProperty("NOM")
    public String nOM;
    @JsonProperty("OBJECTID")
    public Double oBJECTID;
    @JsonProperty("SHAPE__Length")
    public float sHAPE__Length;
	public String getnOM() {
		return nOM;
	}
	public void setnOM(String nOM) {
		this.nOM = nOM;
	}
	public Double getoBJECTID() {
		return oBJECTID;
	}
	public void setoBJECTID(Double oBJECTID) {
		this.oBJECTID = oBJECTID;
	}
	public float getsHAPE__Length() {
		return sHAPE__Length;
	}
	public void setsHAPE__Length(float sHAPE__Length) {
		this.sHAPE__Length = sHAPE__Length;
	}
	public Object getNOM() {
		// TODO Auto-generated method stub
		return null;
	}
	public Double getOBJECTID() {
		// TODO Auto-generated method stub
		return null;
	}
}
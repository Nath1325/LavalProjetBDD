package com.laval.projet.mapper;

import com.laval.projet.dto.BikerouteDTO;
import com.laval.projet.dto.GeometryDTO;
import com.laval.projet.dto.PropertiesDTO;
import com.laval.projet.models.Bikeroute;
import com.laval.projet.models.Geometry;
import com.laval.projet.models.Properties;

public class BikerouteMapper {

    public Bikeroute convertToBikeRoute(BikerouteDTO bikerouteDTO) {
        Bikeroute bikeRoute=new Bikeroute();

        bikeRoute.setId(bikerouteDTO.getProperties().getOBJECTID());
        bikeRoute.setGeometry(GeometryDTOToModel(bikerouteDTO.getGeometry()));
        bikeRoute.setProperties(PropertiesDTOToModel(bikerouteDTO.getProperties()));
        bikeRoute.setType(bikerouteDTO.getType());

        return bikeRoute;
    }
    private Geometry GeometryDTOToModel(GeometryDTO geometryDTO){
        Geometry geometry = new Geometry();        
        //geometry.setCoordinates(geometryDTO.getCoordinates());
       // geometry.setType(geometryDTO.getType());
        return geometry;
    }

    private Properties PropertiesDTOToModel(PropertiesDTO propertiesDTO){
        Properties properties = new Properties();
       // properties.setName(propertiesDTO.getNOM());
       // properties.setShapeLenght(propertiesDTO.getSHAPE__Length());

        return properties;
    }
    



}

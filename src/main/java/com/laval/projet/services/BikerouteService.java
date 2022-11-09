package com.laval.projet.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.laval.projet.dto.BikerouteDTO;
import com.laval.projet.mapper.BikerouteMapper;
import com.laval.projet.mapper.RestaurantMapper;
import com.laval.projet.models.Bikeroute;
import com.laval.projet.dto.PistesCyclablesRootDTO;
import com.laval.projet.repositories.BikerouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service
public class BikerouteService {

    @Autowired
    private BikerouteRepository bikerouteRepository;

    @PostConstruct
    private void loadBikeroutes() {

        //if DB is not empty, then do not fetch new data
        if (this.getNbPistesCyclables() != 0 ) return;

        //JSON to DTO Object
        ObjectMapper objectMapper = new ObjectMapper();
        PistesCyclablesRootDTO pistesCyclablesRootDTO = null;

        try {
            pistesCyclablesRootDTO = objectMapper.readValue(Paths
                    .get("src/main/resources/PistesCyclables.json")
                    .toFile(), PistesCyclablesRootDTO.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //DTO to model

        List<Bikeroute> bikeroutes = new ArrayList<>();
        BikerouteMapper bikerouteMapper = new BikerouteMapper();

        for (BikerouteDTO bikerouteDTO : pistesCyclablesRootDTO.getFeatures()){
            bikeroutes.add(bikerouteMapper.convertToBikeRoute(bikerouteDTO));
        }

        bikerouteRepository.saveAll(bikeroutes);
    }

    public List<Bikeroute> findAll() {
        return this.bikerouteRepository.findAll();
    }

    public long getNbPistesCyclables(){
        return this.bikerouteRepository.count();
    }

    public float getLongueurCyclable(){
        float longueur = 0;
        for (Bikeroute bikeroute: bikerouteRepository.findAll()){
            longueur+=bikeroute.getProperties().getShapeLenght();
        }
        return longueur;
    }

}


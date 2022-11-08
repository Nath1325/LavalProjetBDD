package com.laval.projet.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.laval.projet.models.Bikeroute;
import com.laval.projet.models.PistesCyclablesRoot;
import com.laval.projet.repositories.BikerouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

@Service
public class BikerouteService {

    @Autowired
    private BikerouteRepository bikerouteRepository;

    @PostConstruct
    private void loadBikeroutes() {
        ObjectMapper objectMapper = new ObjectMapper();

        PistesCyclablesRoot pistesCyclablesRoot = null;

        try {
            pistesCyclablesRoot = objectMapper.readValue(Paths
                    .get("src/main/resources/PistesCyclables.json")
                    .toFile(), PistesCyclablesRoot.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(">>>>>>>>pistesCyclablesRoot"+pistesCyclablesRoot.toString());
      
        
        bikerouteRepository.saveAll(pistesCyclablesRoot.features);
    }

    public List<Bikeroute> findAll() {
        return this.bikerouteRepository.findAll();
    }

    public long getNbPistesCyclables(){
        return this.bikerouteRepository.count();
    }
}


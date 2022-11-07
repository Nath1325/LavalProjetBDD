package com.laval.projet.controllers;

import com.laval.projet.models.Bikeroute;
import com.laval.projet.services.BikerouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BikerouteController {
    @Autowired
    private BikerouteService bikerouteService;

    @GetMapping("/bikeroutes")
    public List<Bikeroute> list() {
        return bikerouteService.findAll();
    }
}

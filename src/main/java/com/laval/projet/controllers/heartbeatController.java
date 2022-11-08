package com.laval.projet.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laval.projet.models.Heartbeat;

@RestController
public class heartbeatController {

    @GetMapping("/heartbeat")
    public Heartbeat getHeartbeat() {
    	
        return new Heartbeat("Sherbrooke");
    }
    
	
}
package com.laval.projet.controllers;

import com.laval.projet.models.Heartbeat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class heartbeatController {
    @GetMapping("/heartbeat")
    public Heartbeat getHeartbeat() {
        return new Heartbeat("Québec");
    }
}
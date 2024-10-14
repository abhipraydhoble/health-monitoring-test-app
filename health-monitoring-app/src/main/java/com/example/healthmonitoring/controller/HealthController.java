package com.example.healthmonitoring.controller;

import com.example.healthmonitoring.model.HealthStatus;
import com.example.healthmonitoring.service.HealthService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    private final HealthService healthService;

    public HealthController(HealthService healthService) {
        this.healthService = healthService;
    }

    @GetMapping("/")
    public String home() {
        return "Welcome to the Health Monitoring Application!";
    }

    @GetMapping("/health")
    public HealthStatus getHealthStatus() {
        return healthService.checkHealth();
    }
}

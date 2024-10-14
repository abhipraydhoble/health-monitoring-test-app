package com.example.healthmonitoring.service;

import com.example.healthmonitoring.model.HealthStatus;
import org.springframework.stereotype.Service;

@Service
public class HealthService {

    public HealthStatus checkHealth() {
        // Perform any logic here (e.g., check DB connection, memory, etc.)
        return new HealthStatus("healthy", "Application is running smoothly");
    }
}

package com.example.healthmonitoring.model;

public class HealthStatus {
    private String status;
    private String message;

    public HealthStatus(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}

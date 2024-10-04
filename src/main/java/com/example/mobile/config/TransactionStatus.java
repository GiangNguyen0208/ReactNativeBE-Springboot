package com.example.mobile.config;

public enum TransactionStatus {
    PENDING("PENDING"),
    COMPLETED("COMPLETED"),
    FAILED("FAILED");

    private final String status;
    TransactionStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }
}

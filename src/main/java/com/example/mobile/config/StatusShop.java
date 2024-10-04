package com.example.mobile.config;

public enum StatusShop {
    CLOSE("CLOSE"),
    OPEN("OPEN");

    private final String status;

    StatusShop(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }
}

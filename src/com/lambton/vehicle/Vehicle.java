package com.lambton.vehicle;

import com.lambton.base.IDisplay;

public abstract class Vehicle implements IDisplay {
    protected String vehicleId;
    protected String brand;
    protected boolean isInsured;

    public Vehicle(String vehicleId, String brand, boolean isInsured) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.isInsured = isInsured;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vId) {
        this.vehicleId = vId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isInsured() {
        return isInsured;
    }

    public void setInsured(boolean insured) {
        isInsured = insured;
    }

    public abstract String getType();
}

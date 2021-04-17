package com.lambton.vehicle;

import com.lambton.utils.Color;

public class Car extends Vehicle{
    private Color color;

    public Car(String vehicleId, String brand, boolean isInsured, Color color) {
        super(vehicleId, brand, isInsured);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String getType() {
        return "Vehicle type is Car";
    }

    @Override
    public void display() {
        System.out.println("Vehicle Type        :"+this.getType());
        System.out.println("Vehicle Id          :"+this.getVehicleId());
        System.out.println("Vehicle Brand       :"+this.getBrand());
        System.out.println("Vehicle is insured  :"+this.isInsured());
        System.out.println("Vehicle color       :"+this.getColor());
    }
}

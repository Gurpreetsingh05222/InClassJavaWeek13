package com.lambton.vehicle;

public class MotorCycle extends Vehicle{
    private int noOfSeats;

    public MotorCycle(String vehicleId, String brand, boolean isInsured, int noOfSeats) {
        super(vehicleId, brand, isInsured);
        this.noOfSeats = noOfSeats;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    @Override
    public String getType() {
        return "Vehicle type is MotorCycle";
    }

    @Override
    public void display() {
        System.out.println("Vehicle Type        :"+this.getType());
        System.out.println("Vehicle Id          :"+this.getVehicleId());
        System.out.println("Vehicle Brand       :"+this.getBrand());
        System.out.println("Vehicle is insured  :"+this.isInsured());
        System.out.println("Vehicle Seats Count :"+this.getNoOfSeats());
    }
}

package com.lambton.base;

import com.lambton.exception.InvalidFirstName;
import com.lambton.utils.Gender;
import com.lambton.vehicle.Vehicle;

public abstract class Person implements IDisplay{
    protected int id;
    protected String firstName;
    protected String lastName;
    protected Gender gender;
    protected Vehicle vehicle;

    public Person(int id, String firstName, String lastName, Gender gender, Vehicle vehicle) throws InvalidFirstName {
        this.id = id;
        if(InvalidFirstName.validateFirstName(firstName)){
            this.firstName = firstName;
        }
        else {
            throw new InvalidFirstName("InvalidFirstName Exception:: First Name length less than 10: "+ firstName.length());
        }
        this.lastName = lastName;
        this.gender = gender;
        this.vehicle = vehicle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws InvalidFirstName {

        if(InvalidFirstName.validateFirstName(firstName)){
            this.firstName = firstName;
        }
        else{
            throw new InvalidFirstName("InvalidFirstName Exception:: First Name length less than 10: "+ firstName.length());
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public abstract String getType();
}

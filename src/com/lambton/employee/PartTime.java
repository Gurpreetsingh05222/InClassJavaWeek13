package com.lambton.employee;

import com.lambton.exception.InvalidFirstName;
import com.lambton.exception.InvalidSalaryException;
import com.lambton.utils.Gender;
import com.lambton.vehicle.Vehicle;

public class PartTime extends Faculty{
    private float noOfHoursWorked;
    private float payPerHour;

    public PartTime(int id, String firstName, String lastName, Gender gender, Vehicle vehicle, float totalSalary, String department, float noOfHoursWorked, float payPerHour) throws InvalidSalaryException, InvalidFirstName {
        super(id, firstName, lastName, gender, vehicle, totalSalary, department);
        this.noOfHoursWorked = noOfHoursWorked;
        this.payPerHour = payPerHour;
    }

    public float getNoOfHoursWorked() {
        return noOfHoursWorked;
    }

    public void setNoOfHoursWorked(float noOfHoursWorked) {
        this.noOfHoursWorked = noOfHoursWorked;
    }

    public float getPayPerHour() {
        return payPerHour;
    }

    public void setPayPerHour(float payPerHour) {
        this.payPerHour = payPerHour;
    }

    @Override
    public String getType() {
        return "Part time faculty";
    }

    @Override
    public void display() {
        System.out.println("Employee Type            :"+this.getType());
        System.out.println("Employee Id              :"+this.getId());
        System.out.println("Employee First Name      :"+this.getFirstName());
        System.out.println("Employee Last Name       :"+this.getLastName());
        System.out.println("Employee Gender          :"+this.getGender());
        System.out.println("Employee Department      :"+this.getDepartment());
        System.out.println("Employee Hours Worked    :"+this.getNoOfHoursWorked());
        System.out.println("Employee Pay Per Hour    :"+this.getPayPerHour());
        //System.out.println("Total Salary    :");

        if(this.getVehicle()==null){
            System.out.println("Employee doesn't own a vehicle.");
        }
        else{
            this.getVehicle().display();
        }
    }
}

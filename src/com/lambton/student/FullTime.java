package com.lambton.student;

import com.lambton.exception.InvalidFirstName;
import com.lambton.utils.Gender;
import com.lambton.vehicle.Vehicle;

public class FullTime extends Student{
    private float attendance;

    public FullTime(int id, String firstName, String lastName, Gender gender, Vehicle vehicle, String collegeName, String courseName, String result, float attendance) throws InvalidFirstName {
        super(id, firstName, lastName, gender, vehicle, collegeName, courseName, result);
        this.attendance = attendance;
    }

    public float getAttendance() {
        return attendance;
    }

    public void setAttendance(float attendance) {
        this.attendance = attendance;
    }

    @Override
    public String getType() {
        return "Full Time Student";
    }

    @Override
    public void display() {

        System.out.println("Student Type             :  " + this.getType());
        System.out.println("Student Firstname        :  " + this.firstName);
        System.out.println("Student Lastname         :  " + this.lastName);
        System.out.println("Student gender           :  " + this.gender);
        if(this.vehicle!=null){
            System.out.println("Student vehicle id       :  " + this.vehicle.getVehicleId());
            System.out.println("Student vehicle type     :  " + this.vehicle.getType());
            System.out.println("Student vehicle brand    :  " + this.vehicle.getBrand());
        }
        System.out.println("Student college name     :  " + this.collegeName);
        System.out.println("Student course name      :  " + this.courseName);
        System.out.println("Student result           :  " + this.result);
        System.out.println("Student attendance       :  " + this.attendance);

    }
}

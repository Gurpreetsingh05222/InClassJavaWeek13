package com.lambton.student;

import com.lambton.exception.InvalidFirstName;
import com.lambton.utils.Gender;
import com.lambton.vehicle.Vehicle;

public class PartTime extends Student{
    int noWeeklyClasses;

    public PartTime(int id, String firstName, String lastName, Gender gender, Vehicle vehicle, String collegeName, String courseName, String result, int noWeeklyClasses) throws InvalidFirstName {
        super(id, firstName, lastName, gender, vehicle, collegeName, courseName, result);
        this.noWeeklyClasses = noWeeklyClasses;
    }

    public int getNoWeeklyClasses() {
        return noWeeklyClasses;
    }

    public void setNoWeeklyClasses(int noWeeklyClasses) {
        this.noWeeklyClasses = noWeeklyClasses;
    }

    @Override
    public String getType() {
        return "Part time student";
    }

    @Override
    public void display() {

        System.out.println("Student Type             :  " + this.getType());
        System.out.println("Student Firstname        :  " + this.firstName);
        System.out.println("Student Lastname         :  " + this.lastName);
        System.out.println("Student gender           :  " + this.gender);
        if(this.vehicle!=null) {
            System.out.println("Student vehicle id       :  " + this.vehicle.getVehicleId());
            System.out.println("Student vehicle type     :  " + this.vehicle.getType());
            System.out.println("Student vehicle brand    :  " + this.vehicle.getBrand());
        }
        System.out.println("Student college name     :  " + this.collegeName);
        System.out.println("Student course name      :  " + this.courseName);
        System.out.println("Student result           :  " + this.result);
        System.out.println("Student weekly classes   :  " + this.noWeeklyClasses);

    }
}

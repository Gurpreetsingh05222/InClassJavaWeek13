package com.lambton.employee;

import com.lambton.exception.InvalidFirstName;
import com.lambton.exception.InvalidSalaryException;
import com.lambton.utils.Gender;
import com.lambton.vehicle.Vehicle;

public class FullTime extends Faculty{
    private float bonus;

    public FullTime(int id, String firstName, String lastName, Gender gender, Vehicle vehicle, float totalSalary, String department, float bonus) throws InvalidSalaryException, InvalidFirstName {
        super(id, firstName, lastName, gender, vehicle, totalSalary, department);
        this.bonus = bonus;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public String getType() {
        return "Full time faculty";
    }

    @Override
    public void display() {
        System.out.println("Employee Type   :"+this.getType());
        System.out.println("Employee Id     :"+this.getId());
        System.out.println("First Name      :"+this.getFirstName());
        System.out.println("Last Name       :"+this.getLastName());
        System.out.println("Gender          :"+this.getGender());
        System.out.println("Department      :"+this.getDepartment());
        System.out.println("Bonus           :"+this.getBonus());
        //System.out.println("Total Salary    :");

        if(this.getVehicle()==null){
            System.out.println("Employee doesn't own a vehicle.");
        }
        else{
            this.getVehicle().display();
        }
    }
}

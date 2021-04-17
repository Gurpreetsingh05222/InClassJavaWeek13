package com.lambton.employee;

import com.lambton.exception.InvalidFirstName;
import com.lambton.exception.InvalidSalaryException;
import com.lambton.utils.Gender;
import com.lambton.base.Person;
import com.lambton.vehicle.Vehicle;

public abstract class Employee extends Person {
    protected float totalSalary;

    public Employee(int id, String firstName, String lastName, Gender gender, Vehicle vehicle, float totalSalary) throws InvalidSalaryException, InvalidFirstName {
        super(id, firstName, lastName, gender, vehicle);
        if(InvalidSalaryException.validateSalary(totalSalary)){
            this.totalSalary = totalSalary;
        }
        else{
            throw new InvalidSalaryException("Invalid Salary:" + totalSalary);
        }
    }

    public float getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(float totalSalary) throws InvalidSalaryException{
        if(InvalidSalaryException.validateSalary(totalSalary)){
            this.totalSalary = totalSalary;
        }
        else{
            throw new InvalidSalaryException("Invalid Salary:" + totalSalary);
        }
    }
}

package com.lambton.employee;

import com.lambton.exception.InvalidFirstName;
import com.lambton.exception.InvalidSalaryException;
import com.lambton.utils.Gender;
import com.lambton.vehicle.Vehicle;

public abstract class Faculty extends Employee{
    protected String department;

    public Faculty(int id, String firstName, String lastName, Gender gender, Vehicle vehicle, float totalSalary, String department) throws InvalidSalaryException, InvalidFirstName {
        super(id, firstName, lastName, gender, vehicle, totalSalary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

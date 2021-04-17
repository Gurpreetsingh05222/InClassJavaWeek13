package com.lambton.student;

import com.lambton.exception.InvalidFirstName;
import com.lambton.utils.Gender;
import com.lambton.base.Person;
import com.lambton.vehicle.Vehicle;

public abstract class Student extends Person {
    protected String collegeName;
    protected String courseName;
    protected String result;

    public Student(int id, String firstName, String lastName, Gender gender, Vehicle vehicle, String collegeName, String courseName, String result) throws InvalidFirstName {
        super(id, firstName, lastName, gender, vehicle);
        this.collegeName = collegeName;
        this.courseName = courseName;
        this.result = result;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}

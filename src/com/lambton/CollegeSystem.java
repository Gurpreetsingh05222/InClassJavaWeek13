package com.lambton;

import com.lambton.base.Person;
import com.lambton.exception.InvalidFirstName;
import com.lambton.exception.InvalidSalaryException;
import com.lambton.student.FullTime;
import com.lambton.student.PartTime;
import com.lambton.utils.Color;
import com.lambton.utils.Gender;
import com.lambton.vehicle.Car;
import com.lambton.vehicle.MotorCycle;
import com.lambton.vehicle.Vehicle;

public class CollegeSystem {
    public static void main(String[] args){
        Vehicle car = new Car("1", "Volkswagen Polo", true, Color.WHITE);
        try{
            Person fullTimeStudent = new FullTime(123, "GurpreetSingh","Randhawa",
                    Gender.MALE, car, "Lambton College",
                    "CSAT", "A",88);
            fullTimeStudent.display();
        }
        catch (InvalidFirstName ex){
            System.out.println(ex.getMessage());
        }


        Vehicle bike = new MotorCycle("10", "Yamaha", true, 2);
        try{
            Person partTimeStudent = new PartTime(245, "Maximillian","Maxwell",
                    Gender.MALE, bike, "St Clair College",
                    "CSAT", "A",53);
            partTimeStudent.display();
        }
        catch (InvalidFirstName ex){
            System.out.println(ex.getMessage());
        }


        try{
            com.lambton.employee.FullTime fullTimeEmp = new com.lambton.employee.FullTime(123, "PriteshPatel", "Patel", Gender.MALE,
                    car, 120, "CSAT", 10);
        }
        catch (InvalidSalaryException ex){
            System.out.println(ex.getMessage());
        }
        catch (InvalidFirstName ex){
            System.out.println(ex.getMessage());
        }


    }
}

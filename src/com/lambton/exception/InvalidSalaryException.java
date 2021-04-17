package com.lambton.exception;

public class InvalidSalaryException extends Exception{
    public InvalidSalaryException(String errorMessage){
        super(errorMessage);
    }

    public static boolean validateSalary(double salary){
        if(salary<1000){
            return false;
        }
        return true;
    }
}

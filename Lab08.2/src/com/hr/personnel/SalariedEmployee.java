package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee{
    //instance variables
    private double salary;


    //constructors
    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        super(name, hireDate);
        setSalary(salary);
    }

    // accessors
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //toString
    public String toString() {
        return "Department: name=" + getName() + " Hired Date: "+ getHireDate() + " Salary: $" + getSalary();
    }
}

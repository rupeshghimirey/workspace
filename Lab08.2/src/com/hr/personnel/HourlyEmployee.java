package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee{

    //instance variables
    private double rate;
    private double hours;


    // constructors
    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        super(name, hireDate);
        setRate(rate);
        setHours(hours);
    }

    //business methods

    @Override
    public void pay() {
        System.out.printf(getName() + " is paid weekly of $" + getRate()*getHours() + "\n");
    }


    // accessors
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    // toString
    public String toString() {
        return super.toString() +  " Weekly Wage: $" + getRate() * hours;
    }
}

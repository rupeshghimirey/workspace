package src.com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class HourlyEmployee extends Employee  {

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
    public void payTaxes() {
        System.out.println(getName() + ", Hourly: Taxes = " + getRate()* getHours() * HOURLY_TAX_RATE);

    }

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

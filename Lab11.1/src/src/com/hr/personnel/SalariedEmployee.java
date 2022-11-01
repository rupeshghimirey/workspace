package src.com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class SalariedEmployee extends Employee  {
    //instance variables
    private double salary;


    //constructors
    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        super(name, hireDate);
        setSalary(salary);
    }

    @Override
    public void pay() {
        System.out.printf(getName() + " is paid yearly salary of $" + getSalary() + "\n");
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
        return super.toString() + " Salary: $" + getSalary();
    }

    @Override
    public void payTaxes() {
        System.out.println(getName()+ ", Salaried: Taxes = " + getSalary() * SALARIED_TAX_RATE);
    }
}

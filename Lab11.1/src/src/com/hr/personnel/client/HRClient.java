/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package src.com.hr.personnel.client;



import src.com.hr.personnel.Department;
import src.com.hr.personnel.HourlyEmployee;
import src.com.hr.personnel.SalariedEmployee;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        dept.addEmployee(new SalariedEmployee("Rupesh",LocalDate.of(2022, 9, 18), 70000));
        dept.addEmployee(new HourlyEmployee("Dipesh",LocalDate.of(2021, 10, 22), 35.5, 40));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        // pay all employees
        System.out.println("\nPay All Employees!");
        dept.payEmployees();
    }
}
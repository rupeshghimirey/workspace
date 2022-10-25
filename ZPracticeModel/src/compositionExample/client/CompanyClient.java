package compositionExample.client;

import compositionExample.Address;
import compositionExample.Company;
import compositionExample.Employee;

public class CompanyClient {
    public static void main(String[] args) {
        Employee[] employees = new Employee[100];
        Company company = new Company("Ghimire & Family LLC", employees);

        Employee employee1 = new Employee("Rupesh", 70000, new Address("Cameron", "USA"));
        Employee employee2 = new Employee("Dipesh", 60000, new Address("Pocatello", "USA"));

        company.addEmployee(employee1);
        company.addEmployee(employee2);

        System.out.println("Total salary of all employees: $"+ company.computeTotalSalaryOfAllEmployees());

    }
}

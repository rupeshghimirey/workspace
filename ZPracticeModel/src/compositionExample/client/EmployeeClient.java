package compositionExample.client;

import compositionExample.Address;
import compositionExample.Employee;

public class EmployeeClient {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Rupesh", 70000, new Address("Cameron", "USA"));
        Employee employee2 = new Employee("Dipesh", 60000, new Address("Pocatello", "USA"));


        System.out.println(employee1.getEmployeeInfo());
        System.out.println("**********************");
        System.out.println(employee2.getEmployeeInfo());

    }
}

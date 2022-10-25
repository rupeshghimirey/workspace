package compositionExample;

public class Company {
    private String companyName;
    private Employee[] employees;
    private int employeeCount=0;

    // constructors
    public Company(String companyName, Employee[] employees) {
        this.companyName = companyName;
        this.employees = employees;

    }

    public void addEmployee(Employee employee) {
        employees[employeeCount] = employee;
        employeeCount++;
    }

    public double computeTotalSalaryOfAllEmployees() {
        double totalSalary = 0;
        if(employees.length>=1) {
            for(Employee person: employees) {
                if(person!=null) {
                    totalSalary += person.getSalary();
                }
            }
        }

        return totalSalary;
    }
    //accessors

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;

    }
}

package W2.Employee;

import W2.Service.EmployeeService;

public class Main {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();

        Department it = new Department("IT");
        EmploymentType fullTime = new EmploymentType("Full-Time");

        Employee emp1 = new Employee("Budi", it, fullTime, 5000000);
        Employee emp2 = new Employee("Sari", it, fullTime, 6000000);

        service.addEmployee(emp1);
        service.addEmployee(emp2);

        service.raiseSalary(2, 40); 
    }
}
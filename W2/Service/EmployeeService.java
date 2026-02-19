package W2.Service;

import java.util.HashMap;
import java.util.Map;
import W2.Employee.*;

// mengelola operasi yang berkaitan dengan data dan aturan bisnis
public class EmployeeService {
    private Map<Integer, Employee> employees = new HashMap<>();

    public void addEmployee(Employee emp) {
        employees.put(emp.getId(), emp);
    }
    
    public Employee getEmployee(int id) {
        return employees.get(id);
    }

    public void raiseSalary(int id, double percent) {
        Employee emp = employees.get(id);
        if (emp != null) {
            emp.setSalary(emp.getSalary() * (1 + percent/100));
            System.out.println("Gaji dinaikan sebesar " + percent + "% untuk karyawan " + emp.getName());
            System.out.println("Gaji baru: " + emp.getSalary());
        }
        else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }
}

package src.Week_1.OOP_Basics.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Developer("Lana", 23000, "Java"));
        employees.add(new Manager("Sandra", 45000, 32));
        employees.add(new Intern("David", 0, "KPI"));

        for (Employee emp : employees) {
            System.out.println("Employee details: " + "\n " + emp.getDetails());
        }
    }
}

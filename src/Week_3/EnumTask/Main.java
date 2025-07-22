package src.Week_3.EnumTask;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> em = new ArrayList<>();

        em.add(new Employee("Alan", Department.HR, 2000));
        em.add(new Employee("Dora", Department.MARKETING, 2800));
        em.add(new Employee("Kira", Department.SALES, 2500));
        em.add(new Employee("Lana", Department.HR, 3000));
        em.add(new Employee("Robert", Department.IT, 3200));

        System.out.println("Employee: ");
        for (Employee emp : em) {
            System.out.println(emp);

            switch (emp.getDepartment()) {
                case MARKETING -> System.out.println("Marketing employee");
                case HR -> System.out.println("HR employee");
                case IT -> System.out.println("IT employee");
                case SALES -> System.out.println("Sales employee");
            }
        }
    }
}

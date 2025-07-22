package src.Week_2.Collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentManager sm = new StudentManager();

        sm.addStudent(new Student("1234", "Alla", 23, new ArrayList<>(List.of(1, 2, 3, 4))));
        sm.addStudent(new Student("4321", "David", 21, new ArrayList<>(List.of(3, 4, 2, 1))));
        sm.addStudent(new Student("3214", "Sara", 22, new ArrayList<>(List.of(4, 5, 2, 3))));

        for (Student s : sm.allStudents()) {
            System.out.println(s);
        }

        System.out.println("\nAdd grade 5 to Alla:");
        sm.addGrade("1234", 5);

        System.out.println("\nAlla's new info:");
        System.out.println(sm.searchById("1234"));

        System.out.println("\nRemove student David:");
        sm.removeStudent("4321");

    }
}

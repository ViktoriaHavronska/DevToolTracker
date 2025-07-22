package src.Week_1.OOP_Basics.Task;

import java.util.ArrayList;

import java.util.*;

public class Group {
    private String groupName;
    private List<Student> students;

    public Group(String groupName) {
        this.groupName = groupName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void printStudents() {
        for (Student s : students) {
            s.printInfo();
        }
    }

    public void sortByAverage() {
        students.sort(Comparator.comparingInt(Student::getAverage).reversed());
    }

    public Student getTopStudent() {
        return Collections.max(students, Comparator.comparingInt(Student::getAverage));
    }

    public double getGroupAverage() {
        if (students.isEmpty()) return 0;
        int sum = 0;
        for (Student s : students) {
            sum += s.getAverage();
        }
        return (double) sum / students.size();
    }
}


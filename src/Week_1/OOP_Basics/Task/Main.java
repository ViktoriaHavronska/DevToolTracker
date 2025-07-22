package src.Week_1.OOP_Basics;


public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Anna", 20, new int[]{5, 4, 3});

        Student s2 = new Student("Ivan", 22, new int[]{2, 3, 4});

        Group group = new Group("Java Group");
        group.addStudent(s1);
        group.addStudent(s2);

        System.out.println("Before sort:");
        group.printStudents();

        group.sortByAverage();

        System.out.println("\nAfter sort:");
        group.printStudents();

        System.out.println("\n The best Student: " + group.getTopStudent().getName());
        System.out.println("The average grade of group: " + group.getGroupAverage());
    }
}


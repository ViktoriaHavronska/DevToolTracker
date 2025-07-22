package src.Week_1.OOP_Basics.Task;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;
    private int age;
    private ArrayList<Integer> grades;

    public Student(String name, int age, int[] gradesArray) {
        this.name = name;
        this.age = age;
        this.grades = new ArrayList<>();
        for (int grade : gradesArray) {
            this.grades.add(grade);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public int getAverage() {
        int sum = 0;

        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public void getMaxGrade(){
        for (int grade : grades){
            if (grade > 4){
                System.out.println("Max grade is : ");
            } else {
                System.out.println("You dont have max grade");
            }
        }
    }

    public void printInfo() {
        System.out.println("Student " + "-> " + name);
        System.out.println("Age " + "-> " + age);
        System.out.println("Grades " + "-> " + grades);
        System.out.println("Average: " + "-> " + getAverage());
    }
}

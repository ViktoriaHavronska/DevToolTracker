package src.Week_2.Collections;

import java.util.List;

class Student {
    private String id;
    private String name;
    private int age;
    private List<Integer> grades;

    public Student(String id, String name, int age, List<Integer> grades) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{id='" + id + "', name='" + name + "', age=" + age + ", grades=" + grades + "}";
    }
}

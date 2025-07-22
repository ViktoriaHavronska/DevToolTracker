package src.Week_2.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class StudentManager  {
    private Map<String, Student> students = new HashMap<>();

    //додавання студента

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    //видалення студента за id

    public void removeStudent(String id) {
        students.remove(id);
    }

    //пошуку студента за id
    public Student searchById(String id) {
        return students.get(id);
    }

    //оновлення оцінок студента (додавання нової оцінки)
    public void addGrade(String id, int grade) {
        Student s = students.get(id);
        if (s != null) {
            s.getGrades().add(grade);
        }
    }

    public List<Student> allStudents() {
        List<Student> list = new ArrayList<>(students.values());
        return list;
    }

}

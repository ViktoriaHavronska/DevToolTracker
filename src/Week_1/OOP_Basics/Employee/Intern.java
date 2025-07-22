package src.Week_1.OOP_Basics.Employee;

class Intern extends Employee {
    private String university;

    public Intern(String name, double salary, String university) {
        super(name, salary);
        this.university = university;
    }

    @Override
    public String getDetails() {
        return "Intern: " + super.name + ", salary: " + super.salary + ", university: " + university;
    }
}

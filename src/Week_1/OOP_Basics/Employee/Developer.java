package src.Week_1.OOP_Basics.Employee;

class Developer extends Employee {
    private String language;

    public Developer(String name, double salary, String language) {
        super(name, salary);
        this.language = language;
    }

    @Override
    public String getDetails() {
        return "Developer: " + super.name + ", salary: " + super.salary + ", language: " + language;
    }
}

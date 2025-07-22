package src.Week_1.OOP_Basics.Employee;

class Manager extends Employee {
    public int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public String getDetails() {
        return "Manager: " + super.name + ", salary: " + super.salary + ", teamSize: " + teamSize;    }
}

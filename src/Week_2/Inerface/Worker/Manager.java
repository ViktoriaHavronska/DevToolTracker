package src.Week_2.Inerface.Worker;

class Manager implements Workable {
    @Override
    public String work() {
        return "Manager : I manage the team";
    }
}

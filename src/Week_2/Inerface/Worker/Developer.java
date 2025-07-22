package src.Week_2.Inerface.Worker;

class Developer implements Workable {
    @Override
    public String work() {
        return "Developer: I write code";
    }
}

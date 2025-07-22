package src.Week_2.Inerface.Worker;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Workable> workables = new ArrayList<>();

        workables.add(new Developer());
        workables.add(new Manager());
        workables.add(new Intern());

        for (Workable w: workables){
            System.out.println(w.work());
        }
    }
}

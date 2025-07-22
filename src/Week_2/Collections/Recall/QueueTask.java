package src.Week_2.Collections.Recall;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTask {
    public static void main(String[] args) {
        Queue<String> tasks = new LinkedList<>();

        tasks.add("Task 1");
        tasks.add("Task 2");
        tasks.add("Task 3");
        tasks.add("Task 4");
        tasks.add("Task 5");

        while (!tasks.isEmpty()) {
            System.out.println("Processing ..." + tasks.poll());
        }

        System.out.println("Check: " + tasks.peek());

    }
}

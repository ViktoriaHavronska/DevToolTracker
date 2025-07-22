package src.Week_2.Collections.Recall;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class SetTask {
    public static void main(String[] args) {
        Set<Double> numb = new HashSet<>();

        numb.add(1.9);
        numb.add(2.8);
        numb.add(4.2);
        numb.add(1.9);


        System.out.println("Your Set numbers: ");
        for (Double num : numb) {
            System.out.println(num);
        }

        System.out.println("Your Min and Max number: ");
        System.out.println("Min: " + Collections.min(numb));
        System.out.println("Max: " + Collections.max(numb));
    }
}
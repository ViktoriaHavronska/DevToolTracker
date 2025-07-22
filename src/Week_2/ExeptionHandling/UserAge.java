package src.Week_2.ExeptionHandling;

import java.util.Scanner;

public class UserAge {
    public static int age(int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Invalid age entered");
        }
        return age;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter your age: ");
            age(sc.nextInt());
        } catch (IllegalArgumentException e) {
            System.out.println("Error " + e.getMessage());
        } finally {
            System.out.println("Operation finished");
            sc.close();
        }
    }
}

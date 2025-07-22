package src.Week_3.ThrowThrows;

import java.util.Scanner;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }

    public static int checkAge(int age) {
        if (age < 18) {
            try {
                throw new InvalidAgeException("Занадто молодий!");
            } catch (InvalidAgeException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("End of operation");
            }
        }
        return age;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int user = sc.nextInt();
        checkAge(user);
    }
}

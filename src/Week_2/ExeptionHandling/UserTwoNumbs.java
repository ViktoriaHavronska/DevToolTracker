package src.Week_2.ExeptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserTwoNumbs {

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException(" Not divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {

        System.out.println("Enter 1 number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Enter 2 number:");
        int b = sc.nextInt();

        try {
            int res = divide(a, b);
            System.out.println("Res: " + res);
        } catch (InputMismatchException e){
            System.out.println("Error");
        } catch (ArithmeticException e){
            System.out.println("Error"+ e.getMessage());
        } finally {
            System.out.println("Operation finished");
        }

    }
}

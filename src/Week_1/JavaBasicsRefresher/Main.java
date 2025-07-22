package src.Week_1.JavaBasicsRefresher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Put your number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Check if a number is even or odd
        if (n % 2 == 0) {
            System.out.println("your number is even");
        } else if (n % 2 != 0) {
            System.out.println("Your number is odd");
        } else {
            System.out.println("smth wrong");
        }

        // Print the first 10 Fibonacci numbers
        System.out.println("10 Fibonacci numbers:");
        int first = 0;
        int second = 1;

        for (int i = 0; i < 10; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

        // Reverse a number using a loop
        int[] numb = {1, 2, 3, 4, 5};
        int start = 0;
        int end = numb.length - 1;

        while (start < end) {
            int temp = numb[start];
            numb[start] = numb[end];
            numb[end] = temp;

            start++;
            end--;
        }
        System.out.println("\nReversed array(while):");
        for (int num : numb) {
            System.out.println(num);
        }

        int [] numbs = {1,2,3,4,5};
        for (int i = 0; i < numbs.length /2; i++) {
            int temp = numbs[i];
            numbs[i] = numbs[numbs.length - 1 -i];
            numbs[numbs.length - 1 -i] = temp;
        }
        System.out.println("\n Reversed array (For)");
        for (int num : numbs){
            System.out.println(num);
        }

    }
}


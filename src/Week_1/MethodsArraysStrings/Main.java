package src.Week_1.MethodsArraysStrings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CaesarCipher caesarCipher = new CaesarCipher();
        Scanner sc = new Scanner(System.in);
        System.out.println("Your Message: ");
        String message = sc.nextLine();

        System.out.println("Entere shift: ");
        int shift = sc.nextInt();

        String encoded = caesarCipher.encode(message, shift);
        System.out.println("Encoded message: " + encoded);

        PalindromeCheck palindromeCheck = new PalindromeCheck();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your word to check:");
        String check = scanner.nextLine();

        palindromeCheck.checkerIfPalindrome(check);

        MaxInArray max = new MaxInArray();

        System.out.println("\n Max in Array: ");
        max.maxInArray();
    }
}

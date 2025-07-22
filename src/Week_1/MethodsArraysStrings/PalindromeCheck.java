package src.Week_1.MethodsArraysStrings;

public class PalindromeCheck {

    public void checkerIfPalindrome(String text) {

        boolean isPalindrome = true;

        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("yes, its a palindrome");
        } else {
            System.out.println("no, not a palindrome");
        }

    }
}

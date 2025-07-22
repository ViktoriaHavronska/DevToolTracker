package src.Week_2.ExeptionHandling;

public class Main {
    public static int divide(int a, int b) {
        if (b == 0){
            throw new ArithmeticException("Not divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            int res = divide(2, 0);
            System.out.println("Res: " + res);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Operation finished");
        }

    }
}

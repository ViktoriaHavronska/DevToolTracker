package src.Week_3.Generics;

public class OneMoreGeneric {
    public static <T> void printArray(T[] arr) {
        for (T elem : arr) {
            System.out.print(elem + ", ");
        }
    }

    public static void main(String[] args) {
        Integer[] numb = {1, 2, 3, 4, 5, 6};
        String[] word = {"pi", "iz", "zd", "de", "ec", "pizdec"};

        printArray(numb);
        System.out.println("\n");
        printArray(word);

    }
}

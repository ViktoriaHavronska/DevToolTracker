package src.Week_3.Generics;

public class OneMoreMoreGeneric {

    public static <T extends Number> double average(T[] arr) {
        double sum = 0.0;

        for (T num : arr) {
            sum += num.doubleValue();
        }

        return sum / arr.length;
    }

    public static void main(String[] args) {
        Integer[] numi = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Double[] numd = {2.4, 6.6, 1.3, 5.3, 5.3, 2.5};

        System.out.println("Int : " + average(numi));
        System.out.println("\nDouble : " + average(numd));
    }
}

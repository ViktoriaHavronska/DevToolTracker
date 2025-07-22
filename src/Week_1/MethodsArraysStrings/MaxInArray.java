package src.Week_1.MethodsArraysStrings;

public class MaxInArray {
    public void maxInArray(){
        int [] array = {23,65,24,1,35};
        System.out.println("Original array: ");
        for (int arr : array){
            System.out.print(" " + arr);
        }

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println("\n -> "+ max);
    }
}

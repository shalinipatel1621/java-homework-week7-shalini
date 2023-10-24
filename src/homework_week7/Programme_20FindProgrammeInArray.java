package homework_week7;

/**
 * Write a Java program to test if an array contains a specific value
 */

public class Programme_20FindProgrammeInArray {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int value = 1;

        containingValue(numbers, value);
    }

    public static void containingValue(int[] arr, int value) {
        boolean containing = false ;
        for (int element : arr) {
            if (element == value) {
                containing= true;
            }
        }
        if (containing) {
            System.out.println(" The array contains the value " + value);
        } else {
            System.out.println("The array does not continue the array " + value);
        }
    }
}

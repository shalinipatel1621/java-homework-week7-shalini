package homework_week7;

/**
 * Write a Java program to calculate the average value array elements
 */

public class Programme_19_AverageOfArray {

    public static void main(String[] args) {//main method
        int[] numbers = {1, 2, 3, 4, 5};//array
        calculateSum(numbers);
    }

    public static void calculateSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(" Average of the array elements:  " + sum / arr.length);
    }
}

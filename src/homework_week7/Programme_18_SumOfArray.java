package homework_week7;

/**
 * Write a Java program to sum values of an array
 */

public class Programme_18_SumOfArray {

    public static void main(String[] args) {//main method
        int [] numbers = {1, 2, 3, 4, 5};
        calculateSum(numbers);}

    public static void calculateSum(int [] arr){

        int sum = 0;
        for(int i = 0; i< arr.length; i ++){
            sum = sum + arr[i];
        }
        System.out.println(" Sum of the array elements: " + sum);
    }
}
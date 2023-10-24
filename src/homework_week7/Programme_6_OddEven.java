package homework_week7;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if its odd or even
 */

public class Programme_6_OddEven {
    public static void main(String[] args) {//scanner in main method
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number :");
        int number = scanner.nextInt();
        oddOrEven(number);
        scanner.close();
    }

    public static void oddOrEven(int number) {//if else condition will be used
        if (number % 2 == 0) {
            System.out.println(" This number is an Even number ");

        } else {
            System.out.println(" This number is an Odd number ");
        }
    }
}

package homework_week7;
/**
 * Write a Java program to check if enter number is "POSITIVE", "NEGATIVE" or "Zero"
 */

import java.util.Scanner;

public class Programme_16_FindPositiveNegative {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = scanner.nextInt();
        positiveNegativeNumber(number);
        scanner.close();

    }

    public static void positiveNegativeNumber(int number) {

        if (number > 0) {
            System.out.println("Positive number ");
        } else if (number < 0) {
            System.out.println(" Negative Number ");
        } else if (number == 0) {
            System.out.println("Zero ");
        }
    }
}

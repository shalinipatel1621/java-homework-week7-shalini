package homework_week7;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even
 * HINT: use ternary operator (?:)
 */

public class Programme_1_OddEvenTernaryOperator {

    public static void ternaryOperator(int number) {
        String result = (number % 2 == 0) ? "Even" : "Odd";  //ternary operator used
        System.out.println(result);
    }

    public static void main(String[] args) {//main method declared
        Scanner scanner = new Scanner(System.in);//scanner method use for user input
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        ternaryOperator(number);//static method called in main method
        scanner.close();
    }
}

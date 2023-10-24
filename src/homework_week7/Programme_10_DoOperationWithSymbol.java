package homework_week7;
/**
 * WAP to input any two number and ask user to enter their symbol find addition, Subtraction, multiplication
 * and division according to to their symbol
 */

import java.util.Scanner;

public class Programme_10_DoOperationWithSymbol {

    public static void main(String[] args) {//scanner method used in the main method
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the First Number ");
        double num1 = scanner.nextDouble();
        System.out.println(" Enter the Second Number ");
        double num2 = scanner.nextDouble();
        System.out.println(" Enter the operator (+, - *, / ):");
        char operator = scanner.next().charAt(0);
        calculator(num1, num2, operator);
        scanner.close();
    }

    public static void calculator(double num1, double num2, char operator) {//if else used

        if (operator == '+') {
            System.out.println("Addition: " + num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (operator == '/') {
            System.out.println("Division: " + num1 + " / " + num2 + " = " + (num1 / num2));
        } else if (operator == '*') {
            System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + (num1 * num2));
        } else {
            System.out.println(" Invalid Entry ");
        }
    }
}

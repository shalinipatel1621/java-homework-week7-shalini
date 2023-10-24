package homework_week7;

import java.util.Scanner;

/**
 * Write a java program to input any year like ex 2007 anf find out if its leap year
 * or not?
 */

public class Programme_2_LeapYear {

    public static void leapYear(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))//if else condition
        {
            System.out.println("This is leap year");
        }
        else{
            System.out.println("This is not leap year");

        }
    }

    public static void main(String[] args) {//scanner used
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year = scanner.nextInt();
        leapYear(year);
        scanner.close();
    }
}

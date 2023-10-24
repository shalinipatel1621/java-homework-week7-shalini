package homework_week7;

import java.util.Scanner;

public class Programme_4_NumbersOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
        boolean isLeap = isLeapYear(year);
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isLeap) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year (1-9999): ");
        int year = scanner.nextInt();
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year ");
        } else if (isLeapYear(year)) {
            System.out.println(year + " is not a leap year");
        } else {
            System.out.println("Invalid Entry: Please enter a year from 1 to 9999");
            System.out.println("Enter a month (1-12): ");
            int month = scanner.nextInt();
            System.out.println("Enter a year (1-9999): ");
            int yearForMonth = scanner.nextInt();
            int daysInMonth = getDaysInMonth(month, yearForMonth);
            if (daysInMonth == -1) {
                System.out.println("Invalid input for a month or year ");
            } else {
                System.out.println("There are " + daysInMonth + " days in month " + month + " of year " + yearForMonth + ".");
            }
        }


    }
}

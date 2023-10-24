package homework_week7;

import java.util.Scanner;

public class Programme_12_FindInputValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any variable: ");
        char ch = scanner.next().charAt(0);
        scanner.close();
        inputValue(ch);
    }

    public static void inputValue(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println((ch + " Is an alphabet"));
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " Is a Number");
        } else {
            System.out.println(ch + " Is a special character");
        }
    }
}



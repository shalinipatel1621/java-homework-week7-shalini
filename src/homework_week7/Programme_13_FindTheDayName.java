package homework_week7;

import java.util.Scanner;

public class Programme_13_FindTheDayName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( " Enter number: ");
        int number = scanner.nextInt();
        theDays(number);
        scanner.close();
    }

    public static void theDays(int number){

        switch (number){
            case 1:
                System.out.println(" Monday ");
                break;

            case 2:
                System.out.println(" Tuesday ");
                break;
            case 3:
                System.out.println(" Wednesday ");
                break;
            case 4:
                System.out.println(" Thursday ");
                break;
            case 5:
                System.out.println(" Friday ");
                break;
            case 6:
                System.out.println(" Saturday ");
                break;
            case 7:
                System.out.println(" Sunday ");
                break;
            default:
                System.out.println(" Week contains 1 to 7 days ");
                break;

        }
    }
}

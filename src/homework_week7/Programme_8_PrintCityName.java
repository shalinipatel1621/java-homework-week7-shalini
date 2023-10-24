package homework_week7;

/**
 * Input any alphabet from "A to F" and print their city name accordingly
 * if any other alphabet should be invalid entry
 */

public class Programme_8_PrintCityName {

    public static void main(String[] args) {
        cityName();
    }

    public static void cityName() {
        char alphabet = 'b';
        if (alphabet == 'A' || alphabet == 'a') {
            System.out.println("Arizona");
        } else if (alphabet == 'B' || alphabet == 'b') {
            System.out.println("Bangkok");
        } else if (alphabet == 'C' || alphabet == 'c') {
            System.out.println("Chicago");
        } else if (alphabet == 'D' || alphabet == 'd') {
            System.out.println("Delhi");
        } else if (alphabet == 'E' || alphabet == 'e') {
            System.out.println("Ephesus");
        } else if (alphabet == 'F' || alphabet == 'f') {
            System.out.println("Florida");
        } else {
            System.out.println(" Invalid Entry ");
        }

    }
}




















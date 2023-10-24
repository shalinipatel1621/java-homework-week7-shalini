package homework_week7;

/**
 * Same as above program-8 using switch statement
 */

public class Programme_9_PrintCityNameWithSwitch {
    public static void main(String[] args) {

        cityName();
    }

    public static void cityName() {
        char cityName = 'a';

        switch (cityName) {
            case 'a':
                System.out.println("Arizona");
                break;

            case 'b':
                System.out.println("Bangkok");
                break;

            case 'c':
                System.out.println("Chicago");
                break;

            case 'd':
                System.out.println("Delhi");
                break;

            case 'e':
                System.out.println("Ephesus");

            case 'f':
                System.out.println("Florida");

            default:
                System.out.println(" Invalid entry ");
        }
    }
}


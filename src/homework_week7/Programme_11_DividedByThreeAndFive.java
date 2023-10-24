package homework_week7;

public class Programme_11_DividedByThreeAndFive {

    public static void main(String[] args) {//main method
        division3And5();
    }

    public static void division3And5() {//for loop used
        System.out.println("Division by 3: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ",");
            }
        }
        System.out.println("\nDivision by 5: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + ",");
            }
        }
    }
}

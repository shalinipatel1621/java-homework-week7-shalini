package homework_week7;
/**
 * WAP input sales ID, seelers name, sales amount and salary basic and then find the sales
 * salaes amount >= 50,000 35%
 * sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,0000 5%
 * <10,000 2%
 */

import java.util.Scanner;

public class Programme_7_SalesCommission {


    public static void sales(int salesAmount) {

        if (salesAmount >= 50000) {
            System.out.println(" 35% " + salesAmount * 35 / 100);
        } else if (salesAmount >= 30000) {
            System.out.println(" 20% " + salesAmount * 20 / 100);
        } else if (salesAmount >= 20000) {
            System.out.println(" 10% " + salesAmount * 10 / 100);
        } else if (salesAmount >= 10000) {
            System.out.println(" 5% " + salesAmount * 5 / 100);
        } else {
            System.out.println(" 2% " + salesAmount * 2 / 100);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter Sales ID: ");
        int salesID = scanner.nextInt();
        System.out.println(" Enter Seller's name: ");
        String sellerName = scanner.next();
        System.out.println(" Enter Sales Amount: ");
        int salesAmount = scanner.nextInt();
        System.out.println(" Enter Salary basic: ");
        int salaryBasic = scanner.nextInt();
        scanner.close();
        sales(salesAmount);


    }
}

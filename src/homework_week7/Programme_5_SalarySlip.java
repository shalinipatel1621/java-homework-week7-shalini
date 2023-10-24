package homework_week7;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA= basic salary 9%
 * PF = basic salary 20%
 * gross salary = basic salary + HRA + TA + DA -PF
 * Print
 */

import java.util.Scanner;

public class Programme_5_SalarySlip {

    public static double calculateHRA(double basicSalary) {
        return basicSalary * 0.10;
    }

    public static double calculateDA(double basicSalary) {
        return basicSalary + 0.08;
    }

    public static double calculateTA(double basicSalary) {
        return basicSalary * 0.09;
    }

    public static double calculatePF(double basicSalary) {
        return basicSalary * 0.2;
    }

    public static double calculateGrossSalary(double basicSalary, double hRE, double tA, double dA, double pF) {
        return basicSalary + hRE + tA + dA - pF;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee ID ");
        int employeeID = scanner.nextInt();
        scanner.nextLine();
        System.out.println(" Enter Name ");
        String employeeName = scanner.nextLine();
        System.out.println(" Enter Basic Salary ");
        double basicSalary = scanner.nextDouble();

        double hRE = calculateHRA(basicSalary);
        double tA = calculateTA(basicSalary);
        double dA = calculateDA(basicSalary);
        double pF = calculatePF(basicSalary);

        double grossSalary = calculateGrossSalary(basicSalary, hRE, tA, dA, pF);
        System.out.println("__________________________________________________________");
        System.out.println("|  Salary Slip                                            |");
        System.out.println("|_________________________________________________________|");
        System.out.println("| Employee Id       : " + employeeID + "                                 |");
        System.out.println("| Employee Name     : " + employeeName + "                              |");
        System.out.println("|_________________________________________________________|");
        System.out.println("| Basic Salary      : " + basicSalary + "                             |");
        System.out.println("| HRA 10%           : " + basicSalary + "                             |");
        System.out.println("| TA 8%             : " + tA + "                               |");
        System.out.println("| DA 9%             : " + dA + "                            |");
        System.out.println("| PF - 20%          : " + pF + "                              |");
        System.out.println("|_____________________________________________________|");
        System.out.println("| Gross Salary     : " + grossSalary + "                              |");
        System.out.println("|=======================================================|");
        scanner.close();
    }

}

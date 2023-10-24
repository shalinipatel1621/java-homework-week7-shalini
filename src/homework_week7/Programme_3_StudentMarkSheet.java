package homework_week7;

import java.util.Scanner;

public class Programme_3_StudentMarkSheet {

    public static int calculateTotal(int mathMarks, int scienceMarks, int englishMarks) {
        return mathMarks + scienceMarks + englishMarks;
    }

    public static double calculatePercentage(int totalMarks) {
        return (double) totalMarks / 300 * 100;
    }

    public static String determineResultAndGrade(double percentage) {
        String result, grade;
        if (percentage >= 35) {
            result = "Pass";
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else {
                grade = "C";
            }
        } else {
            result = "Fail";
            grade = "N/A";
        }
        return result + " (" + grade + ")";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student's name ");
        String name = scanner.nextLine();
        System.out.println("Enter Roll no: ");
        int rollNo = scanner.nextInt();
        System.out.println("Enter Math Marks ");
        int mathMarks = scanner.nextInt();
        System.out.println("Enter Science Marks ");
        int scienceMarks = scanner.nextInt();
        System.out.println("Enter English Marks ");
        int englishMarks = scanner.nextInt();

        if (mathMarks < 0 || mathMarks > 100 || scienceMarks < 0 || scienceMarks > 100 || englishMarks < 0 || englishMarks > 100) {
            System.out.println("Invalid Input, Marks should be between 0 to 100");
        } else {
            int totalMarks = calculateTotal(mathMarks, scienceMarks, englishMarks);
            double percentage = calculatePercentage(totalMarks);
            String resultAndGrade = determineResultAndGrade(percentage);
            System.out.println("____________________________________________ ");
            System.out.println("|                                            |");
            System.out.println("|   Mark Sheet                               |");
            System.out.println("|___________________________________________ |");
            System.out.println("| Name: " + name + "                             |");
            System.out.println("| Roll No: " + rollNo + "                                |");
            System.out.println("|____________________________________________|");
            System.out.println("| Subjects: Marks                            |");
            System.out.println("|____________________________________________|");
            System.out.println("|  Math:" + mathMarks + "                                   |");
            System.out.println("|  Science:" + scienceMarks + "                                |");
            System.out.println("|  English:" + englishMarks + "                                |");
            System.out.println("|____________________________________________|");
            System.out.println("|  Total:" + totalMarks + "                                 |");
            System.out.println("|____________________________________________|");
            System.out.println("| Percentage:" + percentage + "                      |");
            System.out.println("| Result: " + resultAndGrade + "|");
            System.out.println("|____________________________________________|");

            scanner.close();


        }
    }
}
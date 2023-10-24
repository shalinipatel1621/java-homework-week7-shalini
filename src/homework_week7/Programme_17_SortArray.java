
package homework_week7;
/**
 * Write a Java program to sort a numeric array and a string array
 */

import java.util.Arrays;

public class Programme_17_SortArray {

    public static void main(String[] args) {
        sortArray();
    }

    public static void sortArray() {
        int[] numberArray = {2, 5, 67, 1, 0};
        Arrays.sort(numberArray);
        System.out.println(Arrays.toString(numberArray));
        String[] StringArray = {"Java", "Ruby", "Python"};
        Arrays.sort(StringArray);
        System.out.println(Arrays.toString(StringArray));
    }
}

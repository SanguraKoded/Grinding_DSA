package arrays;

import java.util.*;

/**
 * Problem: Plus One
 * -----------------
 * Add one to an integer represented as an array of digits.
 *
 * Example:
 * Input: [9,9,9]
 * Output: [1,0,0,0]
 *
 * Logic:
 * - Start from the last digit.
 * - If it's 9, set to 0 and carry 1 to the left.
 * - If all digits are 9, create a new array with one extra digit at the front.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1) or O(n) if new array is created
 */
public class IncrementLastDigit {
    public static int[] incrementLastDigit(int[] array) {
        int counter = array.length - 1;
        while (array[counter] == 9) {
            if (counter == 0) {
                int[] newArray = new int[array.length + 1];
                newArray[0] = 1;
                return newArray;
            }
            array[counter] = 0;
            counter--;
        }
        array[counter]++;
        return array;
    }

    public static void main(String[] args) {
        int[] digits = {9,9,9,9};
        System.out.println(Arrays.toString(incrementLastDigit(digits)));
    }
}

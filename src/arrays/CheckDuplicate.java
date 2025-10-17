package arrays;

import java.util.*;

/**
 * Problem: Contains Duplicate
 * ---------------------------
 * Check if an array contains any duplicate elements.
 *
 * Example:
 * Input: [1,2,3,4]
 * Output: false
 * Input: [1,2,3,1]
 * Output: true
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class CheckDuplicate {
    public static boolean checkDuplicate(int[] numbers) {
        HashSet<Integer> unique = new HashSet<>();
        for (int num : numbers) {
            if (unique.contains(num)) {
                return true;
            }
            unique.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println("Contains duplicate: " + checkDuplicate(nums));
    }
}

import java.util.*;

/**
 * Problem: Find the Unique Element
 * --------------------------------
 * Given an array where every element appears twice except for one,
 * find that single unique element.
 *
 * Approach: Use XOR (a ^ a = 0, a ^ 0 = a)
 *
 * Example:
 * Input: [4,1,2,1,2]
 * Output: 4
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class FindUnique {
    public static int findUnique(int[] numbers) {
        int finder = 0;
        for (int num : numbers) {
            finder ^= num;
        }
        return finder;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println("Unique element: " + findUnique(nums));
    }
}

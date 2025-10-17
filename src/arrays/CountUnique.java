package arrays;

/**
 * Problem: Count Unique Elements in a Sorted Array
 * -----------------------------------------------
 * Given a sorted array, return the number of unique elements.
 * The function modifies the array in-place to bring all unique elements to the front.
 *
 * Example:
 * Input: [1,1,2,3,3,4]
 * Output: 4 (Unique elements are [1,2,3,4])
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class CountUnique {
    public static int countUnique(int[] numbers) {
        int lastUniqueIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != numbers[lastUniqueIndex]) {
                lastUniqueIndex++;
                numbers[lastUniqueIndex] = numbers[i];
            }
        }
        return lastUniqueIndex + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4};
        System.out.println("Unique count: " + countUnique(nums));
    }
}

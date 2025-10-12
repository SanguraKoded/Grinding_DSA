import java.util.*;

/**
 * Problem: Rotate Array
 * ---------------------
 * Rotate an array to the right by k steps.
 *
 * Example:
 * Input: [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 *
 * Approach: Reverse the whole array, then reverse the two parts separately.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class RotateArray {
    public static int[] rotateArray(int[] arr, int k) {
        k = k % arr.length;
        arr = reverse(arr, 0, arr.length - 1);
        arr = reverse(arr, 0, k - 1);
        arr = reverse(arr, k, arr.length - 1);
        return arr;
    }

    public static int[] reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(rotateArray(nums, 3)));
    }
}

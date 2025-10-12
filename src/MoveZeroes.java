import java.util.*;

/**
 * Problem: Move Zeroes
 * --------------------
 * Given an array, move all 0's to the end while maintaining the relative order of non-zero elements.
 *
 * Example:
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 *
 * Approach: Use two pointers to track the position of non-zero elements and fill in zeros at the end.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class MoveZeroes {
    public static int [] moveZeroes(int [] nums){
        int mostLeftZeroIndex = 0;
        int rightCounter = 1;

        if(nums.length < 2) return nums;
        while(rightCounter < nums.length){
            if(nums[mostLeftZeroIndex] != 0){
                mostLeftZeroIndex++;
                rightCounter++;
            }
            else if(nums[rightCounter] == 0){
                rightCounter++;
            }
            else {
                int temp = nums[mostLeftZeroIndex];
                nums[mostLeftZeroIndex] = nums[rightCounter];
                nums[rightCounter] = temp;
                mostLeftZeroIndex++;
                rightCounter++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] digits = {9,9,9,0,0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeroes(digits)));
    }
}

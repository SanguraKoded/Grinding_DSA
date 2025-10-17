package arrays;

import java.util.*;
/**
 * Problem: 3Sum
 * --------------
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
 * such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 *
 * Example:
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 *
 * Approach: Sort the array and use two pointers to find pairs that sum to the negative of the current element.
 * Time Complexity: O(n^2)
 * Space Complexity: O(n) for the result list
 */

class ThreeSumSolution{

    public static List<List<Integer>> solution3Sum(int[] numbers){
        List<List<Integer>> result = new ArrayList<>();
        if(numbers.length<3 || numbers==null){
            return result;
        }
        Arrays.sort(numbers);

        for(int i = 0; i<numbers.length-2; i++){
            if(i>0 && numbers[i]==numbers[i-1]){
                continue;
            }
            int left = i+1;
            int right = numbers.length-1;
            while(left<right){
                int sum = numbers[i] + numbers[left] + numbers[right];
                if(sum==0){
                    result.add(Arrays.asList(numbers[i], numbers[left], numbers[right]));
                    while(left<right && numbers[left]==numbers[left+1]){
                        left++;
                    }
                    while(left<right && numbers[right]==numbers[right-1]){
                        right--;
                    }

                    left++;
                    right--;
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(solution3Sum(nums));
    }
}
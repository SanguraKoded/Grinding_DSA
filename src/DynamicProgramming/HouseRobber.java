package DynamicProgramming;

public class HouseRobber {

    public int houseRobber(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        int twoMaxAgo = nums[0];
        int prevMax = Math.max(nums[0], nums[1]);
        int currentMax = 0;
        for(int i = 2; i<nums.length; i++){
            currentMax = Math.max(prevMax, twoMaxAgo + nums[i]);
            twoMaxAgo = prevMax;
            prevMax = currentMax;
        }
        return currentMax;
    }
    public static void main(String[] args) {
        HouseRobber hr = new HouseRobber();
        int[] houses = {2,7,9,3,1};
        System.out.println(hr.houseRobber(houses)); // Output: 12
    }
}

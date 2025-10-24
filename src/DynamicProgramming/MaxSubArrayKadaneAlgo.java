package DynamicProgramming;

public class MaxSubArrayKadaneAlgo {

    public int maxArray(int [] nums){

        int maxSoFar = nums[0];
        int currentSoFar = nums[0];

        for(int i=1; i<nums.length; i++){
            if(currentSoFar<0){
                currentSoFar = nums[i];
            } else {
                currentSoFar += nums[i];
            }
            maxSoFar = Math.max(maxSoFar, currentSoFar);
        }
        return maxSoFar;
    }
    public static void main(String[] args) {
        MaxSubArrayKadaneAlgo msa = new MaxSubArrayKadaneAlgo();
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(msa.maxArray(nums));
    }
}

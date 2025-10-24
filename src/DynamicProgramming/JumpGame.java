package DynamicProgramming;

public class JumpGame {

    public boolean jump(int[] nums) {
        int maxJump = 0;
        for(int i=0; i<nums.length; i++){
            if(i>maxJump){
                return false;
            }
            maxJump=Math.max(maxJump, i+nums[i]);
        }
        return true;
    }
    public static  void main(String[] args) {
        JumpGame j = new JumpGame();
        int [] nums = {2,0,0,1,4};
        System.out.println(j.jump(nums));
    }
}

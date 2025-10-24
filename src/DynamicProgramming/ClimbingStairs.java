package DynamicProgramming;

import java.util.*;

public class ClimbingStairs {

    Hashtable<Integer, Integer> memo = new Hashtable<Integer, Integer>();
    public int climbStairs(int n){
        if(n==1 || n==0){
            return 1;
        }
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        int ways = climbStairs(n-1) + climbStairs(n-2);
        memo.put(n, ways);
        return ways;
    }
    public static void main(String[] args) {
        ClimbingStairs cs = new ClimbingStairs();
        System.out.println(cs.climbStairs(3)); // Output: 8
    }
}

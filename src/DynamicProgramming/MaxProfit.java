package DynamicProgramming;

public class MaxProfit {

    public int maxProfit(int [] prices){

        if(prices == null || prices.length ==0){
            return 0;
        }
        int max = 0;
        int low = prices[0];
        for(int i = 1; i<prices.length; i++){

            max = Math.max(max, prices[i]-low);
            low = Math.min(low, prices[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        MaxProfit mp = new MaxProfit();
        System.out.println(mp.maxProfit(new int [] {7,1,5,3,6,4}));
    }
}

import java.util.*;

/**
 * Problem: Best Time to Buy and Sell Stock II
 * ------------------------------------------
 * Given an array of stock prices, find the maximum profit by buying and selling multiple times.
 * You may buy and sell multiple times as long as you sell before buying again.
 *
 * Example:
 * Input: [7,1,5,3,6,4]
 * Output: 7 (Buy at 1, sell at 5; buy at 3, sell at 6)
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class MaxProfit {
    public static int maxProfit(int[] prices) {
        int totalProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                totalProfit += prices[i] - prices[i - 1];
            }
        }
        return totalProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println("Max Profit: " + maxProfit(prices));
    }
}

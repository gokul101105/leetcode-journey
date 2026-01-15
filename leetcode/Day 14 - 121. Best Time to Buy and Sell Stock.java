/**
 * LeetCode Journey - Day 14
 *
 * Problem Name: 121. Best Time to Buy and Sell Stock
 * Difficulty: Easy
 *
 * Problem:
 * Find the maximum profit by choosing one day to buy
 * and a later day to sell.
 *
 * Approach:
 * Step 1: Pick a buying day.
 * Step 2: Pick a selling day after it.
 * Step 3: Calculate and track maximum profit.
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 */

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }
}

/**
- LeetCode Journey - Day 15
-
- Problem Name: Best Time to Buy and Sell Stock II
- Difficulty: Easy
-
- Problem:
- Find the maximum profit by buying and selling stocks any number of times.
-
- LeetCode Link:
- https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
-
- Approach:
-
- Step 1:
- Traverse the price array from day 1 to the last day.
-
- Step 2:
- If today’s price is greater than yesterday’s price, add the difference to profit.
-
- Step 3:
- Continue this for all days to get total profit.
-
- Time Complexity: O(n)
- Space Complexity: O(1)
*/

import java.util.*;

class Solution {
    public int maxProfit(int[] pri) {
        int profit = 0;

        for (int i = 1; i < pri.length; i++) {
            if (pri[i] > pri[i - 1]) {
                profit += pri[i] - pri[i - 1];
            }
        }
        return profit;
    }
}

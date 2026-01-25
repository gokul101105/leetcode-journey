/**
 * LeetCode Journey - Day 24
 * 
 * Problem Name: Candy
 * Difficulty: Hard
 * 
 * Problem:
 * Given ratings of children standing in a line, distribute candies such that:
 * each child has at least one candy, and children with a higher rating than
 * their neighbors get more candies. Return the minimum candies required.
 * 
 * LeetCode Link:
 * https://leetcode.com/problems/candy/
 * 
 * Approach:
 * 
 *  - Step 1:
 *    Initialize a candies array where each child gets at least 1 candy.
 * 
 *  - Step 2:
 *    Traverse from left to right. If a child has a higher rating than the
 *    left neighbor, give them one more candy than the left neighbor.
 * 
 *  - Step 3:
 *    Traverse from right to left. If a child has a higher rating than the
 *    right neighbor, update their candies to ensure it is greater than the
 *    right neighbor, without reducing previous assignments. Sum candies.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.*;

class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];
        Arrays.fill(candies, 1);

        // Left to right pass
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Right to left pass - update in place and sum
        int total = candies[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
            total += candies[i];
        }

        return total;
    }
}

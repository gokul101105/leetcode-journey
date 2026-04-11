/**
 * LeetCode Journey - Day 62
 * 
 * Problem Name: Maximum Product of Three Numbers
 * Difficulty: Easy
 * 
 * Problem:
 * Find the maximum product of any three numbers in the array.
 * 
 * LeetCode Link:
 * https://leetcode.com/problems/maximum-product-of-three-numbers/
 * 
 * Approach:
 * 
 *    - Step 1:
 *      Sort the array in ascending order.
 * 
 *    - Step 2:
 *      Calculate two possible products:
 *        1) Product of the three largest numbers
 *        2) Product of the two smallest numbers and the largest number
 * 
 *    - Step 3:
 *      Return the maximum of the above two values.
 * 
 * Why this works:
 * - The largest product can come from:
 *   (a) Three biggest positive numbers
 *   (b) Two negative numbers (very small) × one large positive
 *     because negative × negative = positive
 * 
 * Time Complexity:
 * O(n log n)  // due to sorting
 * 
 * Space Complexity:
 * O(1)        // no extra space used
 */

import java.util.*;

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        return Math.max(
            nums[n - 1] * nums[n - 2] * nums[n - 3], // 3 largest
            nums[0] * nums[1] * nums[n - 1]          // 2 smallest + largest
        );
    }
}

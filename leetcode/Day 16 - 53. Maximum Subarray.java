/**
 * LeetCode Journey - Day 16
 *
 * Problem Name: Maximum Subarray
 * Difficulty: Medium
 *
 * Problem:
 * Given an integer array nums, find the contiguous subarray
 * (containing at least one number) which has the largest sum.
 *
 * LeetCode Link:
 * https://leetcode.com/problems/maximum-subarray/
 *
 * Simple Approach (Kadane’s Algorithm):
 *
 * Step 1:
 * Start with the first element as the maximum sum.
 *
 * Step 2:
 * Traverse the array and keep a running sum.
 * If the running sum becomes negative, reset it to 0.
 *
 * Step 3:
 * At each step, update the maximum sum.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int maxSubArray(int[] nums) {

        int maxSum = nums[0];   // stores the maximum subarray sum
        int currentSum = 0;    // stores current running sum

        for (int i = 0; i < nums.length; i++) {

            if (currentSum < 0) {
                currentSum = 0;   // reset if sum becomes negative
            }

            currentSum = currentSum + nums[i];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}

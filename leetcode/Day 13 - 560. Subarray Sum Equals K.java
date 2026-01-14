/**
 * LeetCode Journey - Day 13
 *
 * Problem Name: 560. Subarray Sum Equals K
 * Difficulty: Medium
 *
 * Problem:
 * Count the number of continuous subarrays whose sum equals k.
 *
 * Approach:
 * Step 1: Fix a starting index.
 * Step 2: Add elements one by one to form subarrays.
 * Step 3: If subarray sum == k, increase count.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }
}

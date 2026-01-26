/**
 * 
 * - LeetCode Journey - Day 25
 * 
 * - Problem Name:
 *   Minimum Size Subarray Sum
 * 
 * - Difficulty:
 *   Medium
 * 
 * - Problem:
 *   Given an array of positive integers nums and a positive integer target,
 *   return the minimal length of a contiguous subarray of which the sum is
 *   greater than or equal to target. If there is no such subarray, return 0.
 * 
 * - LeetCode Link:
 *   https://leetcode.com/problems/minimum-size-subarray-sum/
 * 
 * - Approach:
 *   Sliding Window (Two Pointers)
 * 
 *   - Step 1:
 *     Initialize windowStart = 0, windowSum = 0, and minLength = Integer.MAX_VALUE
 * 
 *   - Step 2:
 *     Expand the window using windowEnd, add nums[windowEnd] to windowSum
 * 
 *   - Step 3:
 *     While windowSum >= target, try to shrink the window from the left
 *     and update the minimum length
 * 
 * - Time Complexity:
 *   O(n)
 * 
 * - Space Complexity:
 *   O(1)
 */

class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int minLength = Integer.MAX_VALUE;
        int windowStart = 0;
        int windowSum = 0;

        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            windowSum += nums[windowEnd];

            while (windowSum >= target) {
                minLength = Math.min(minLength, windowEnd - windowStart + 1);
                windowSum -= nums[windowStart];
                windowStart++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}

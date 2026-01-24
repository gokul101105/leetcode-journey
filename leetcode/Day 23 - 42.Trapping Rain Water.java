/**
 *
 * - LeetCode Journey - Day 23
 *
 * - Problem Name: Trapping Rain Water
 * - Difficulty: Hard
 *
 * - Problem:
 *   Given n non-negative integers representing an elevation map where the width
 *   of each bar is 1, compute how much water it can trap after raining.
 *
 * - LeetCode Link:
 *   https://leetcode.com/problems/trapping-rain-water/
 *
 * - Approach: Two Pointer Technique
 *
 *   - Step 1:
 *     Initialize two pointers `left` at start and `right` at end.
 *     Also maintain `maxLeft` and `maxRight` to store the maximum height
 *     seen so far from both sides.
 *
 *   - Step 2:
 *     Move the pointer with the smaller max height.
 *     If `maxLeft < maxRight`, move `left` pointer, else move `right`.
 *
 *   - Step 3:
 *     For each move, calculate trapped water as:
 *     maxHeightSoFar - currentHeight
 *     and add it to total water.
 *
 * - Time Complexity: O(n)
 * - Space Complexity: O(1)
 */

class Solution {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int maxLeft = height[left];
        int maxRight = height[right];
        int water = 0;

        while (left < right) {
            if (maxLeft < maxRight) {
                left++;
                maxLeft = Math.max(maxLeft, height[left]);
                water += maxLeft - height[left];
            } else {
                right--;
                maxRight = Math.max(maxRight, height[right]);
                water += maxRight - height[right];
            }
        }
        return water;
    }
}

/**
 * LeetCode Journey - Day 3#
 *
 * Problem Name: Valid Mountain Array
 * Difficulty: Easy
 *
 * Problem:
 * Given an array of integers, return true if it is a valid mountain array.
 * A mountain array must strictly increase and then strictly decrease.
 *
 * LeetCode Link:
 * https://leetcode.com/problems/valid-mountain-array/
 *
 * Approach:
 * - A mountain must have at least 3 elements.
 * - First, move forward while the array is strictly increasing.
 * - If no increase happens or the peak is at the last index, return false.
 * - After reaching the peak, move forward while the array is strictly decreasing.
 * - If we reach the end of the array, it is a valid mountain.
 *
 * Time Complexity:
 * O(n), because we traverse the array only once.
 *
 * Space Complexity:
 * O(1), no extra space is used.
 */

class Solution {
    public boolean validMountainArray(int[] arr) {

        if (arr.length < 3) {
            return false;
        }

        int i = 0;

        // Walk up the mountain
        while (i < arr.length - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        // Peak cannot be first or last
        if (i == 0 || i == arr.length - 1) {
            return false;
        }

        // Walk down the mountain
        while (i < arr.length - 1 && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == arr.length - 1;
    }
}

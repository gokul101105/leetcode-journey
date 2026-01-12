/**
 * LeetCode Journey - Day 11
 *
 * Problem Name: Two Sum
 * Difficulty: Easy
 *
 * Problem:
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 *
 * LeetCode Link:
 * https://leetcode.com/problems/two-sum/
 *
 * Approach:
 *
 * Step 1:
 * Create a HashMap to store numbers and their indices.
 *
 * Step 2:
 * Traverse the array and calculate the difference:
 * diff = target - currentElement.
 *
 * Step 3:
 * If diff already exists in the map, return current index
 * and the stored index. Otherwise, store current number and index.
 *
 * Time Complexity:
 * O(n) — single pass through the array
 *
 * Space Complexity:
 * O(n) — HashMap stores elements
 */

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        int sizeOfArray = nums.length;

        for (int i = 0; i < sizeOfArray; i++) {
            int diff = target - nums[i];

            if (numToIndex.containsKey(diff)) {
                return new int[] { i, numToIndex.get(diff) };
            }

            numToIndex.put(nums[i], i);
        }

        return null; // as per problem, exactly one solution exists
    }
}

/**
 * LeetCode Journey - Day 65
 * 
 * Problem Name: Missing Number
 * Difficulty: Easy
 * 
 * Problem:
 * Given an array nums containing n distinct numbers in the range [0, n]
 * return the only number in the range that is missing from the array.
 * 
 * LeetCode Link:
 * https://leetcode.com/problems/missing-number/
 * 
 * Approach:
 * 
 *    - Step 1:
 *      Initialize a variable 'sum' to store the sum of elements in the array.
 * 
 *    - Step 2:
 *      Traverse the array and calculate the total sum of given elements.
 * 
 *    - Step 3:
 *      Calculate the expected sum of numbers from 0 to n using formula:
 *      n * (n + 1) / 2
 * 
 *    - Step 4:
 *      Subtract the actual array sum from expected sum.
 * 
 *    - Step 5:
 *      The result gives the missing number.
 * 
 * Why this works:
 * - The array should contain all numbers from 0 to n.
 * - Using the mathematical formula, we get the total expected sum.
 * - The difference between expected sum and actual sum gives the missing value.
 * 
 * Time Complexity:
 * O(n)  // single traversal of array
 * 
 * Space Complexity:
 * O(1)  // no extra space used
 */

import java.util.*;

class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }

        int actual = (n) * (n + 1) / 2;
        int result = actual - sum;

        return result;
    }
}

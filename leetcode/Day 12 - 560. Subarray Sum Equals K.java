/**
 * 
 * - LeetCode Journey - Day 12
 * 
 * - Problem Name: Subarray Sum Equals K
 * - Difficulty: Medium
 * 
 * - Problem:
 * Given an integer array `nums` and an integer `k`,
 * return the total number of continuous subarrays whose sum equals `k`.
 * 
 * - LeetCode Link:
 * https://leetcode.com/problems/subarray-sum-equals-k/
 * 
 * - Approach (Simple / Brute Force):
 * 
 *   - Step 1:
 *     Fix a starting index `i` and assume a new subarray begins from there.
 * 
 *   - Step 2:
 *     From index `i`, keep adding elements one by one using another index `j`
 *     and calculate the running sum.
 * 
 *   - Step 3:
 *     Every time the r*

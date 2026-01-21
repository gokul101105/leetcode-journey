/**
 *
 * - LeetCode Journey - Day 20
 *
 * - Problem Name: Longest Consecutive Sequence
 * - Difficulty: Medium
 *
 * - Problem:
 *   Given an unsorted array of integers, find the length of the longest
 *   consecutive elements sequence.
 *
 * - LeetCode Link:
 *   https://leetcode.com/problems/longest-consecutive-sequence/
 *
 * - Approach (Simple):
 *
 *   - Step 1:
 *     Put all numbers into a HashSet for O(1) lookup.
 *
 *   - Step 2:
 *     For each number, check if it is the start of a sequence
 *     (i.e., number - 1 does NOT exist).
 *
 *   - Step 3:
 *     From that start, keep checking next numbers (number + 1)
 *     and count the sequence length.
 *
 * - Time Complexity:
 *   O(n)
 *
 * - Space Complexity:
 *   O(n)
 *
 */

import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longest = 1;

        for (int num : set) {

            // start only if previous number does not exist
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int count = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}

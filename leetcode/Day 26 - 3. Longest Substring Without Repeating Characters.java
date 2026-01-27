/**
 * 
 * - LeetCode Journey - Day 26
 * 
 * - Problem Name:
 *   Longest Substring Without Repeating Characters
 * 
 * - Difficulty:
 *   Medium
 * 
 * - Problem:
 *   Given a string s, find the length of the longest substring without repeating characters.
 * 
 * - LeetCode Link:
 *   https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * 
 * - Approach:
 *   Sliding Window + HashSet
 * 
 *   - Step 1:
 *     Use two pointers (left and right) to maintain a sliding window.
 * 
 *   - Step 2:
 *     Expand the window by moving the right pointer.
 *     If a duplicate character is found, shrink the window from the left
 *     until the duplicate is removed.
 * 
 *   - Step 3:
 *     Track the maximum window size during the process.
 * 
 * - Time Complexity:
 *   O(n)
 * 
 * - Space Complexity:
 *   O(min(n, 26))  // HashSet for unique characters
 * 
 */

import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}

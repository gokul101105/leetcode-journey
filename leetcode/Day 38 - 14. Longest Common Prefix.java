/**   
 * LeetCode Journey - Day 38
 *
 * Problem Name: Longest Common Prefix
 * Difficulty: Easy
 *
 * Problem:
 * Given an array of strings, return the longest common prefix 
 * among them. If there is no common prefix, return an empty string "".
 *
 * LeetCode Link:
 * https://leetcode.com/problems/longest-common-prefix/
 *
 * Approach:
 *
 * Step 1:
 * Sort the array of strings lexicographically.
 *
 * Step 2:
 * Compare only the first and last string in the sorted array.
 * (They will be the most different.)
 *
 * Step 3:
 * Iterate character by character up to the minimum length
 * of both strings and build the common prefix.
 *
 * Time Complexity:
 * O(n log n)  -> Because of sorting
 *
 * Space Complexity:
 * O(1)        -> Ignoring output storage
 */

import java.util.*;

class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0)
            return "";

        StringBuilder sb = new StringBuilder();

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return sb.toString();
            }
            sb.append(first.charAt(i));
        }

        return sb.toString();
    }
}

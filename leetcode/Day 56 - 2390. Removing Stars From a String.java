/**
 * LeetCode Journey - Day 56
 * 
 * Problem Name: Removing Stars From a String
 * Difficulty: Medium
 * 
 * Problem:
 * Given a string containing letters and '*' characters, remove each '*' along with   
 * the closest non-star character to its left, and return the final string 
 * 
 * LeetCode Link:
 * https://leetcode.com/problems/removing-stars-from-a-string/
 * 
 * Approach:
 * 
 * - Step 1:
 *   Create a StringBuilder to simulate a stack-like structure.
 * 
 * - Step 2:
 *   Traverse each character in the string:
 *   - If the character is not '*', append it to StringBuilder.
 *   - If the character is '*', remove the last character from StringBuilder.
 * 
 * - Step 3:
 *   After processing all characters, convert StringBuilder to string and return it.
 * 
 * Time Complexity:
 * O(n)
 * 
 * Space Complexity:
 * O(n)
 */

import java.util.*;

class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}

/**
 * LeetCode Journey - Day 54
 * 
 * Problem Name: Determine if Two Strings Are Close
 * Difficulty: Medium
 * 
 * Problem:
 * Given two strings word1 and word2, return true if you can transform word1 into word2
 * using any number of allowed operations. Otherwise, return false.
 * 
 * LeetCode Link:
 * https://leetcode.com/problems/determine-if-two-strings-are-close/
 * 
 * Approach:
 * 
 * - Step 1:
 *   Create two frequency arrays of size 26 to count occurrences of each character
 *   in word1 and word2.
 * 
 * - Step 2:
 *   Check if both strings contain the same set of characters.
 *   If a character exists in one string but not the other, return false.
 * 
 * - Step 3:
 *   Sort both frequency arrays and compare them.
 *   If sorted frequencies are equal, return true; otherwise return false.
 * 
 * Time Complexity:
 * O(n log 26) ≈ O(n)
 * 
 * Space Complexity:
 * O(1)
 */

import java.util.*;

class Solution {
    public boolean closeStrings(String word1, String word2) {  
        int arr1[] = new int[26];
        int arr2[] = new int[26];

        // Count frequency of each character in word1
        for (int i = 0; i < word1.length(); i++) {
            char ch = word1.charAt(i);
            arr1[ch - 'a'] += 1;
        }

        // Count frequency of each character in word2
        for (int i = 0; i < word2.length(); i++) {
            char ch = word2.charAt(i);
            arr2[ch - 'a'] += 1;
        }

        // Ensure both strings have the same set of characters
        for (int i = 0; i < 26; i++) {
            if ((arr1[i] != 0 && arr2[i] == 0) || (arr1[i] == 0 && arr2[i] != 0)) {
                return false;
            }
        }

        // Sort frequency arrays and compare them
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}

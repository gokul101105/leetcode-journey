/**
 * LeetCode Journey - Day 64
 * 
 * Problem Name: Valid Anagram
 * Difficulty: Easy
 * 
 * Problem:
 * Determine if two strings s and t are anagrams of each other.
 * An anagram means both strings contain the same characters 
 * with the same frequency, but possibly in different order.
 * 
 * LeetCode Link:
 * https://leetcode.com/problems/valid-anagram/
 * 
 * Approach:
 * 
 *    - Step 1:
 *      If lengths of s and t are not equal → return false.
 * 
 *    - Step 2:
 *      Use a HashMap to store frequency of characters from string s.
 * 
 *    - Step 3:
 *      Traverse string t and decrease frequency from the map.
 * 
 *    - Step 4:
 *      If a character is not found OR its count becomes 0 → return false.
 * 
 *    - Step 5:
 *      If all checks pass → return true.
 * 
 * Why this works:
 * - Anagrams must have identical character counts.
 * - We increment counts for s and decrement for t.
 * - If any mismatch occurs → not an anagram.
 * 
 * Time Complexity:
 * O(n)  // single pass for both strings
 * 
 * Space Complexity:
 * O(1)  // at most 26 characters (constant space)
 */

import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);

            if (!map.containsKey(c) || map.get(c) == 0) {
                return false;
            }

            map.put(c, map.getOrDefault(c, 0) - 1);
        }

        return true;
    }
}

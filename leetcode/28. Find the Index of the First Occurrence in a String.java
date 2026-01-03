/**
 * LeetCode Journey - Day 2
 *
 * Problem Name: Find the Index of the First Occurrence in a String
 * Difficulty: Easy
 *
 * Problem:
 * Given two strings haystack and needle, return the index of the first
 * occurrence of needle in haystack. If needle is not found, return -1.
 *
 * LeetCode Link:
 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
 *
 * Approach:
 * - Loop through each character of the haystack string.
 * - When the first character of needle matches, start comparing
 *   characters one by one.
 * - Use two pointers to compare needle and haystack.
 * - If all characters match, return the starting index.
 * - If no match is found, return -1.
 *
 * Time Complexity:
 * - O(n * m), where n is the length of haystack and m is the length of needle.
 *
 * Space Complexity:
 * - O(1), no extra space is used.
 */

class Solution {
    public int strStr(String haystack, String needle) {

        for (int i = 0; i < haystack.length(); i++) {

            if (haystack.charAt(i) == needle.charAt(0)) {

                int j = 0;
                int k = i;

                while (j < needle.length()
                        && k < haystack.length()
                        && needle.charAt(j) == haystack.charAt(k)) {

                    j++;
                    k++;

                    if (j == needle.length()) {
                        return i;
                    }
                }
            }
        }

        return -1;
    }
}

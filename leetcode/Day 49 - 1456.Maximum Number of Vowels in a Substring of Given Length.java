/**
 * LeetCode Journey - Day 49
 * 
 * Problem Name: Maximum Number of Vowels in a Substring of Given Length
 * Difficulty: Medium
 * 
 * Problem:
 * Given a string s and an integer k, return the maximum number of vowel
 * letters present in any substring of length k.
 * 
 * LeetCode Link:
 * https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/
 * 
 * Approach: Sliding Window
 * 
 *    Step 1:
 *    Store all vowels (a, e, i, o, u) inside a HashSet for quick lookup.
 * 
 *    Step 2:
 *    Use a sliding window of size k.
 *    Move the right pointer through the string and count vowels.
 * 
 *    Step 3:
 *    If window size becomes greater than k, remove the left character
 *    from the window and update the vowel count if needed.
 * 
 *    Step 4:
 *    Update the maximum vowel count seen so far.
 * 
 * Time Complexity:
 * O(n)
 * 
 * Space Complexity:
 * O(1)
 */

import java.util.*;

class Solution {

    public int maxVowels(String s, int k) {

        Set<Character> vowel = new HashSet<>(Arrays.asList('a','e','i','o','u'));

        int left = 0;
        int res = 0;
        int count = 0;

        for(int right = 0; right < s.length(); right++){

            // Add new character to window
            if(vowel.contains(s.charAt(right))){
                count++;
            }

            // Maintain window size k
            if(right - left + 1 > k){
                if(vowel.contains(s.charAt(left))){
                    count--;
                }
                left++;
            }

            // Update maximum vowels
            res = Math.max(res, count);
        }

        return res;
    }
}

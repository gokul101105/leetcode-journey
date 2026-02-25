/**
 
- LeetCode Journey - Day 45
- 
- Problem Name: Reverse Vowels of a String
- Difficulty: Easy
- 
- Problem:
- Given a string s, reverse only the vowels in the string and return the updated string.
- 
- LeetCode Link:
- https://leetcode.com/problems/reverse-vowels-of-a-string/
- 
- Approach:
- 
    - Step 1:
        Convert the string into a character array for easy swapping.
 
    - Step 2:
        Use two pointers (start = 0, end = n-1).
        Move start forward until it finds a vowel.
        Move end backward until it finds a vowel.
 
    - Step 3:
        Swap both vowels, then move both pointers inward.
        Repeat until start < end.
 
- Time Complexity:
    O(n)  → Each character is visited at most once.
 
- Space Complexity:
    O(n)  → For character array conversion.
*/

import java.util.*;

class Solution {
    public String reverseVowels(String s) {
        char[] strs = s.toCharArray();
        String vowels = "AEIOUaeiou";
        
        int start = 0;
        int end = strs.length - 1;

        while (start < end) {

            while (start < end && vowels.indexOf(strs[start]) == -1) {
                start++;
            }

            while (start < end && vowels.indexOf(strs[end]) == -1) {
                end--;
            }

            char temp = strs[start];
            strs[start] = strs[end];
            strs[end] = temp;

            start++;
            end--;
        }

        return new String(strs);
    }
}

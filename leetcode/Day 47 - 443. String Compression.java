/**
 
- LeetCode Journey - Day 47
- 
- Problem Name: String Compression
- Difficulty: Medium
- 
- Problem:
- Given an array of characters, compress it in-place by replacing
  consecutive repeating characters with the character followed by
  the count (if count > 1). Return the new length.
- 
- LeetCode Link:
- https://leetcode.com/problems/string-compression/
- 
- Approach:
    - Step 1: Use two pointers (read and write).
    - Step 2: Count consecutive repeating characters using read pointer.
    - Step 3: Write character and its count (if >1) using write pointer.
 
- Time Complexity: O(n)
- Space Complexity: O(1)
 
*/

import java.util.*;

class Solution {
    public int compress(char[] chars) {

        int read = 0;     // Pointer to read characters
        int write = 0;    // Pointer to write compressed result

        while (read < chars.length) {

            int count = 0;
            char current = chars[read];

            // Count consecutive same characters
            while (read < chars.length && chars[read] == current) {
                read++;
                count++;
            }

            // Write the character
            chars[write] = current;
            write++;

            // If count > 1, write the digits of count
            if (count > 1) {
                for (char ch : String.valueOf(count).toCharArray()) {
                    chars[write] = ch;
                    write++;
                }
            }
        }

        return write;   // Return new compressed length
    }
}

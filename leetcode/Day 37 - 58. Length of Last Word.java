/**
 * LeetCode Journey - Day 37
 * 
 * Problem Name: Length of Last Word
 * Difficulty: Easy
 * 
 * Problem:
 * Given a string consisting of words and spaces,
 * return the length of the last word.
 * A word is a sequence of non-space characters.
 * 
 * LeetCode Link:
 * https://leetcode.com/problems/length-of-last-word/
 * 
 * Approach (Best Greedy Traversal):
 * 
 * Step 1:
 * Start from the END of the string.
 * Ignore trailing spaces.
 * 
 * Step 2:
 * Once the first letter is found,
 * start counting characters.
 * 
 * Step 3:
 * Stop when a space appears again
 * or the string starts.
 * 
 * Time Complexity: O(n)
 * (In worst case we scan the string once.)
 * 
 * Space Complexity: O(1)
 * (No extra memory used.)
 */

class Solution {
    public int lengthOfLastWord(String s) {

        int length = 0;
        int i = s.length() - 1;

        // Step 1: Skip trailing spaces
        while(i >= 0 && s.charAt(i) == ' '){
            i--;
        }

        // Step 2: Count last word characters
        while(i >= 0 && s.charAt(i) != ' '){
            length++;
            i--;
        }

        return length;
    }
}

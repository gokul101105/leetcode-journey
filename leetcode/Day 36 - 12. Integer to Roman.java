/**
 * LeetCode Journey - Day 36
 * 
 * Problem Name: Integer to Roman
 * Difficulty: Medium
 * 
 * Problem:
 * Convert an integer into its Roman numeral representation.
 * Roman numerals use symbols like I, V, X, L, C, D, M with special subtraction cases (IV, IX, etc.).
 * 
 * LeetCode Link:
 * https://leetcode.com/problems/integer-to-roman/
 * 
 * Approach:
 * 
 * Step 1:
 * Create two arrays:
 * - One for integer values.
 * - One for corresponding Roman symbols.
 * Arrange them in descending order.
 * 
 * Step 2:
 * Traverse the values array and check:
 * While the number is greater than or equal to the current value,
 * append the symbol and subtract the value from the number.
 * 
 * Step 3:
 * Continue until the number becomes zero.
 * The built string is the final Roman numeral.
 * 
 * Time Complexity: O(1)
 * (Because the number of Roman symbols is fixed — only 13.)
 * 
 * Space Complexity: O(1)
 * (Ignoring the output string.)
 */

import java.util.*;

class Solution {
    public String intToRoman(int num) {

        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < values.length; i++){

            while(num >= values[i]){
                sb.append(symbols[i]);
                num -= values[i];
            }

            if(num == 0){
                break;
            }
        }

        return sb.toString();
    }
}

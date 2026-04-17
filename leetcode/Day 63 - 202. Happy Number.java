/**
 * LeetCode Journey - Day 63
 * 
 * Problem Name: Happy Number
 * Difficulty: Easy
 * 
 * Problem:
 * Determine if a number is a happy number.
 * A happy number is defined as a number which eventually reaches 1 
 * when replaced by the sum of the squares of its digits repeatedly.
 * If it loops endlessly without reaching 1, it is not a happy number.
 * 
 * LeetCode Link:
 * https://leetcode.com/problems/happy-number/
 * 
 * Approach:
 * 
 *    - Step 1:
 *      Use a loop to repeatedly calculate the sum of squares of digits.
 * 
 *    - Step 2:
 *      Extract each digit using modulus (%) and divide (/) operations.
 * 
 *    - Step 3:
 *      Replace the number with the computed sum.
 * 
 *    - Step 4:
 *      Stop when:
 *        1) n becomes 1 → Happy Number
 *        2) n becomes 4 → Cycle detected (Not Happy)
 * 
 * Why this works:
 * - Every non-happy number eventually falls into a known cycle:
 *   4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4
 * - If we reach 1 → happy
 * - If we reach 4 → stuck in loop → not happy
 * 
 * Time Complexity:
 * O(log n)  // per iteration (digit processing)
 * 
 * Space Complexity:
 * O(1)      // no extra space used
 */

import java.util.*;

class Solution {
    public boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }

            n = sum;
        }

        return n == 1;
    }
}

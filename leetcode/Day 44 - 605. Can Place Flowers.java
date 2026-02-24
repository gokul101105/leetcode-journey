/**
 
- LeetCode Journey - Day 44
- 
- Problem Name: Can Place Flowers
- Difficulty: Easy
- 
- Problem:
- Given a flowerbed (0 = empty, 1 = planted) and an integer n,
- return true if n new flowers can be planted without violating the no-adjacent-flowers rule.
- 
- LeetCode Link:
- https://leetcode.com/problems/can-place-flowers/ 
- 
- Approach:
- 
    - Step 1:
        Traverse the flowerbed array from left to right.
 
    - Step 2:
        For each position i, check:
            • f[i] == 0 (current spot empty)
            • Left spot is empty OR i == 0
            • Right spot is empty OR i == last index
 
    - Step 3:
        If valid, plant flower (set f[i] = 1) and decrement n.
        Stop early if n becomes 0.
 
- Time Complexity:
    O(n) → We traverse the array once.
 
- Space Complexity:
    O(1) → No extra space used.
*/

import java.util.*;

class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        for(int i = 0; i < f.length; i++){
            if(f[i] == 0 &&
               (i == 0 || f[i-1] == 0) &&
               (i == f.length-1 || f[i+1] == 0)){
                   
                f[i] = 1;
                n--;
                
                if(n == 0) return true;  // early stop
            }
        }
        return n <= 0;
    }
}

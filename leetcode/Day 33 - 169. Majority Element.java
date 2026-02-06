/**
- LeetCode Journey - Day 33
-
- Problem Name:
- Majority Element 
-
- Difficulty:
- Easy  
-
- Problem:  
- Given an array `nums` of size `n`, return the element that appears more than ⌊n / 2⌋ times.
- You may assume that the majority element always exists in the array.
-
- LeetCode Link:
- https://leetcode.com/problems/majority-element/
-
- Approach:
-
    - Step 1:
      Use a HashMap to store the frequency of each element.
-
    - Step 2:
      Traverse the array and update the count for each number.
-
    - Step 3:
      Track the element with the maximum frequency and return it as the result.
-
- Time Complexity:
- O(n)
-
- Space Complexity:
- O(n)
*/

import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        int result = 0;
        int majority = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);

            if (map.get(n) > majority) {
                result = n;
                majority = map.get(n);
            }
        }
        return result;
    }
}

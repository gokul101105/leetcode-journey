/**
- LeetCode Journey - Day 30
-
- Problem Name:
- Merge Sorted Array
-
- Difficulty:
- Easy
-
- Problem:
- You are given two sorted integer arrays nums1 and nums2, and integers m and n.
- Merge nums2 into nums1 as one sorted array in-place.
-
- LeetCode Link:
- https://leetcode.com/problems/merge-sorted-array/
-
- Approach:
- Use three pointers starting from the end of both arrays.
-
    - Step 1:
    - Initialize pointers:
        midx = m - 1 (last valid element of nums1)
        nidx = n - 1 (last element of nums2)
        right = m + n - 1 (last index of nums1)

    - Step 2:
    - Compare nums1[midx] and nums2[nidx].
    - Place the larger element at nums1[right].

    - Step 3:
    - Move pointers accordingly and repeat until nums2 is fully merged.
-
- Time Complexity:
- O(m + n)
-
- Space Complexity:
- O(1) (in-place)
*/

import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int midx = m - 1;
        int nidx = n - 1;
        int right = m + n - 1;

        while (nidx >= 0) {
            if (midx >= 0 && nums1[midx] > nums2[nidx]) {
                nums1[right] = nums1[midx];
                midx--;
            } else {
                nums1[right] = nums2[nidx];
                nidx--;
            }
            right--;
        }
    }
}

/**
 * LeetCode Journey - Day 1
 *
 * Problem Name: Pascal's Triangle
 * Difficulty: Easy
 *
 * Problem:
 * Given an integer numRows, return the first numRows of Pascal's Triangle.
 *
 * LeetCode Link:
 * https://leetcode.com/problems/pascals-triangle/
 *
 * Approach:
 * - Create a list to store the final Pascal's Triangle.
 * - Use a loop to generate the triangle row by row.
 * - For each row, iterate through its columns.
 * - If the index is the first or last position in the row, add 1.
 * - Otherwise, calculate the value by adding the two numbers
 *   from the previous row (j - 1 and j).
 * - Add the completed row to the final list.
 * - Return the Pascal's Triangle.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(n²)
 */

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    List<Integer> prevRow = pascal.get(i - 1);
                    row.add(prevRow.get(j - 1) + prevRow.get(j));
                }
            }

            pascal.add(row);
        }

        return pascal;
    }
}

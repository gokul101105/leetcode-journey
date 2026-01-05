/**
 * LeetCode Journey - Day 4
 *
 * Problem Name: Check If It Is a Straight Line (Boomerang)
 * Difficulty: Easy
 *
 * Problem:
 * Given three points on a 2D plane, return true if they form a boomerang.
 * A boomerang means the three points are not in a straight line.
 *
 * LeetCode Link:
 * https://leetcode.com/problems/check-if-it-is-a-boomerang/
 *
 * Approach:
 * - Find the difference in x and y coordinates between the points.
 * - Use slope comparison to check if the points are in a straight line.
 * - If the slopes are different, the points form a boomerang.
 * - If the slopes are the same, the points lie on a straight line.
 *
 * Time Complexity:
 * O(1), only constant calculations are done.
 *
 * Space Complexity:
 * O(1), no extra space is used.
 */

class Solution {
    public boolean isBoomerang(int[][] points) {

        int dx1 = points[1][0] - points[0][0];
        int dy1 = points[1][1] - points[0][1];

        int dx2 = points[2][0] - points[1][0];
        int dy2 = points[2][1] - points[1][1];

        return (dx1 * dy2 != dx2 * dy1);
    }
}

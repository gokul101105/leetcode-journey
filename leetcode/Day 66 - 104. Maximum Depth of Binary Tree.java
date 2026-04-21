/**
 * LeetCode Journey - Day 66
 * 
 * Problem Name: Maximum Depth of Binary Tree
 * Difficulty: Easy
 * 
 * Problem:
 * Given the root of a binary tree, return its maximum depth.
 * The maximum depth is the number of nodes along the longest path 
 * from the root node down to the farthest leaf node.
 * 
 * LeetCode Link:
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * 
 * Approach:
 * 
 *    - Step 1:
 *      Check if the root is null.
 *      If yes, return 0 (no nodes → depth = 0).
 * 
 *    - Step 2:
 *      Recursively calculate the depth of the left subtree.
 * 
 *    - Step 3:
 *      Recursively calculate the depth of the right subtree.
 * 
 *    - Step 4:
 *      Take the maximum of left and right subtree depths.
 * 
 *    - Step 5:
 *      Add 1 to include the current node.
 * 
 * 
 * Time Complexity:
 * O(n)  // visit every node once
 * 
 * Space Complexity:
 * O(h)  // recursion stack (h = height of tree)
 * Worst case: O(n) for skewed tree
 * Best case: O(log n) for balanced tree
 */

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}

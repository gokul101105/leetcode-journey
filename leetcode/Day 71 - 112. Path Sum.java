/**
 * LeetCode Journey - Day 71
 * 
 * Problem Name: Path Sum
 * Difficulty: Easy
 *   
 * Problem:
 * Given the root of a binary tree and an integer targetSum,
 * return true if the tree has a root-to-leaf path such that
 * adding up all the values along the path equals targetSum.
 * 
 * A leaf is a node with no children.
 * 
 * LeetCode Link:
 * https://leetcode.com/problems/path-sum/
 * 
 * Approach:
 * 
 *    - Step 1:
 *      If the current node is null, return false.
 * 
 *    - Step 2:
 *      Check if the current node is a leaf node
 *      (left == null && right == null).
 * 
 *    - Step 3:
 *      If it is a leaf node, check whether
 *      targetSum == node.val.
 *      If yes, return true.
 * 
 *    - Step 4:
 *      Reduce the targetSum by subtracting
 *      current node's value.
 * 
 *    - Step 5:
 *      Recursively check the left subtree
 *      with updated targetSum.
 * 
 *    - Step 6:
 *      Recursively check the right subtree
 *      with updated targetSum.
 * 
 *    - Step 7:
 *      If either left or right returns true,
 *      return true (logical OR).
 * 
 * Time Complexity:
 * O(n)  // Each node visited once
 * 
 * Space Complexity:
 * O(h)  // Recursion stack (height of tree)
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null && targetSum == root.val) {
            return true;
        }

        return hasPathSum(root.right, targetSum - root.val) 
            || hasPathSum(root.left, targetSum - root.val);
    }
}

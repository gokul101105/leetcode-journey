/**
 * LeetCode Journey - Day 69
 * 
 * Problem Name: Balanced Binary Tree
 * Difficulty: Easy
 * 
 * Problem:
 * Given a binary tree, determine if it is height-balanced.
 * A binary tree is balanced if the depth of the two subtrees 
 * of every node never differs by more than 1.
 * 
 * LeetCode Link:
 * https://leetcode.com/problems/balanced-binary-tree/
 * 
 * Approach:
 * 
 *    - Step 1:
 *      Use a helper function to calculate height of the tree.
 * 
 *    - Step 2:
 *      If node is null, return height = 0.
 * 
 *    - Step 3:
 *      Recursively calculate left subtree height.
 *      If it returns -1, tree is already unbalanced → return -1.
 * 
 *    - Step 4:
 *      Recursively calculate right subtree height.
 *      If it returns -1, tree is already unbalanced → return -1.
 * 
 *    - Step 5:
 *      If difference between left and right height > 1,
 *      return -1 (unbalanced).
 * 
 *    - Step 6:
 *      Otherwise, return height = max(left, right) + 1.
 * 
 *    - Step 7:
 *      In main function, check if result != -1 → balanced.
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
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    private int checkHeight(TreeNode root) {
        if (root == null) return 0;

        int leftHeight = checkHeight(root.left);
        if (leftHeight == -1) return -1;

        int rightHeight = checkHeight(root.right);
        if (rightHeight == -1) return -1;

        if (Math.abs(leftHeight - rightHeight) > 1) return -1;

        return Math.max(leftHeight, rightHeight) + 1;
    }
}

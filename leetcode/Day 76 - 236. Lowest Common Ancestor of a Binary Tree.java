/**
 * LeetCode Journey - Day 76
 * 
 * Problem Name:
 * Lowest Common Ancestor of a Binary Tree 
 * 
 * Difficulty:
 * Medium
 * 
 * Problem:
 * Given a binary tree, find the lowest common ancestor
 * (LCA) of two given nodes in the tree.
 * 
 * According to the definition of LCA:
 * 
 * “The lowest common ancestor is defined between two nodes
 * p and q as the lowest node in T that has both p and q
 * as descendants (where we allow a node to be a descendant
 * of itself).”
 * 
 * LeetCode Link:
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
 * 
 * Approach:
 * 
 *    - Step 1:
 *      Use recursion to search both left and right subtrees.
 * 
 *    - Step 2:
 *      Base case:
 * 
 *          - If current node is null,
 *            return null.
 * 
 *          - If current node equals p or q,
 *            return current node.
 * 
 *    - Step 3:
 *      Recursively search left subtree.
 * 
 *    - Step 4:
 *      Recursively search right subtree.
 * 
 *    - Step 5:
 *      If left subtree returns null,
 *      answer exists in right subtree.
 * 
 *    - Step 6:
 *      If right subtree returns null,
 *      answer exists in left subtree.
 * 
 *    - Step 7:
 *      If both left and right are not null,
 *      current node is the Lowest Common Ancestor.
 * 
 * Time Complexity:
 * O(n)  // Visit each node once
 * 
 * Space Complexity:
 * O(h)  // Recursive stack height
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {

    public TreeNode lowestCommonAncestor(
        TreeNode root,
        TreeNode p,
        TreeNode q
    ) {

        // Base case
        if (root == null || root == p || root == q) {
            return root;
        }

        // Search left subtree
        TreeNode left = lowestCommonAncestor(root.left, p, q);

        // Search right subtree
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // If left subtree did not find anything
        if (left == null) {
            return right;
        }

        // If right subtree did not find anything
        else if (right == null) {
            return left;
        }

        // If both sides found nodes
        else {
            return root;
        }
    }
}

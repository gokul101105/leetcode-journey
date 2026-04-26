/**
 * LeetCode Journey - Day 68
 * 
 * Problem Name: Binary Tree Preorder Traversal
 * Difficulty: Easy
 * 
 * Problem:
 * Given the root of a binary tree, return the preorder traversal 
 * of its nodes' values.
 * 
 * Preorder Traversal Order:
 * Root → Left → Right
 * 
 * LeetCode Link:
 * https://leetcode.com/problems/binary-tree-preorder-traversal/
 * 
 * Approach:
 * 
 *    - Step 1:
 *      Create a List to store the result.
 * 
 *    - Step 2:
 *      Use a helper recursive function to traverse the tree.
 * 
 *    - Step 3:
 *      If the current node is null, return.
 * 
 *    - Step 4:
 *      Add the current node value to the list (Root).
 * 
 *    - Step 5:
 *      Recursively traverse the left subtree.
 * 
 *    - Step 6:
 *      Recursively traverse the right subtree.
 * 
 *    - Step 7:
 *      Return the final list.
 * 
 * Time Complexity:
 * O(n)  // Visit each node once
 * 
 * Space Complexity:
 * O(n)  // Recursion stack + result list
 */

import java.util.*;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorder(root, list);
        return list;
    }

    private void preorder(TreeNode root, List<Integer> list) {
        if (root == null) return;

        // Root
        list.add(root.val);

        // Left
        preorder(root.left, list);

        // Right
        preorder(root.right, list);
    }
}

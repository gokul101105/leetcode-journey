/**
 * LeetCode Journey - Day 67
 * 
 * Problem Name: Leaf-Similar Trees 
 * Difficulty: Easy
 * 
 * Problem:
 * Two binary trees are considered leaf-similar if their leaf value sequence 
 * is the same. Return true if both trees are leaf-similar, otherwise false.
 * 
 * LeetCode Link:
 * https://leetcode.com/problems/leaf-similar-trees/
 * 
 * Approach:
 * 
 *    - Step 1:
 *      Create two ArrayLists to store leaf nodes of both trees.
 * 
 *    - Step 2:
 *      Traverse the first tree using DFS.
 * 
 *    - Step 3:
 *      During traversal, check if a node is a leaf 
 *      (i.e., both left and right are null).
 *      If yes, add its value to list1.
 * 
 *    - Step 4:
 *      Repeat the same process for the second tree 
 *      and store leaf values in list2.
 * 
 *    - Step 5:
 *      Compare both lists using equals().
 *      If both lists are equal → trees are leaf-similar.
 * 
 * 
 * Time Complexity:
 * O(n + m)  // n = nodes in tree1, m = nodes in tree2
 * 
 * Space Complexity:
 * O(n + m)  // storing leaf nodes + recursion stack
 */

import java.util.*;

class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        collectLeaves(root1, list1);
        collectLeaves(root2, list2);

        return list1.equals(list2);
    }

    public void collectLeaves(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }

        // If it's a leaf node, add to list
        if (root.left == null && root.right == null) {
            list.add(root.val);
            return;
        }

        // Traverse left and right
        collectLeaves(root.left, list);
        collectLeaves(root.right, list);
    }
}

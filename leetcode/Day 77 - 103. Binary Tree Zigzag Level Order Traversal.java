/**
 * LeetCode Journey - Day 77
 * 
 * Problem Name:
 * Binary Tree Zigzag Level Order Traversal
 * 
 * Difficulty:
 * Medium
 * 
 * Problem:
 * Given the root of a binary tree, return the zigzag
 * level order traversal of its nodes' values.
 * 
 * (i.e., from left to right, then right to left for
 * the next level and alternate between them).
 * 
 * LeetCode Link:
 * https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
 * 
 * Approach:
 * 
 *    - Step 1:
 *      Use a Deque to support insertion and removal
 *      from both ends.
 * 
 *    - Step 2:
 *      If tree is empty,
 *      return empty result list.
 * 
 *    - Step 3:
 *      Add root node into deque.
 * 
 *    - Step 4:
 *      Use a boolean variable 'reverse'
 *      to track traversal direction.
 * 
 *          - false -> Left to Right
 *          - true  -> Right to Left
 * 
 *    - Step 5:
 *      Traverse level by level using BFS.
 * 
 *    - Step 6:
 *      If traversal direction is normal:
 * 
 *          - Remove node from front.
 *          - Add children to back.
 * 
 *    - Step 7:
 *      If traversal direction is reversed:
 * 
 *          - Remove node from back.
 *          - Add children to front
 *            in reverse order.
 * 
 *    - Step 8:
 *      Add current level into result.
 * 
 *    - Step 9:
 *      Flip traversal direction after
 *      every level.
 * 
 * Time Complexity:
 * O(n)  // Visit each node once
 * 
 * Space Complexity:
 * O(n)  // Queue storage
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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();

        // If tree is empty
        if (root == null) {
            return res;
        }

        // Deque for zigzag traversal
        Deque<TreeNode> q = new LinkedList<>();

        // Add root node
        q.addFirst(root);

        // Traversal direction
        boolean reverse = false;

        // BFS traversal
        while (!q.isEmpty()) {

            int level = q.size();

            List<Integer> current = new ArrayList<>();

            // Traverse current level
            for (int i = 0; i < level; i++) {

                // Left to Right traversal
                if (!reverse) {

                    TreeNode curr = q.pollFirst();

                    current.add(curr.val);

                    // Add children to back
                    if (curr.left != null) {
                        q.addLast(curr.left);
                    }

                    if (curr.right != null) {
                        q.addLast(curr.right);
                    }
                }

                // Right to Left traversal
                else {

                    TreeNode curr = q.pollLast();

                    current.add(curr.val);

                    // Add children to front
                    if (curr.right != null) {
                        q.addFirst(curr.right);
                    }

                    if (curr.left != null) {
                        q.addFirst(curr.left);
                    }
                }
            }

            // Add current level to result
            res.add(current);

            // Change traversal direction
            reverse = !reverse;
        }

        return res;
    }
}

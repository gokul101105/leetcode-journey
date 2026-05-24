/**
 * LeetCode Journey - Day 79
 * 
 * Problem Name:
 * Vertical Order Traversal of a Binary Tree
 * 
 * Difficulty:
 * Hard
 * 
 * Problem:
 * Given the root of a binary tree,
 * calculate the vertical order traversal
 * of the binary tree.
 * 
 * For each node:
 * 
 *    - left child  -> column - 1
 *    - right child -> column + 1
 * 
 * Nodes are ordered by:
 * 
 *    1. Column
 *    2. Row
 *    3. Node value (if same position)
 * 
 * Return the vertical traversal
 * from leftmost column to rightmost column.
 * 
 * LeetCode Link:
 * https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/
 * 
 * Approach:
 * 
 *    - Step 1:
 *      Use BFS traversal with a queue.
 * 
 *    - Step 2:
 *      Store:
 * 
 *          - node
 *          - column (x)
 *          - row (y)
 * 
 *      inside a Tuple class.
 * 
 *    - Step 3:
 *      Use nested TreeMaps:
 * 
 *          column -> row -> min heap
 * 
 *      to maintain sorted order.
 * 
 *    - Step 4:
 *      Start BFS from root:
 * 
 *          root -> (0,0)
 * 
 *    - Step 5:
 *      For every node:
 * 
 *          - insert into map
 *          - store value in PriorityQueue
 * 
 *      PriorityQueue keeps values sorted
 *      if multiple nodes share same position.
 * 
 *    - Step 6:
 *      Push children into queue:
 * 
 *          left  -> (x-1, y+1)
 *          right -> (x+1, y+1)
 * 
 *    - Step 7:
 *      Traverse TreeMaps in sorted order
 *      and build final answer.
 * 
 * Time Complexity:
 * O(n log n)
 * 
 *    - TreeMap insertion -> log n
 *    - PriorityQueue insertion -> log n
 * 
 * Space Complexity:
 * O(n)
 * 
 *    - Queue
 *    - TreeMaps
 *    - PriorityQueues
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

class Tuple {

    TreeNode node;
    int row;
    int col;

    public Tuple(TreeNode node, int col, int row) {

        this.node = node;
        this.col = col;
        this.row = row;
    }
}

class Solution {

    public List<List<Integer>> verticalTraversal(TreeNode root) {

        // column -> row -> sorted node values
        TreeMap<Integer,
                TreeMap<Integer,
                PriorityQueue<Integer>>> map
                = new TreeMap<>();

        // BFS queue
        Queue<Tuple> q = new LinkedList<>();

        // Start from root at (0,0)
        q.offer(new Tuple(root, 0, 0));

        // BFS traversal
        while (!q.isEmpty()) {

            Tuple tuple = q.poll();

            TreeNode node = tuple.node;

            int x = tuple.col;
            int y = tuple.row;

            // Create column if missing
            if (!map.containsKey(x)) {

                map.put(x, new TreeMap<>());
            }

            // Create row if missing
            if (!map.get(x).containsKey(y)) {

                map.get(x).put(y,
                        new PriorityQueue<>());
            }

            // Insert node value
            map.get(x).get(y).offer(node.val);

            // Left child
            if (node.left != null) {

                q.offer(new Tuple(
                        node.left,
                        x - 1,
                        y + 1
                ));
            }

            // Right child
            if (node.right != null) {

                q.offer(new Tuple(
                        node.right,
                        x + 1,
                        y + 1
                ));
            }
        }

        // Final answer
        List<List<Integer>> list =
                new ArrayList<>();

        // Traverse columns
        for (TreeMap<Integer,
                PriorityQueue<Integer>> ys
                : map.values()) {

            list.add(new ArrayList<>());

            // Traverse rows
            for (PriorityQueue<Integer> nodes
                    : ys.values()) {

                // Add sorted values
                while (!nodes.isEmpty()) {

                    list.get(list.size() - 1)
                            .add(nodes.poll());
                }
            }
        }

        return list;
    }
}

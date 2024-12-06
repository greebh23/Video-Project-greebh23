import java.util.LinkedList;

public class Solution {
//Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) 
//of all the values of the nodes in the tree.

//TreeNode was given
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
  //
    public static int kthSmallest(TreeNode root, int k) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        int count = 0;
        // In-order traversal
        while (root != null || !stack.isEmpty()) {
            // Reach the leftmost node
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            // Pop the node from the stack
            root = stack.pop();
            // Increment the count of nodes visited
            count++;
            // If we've visited k nodes, return the current node's value
            if (count == k) {
                return root.val;
            }
            // Move to the right subtree
            root = root.right;
        }

        // If we don't find the kth smallest (shouldn't happen in a valid input)
        return -1;  // This is a safety return, it won't be hit in valid cases.
    }

}


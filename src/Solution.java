/**********************************************************************
 * @file Solution.java
 * @brief This program finds the kth smallest element in a BST.
 * @author Blythe Greene
 * @date: December 6, 2024
 ***********************************************************************/
import java.util.LinkedList;

public class Solution {

    //TreeNode class was given
    public static class TreeNode {
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
    //Given the root of a binary search tree, and an integer k, return the
    //kth smallest value (1-indexed) of all the values of the nodes in the tree.
    public static int kthSmallest(TreeNode root, int k) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        int count = 0;//Helps determine if reached kth smallest number
        //Check if stack is empty or if root is null
        //Traverse tree using while loop
        while (!stack.isEmpty() || root != null) {
            // Reach the leftmost node first, continuously go left in the tree
            //until null. Since a BST, left node is smaller than right.
            while (root != null) {
                stack.push(root);//push node onto stack
                root = root.left;
            }
            // Pop the node from the stack
            root = stack.pop();//this is the smallest node in the stack since it is on the top
            // Increment the count of nodes visited
            count++;
            // If number of smallest nodes found = k then return the current nodes value
            if (count == k) {
                return root.val;
            }
            // Otherwise, move to the right subtree
            // iff node found still to small move to the right subtree since contains larger nodes
            root = root.right;
        }
        // If we don't find the kth smallest (shouldn't happen in a valid input)
        //Returns -1 if the root was null or if k is greater
        // than the number of nodes in the tree.
        return -1;
    }

}

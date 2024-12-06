# Video-Project-greebh23

<b>kth Smallest Element in a BST:</b>

Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.


Instructions: To run the program you can create a main function and a TreeNode object. Using several TreeNodes you can create a BST. The main function below
has a left and right node for the object. Then it calls the kthSmallest function using the root and int k to get the smallest kth element in the BST.


    public static void main(String[] args) {
        TreeNode root = new TreeNode(4, new TreeNode(2), new TreeNode(5));
        int x = kthSmallest(root, 1);
        System.out.println(x);
    }

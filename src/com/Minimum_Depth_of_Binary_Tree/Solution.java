package com.Minimum_Depth_of_Binary_Tree;


//Definition for a binary tree node.
class TreeNode {
    TreeNode left;
    TreeNode right;
    private int val;

    TreeNode(int x) {
        val = x;
    }
}


public class Solution {
    protected int minDepth(TreeNode root) {

        if (root == null)
            return 0;

        if (root.left == null && root.right == null)
            return 1;
        else if (root.left == null && root.right != null)
            return minDepth(root.right) + 1;
        else if (root.left != null && root.right == null)
            return minDepth(root.left) + 1;
        else
            return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
    }
}
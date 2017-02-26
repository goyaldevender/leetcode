package com.Symmetric_Tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    public boolean isSymmetric(TreeNode root) {

        if (root == null)
            return true;
        else if (root.left == null && root.right != null)
            return false;
        else if (root.left != null && root.right == null)
            return false;
        else if (root.left == null && root.right == null)
            return true;
        else
            return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode root1, TreeNode root2) {

        if (root1 == null && root2 == null)
            return true;
        else if (root1 == null && root2 != null
                || root1 != null && root2 == null)
            return false;
        else if (root1.val == root2.val) {
            return isSymmetric(root1.left, root2.right) && isSymmetric(root1.right, root2.left);
        } else
            return false;
    }
}
package com.Sum_of_Left_Leaves;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class SumClass {
    int sum = 0;
}

public class Solution {

    public int sumOfLeftLeaves(TreeNode root) {

        if (root == null)
            return 0;

        SumClass sum = new SumClass();

        if (root.left == null && root.right == null)
            return 0;

        // Calling the helper function
        sumofLeftLeaves(root, false, sum);

        return sum.sum;
    }

    private void sumofLeftLeaves(TreeNode root, boolean isLeft, SumClass sum) {
        if (root == null)
            return;

        // If it is a leaf node and if the node is a left node
        if (root.left == null && root.right == null && isLeft)
            sum.sum += root.val;

        sumofLeftLeaves(root.left, true, sum);
        sumofLeftLeaves(root.right, false, sum);

    }
}
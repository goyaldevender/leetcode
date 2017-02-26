package com.Lowest_Common_Ancestor_of_a_Binary_Search_Tree;

//  Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    private TreeNode temp;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (p.val > q.val) {
            temp = p;
            p = q;
            q = temp;
        }

        if (p.val <= root.val && root.val < q.val)
            return root;
        else if (p.val < root.val && root.val <= q.val)
            return root;
        else if (p.val < root.val && q.val < root.val)
            return lowestCommonAncestor(root.left, p, q);
        else if (root.val < p.val && root.val < q.val)
            return lowestCommonAncestor(root.right, p, q);
        else
            return null;
    }
}
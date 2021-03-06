package com.fibers.algorithm.leetcode._116;

import com.fibers.algorithm.datastructure.TreeLinkNode;

public class Solution {
    public void connect(TreeLinkNode root) {
        if(root == null){
            return;
        }

        if(root.left != null){
            root.left.next = root.right;
        }

        if(root.right != null && root.next != null) {
            root.right.next = root.next.left;
        }

        connect(root.left);
        connect(root.right);
    }
}

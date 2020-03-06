package leetcode.recursion;

import com.sun.source.tree.Tree;

/**
 * Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.
 *
 * You need to merge them into a new binary tree.
 * The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node.
 * Otherwise, the NOT null node will be used as the node of new tree.
 */

public class MergeTwoBinaryTrees {

    //Definition for a binary tree node.
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        return null;
    }

    public void run(){
        TreeNode t1 = new TreeNode(5);
    }
}

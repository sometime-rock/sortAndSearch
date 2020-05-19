package com.yan.sort.treesearch;

public class DFS {

    public int DFS(TreeNode root){
        if (root == null){
            return 0;
        }
        return Math.max(DFS(root.leftNode),DFS(root.rightNode))+1;

    }

    class TreeNode{
        int val;
        TreeNode leftNode;
        TreeNode rightNode;
        TreeNode(int val){
            this.val = val;
        }
    }


}

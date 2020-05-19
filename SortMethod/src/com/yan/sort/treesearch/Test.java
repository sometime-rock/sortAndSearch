package com.yan.sort.treesearch;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public List<ArrayList<Integer>> res = new ArrayList<>();

    public List<ArrayList<Integer>> getTree(TreeNode node){
        getTreeArray(node,0);
        return res;
    }

    public void getTreeArray(TreeNode treeNode,int k){
        if (treeNode!=null){
            if (res.size()<=k){
                res.add(new ArrayList<>());
            }
            res.get(k).add(treeNode.val);
            if (treeNode.leftNode!=null){
                getTreeArray(treeNode.leftNode,k+1);
            }
            if (treeNode.rightNode!=null){
                getTreeArray(treeNode.rightNode,k+1);
            }
        }
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

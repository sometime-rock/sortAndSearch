package com.yan.sort.treesearch;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DepthTree {

    public static int findDepthTree(Node node){
        if (node == null){
            return 0;
        }else if (node.children.isEmpty()){
            return 1;
        }else {
            List<Integer> height = new LinkedList<>();
            for (Node item: node.children){
                height.add(findDepthTree(item));
            }
            return Collections.max(height)+1;
        }
    }

    static class Node{
        public int val;
        public List<Node> children;

        public Node(int val ,List<Node> children){
            this.val = val;
            this.children = children;
        }
    }


    public static void main(String[] args){
        List<Node> item1 = new LinkedList<>();
        List<Node> item11 = new LinkedList<>();
        item1.add(new Node(1,item11));
        item11.add(new Node(2,null));
        Node tree = new Node(0,item1);
        findDepthTree(tree);
    }

}

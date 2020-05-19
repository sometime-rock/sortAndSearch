package com.yan.sort;

/**
 * 单向链表
 */
public class LinkedList {

    /**
     * 反转单向链表
     * eg : 1->2->3->4
     * 反转:4->3->2->1
     */
    private void reverseLinkedList(Node node) {
        Node next = null;
        Node pre = null;
        while (node.next!=null) {
            next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
    }
    class Node{
      Node next;
      int data;
    }
}

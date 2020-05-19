package com.yan.sort.linkedlist;

public class MiddleLinkedList {

    private ListNode getMiddleListNode(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }


    class ListNode{
        ListNode next;
        int val;
    }
}

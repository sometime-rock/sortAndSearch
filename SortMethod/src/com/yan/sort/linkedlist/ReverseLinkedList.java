package com.yan.sort.linkedlist;

public class ReverseLinkedList {

    public ListNode reverseLinkedList(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while (cur!=null){
            ListNode nextNode = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nextNode;
        }
        return pre;
    }

    class ListNode{
        ListNode next;
        int val;
    }
}

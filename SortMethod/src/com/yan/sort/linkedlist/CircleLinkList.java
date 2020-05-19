package com.yan.sort.linkedlist;

public class CircleLinkList {

    public boolean checkCircle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                return true;
            }
        }
        return false;
    }


    class ListNode{
        ListNode next;
        int val;
    }
}

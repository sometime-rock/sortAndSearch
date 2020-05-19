package com.yan.sort;

public class MergeLinkList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        ListNode l11 = new ListNode(1);
        ListNode l22 = new ListNode(3);
        ListNode l33 = new ListNode(4);
        l11.next = l22;
        l22.next = l33;
        ListNode ans = mergeTwoLists(l1, l11);
        while (ans != null) {
            System.out.print(ans.val);
            ans = ans.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // 把原两个链表的内容放到第三个链表，最后返回第三个链表的 头
        ListNode l3 = new ListNode(0);
        ListNode head = l3;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                ListNode newNode = new ListNode(l1.val);
                l3.next = newNode;
                l3 = l3.next;
                l1 = l1.next;
            } else {
                ListNode newNode = new ListNode(l2.val);
                l3.next = newNode;
                l3 = l3.next;
                l2 = l2.next;
            }
        }
        // 可能存在l1、l2偏大，某一个链表没有比较完，需要把剩下的加入到l3
        while (l1 != null) {
            ListNode newNode = new ListNode(l1.val);
            l3.next = newNode;
            l3 = l3.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            ListNode newNode = new ListNode(l2.val);
            l3.next = newNode;
            l3 = l3.next;
            l2 = l2.next;
        }
        return head.next;
    }

}
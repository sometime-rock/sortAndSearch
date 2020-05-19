package com.yan.sort.array;

/**
 * 两数相加
 */
public class ArrayAdd {

    public static ListNode addArray(ListNode l1, ListNode l2){
        ListNode p = l1;
        ListNode q = l2;
        int carry = 0;
        ListNode dummyHead = new ListNode(0);

        ListNode newNode = dummyHead;
        while (p!=null || q !=null ){
            //如果两个链表长度大小不一致，则小的链表后面位数补0
            int x = (p != null) ? p.value : 0;
            int y = (q != null) ? q.value : 0;
            int sum = x + y + carry;
            carry = sum/10;
            newNode.next = new ListNode(sum % 10);
            newNode = newNode.next;
            p = p.next;
            q = q.next;
        }
        if (carry > 0) {
            newNode.next = new ListNode(carry);
        }
        return dummyHead.next;
    }


    static class ListNode{
        public ListNode(int value){
            this.value = value;
        }
        int value;
        ListNode next;
    }

    public static void main(String args[]){
        ListNode l1 = new ListNode(0);
        l1.value = 3;
        l1.next = new ListNode(2);

        ListNode l2 = new ListNode(0);
        l2.value = 5;
        l2.next = new ListNode(6);

        addArray(l1,l2);

    }
}


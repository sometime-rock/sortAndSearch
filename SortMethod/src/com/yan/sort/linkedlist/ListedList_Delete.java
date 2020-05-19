package com.yan.sort.linkedlist;

public class ListedList_Delete {

//    //获取倒数第k个节点
//    public ListNode getKthFromEnd(ListNode head, int k){
//        //1. 算出链表的长度
//        int length = 0;
//        if (head ==null){
//            return null;
//        }
//        ListNode first = head;
//        while (first !=null){
//            length ++;
//            first = first.next;
//        }
//        //2. 获取第 length
//        ListNode kNode = head;
//        int index = 0;
//        while (kNode!=null){
//            if (length-k == index){
//                return kNode;
//            }else {
//                kNode = kNode.next;
//                index++;
//            }
//        }
//        return head;
//    }

    //获取倒数第k个节点 ,快慢指针的做法
    public ListNode getKthFromEnd(ListNode head, int k){
        if (head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 0 ;i<k ;i ++ ){
            fast = fast.next;
        }
        while (fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }


    class ListNode{
        int val ;
        ListNode next;
    }

}

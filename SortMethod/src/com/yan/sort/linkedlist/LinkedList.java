package com.yan.sort.linkedlist;

public class LinkedList {

    public static void main(String args[]){
//        printLinkedList(testList());
        Node list = testList();
//        Node reverseList = reverse(list);
//        printLinkedList(reverseList);

//        System.out.println(checkCircle(list));
        int data = findMidleNode(list).data;
        System.out.println(data);
    }


    private static Node testList(){
        Node testList = new Node();

        Node node1 = new Node();

        testList.data = 1;
        testList.next = node1;
        node1.data = 2;

        Node node2 = new Node();
        node2.data = 3;

        node1.next = node2;

        Node node3 = new Node();
        node3.data = 4;
        node2.next = node3;

        Node node4 = new Node();
        node4.data = 5;
//        node4.next = testList;

        node3.next = node4;
        return testList;
    }

    //输出链表的所有值
    public static void printLinkedList(Node list) {
        Node p = list;
        while (p !=null) {
            System.out.println(p.data);
            p = p.next;
        }
    }

    //链表反转
    public static Node reverse(Node list){
        Node curr = list;
        Node pre = null;
        while (curr!=null) {
            Node next = curr.next;
            curr.next = pre;

            pre = curr;
            curr = next;
        }
        return pre;
    }

    //判断链表是否有环
    public static boolean checkCircle(Node list){
        if (list == null) return false;
        Node fast = list.next;
        Node slow = list;
        while (fast !=null && fast.next !=null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                return true;
            }
        }
        return false;
    }

    public static Node findMidleNode(Node list){
        if (list == null) return null;
        Node fast = list;
        Node slow = list;
        while (fast !=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    static class Node {
        public int data;
        public Node next;
    }
}

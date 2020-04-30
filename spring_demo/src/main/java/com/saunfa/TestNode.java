package com.saunfa;

import java.util.Stack;

public class TestNode {
    private static Node head = new Node(0);

    static class Node {
        int data;
        Node next;

        private Node(int data) {
            this.data = data;
        }
    }

    public static void showNode(Node node) {
        Node tmp = node;
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }

    public static void addNode(Node head, Node node) {
        Node tmp = head;
        while (true) {
            if (tmp.next == null) {
                break;
            }
            tmp = tmp.next;
        }
        tmp.next = node;
    }

    //  反转
    private static void reverseNode(Node node) {
        Node pre = null;
        while (node != null) {
            Node next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        showNode(pre);
    }


    //  反转
    private static Node reverseNode2(Node cur) {
        return cur;
    }

    // 交换相邻的链表节点
    public static Node swapNode(Node node) {
        if (node == null || node.next == null) {
            return node;
        }
        Node res = node.next;
        Node tmp = swapNode(res.next);
        res.next = node; //交换
        node.next = tmp; //指针后移
        return res;
    }


    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            addNode(head, new Node(i));
        }
        showNode(head);
        System.out.println("*****************");
//        showNode(swapNode(head));
        showNode(reverseNode2(head));
    }

}

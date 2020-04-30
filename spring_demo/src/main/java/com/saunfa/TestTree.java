package com.saunfa;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestTree {
    private static MyTree root = new MyTree(0);

    static class MyTree {
        int data;
        MyTree left;
        MyTree right;

        public MyTree(int data) {
            this.data = data;
        }
    }

    //数组转化成完全二叉树
    public static MyTree arrayToTree(int a[], int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        if (start == end) {
            return new MyTree(a[mid]);
        }
        MyTree root = new MyTree(a[mid]);
        root.left = arrayToTree(a, start, mid - 1);
        root.right = arrayToTree(a, mid + 1, end);
        return root;
    }

    //前序：root-->左--->右
    public static void preOrder(MyTree treeNode) {
        if (treeNode != null) {
            System.out.println(treeNode.data);
            preOrder(treeNode.left);
            preOrder(treeNode.right);
        }

    }

    //中序：左--->root-->右
    public static void midOrder(MyTree treeNode) {
        if (treeNode != null) {
            midOrder(treeNode.left);
            System.out.println(treeNode.data);
            midOrder(treeNode.right);
        }
    }

    //后序：左-->右--->root
    public static void postOrder(MyTree treeNode) {
        if (treeNode != null) {
            postOrder(treeNode.left);
            postOrder(treeNode.right);
            System.out.println(treeNode.data);
        }
    }

    public static void main(String[] args) {
        MyTree t1 = new MyTree(1);
        MyTree t2 = new MyTree(2);
        MyTree t3 = new MyTree(3);
        MyTree t4 = new MyTree(4);
        MyTree t5 = new MyTree(5);
        MyTree t6 = new MyTree(6);

        root.left = t1;
        root.right = t2;
        t1.left = t3;
        t1.right = t4;
        t2.left = t5;
        t2.right = t6;

        int[] array = {0, 2, 3, 1, 6, 5, 4};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        MyTree a[] = new MyTree[array.length];
        for (int i = 0; i < array.length; i++) {
            a[i] = new MyTree(i);
        }

        MyTree myTree = arrayToTree(array, 0, array.length - 1);
        preOrder(myTree);

    }
}

package com.arsatapathy.trees;

public class TreeTraverse {

    public static void main(String... args) {
        MyTreeNode one = new MyTreeNode(1);
        MyTreeNode two = new MyTreeNode(2);
        MyTreeNode three = new MyTreeNode(3);
        MyTreeNode four = new MyTreeNode(4);
        MyTreeNode five = new MyTreeNode(5);
        MyTreeNode six = new MyTreeNode(6);

        three.left = two;
        three.right = five;
        two.left = one;
        five.left = four;
        five.right = six;

        preOrder(three);
        System.out.println();
        inOrder(three);
        System.out.println();
        postOrder(three);

    }

    public static void preOrder(MyTreeNode root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(MyTreeNode root) {
        if (root == null) return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void postOrder(MyTreeNode root) {
        if (root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
}

class MyTreeNode {
    int data;
    MyTreeNode left;
    MyTreeNode right;

    MyTreeNode(int data) {
        this.data = data;
    }
}


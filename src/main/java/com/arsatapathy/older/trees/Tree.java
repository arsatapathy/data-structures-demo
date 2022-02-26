package com.arsatapathy.older.trees;

public class Tree {

    class Node {
        Node left;
        int data;
        Node right;

        Node(int data) {
            left = null;
            this.data = data;
            right = null;
        }
    }

    private Node root;

    public Tree() {
        root = null;
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    private Node insert(Node root, int data) {

        if (root == null) {
            root = new Node(data);
        } else {
            if (data < root.data) {
                root.left = insert(root.left, data);
            } else {
                root.right = insert(root.right, data);
            }
        }

        return root;
    }

    public void inorderTraverse() {
       inorderTraverse(root);
    }

    public void inorderTraverse(Node root) {
        if (root != null) {
            inorderTraverse(root.left);
            System.out.print(root.data + "\t");
            inorderTraverse(root.right);
        }
    }

    public void preorderTraverse() {
        preorderTraverse(root);
    }

    private void preorderTraverse(Node root) {
        if (root != null) {
            System.out.print(root.data + "\t");
            preorderTraverse(root.left);
            preorderTraverse(root.right);
        }
    }

    public void postorderTraverse() {
        postorderTraverse(root);
    }

    private void postorderTraverse(Node root) {
        if (root != null) {
            postorderTraverse(root.left);
            postorderTraverse(root.right);
            System.out.print(root.data + "\t");
        }
    }


}

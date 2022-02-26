package com.arsatapathy.older.trees;

public class TestTree {
    public static void main(String[] args) {

        Tree tree = new Tree();

        tree.insert(5);
        tree.insert(6);
        tree.insert(4);
        tree.insert(3);
        tree.insert(1);
        tree.insert(2);

        tree.inorderTraverse();

//        tree.preorderTraverse();
//
//        tree.postorderTraverse();

    }
}

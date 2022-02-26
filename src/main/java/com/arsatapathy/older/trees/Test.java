package com.arsatapathy.older.trees;

public class Test {
    public static void main(String[] args) {
        testBinaryTree();
    }

    public static void testBinaryTree(){
        BinaryTree bt = new BinaryTree();

        BinaryTree.Node nd1 = new BinaryTree.Node(1);
        BinaryTree.Node nd2 = new BinaryTree.Node(2);
        BinaryTree.Node nd3 = new BinaryTree.Node(3);
        BinaryTree.Node nd4 = new BinaryTree.Node(4);
        BinaryTree.Node nd5 = new BinaryTree.Node(4);
        BinaryTree.Node nd6 = new BinaryTree.Node(5);

        bt.addNode(nd1, "");
        bt.addNode(nd2, "RIGHT");
        bt.addNode(nd3, "LEFT");
        bt.addNode(nd4, "LEFT");
        bt.addNode(nd5, "LEFT");
        bt.addNode(nd6, "LEFT");

        bt.printSide(bt.root, "RIGHT");
        bt.printSide(bt.root, "LEFT");
    }

}


package com.arsatapathy.older.trees;



class BinaryTree {
    static class Node{
        int data;
        Node right, left;

        public Node(int data) {
            this.data = data;
            this.right = this.left = null;
        }
    }

    Node root;

    public BinaryTree() {
        root = null;
    }

    public BinaryTree addNode(Node node, String side){
        Node temp;

        if (root == null)
            root = node;
        else {
            temp = root;
            if (side.equalsIgnoreCase("RIGHT")) {
                while (temp.right != null)
                    temp = temp.right;
                temp.right = node;
            } else {
                while (temp.left != null)
                    temp = temp.left;
                temp.left = node;
            }
        }
        return this;
    }

    void printSide(Node root, String side) {
        Node temp = root;

        if (temp != null){
            System.out.println(temp.data);
            while (side.equalsIgnoreCase("RIGHT") ? temp.right != null : temp.left != null) {
                if (side.equalsIgnoreCase("RIGHT"))
                    temp = temp.right;
                else
                    temp = temp.left;

                System.out.println(temp.data);
            }
        }
    }
}

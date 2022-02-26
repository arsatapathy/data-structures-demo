package com.arsatapathy.trees;

public class BinaryTreeBasics<X extends Comparable<X>> {

    private Node root;
    private int size;

    public BinaryTreeBasics() {
        this.root = null;
    }

    public int size() {
        return size;
    }

    public void add(X item) {
        Node node = new Node(item);

        if (root == null) {
            root = node;
            size ++;
        } else {
            insert (root, node);
        }
    }

    public boolean contains(X item) {
        return getNode(item) != null;
    }

    // Not complete
    public boolean delete(X item) {

        if (root == null)
            return false;

        Node currentNode = getNode(item);

        if (currentNode != null) {
           if (currentNode.getLeft() == null && currentNode.getRight() == null) {
               unlink(currentNode, null);
               return true;
           } else if (currentNode.getLeft() == null) {
               unlink(currentNode, currentNode.getRight());
               return true;
           } else if (currentNode.getRight() == null) {
               unlink(currentNode, currentNode.getLeft());
               return true;
           } else {
               // TODO - Implement
           }
        }

        return false;
    }

    private void unlink(Node currentNode, Node newNode) {
        if (currentNode == root) {
            newNode.setLeft(currentNode.getLeft());
            newNode.setRight(currentNode.getRight());
        } else if (currentNode.getParrent().getRight() == currentNode) {
            currentNode.getParrent().setRight(newNode);
        } else {
            currentNode.getParrent().setLeft(newNode);
        }
    }


    private Node getNode(X item) {
        Node currentNode = root;

        while (currentNode != null) {
            int value = item.compareTo(currentNode.getItem());

            if (value == 0)
                return currentNode;
            else if (value < 0)
                currentNode = currentNode.getLeft();
            else
                currentNode = currentNode.getRight();
        }
        return null;
    }

    private void insert(Node parent, Node child) {
        if (child.getItem().compareTo(parent.getItem()) < 0) {
            if (parent.getLeft() == null) {
                parent.setLeft(child);
                child.setParrent(parent);
                size ++;
            } else {
                insert(parent.getLeft(), child);
            }
        } else if (child.getItem().compareTo(parent.getItem()) > 0) {
            if (parent.getRight() == null) {
                parent.setRight(child);
                child.setParrent(parent);
                size ++;
            } else {
                insert(parent.getRight(), child);
            }
        }
    }

    private class Node {
        private Node left;
        private Node right;
        private Node parrent;
        private X item;

        public Node(X item) {
            this.item = item;

            this.left = null;
            this.right = null;
            this.parrent = null;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }

        public Node getParrent() {
            return parrent;
        }

        public void setParrent(Node parrent) {
            this.parrent = parrent;
        }

        public X getItem() {
            return item;
        }

        public void setItem(X item) {
            this.item = item;
        }
    }
}

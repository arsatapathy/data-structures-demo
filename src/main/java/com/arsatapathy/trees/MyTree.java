package com.arsatapathy.trees;
import java.util.*;

public class MyTree {

    public static void main(String... args) {
        /*
         *         3
         *        / \
         *       2   5
         *      /   / \
         *     1   4   6
         */

        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);

        three.left = two;
        three.right = five;
        two.left = one;
        five.left = four;
        five.right = six;

        DFS(three);
        System.out.println();
        BFS(three);
    }

    /*
     *  Preorder = root > left > right
     *  Inorder = left > root > right
     *  Postorder = left > right > root
     */

    public static void BFS(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode current = queue.remove();
            System.out.print(current.data + " ");

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);

        }
    }


    public static void DFS(TreeNode root) {
        if (root == null) return;

        System.out.print(root.data + " ");

        DFS(root.left);
        DFS(root.right);
    }
}


class TreeNode {

    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

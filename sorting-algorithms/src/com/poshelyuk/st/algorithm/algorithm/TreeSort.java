package com.poshelyuk.st.algorithm.algorithm;

import java.util.ArrayList;

import static com.poshelyuk.st.algorithm.algorithm.AlgorithmsNameConstant.TREE_SORT;

public class TreeSort implements Sortable {

    @Override
    public int[] sort(int[] array) {
        Tree tree = new Tree(array[0]);
        for (int num : array) {
            tree.insert(tree.node, num);
        }
        var list = new ArrayList<Integer>();
        tree.inOrder(tree.node, list);
        return list.stream().mapToInt(num -> num).toArray();
    }

    @Override
    public String getName() {
        return TREE_SORT;
    }
    class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    class Tree {
        Node node;
        Tree(int value) {
            node = new Node(value);
        }
        public Node insert(Node node, int value) {
            if (node == null) {
                return new Node(value);
            }
            // Move to the left if passed value is
            // less than the current node
            if (value < node.value) {
                node.left = insert(node.left, value);
            }
            // Move to the right if passed value is
            // greater than the current node
            else if (value > node.value) {
                node.right = insert(node.right, value);
            }
            return node;
        }

        // For traversing in order
        public void inOrder(Node node, ArrayList<Integer> list) {
            if (node != null) {
                inOrder(node.left, list);
                list.add(node.value);
                inOrder(node.right, list);
            }
        }
    }

}
package trees;

import sun.misc.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class TreeTopView {
    void top_view(Node root) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            System.out.print(root.data);
            return;
        }

        Node currentLeftNode = root;
        Deque<Integer> leftElements = new ArrayDeque<>();
        while (currentLeftNode != null) {
            leftElements.push(currentLeftNode.data);
            currentLeftNode = currentLeftNode.left;
        }

        for (Integer element: leftElements) {
            System.out.print(element + " ");
        }

        Node currentRightElement = root.right;
        while (currentRightElement != null) {
            System.out.print(currentRightElement.data + " ");
            currentRightElement = currentRightElement.right;
        }
    }

    class Node {
        Node left;
        Node right;
        int data;
    }
}

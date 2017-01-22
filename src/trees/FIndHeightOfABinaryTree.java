package trees;

public class FIndHeightOfABinaryTree {
    static int height(Node root) {
        if (root == null)
        {
            return -1;
        }
        else
        {
            return 1 + Math.max(height(root.left), height(root.right));
        }
    }


    class Node {
        Node left;
        Node right;
        int data;
    }
}

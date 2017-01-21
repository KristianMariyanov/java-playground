package trees;

public class PreorderTraversal {

    void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");

            if (root.left != null) {
                preOrder(root.left);
            }
            if (root.right != null) {
                preOrder(root.right);
            }
        }
    }

    class Node {
        int data;
        Node left;
        Node right;
    }
}

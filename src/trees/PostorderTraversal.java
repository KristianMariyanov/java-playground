package trees;

public class PostorderTraversal {
    void postOrder(Node root) {
        if (root != null) {
            if (root.left != null) {
                postOrder(root.left);
            }
            if (root.right != null) {
                postOrder(root.right);
            }

            System.out.print(root.data + " ");
        }
    }

    class Node {
        int data;
        Node left;
        Node right;
    }
}

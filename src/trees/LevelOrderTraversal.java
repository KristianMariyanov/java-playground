package trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    void LevelOrder(Node root){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            Node tempNode = queue.poll();
            System.out.printf("%d ",tempNode.data);
            if(tempNode.left!=null){
                queue.add(tempNode.left);
            }

            if(tempNode.right!=null){
                queue.add(tempNode.right);
            }
        }
    }

    class Node {
        int data;
        Node left;
        Node right;
    }
}

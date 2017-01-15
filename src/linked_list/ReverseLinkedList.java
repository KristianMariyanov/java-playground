package linked_list;

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedList {
    Node Reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        List<Node> nodes = new ArrayList<>();
        Node currentNode = head;
        while (currentNode != null) {
            nodes.add(currentNode);
            currentNode = currentNode.next;
        }
        Node node = null;
        for (int i = nodes.size() - 1; i > 0 ; i--) {
            node = nodes.get(i);
            node.next = nodes.get(i-1);
        }

        node.next.next = null;
        return nodes.get(nodes.size() - 1);
    }

    class Node {
        int data;
        Node next;
    }
}

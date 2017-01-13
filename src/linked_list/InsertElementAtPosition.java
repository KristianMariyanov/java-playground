package linked_list;

public class InsertElementAtPosition {
    Node InsertNth(Node head, int data, int position) {
        Node node = new Node();
        node.data = data;

        if (head == null || position == 0) {
            node.next = head;
            return node;
        } else {
            Node currentNode = head;
            for (int i = 0; i < position - 1; i++) {
                currentNode = currentNode.next;
            }

            Node currentNext = currentNode.next;
            currentNode.next = node;
            node.next = currentNext;
        }

        return head;
    }

    class Node {
        int data;
        Node next;
    }
}

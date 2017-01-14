package linked_list;

public class DeleteAtPosition {
    Node Delete(Node head, int position) {
        if (position == 0) {
            return head.next;
        }

        Node currentNode = head;
        for (int i = 0; i < position - 1; i++) {
            currentNode = currentNode.next;
        }

        Node currentNext = currentNode.next;
        currentNode.next = currentNext.next;

        return head;
    }

    class Node {
        int data;
        Node next;
    }
}

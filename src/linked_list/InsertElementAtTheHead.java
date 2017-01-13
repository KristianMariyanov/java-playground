package linked_list;

public class InsertElementAtTheHead {
    Node Insert(Node head, int x) {
        Node node = new Node();
        node.data = x;
        node.next = head;

        return node;
    }

    class Node {
        int data;
        Node next;
    }
}

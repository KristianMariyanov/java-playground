package linked_list;

public class InsertElementToTheTail {
    Node Insert(Node head,int data) {
        Node node = new Node();
        node.data = data;
        if (head == null) {
            return node;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = node;
            return head;
        }
    }

    class Node {
        int data;
        Node next;
    }
}

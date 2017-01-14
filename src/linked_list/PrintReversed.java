package linked_list;

public class PrintReversed {
    public void ReversePrint(Node head) {
        if (head == null) {
            return;
        }

        ReversePrint(head.next);
        System.out.println(head.data);
    }

    class Node {
        int data;
        Node next;
    }
}

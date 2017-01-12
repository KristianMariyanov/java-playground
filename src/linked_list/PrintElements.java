package linked_list;
public class PrintElements {
    void Print(Node head) {
        Node node = head;
        if (node != null){
            while (node != null) {
                System.out.println(node.data + " ");
                node = node.next;
            }
        }
    }

    class Node {
        int data;
        Node next;
    }
}




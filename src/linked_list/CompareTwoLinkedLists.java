package linked_list;

public class CompareTwoLinkedLists {
    int CompareLists(Node headA, Node headB) {
        Node currentNodeA = headA;
        Node currentNodeB = headB;
        while (currentNodeA != null || currentNodeB != null) {
            if (currentNodeA == null || currentNodeB == null || currentNodeA.data != currentNodeB.data) {
                return 0;
            }
            currentNodeA = currentNodeA.next;
            currentNodeB = currentNodeB.next;
        }

        return 1;
    }

    class Node {
        int data;
        Node next;
    }
}

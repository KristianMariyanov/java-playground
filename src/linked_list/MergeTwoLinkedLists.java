package linked_list;

public class MergeTwoLinkedLists {
    Node MergeLists(Node headA, Node headB) {
        if (headA == null && headB == null) {
            return null;
        }
        Node currentNodeA = headA;
        Node currentNodeB = headB;
        Node newHead = new Node();
        if (currentNodeA == null || currentNodeB.data < currentNodeA.data)  {
            newHead.data = currentNodeB.data;
            currentNodeB = currentNodeB.next;
        } else {
            newHead.data = currentNodeA.data;
            currentNodeA = currentNodeA.next;
        }

        Node currentNewNode = newHead;
        while (currentNodeA != null || currentNodeB != null) {
            currentNewNode.next = new Node();
            if (currentNodeA == null || (currentNodeB != null && currentNodeB.data < currentNodeA.data)) {
                currentNewNode.next.data = currentNodeB.data;
                currentNodeB = currentNodeB.next;
            } else{
                currentNewNode.next.data = currentNodeA.data;
                currentNodeA = currentNodeA.next;
            }

            currentNewNode = currentNewNode.next;
        }

        currentNewNode.next = null;

        return newHead;
    }

    class Node {
        int data;
        Node next;
    }
}

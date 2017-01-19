package queues;

import java.util.Scanner;
import java.util.Stack;

public class QueueWithTwoStacks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Queue<Integer> queue = new Queue<>();
        for (int i = 0; i < n; i++) {
            int command = in.nextInt();
            if (command == 1) {
                queue.enqueue(in.nextInt());
            } else if (command == 2){
                queue.dequeue();
            } else if (command == 3) {
                System.out.println(queue.peek());
            }
        }
    }
}

class Queue<T>
{
    private Stack<T> inbox = new Stack<>();
    private Stack<T> outbox = new Stack<>();

    public void enqueue(T item) {
        inbox.push(item);
    }

    public T dequeue() {
        if (outbox.isEmpty()) {
            fillOutbox();
        }

        return outbox.pop();
    }

    public T peek() {
        if (outbox.isEmpty()) {
            fillOutbox();
        }

        return outbox.peek();
    }

    private void fillOutbox() {
        while (!inbox.isEmpty()) {
            outbox.push(inbox.pop());
        }
    }
}
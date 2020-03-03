public class QueueUsingDoubleLinkedList {
    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println(queue.isEmpty());
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue.isEmpty());
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();

    }
}

class Queue {

    Node front;
    Node rear;

    public void add(int val) {
        Node node = new Node(val);

        if(front == null && rear == null) {
            node.next = null;
            node.prev = null;
            front = node;
            rear = node;
        } else {
            node.prev = rear;
            node.next = null;
            rear.next = node;
            rear = node;
        }
    }

    public void poll() {
        if(isEmpty()) {
            System.out.println("Nothing to delete");
            return;
        } else {
            rear = rear.prev;
            if(rear == null) {
                front = null;
                return;
            }
            rear.next = null;

        }
    }

    public boolean isEmpty() {
        return front == null && rear == null;
    }

}


class Node {
    int val;
    Node prev;
    Node next;

    public Node(int val) {
        this.val = val;
    }
}
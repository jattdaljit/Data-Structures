class QueueImpl implements Queue {

    int length = 10;
    int front = 0;
    int rear = 0;
    Object[] array = new Object[10];

    @Override
    public void enqueue(Object item) {
        if(rear > length-1) {
            System.out.println("Queue is full");
            return;
        } else {
            array[rear] = item;
            rear++;
        }
    }

    @Override
    public Object dequeue() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }

       Object temp = array[front];
       for(int i = 0; i < rear-1; i++) {
           array[i] = array[i+1];
       }
       rear--;
       return temp;
    }

    @Override
    public Object front() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        } else {
            return array[front];
        }
    }

    @Override
    public boolean isEmpty() {
        return front == rear;
    }
}

public class QueueUsingArray {
    public static void main(String[] args) {
        QueueImpl queue = new QueueImpl();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        queue.enqueue(11);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(1234);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());

   }
}

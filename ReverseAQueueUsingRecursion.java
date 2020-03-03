import java.util.LinkedList;
import java.util.Queue;

public class ReverseAQueueUsingRecursion {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        reverse(queue);
    }

    public static Queue reverse(Queue<Integer> queue) {
        if (queue.size() > 0) {
            int front = queue.poll();
            Queue<Integer> tempQueue = reverse(queue);
            tempQueue.add(front);
            return tempQueue;
        }
        return queue;
    }
}
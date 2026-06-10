package QueueBasic;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasic {
    public static void main(String[] args) {

        Queue<Integer> queue = new PriorityQueue<>();
        // default behavior is min heap -> integer -> last value -> high priority -> minheap
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(45);
        System.out.println(queue);

    System.out.println(queue.poll());
    System.out.println(queue);
    System.out.println(queue.poll());
    System.out.println(queue);


    Queue<Integer> queue1 = new PriorityQueue<>((a,b)->(b-a));
    // max heap -> Integer -> high value -> high priority
    queue1.offer(10);
    queue1.offer(20);
    queue1.offer(30);
    queue1.offer(45);
    System.out.println(queue1);
  }
}

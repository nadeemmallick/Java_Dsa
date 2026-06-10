package QueueBasic;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeBasic {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>(); // create doubly deque we can use it from first and last
        deque.offer(10);
        deque.offerFirst(23);
        deque.offerLast(34);
        deque.offer(45);
        System.out.println(deque);

        deque.pollLast();
        System.out.println(deque);
        deque.pollFirst();
        System.out.println(deque);

        deque.peekFirst();
        System.out.println(deque);
        deque.peekLast();
        System.out.println(deque);
    }

}

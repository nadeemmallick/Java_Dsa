package StackMethods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class StackLearning {
    public static void main(String[] args) {
    //    Stack<Integer> stack = new Stack<>();
    //
    //    // add -> add element
    //    stack.add(10);
    //    stack.add(20);
    //    stack.add(30);
    //    System.out.println(stack);
    //    stack.add(35);
    //    System.out.println(stack);
    //
    //    // remove -> remove element
    //    stack.remove(2);
    //    System.out.println(stack);
    //
    //    Stack<Integer> list1 = new Stack<>();
    //    list1.add(100);
    //    list1.add(200);
    //    list1.add(300);
    //
    //
    //    // addAll -> add two lists in one list
    //    stack.addAll(list1);
    //    System.out.println(stack);
    //
    //
    //    // removeAll -> remove
    //    stack.removeAll(list1);
    //    System.out.println(stack);
    //
    //
    //    // size -> size of the list
    //    System.out.println(stack.size());
    //
    //
    //    System.out.println("printing elements of the list 2:" + list1);
    //
    //
    //    // clear -> clear all elements
    //    list1.clear();
    //    System.out.println(list1.size());
    //
    //
    //    // iterator -> iterator the list
    //    Iterator<Integer> it = stack.iterator();
    //    while (it.hasNext()) {
    //      System.out.println(it.next());
    //
    //      Stack<Integer> list2 = new Stack<>();
    //      list2.add(100);
    //      list2.add(200);
    //      list2.add(300);
    //      // list mai 0 index ka element aa jiye ga
    //      System.out.println(list2.get(0));
    //
    //      // list mai 0 index ka element change ho krr 1000
    //      list2.set(0, 1000);
    //      System.out.println(list2);
    //
    //      // list mai element hai ke nhi
    //      System.out.println(list2.contains(1000));

    Stack<Integer> stack = new Stack<>();

    stack.push(10);
    stack.push(20);
    stack.push(30);
    System.out.println(stack);

    System.out.println(stack.peek());

    System.out.println(stack.search(20));

    stack.pop();
    System.out.println(stack);

    System.out.println(stack.empty());
    }
}

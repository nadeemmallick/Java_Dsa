package LinkedListMethods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListLearning {
    public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>(); // create Linked list
    list.add(101);
    list.add(202);
    list.add(30);
    System.out.println(list);


    // add -> add element
    list.add(35);
    System.out.println(list);


    // remove -> remove element
    list.remove(2);
    System.out.println(list);

    LinkedList<Integer> list1 = new LinkedList<>();
    list1.add(100);
    list1.add(200);
    list1.add(300);


    // addAll -> add two lists in one list
    list.addAll(list1);
    System.out.println(list);


    // removeAll -> remove
    list.removeAll(list1);
    System.out.println(list);


    // size -> size of the list
    System.out.println(list.size());

    System.out.println("printing elements of the list 2:" + list1);


    // clear -> clear all elements
    list1.clear();
    System.out.println(list1.size());


    // iterator -> iterator the list
    Iterator<Integer> it = list.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());

      List<Integer> list2 = new ArrayList<>();
      list2.add(100);
      list2.add(200);
      list2.add(300);


      // list mai 0 index ka element aa jiye ga
      System.out.println(list2.get(0));


      // list mai 0 index ka element change ho krr 1000
      list2.set(0, 1000);
      System.out.println(list2);


      // list mai element hai ke nhi
      System.out.println(list2.contains(1000));

      LinkedList<Integer> list3 = new LinkedList<>();
      list3.add(100);


      // add first and last in the list
      list3.addFirst(2);
      list3.addLast(3);
      System.out.println(list3);


      // get the first and last element in the list
      System.out.println(list3.getFirst());
      System.out.println(list3.getLast());


      // remove the first and last element in the list
      System.out.println(list3.removeFirst());
      System.out.println(list3);
      System.out.println(list3.removeLast());
      System.out.println(list3);


      // peak head and tail
      System.out.println(list);
      System.out.println(list.peekFirst());
      System.out.println(list.peekLast());


      // poll head and tail
      System.out.println(list.pollFirst());
      System.out.println(list);
      System.out.println(list.pollLast());
      System.out.println(list);
    }
}}

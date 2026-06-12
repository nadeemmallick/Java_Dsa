package ArrayListMethods;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListLearning {
  public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>(); // create an array list using ArrayList as refrence
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(4);
    list.add(5);
    list.add(6);
    System.out.println(list);

    // Sort the array in ascending order
    Collections.sort(list);
    System.out.println(list);

    // sort the array in descending order
    Collections.sort(list, Collections.reverseOrder());
    System.out.println(list);

    ArrayList<Integer> newlist = (ArrayList<Integer>) list.clone();
    System.out.println(newlist);

    ArrayList<Integer> newlist1 = new ArrayList<>(list);
    newlist1.ensureCapacity(100);

    // fixed the size of an array list
    System.out.println(list.isEmpty());

    // size of an array list
    System.out.println("Size of list " + list.size());
    System.out.println(newlist1.isEmpty());

    // find the index of the element
    System.out.println(list.indexOf(5));
  }
}

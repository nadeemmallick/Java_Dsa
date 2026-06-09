import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    // list or collection -> sab interface hai iska object creat nhi krr sakte.

    // ArrayList -> object
    ArrayList<Integer> list = new ArrayList<>();
    //        List<String> list = new ArrayList<>();
    //        Collection<String> collection = new ArrayList<>();


    // add -> add element
    list.add(10);
    list.add(20);
    list.add(30);
    System.out.println(list);
    list.add(35);
    System.out.println(list);


    // remove -> remove element
    list.remove(2);
    System.out.println(list);

    List<Integer> list1 = new ArrayList<>();
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
      //list mai 0 index ka element aa jiye ga
      System.out.println(list2.get(0));

      //list mai 0 index ka element change ho krr 1000
      list2.set(0, 1000);
      System.out.println(list2);

      //list mai element hai ke nhi
      System.out.println(list2.contains(1000));
    }
  }
}

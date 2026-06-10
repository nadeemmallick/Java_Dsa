package VectorMethods;

import java.util.Vector;

public class VectorLearning {
    public static void main(String[] args) {
    Vector<Integer> v = new Vector<>(); // create vector
    v.add(10); // add elements
    v.add(20);
    v.add(30);
    System.out.println(v);

    Vector<Integer> v1 = new Vector<>();
    v1.add(40); // add elements
    v1.add(50);
    v1.add(60);
    System.out.println(v1);

    v.addAll(v1); // add all elements of v1 and v together
    System.out.println("Adding vector 1 in to vector :" + v);

    System.out.println("size of first vector :" + v.size()); // size of vector
    System.out.println("Size of second vector :" + v1.size()); // size of vector1

    System.out.println("remove index 1 element :" + v.remove(1));

    v.addFirst(2);
    v.addLast(3);
    System.out.println(v);

    // get the first and last element in the list
    System.out.println(v.getFirst());
    System.out.println(v.getLast());

    // remove the first and last element in the list
    System.out.println(v.removeFirst());
    System.out.println(v);
    System.out.println(v.removeLast());
    System.out.println(v);
  }
}

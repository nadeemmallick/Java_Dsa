import java.util.HashSet;
import java.util.Set;

public class HashSetBasic {
    public static void main(String[] args) {

//        Set<Integer> set = new HashSet<>();
//        set.add(10);
//        set.add(10);
//        set.add(10);
//        set.add(10);
//        set.add(10);
//        set.add(30);
//        set.add(20);
//        set.add(10);
//        set.add(30);
//        set.add(20);
//        System.out.println(set);

        //hashset -> it is unordered set O(1)
        //tree set -> it based on binary tree O(log)
        //linked hashset -> it based on linked and sorted O(n)

        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        set1.add(30);
        set1.add(40);
        set1.add(50);
        set1.add(60);

        set.retainAll(set1); // it store only common elements
        System.out.println(set);

    System.out.println(set.containsAll(set1));
    System.out.println(set1.containsAll(set));
  }
}

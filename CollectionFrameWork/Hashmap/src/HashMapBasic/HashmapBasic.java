package HashMapBasic;

import java.util.*;

public class HashmapBasic {
    public static void main(String[] args) {

    // Insertion

    Map<String, String> mapping = new HashMap<>();
//    Map<String, String> mapping = new LinkedHashMap<>();
//    Map<String, String> mapping = new TreeMap<>();

    mapping.put("in", "India");
    // mappint.put("in", "India2"); // its just update the vale of the key
    mapping.put("us", "USA");
    mapping.put("uk", "UK");
    System.out.println(mapping);

    Map<String, String> mapping1 = new HashMap<>();
    mapping1.put("br", "Brazil");
    System.out.println("After " + mapping1);
    mapping.putAll(mapping1);
    System.out.println("After " + mapping);

    // Deletion
    mapping.remove("us");
    System.out.println(mapping);



    mapping.putIfAbsent("is", "India2");
    System.out.println(mapping);

    System.out.println(mapping.get("in")); // getting value of the key

    System.out.println(mapping.getOrDefault("inn", "Not Found"));

    System.out.println(mapping.containsKey("in")); // return true if key present

    System.out.println(mapping.containsValue("India")); // return true if the value id present

    System.out.println(mapping);
    mapping.replace("is", "Istanbul");
    System.out.println(mapping);

    Set<String> keySet = mapping.keySet();
    System.out.println(keySet);

    Collection<String> valueSet = mapping.values();
    System.out.println(valueSet);

    // Size

    //        System.out.println(mapping.size());
    //
    //        mapping1.clear();
    //        System.out.println(mapping1);
    //        System.out.println(mapping1.size());

  }
}

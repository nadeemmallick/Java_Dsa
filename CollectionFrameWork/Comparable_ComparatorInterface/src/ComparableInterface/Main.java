package ComparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();

        students.add(new Student("nadeem",23,100,1));
        students.add(new Student("roni",33,45,2));
        students.add(new Student("arif",21,59,3));
        students.add(new Student("saif",13,39,6));
        students.add(new Student("lov",28,48,7));

    System.out.println(students);

        Collections.sort(students);
        System.out.println(students);


  }
}

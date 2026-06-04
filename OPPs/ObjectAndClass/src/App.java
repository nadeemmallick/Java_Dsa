public class App {
    public static void main(String[] args) {

    // Default constructor making
        // ( tahan prr hum default constructor ke object banna rahe hai or value pass krr rahe hai)

    //    Student A = new Student();
    //    A.id = 1;
    //    A.name = "Nadeem";
    //    A.age = 19;
    //    A.gender = "Male";
    //    A.nos = 3;
    //
    //    System.out.println(A.id);
    //    System.out.println(A.name);
    //    System.out.println(A.age);
    //    System.out.println(A.gender);
    //    System.out.println(A.nos);
    //
    //    A.study();
    //    A.sleep();
    //    A.bunk();



    // Parameterized constructor

    Student A = new Student(2, "Nadeem", 23, "male", 1);
    //    System.out.println(A.id);
    //    System.out.println(A.name);
    //    System.out.println(A.age);
    //    System.out.println(A.gender);
    //    System.out.println(A.nos);

    //    A.study();
    //    A.sleep();
    //    A.bunk();


    // copy constructor

    Student B = new Student(A);
    System.out.println(B.id);
    System.out.println(B.name);
    System.out.println(B.age);
    System.out.println(B.gender);
    System.out.println(B.nos);

    B.study();
    B.sleep();
    B.bunk();
  }
}

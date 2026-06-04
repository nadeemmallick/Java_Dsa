public class Student {
  // Attributes

  public int id;
  public String name;
  public int age;
  public String gender;
  public int nos;

  // Default constructor

  public Student() {
    System.out.println("This is default constructor");
  }

  // Parameterized constructor

  public Student(int id, String name, int age, String gender, int nos) {
    System.out.println("this is parameterized constructor");
    this.id = id;
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.nos = nos;
  }

  // Copy constructor

  public Student(Student srcobj) { // srcobje -> A
    System.out.println("this is copy constructor");
    this.id = srcobj.id;
    this.name = srcobj.name;
    this.age = srcobj.age;
    this.gender = srcobj.gender;
    this.nos = srcobj.nos;
  }

  // Methods or function

  public void study() {
    System.out.println(name + "Studying");
  }

  public void sleep() {
    System.out.println(name + "Sleeping");
  }

  public void bunk() {
    System.out.println(name + "bunking");
  }
}

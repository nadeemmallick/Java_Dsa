public class Teacher {
  // Attributes

  private int id;
  private String name;
  int age;
  String gender;

  public String getName() {
    return this.name;
  }

  public int getId() {
    return this.id;
  }

  // Parameterized constructor

  public Teacher(int id, String name, int age, String gender) {
    System.out.println("this is parameterized constructor");
    this.id = id;
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  // Copy constructor

  //        public Teacher(Teacher srcobj) { // srcobje -> A
  //            System.out.println("this is copy constructor");
  //            this.id = srcobj.id;
  //            this.name = srcobj.name;
  //            this.age = srcobj.age;
  //            this.gender = srcobj.gender;
  //
  //        }

  // Methods or function

  public void study() {
    System.out.println(name + "Studying");
  }

  public void sleep() {
    System.out.println(name + "Sleeping");
  }

  public void bunk() {
    System.out.println(name + "Learning");
        }
    }


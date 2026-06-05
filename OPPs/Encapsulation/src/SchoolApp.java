public class SchoolApp {
  public static void main(String[] args) {
    Teacher A = new Teacher(2, "Nadeem", 23, "male");
    System.out.println(A.getName());
    System.out.println(A.getId());

    A.bunk();
    }
}

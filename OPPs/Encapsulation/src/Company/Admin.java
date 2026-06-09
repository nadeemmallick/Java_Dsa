package Company;

public class Admin {
  public static void main(String[] args) {

    Employ em =
        new Employ(121, "Nadeem", 23, "male", "Developer", "Tech", 200000, "patna", 99756843);
    System.out.println(em.getSalary());
    System.out.println(em.getAddress());
    System.out.println(em.getPhone());
    System.out.println(em.Designation);
    System.out.println(em.Department);

    em.project();
    em.sleep();
  }
}

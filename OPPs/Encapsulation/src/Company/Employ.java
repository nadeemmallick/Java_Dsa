package Company;

public class Employ {

  private int EmployId;
  private String EmployName;
  int Age;
  String Gender;
  String Designation;
  String Department;
  private int Salary;
  private String Address;
  private int Phone;

  public int getEmployId() {
      return this.EmployId;
  }

  public String getEmployName() {
      return this.EmployName;
  }

  public int getSalary() {
      return this.Salary;
  }

  public String getAddress() {
      return this.Address;
  }
  public int getPhone(){
      return this.Phone;
  }

  public Employ(int EmployId, String EmployName, int age,String Gender,String Designation,String Department,int Salary, String Address, int Phone) {
      System.out.println("this is parameterized constructor");
      this.EmployId = EmployId;
      this.EmployName = EmployName;
      this.Age = age;
      this.Gender = Gender;
      this.Designation = Designation;
      this.Department = Department;
      this.Salary = Salary;
      this.Address = Address;
      this.Phone = Phone;
  }

  public void project(){
      if(Designation.equals("Developer")){
          System.out.println("Developing");
      }
  }
  public void work(){
      System.out.println("Working");
  }
  public void eat(){
      System.out.println("Eating");
  }
  public void sleep(){
      System.out.println("Sleeping");
  }
}

package ComparableInterface;

public class Student implements Comparable<Student> {
    public String name;

    public int age;
    public double weight;

    public int rollno;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRollno() {
        return rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\n' +
                ", age=" + age +
                ", weight=" + weight +
                ", rollno=" + rollno +
                '}';
    }

    public Student(String name, int age, double weight,int rollno) {
        this.name = name;
        this.age = age;
        this.weight = 0;
        this.rollno = rollno;
    }


    @Override
    public int compareTo(Student that) {

        return this.age-that.age; // ascending order
        //return that.age-this.age;// decending order
    }
}


package Abstract;

abstract class Animal {

  abstract void eat();

  abstract void move();
}

class Mammal extends Animal {
  @Override
  void eat() {
    System.out.println("Mammal Eat");
  }

  void move() {
    System.out.println("Mammal Move");
  }

  class Bird extends Animal {
    @Override
    void eat() {
      System.out.println("Bird Eat");
    }

    void move() {
      System.out.println("Bird Move");
    }
  }
}

public class Main {
  public static void main(String[] args) {
    Mammal m = new Mammal();
    m.eat();
    m.move();

    Mammal.Bird b = m.new Bird();
    b.eat();
    b.move();
  }
}

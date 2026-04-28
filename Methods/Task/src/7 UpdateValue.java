class UpdateValue {
  public static void main(String[] args) {
    int a = 10;
    System.out.println(a);
    updateValue(a);
    printValue(a);
  }

  public static void updateValue(int a) {
    a = 20;
  }

  public static void printValue(int a) {
    System.out.println(a);
  }
}

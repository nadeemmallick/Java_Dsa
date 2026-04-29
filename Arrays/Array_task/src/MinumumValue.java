public class MinumumValue {
  static void main() {
    int[] marks = {20, 1, 40, 60, 8};
    int n = marks.length;
    int minvalue = marks[0];

    for (int i = 0; i <= n - 1; i++) {
      if (marks[i] < minvalue) {
        minvalue = marks[i];
      }
    }
    System.out.println(minvalue);
  }
}

public class FindMax {
  public static void main(String[] args) {
    int[] a = { 23, 53, 65, 21, 100 };
    int max = a[0];

    for (int i = 1; i < a.length; i++) {
      if (a[i] > max) {
        max = a[i];
      }
    }
    System.out.println("The Maximum element in an Array is: " + max);
  }
}

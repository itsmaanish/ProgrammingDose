public class FindMin {
  public static void main(String[] args) {
    int[] a = { 23, 53, 65, 21, 100 };
    int min = a[0];

    for (int i = 1; i < a.length; i++) {
      if (a[i] < min) {
        min = a[i];
      }
    }
    System.out.println("The Minimum element in an Array is: " + min);
  }

}

public class ReverseArray {
  public static void main(String[] args) {
    int[] a = { 1, 2, 3, 4, 5, 6 };
    int temp;
    int j = a.length - 1;

    for (int i = 0; i < a.length; i++) {
      if (a[i] < a[j]) {
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
      }
      j--;
    }
    // Reverse ann Array

    for (int i = a.length - 1; i >= 0; i--) {
      System.out.print(a[i] + " ");
    }
  }
}

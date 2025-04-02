public class MaxEle {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 34, 19, 6 };
    int max = arr[0];

    for (int n : arr) {
      if (n > max) {
        max = n;
      }
    }
    System.out.println(max);
  }
}
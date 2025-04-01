public class CountNoDigits {
  public static void main(String[] args) {
    int num = 123578674;
    int count = 0;
    System.out.println("The numbers are: " + num);

    while (num != 0) {
      num /= 10;
      count++;
    }
    System.out.println("No of digits: " + count);
  }
}

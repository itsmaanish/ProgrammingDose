public class RevNum {
  public static void main(String[] args) {
    int number = 121;
    int original_num = number;
    int rev = 0;

    while (number != 0) {
      rev = rev * 10 + number % 10;
      number /= 10;
    }
    // System.out.println(rev);
    if (original_num == rev) {
      System.out.println(original_num + " is a Palindrome");
    } else {
      System.out.println(original_num + " is Not a Palindrome");
    }
  }
}

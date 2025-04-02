public class Armstrong {
  public static void main(String[] args) {
    int n = 153;
    int temp, Armstrong = 0;
    int original_num = n;

    while (n != 0) {
      temp = n % 10;
      temp = (int) (Math.pow(temp, 3));
      Armstrong += temp;
      n = n / 10;
    }
    if (Armstrong == original_num) {
      System.out.println(Armstrong + " Armstrong Number");
    } else {
      System.out.println(Armstrong + " Armstrong Number");
    }
  }
}

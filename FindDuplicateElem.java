public class FindDuplicateElem {
  public static void main(String[] args) {
    String[] a = { "java", "C", "C++", "Python", "java" };
    boolean flag = false;

    for (int i = 0; i < a.length; i++) {
      for (int j = i + 1; j < a.length; j++) {
        if (a[i] == a[j]) {
          System.out.println("The duplicate element Founded!! " + a[i]);
          flag = true;
        }
      }
    }
    if (flag == false) {
      System.out.println("Duplicate Element not found!!");
    }

  }
}

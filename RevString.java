public class RevString {
    public static void main(String[] args) {
        String str = "manish";
        String rev = "";
        int len = str.length();

        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        // System.out.println(rev);
        if (str.equals(rev)) {
            System.out.println(str + " is a Plaindrome");
        } else {
            System.out.println(str + " is Not a Plaindrome");
        }
    }
}
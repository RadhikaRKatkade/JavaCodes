import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        String str = sc.nextLine();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("Revserve string is: " + rev);

        if (rev.equals(str)) {
            System.out.println(rev + "==" + str + ": it is palindrome string");
        } else {
            System.out.println("it is not palindrome");
        }

    }
}

import java.util.Scanner;

public class characterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        int count = 0;
        System.out.print("enter char to find count: ");
        char c = sc.next().charAt(0);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
                System.out.println("char position: " + i);
            }
        }
        System.out.println(c + " total char are: " + count);

    }
}

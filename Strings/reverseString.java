import java.util.Scanner;

class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter String:  ");
        String str = sc.nextLine();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("reverse string is : " + rev);
    }
}
// import java.util.*;

// class palindrome {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter string: ");
//         String str = sc.nextLine();
//         String rev = "";
//         for (int i = str.length() - 1; i >= 0; i--) {
//             rev = rev + str.charAt(i);
//         }
//         System.out.println(rev);

//         if (rev.equals(str)) {
//             System.out.println("it is palindrome");
//         } else {
//             System.out.println("it is not palindrome");
//         }

//     }
// }

import java.util.*;

class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string: ");
        int n = sc.nextInt();

        String str = String.valueOf(n);
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);

        if (rev.equals(str)) {
            System.out.println("it is palindrome");
        } else {
            System.out.println("it is not palindrome");
        }

    }
}
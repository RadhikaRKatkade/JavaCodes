// import java.util.Scanner;

// public class primeNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         if (n == 1) {
//             System.out.println("it is not prime number");
//         } else if (n == 2) {
//             System.out.println("it is prime number");
//         } else if (n % 2 == 0) {
//             System.out.println("it is not prime number");

//         } else {
//             System.out.println("not prime");
//         }
//     }
// }

import java.util.Scanner;

class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter range: ");
        int n = sc.nextInt();

        boolean isprime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isprime = false;
            }
        }
        if (isprime) {
            System.out.print(n + " ");

        } else {
            System.out.print("not prime number");
        }

    }
}
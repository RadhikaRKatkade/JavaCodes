import java.util.Scanner;

public class Try_Catch_Block {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a: ");
        int a = sc.nextInt();
        System.out.print("enter b: ");
        int b = sc.nextInt();
        int c;
        try {
            c = a / b;

        } catch (Exception e2) {
            System.out.println(e2);
            e2.printStackTrace();
            System.out.println("e2.toString(): " + e2.toString());
            System.out.println("e2.getMessage(): " + e2.getMessage());
        }
        System.out.println("You got your answer");
    }
}

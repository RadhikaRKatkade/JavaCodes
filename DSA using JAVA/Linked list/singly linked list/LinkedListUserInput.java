import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of list: ");
        int n = sc.nextInt();

        Node first = null;
        Node last = null;

        for (int i = 0; i < n; i++) {
            System.out.println("enter " + i + " data: ");
            int value = sc.nextInt();

            Node newNode = new Node(value);
            if (first == null) {
                first = newNode;
                last = newNode;
            } else {
                last.next = newNode;
                last = newNode;
            }
        }
        System.out.println("list you entered is: ");
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");

        temp = first;

        System.out.print("enter key want to found: ");
        int key = sc.nextInt();
        boolean found = false;
        while (temp != null) {
            if (temp.data == key) {
                found = true;
                break;
            }
            temp = temp.next;
        }
        if (found) {
            System.out.println("element " + key + " found");
        } else {
            System.out.println("not found");
        }

    }
}

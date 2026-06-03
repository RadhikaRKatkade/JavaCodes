import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class searchElement {
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next = second;
        second.next = third;

        boolean found = false;

        Node temp = first;
        int key = 20;

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

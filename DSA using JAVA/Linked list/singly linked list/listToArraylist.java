import java.util.ArrayList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class listToArraylist {
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next = second;
        second.next = third;

        Node temp = first;
        ArrayList<Integer> list = new ArrayList<>();

        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }
        System.out.println("convert linked list to arraylist");
        System.out.println(list);

    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class listToArray {
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next = second;
        second.next = third;

        Node temp = first;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int[] arr = new int[count];
        int i = 0;
        temp = first;

        while (temp != null) {
            arr[i] = temp.data;
            i++;
            temp = temp.next;
        }
        for (int num : arr) {
            System.out.println(num);
        }

    }
}

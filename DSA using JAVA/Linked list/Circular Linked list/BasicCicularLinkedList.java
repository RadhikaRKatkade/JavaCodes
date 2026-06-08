class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class BasicCicularLinkedList {
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        Node temp = first;
        do {
            System.out.print(temp.data + "->");
            temp = temp.next;
        } while (temp != first);
        System.out.print("null");

    }
}
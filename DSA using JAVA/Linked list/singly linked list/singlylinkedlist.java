class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class singlylinkedlist {
    public static void main(String[] args) {

        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        // Node fourth = new Node(40);

        first.next = second;
        second.next = third;

        Node temp = first;
        // temp.next = newNodeLast;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print("null");

    }
}
// class Node {
//     int data;
//     Node next;

//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// class InsertAtEnd {
//     public static void main(String[] args) {
//         Node first = new Node(10);
//         Node second = new Node(20);
//         Node third = new Node(30);

//         first.next = second;
//         second.next = third;

//         Node newnNode = new Node(100);
//         Node temp = first;

//         while (temp.next != null) {
//             temp = temp.next;
//         }
//         temp.next = newnNode;

//         temp = first;

//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//         System.out.print("null");

//     }
// }

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}

class InsertAtEnd {
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.next = second;
        second.next = third;

        Node newNode = new Node(100);
        Node temp = first;

        while (temp.next != null) {
            // System.out.print(temp.data+" ");
            temp = temp.next;
        }
        temp.next = newNode;

        newNode.next = first;
        temp = first;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print("null");

    }
}
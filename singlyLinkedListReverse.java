import java.util.Scanner; 

class singlyLinkedListReverse {

    private static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node root;

    public singlyLinkedListReverse() {
        this.root = null;
    }

    public void add(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }

        Node head = root;
        while (head.next != null) head = head.next;
        head.next = new Node(value);
    }

    public void print() {
        Node current = root;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void reverse() {
        Node next = root;
        Node previous = null;
        Node current;

        while (next != null) {
            current = next;
            next = next.next;

            current.next = previous;
            previous = current;
            root = current;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        singlyLinkedListReverse list = new singlyLinkedListReverse();

        System.out.print("How many nodes would you like in your singly linked list?: ");
        int size = sc.nextInt();
        int i = 0; 
        while(i < size) {
            System.out.print("Set data for node# " + (i+1) + ": ");
            list.add(sc.nextInt());
            i++;
        }
       sc.close();

        list.print();
        list.reverse();
        list.print();
    }
}
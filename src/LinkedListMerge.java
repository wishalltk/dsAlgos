/**
 * Created by vishal.tk on 6/19/18 using Stark Machine.
 */
public class LinkedListMerge {

    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(5);

        Node head2 = new Node(3);
        head2.next = new Node(4);

        Node combined = merge(head1, head2);

    }

    private static Node merge(Node head1, Node head2) {
        if (head1.data <= head2.data) {
            head1.next = merge(head1.next, head2);
        } else {

        }

    }

    static class Node {
        Node(int data) { this.data = data; }
        private final int data;
        private Node next = null;
    }
}


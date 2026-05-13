package day9_LinkedList;

public class LinkedListBasics {
    public static void main(String[] args) {
        Node a = new Node(10); //[10|null] not connected yet
        Node b = new Node(20); //[20|null]
        Node c = new Node(30); //[30|null]
        Node d = new Node(40); //[40|null]

        // connect each node
        a.next = b;
        b.next = c;
        c.next = d;

        // custom data type of node to store the node value
        //this preserves the head value
        Node head = a; // head points to

        //this becomes null after operation ends
        Node current = head;

        while(current != null){
            System.out.println(current.data+" ");
            current = current.next;
        }
    }
}
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null; // not connected to any node yet
    }
}

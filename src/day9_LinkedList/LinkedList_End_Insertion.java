package day9_LinkedList;
/*
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/


import java.util.Scanner;

public class LinkedList_End_Insertion {

    public Node insertAtEnd(Node head, int x) {
        // convert x into a node
        Node last = new Node(x);

        // if list is empty, new node becomes head
        if (head == null) {
            return last;
        }

        // move current to the last node
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        // attach new node at the end
        current.next = last;

        return head;
    }

    public void printList(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.print("null");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length: ");
        int n = sc.nextInt();

        Node head = null;
        Node tail = null;

        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();

            Node newNode = new Node(val);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        LinkedList_End_Insertion endinsertion = new LinkedList_End_Insertion();

        System.out.println("Enter value to insert at end: ");
        int newval = sc.nextInt();

        Node ans = endinsertion.insertAtEnd(head, newval);

        endinsertion.printList(ans);

        sc.close();
    }
}
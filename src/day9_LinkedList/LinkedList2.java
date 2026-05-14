package day9_LinkedList;

import java.util.Scanner;

public class LinkedList2 {

    /*
     * We are using Node class from another file,
     * for example: LinkedListBasics.java
     *
     * This is possible because both classes are in the same package:
     * package day9_LinkedList;
     */

    Node head; // head points to the first node of the linked list

    // Method to add a new node at the END of the linked list
    void addLast(int data) {

        // Step 1: Create a new node with given data
        Node newNode = new Node(data);

        // Step 2: If the list is empty, make newNode the head
        if (head == null) {
            head = newNode;
            return; // stop here because node is added
        }

        // Step 3: Start from the head
        Node current = head;

        // Step 4: Move forward until we reach the last node
        // Last node is the node whose next is null
        while (current.next != null) {
            current = current.next;
        }

        // Step 5: Attach the new node after the last node
        current.next = newNode;
    }

    // Method to add a new node at the BEGINNING of the linked list
    void addFirst(int data) {

        // Step 1: Create a new node with given data
        Node newNode = new Node(data);

        // Step 2: New node should point to the current head
        newNode.next = head;

        // Step 3: Make newNode the new head
        head = newNode;
    }

    // Method to print the linked list
    void printList() {

        // Start from the first node
        Node current = head;

        // Keep printing until current becomes null
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next; // move to next node
        }

        System.out.println("null"); // shows end of linked list
    }
}

/*
 * Node class is not written here because we are using
 * the Node class from another file in the same package.
 *
 * Example Node class:
 *
 * class Node {
 *     int data;
 *     Node next;
 *
 *     Node(int data) {
 *         this.data = data;
 *         this.next = null;
 *     }
 * }
 */

class Main {
    public static void main(String[] args) {

        // Create object of our custom linked list
        LinkedList2 list = new LinkedList2();

        // Scanner for taking input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int n = sc.nextInt();

        System.out.println("add values: ");

        // Taking 5 values from user and adding them at the end
        for (int i = 0; i <n; i++) {
            int value = sc.nextInt();
            list.addLast(value);
        }

        // Adding 5 at the beginning of the linked list
        System.out.println("Add first value: ");
        int first = sc.nextInt();
        list.addFirst(first);

        // Printing final linked list
        list.printList();

        // Closing scanner
        sc.close();

        /*
         * Example:
         *
         * Input:
         * 10 20 30 40 50
         *
         * After addLast:
         * 10 -> 20 -> 30 -> 40 -> 50 -> null
         *
         * After addFirst(5):
         * 5 -> 10 -> 20 -> 30 -> 40 -> 50 -> null
         */
    }
}
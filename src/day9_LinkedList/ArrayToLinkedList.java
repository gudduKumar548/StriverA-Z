//import java.util.Scanner;
//class Node{
//    int data;
//    Node next;
//
//    Node(int data){
//        this.data = data;
//        this.next = null;
//    }
//}
//class LinkedList{
//    public Node arraytoLinkedlist(int[]arr){
//        if(arr.length == 0){
//            return null;
//        }
//        Node head = new Node(arr[0]);
//        Node current = head;
//        for(int i=1;i<arr.length;i++){
//            Node newNode = new Node(arr[i]);
//            current.next = newNode;
//            current = newNode;
//        }
//        return head;
//    }
//    public void printList(Node head){
//        Node current = head;
//        while(current != null){
//            System.out.print(current.data+" ");
//            current = current.next;
//        }
//        System.out.print("null");
//    }
//}
//public class Main
//{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter length: ");
//        int n = sc.nextInt();
//
//        System.out.println("enter elements: ");
//        int[] arr = new int[n];
//
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        sc.close();
//
//        LinkedList arraytolist = new LinkedList();
//        Node ans = arraytolist.arraytoLinkedlist(arr);
//        arraytolist.printList(ans);
//    }
//
//}
package day9_LinkedList;

import java.util.Scanner;

public class ArrayToLinkedList {
    // Method of Return type Node
    public Node arrayToLinkedList(int[] arr){
        if(arr.length == 0){
            return null;
        }
//        Node head = new Node(arr[0]);
//        Node current = head;
//
//        for(int i=1;i<arr.length;i++){
//            Node newNode = new Node(arr[i]);
//            current.next = newNode;
//            current = newNode;
//        }
//        return head;
          Node head = null;
          Node tail = null;
          for(int i=0;i<arr.length;i++){
              Node newNode = new Node(arr[i]);
              if(head == null){
                  head = newNode;
                  tail = newNode;
              }
              else{
                  tail.next = newNode;
                  tail = newNode;
              }
          }
          return head;
    }
    public void printList(Node head){
        //current is a reference pointing to real nodes.
        //That is why current.data and current.next work.
        Node current = head;
        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.print("null");
    }
    public void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        sc.close();
        ArrayToLinkedList  arraytolist = new ArrayToLinkedList();
        Node ans = arraytolist.arrayToLinkedList(arr);
        arraytolist.printList(ans);
    }
}

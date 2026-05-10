package day7_Array_problems;

import java.util.Scanner;

public class SecondSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int n = sc.nextInt();

        System.out.println("Enter Elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = secondSmallestElement(arr, n);
        System.out.println("second smallest element: " + ans);
    }

    public static int secondSmallestElement(int[] arr, int n) {
//        Optimal solution
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                secondsmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i]>smallest && arr[i]<secondsmallest){
                secondsmallest = arr[i];
            }
        }
        return secondsmallest;


//        Better solution
//        int smallest = Integer.MAX_VALUE;
//        for (int i = 0; i < n; i++) {
//            if (arr[i] < smallest) {
//                smallest = arr[i];
//            }
//        }
//        int secondsmallest = Integer.MAX_VALUE;
//        for(int i=0;i<n;i++){
//            if(arr[i]>smallest && arr[i]<secondsmallest){
//                secondsmallest = arr[i];
//            }
//        }
//        return secondsmallest;


//    brute force
//    Arrays.sort(arr)
//    return arr[1];

    }
}
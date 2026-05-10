package day7_Array_problems;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int n = sc.nextInt();

        System.out.println("Enter Elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = secondLargestElement(arr,n);
        System.out.println("second largest element: "+ans);
    }
    public static int secondLargestElement(int[]arr,int n) {
//        Optimal solution

          if(arr.length == 0){
              return 0;
          }
          int largest = Integer.MIN_VALUE;
          int slargest = Integer.MIN_VALUE;

          for(int i=0;i<n;i++){
              if(arr[i]>largest){
                  slargest = largest;
                  largest = arr[i];
              }
              else if(arr[i]<largest && arr[i]>slargest){
                  slargest = arr[i];
              }
          }
          return slargest;

//        Better solution
//        int largest = Integer.MIN_VALUE;
//        for (int i = 0; i < n; i++) {
//            if (arr[i] > largest) {
//                largest = arr[i];
//            }
//        }
//        int slargest = -1;
//        for(int i=0;i<n;i++){
//            if(arr[i]<largest && arr[i]>slargest){
//                slargest = arr[i];
//            }
//        }
//        return slargest;



//        Brute force
//          Arrays.sort(arr);
//          return arr[n-2];
    }
}

package day7_Array_problems;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int n = sc.nextInt();

        System.out.println("Enter Elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = largestElement(arr,n);
        System.out.println("Largest element: "+ans);
    }
    public static int largestElement(int[]arr,int n){
//        Optimal solution
        if(arr.length == 0){
            return 0;
        }
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;

//        Brute force
//        Arrays.sort(arr);
//        return arr[n-1];
    }
}

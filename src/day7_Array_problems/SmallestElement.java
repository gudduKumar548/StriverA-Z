package day7_Array_problems;

import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int n = sc.nextInt();

        System.out.println("Enter Elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = smallestElement(arr,n);
        System.out.println("smallest element: "+ans);
    }
    public static int smallestElement(int[]arr,int n) {
//        Optimal solution
        if(arr.length == 0){
            return 0;
        }
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;

//        Arrays.sort(arr);
//        return arr[0]
    }
}

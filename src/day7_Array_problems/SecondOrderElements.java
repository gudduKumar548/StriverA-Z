package day7_Array_problems;

import java.util.Arrays;
import java.util.Scanner;

public class SecondOrderElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int n = sc.nextInt();

        System.out.println("Enter Elements: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = getSecondOrderElements(arr, n);
        System.out.println("second largest and second smallest element: " + Arrays.toString(ans));
    }
    public static int[] getSecondOrderElements(int []arr, int n) {
        int[] result = new int[2];
//      most optimal solution
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>secondlargest){
                secondlargest = arr[i];
            }
            if(arr[i]<smallest){
                secondsmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i]>smallest && arr[i]<secondsmallest){
                secondsmallest = arr[i];
            }
        }
        if(secondlargest == Integer.MIN_VALUE && secondsmallest == Integer.MAX_VALUE){
            return new int[]{-1,-1};
        }
        result[0] = secondlargest;
        result[1] = secondsmallest;

        return result;


//        Better solution
//        int largest = Integer.MIN_VALUE;
//        int secondlargest = Integer.MIN_VALUE;
//        int smallest = Integer.MAX_VALUE;
//        int secondsmallest = Integer.MAX_VALUE;
//
//        for(int i=0;i<n;i++){
//            if(arr[i]>largest){
//                secondlargest = largest;
//                largest = arr[i];
//            }
//            else if(arr[i]<largest && arr[i]>secondlargest){
//                secondlargest = arr[i];
//            }
//        }
//
//        for(int j=0;j<n;j++){
//            if(arr[j]<smallest){
//                secondsmallest = smallest;
//                smallest = arr[j];
//            }
//            else if(arr[j]>smallest && arr[j]<secondsmallest){
//                secondsmallest = arr[j];
//            }
//        }
//        if(secondlargest == Integer.MIN_VALUE && secondsmallest == Integer.MAX_VALUE){
//            return new int[]{-1,-1};
//        }
//        result[0] = secondlargest;
//        result[1] = secondsmallest;
//
//        return result;

//        Arrays.sort(arr);
//        result[0] = arr[n-2];
//        result[1] = arr[1];
//        return result;
    }
}

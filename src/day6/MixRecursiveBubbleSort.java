package day6;

import java.util.Arrays;
import java.util.Scanner;

public class MixRecursiveBubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int n = sc.nextInt();

        System.out.println("Enter elements");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        recursive_bubble_sort(arr,arr.length);
        System.out.println(Arrays.toString(arr));

    }
    public static void recursive_bubble_sort(int[] arr,int n) {
        if (n <= 1) {
            return;
        }
        for (int i = 0; i <n - 1; i++) {
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        recursive_bubble_sort(arr, n - 1);
    }
}

package day6;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveInsertionSort {
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
        recursive_insertion_sort(arr,arr.length,1);
        System.out.println(Arrays.toString(arr));

    }
    public static void recursive_insertion_sort(int[] arr,int n,int i) {
        if(i == n){
            return;
        }
        int j = i;
        while(j>0 && arr[j-1]>arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }
        recursive_insertion_sort(arr,n,i+1);


//        if (i>=n) {
//            return;
//        }
//        int key = arr[i];
//        int j=i-1;
//        while(j>=0 && arr[j]>key){
//            arr[j+1] = arr[j];
//            j--;
//        }
//        arr[j+1] = key;
//        recursive_insertion_sort(arr, n,i+1);
    }
}

package day6;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int n = sc.nextInt();

        System.out.println("Enter elements: ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        quick_sort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quick_sort(int[] arr,int low,int high){
        if(low<high){
           int partition = helper(arr,low,high);
            quick_sort(arr,low,partition-1);
            quick_sort(arr,partition+1,high);
        }
    }
    public static int helper(int[] arr,int low, int high){
        int pivot = low;
        int i=low;
        int j=high;

        while(i<j){
            while(i<=high-1 && arr[i]<=arr[pivot]){
                i++;
            }
            while(j>= low+1 && arr[j]>arr[pivot]){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[pivot];
        arr[pivot] = arr[j];
        arr[j] = temp;

        return j;
    }
}

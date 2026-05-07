package day6;

import java.util.Arrays;
import java.util.Scanner;

public class Recursivebubblesort {
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
        recursive_bubble_sort(arr,0);
        System.out.println(Arrays.toString(arr));

    }
    public static void recursive_bubble_sort(int[] arr,int start){
         if(start >= arr.length-1){
             return;
         }
         sort(arr,arr.length-1,start);
         recursive_bubble_sort(arr,start+1);
    }
    public static void sort(int[] arr,int pt,int start){
        if(pt<=start){
            return;
        }
        if(arr[pt]< arr[pt-1]){
            int temp = arr[pt];
            arr[pt] = arr[pt-1];
            arr[pt-1] = temp;
        }
        sort(arr,pt-1,start);
    }
}

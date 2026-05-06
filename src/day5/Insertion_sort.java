package day5;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for(int start=0;start<arr.length;start++){
            arr[start] = sc.nextInt();
        }

        int[] result = insertion_sort(arr,n);
        System.out.println(Arrays.toString(result));
    }

    private static int[] insertion_sort(int[] arr, int n) {

        for(int i=1;i<n;i++){
           int key = arr[i]; //current element as key
           int j=i-1; // previous element

            //Shift the elements that are greater than key by one position
            while(j>=0 && arr[j]>key){
               arr[j+1] = arr[j];
               j--;
           }
           arr[j+1] = key; //Insert key at correct positon
        }
        return arr;
    }
}

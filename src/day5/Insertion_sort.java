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
           int key = arr[i]; //Pick current element.
           int j=i-1; // previous element

            //Move bigger elements one position right.
            while(j>=0 && arr[j]>key){
               arr[j+1] = arr[j];
               j--;
           }
           arr[j+1] = key; //Insert current element in the empty position.
        }
        return arr;
    }
}

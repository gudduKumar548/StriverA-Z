package day5;

import java.util.Arrays;
import java.util.Scanner;

// move the smallest one at the very first
public class Selection_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int n = sc.nextInt();

        System.out.println("Enter elements: ");
        int[] arr = new int[n];
        for(int start=0;start<n;start++){
            arr[start]= sc.nextInt();
        }

        int[] result = selection_sort(arr,n);
        System.out.println("Sorted Array: "+Arrays.toString(result));
    }
    public static int[] selection_sort(int[] arr,int n){
        for(int start=0;start<n;start++){
            int min = start;
            for(int movefrom=start;movefrom<n;movefrom++){
                if(arr[movefrom]<arr[min]){
                    min = movefrom;
                }
            }
            int current_val = arr[start];
            arr[start] = arr[min];
            arr[min] = current_val;
        }
        return arr;
    }
}

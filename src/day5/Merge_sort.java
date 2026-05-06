package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Merge_sort {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter num: ");
       int n = sc.nextInt();

       System.out.println("Enter elements: ");
       int[] arr = new int[n];
       for(int i=0;i<n;i++){
           arr[i] = sc.nextInt();
       }
       mergesort(arr,0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergesort(int[] arr, int low, int high) {
        // Base case: one element is already sorted
        if(low>=high){
            return;
        }

        // Find middle
        int mid = low+(high-low)/2;

        // Sort left half
        mergesort(arr,low,mid);

        // Sort right half
        mergesort(arr,mid+1,high);

        // Merge both sorted halves
        merge(arr,low,mid,high);
    }
    public static void merge(int[] arr,int low,int mid,int high){
        // for every merge function call a new array is created
        int[] result = new int[high-low+1];
        int left = low;
        int right = mid+1;
        int k=0; //  keeps track of the index in result array

        //compare elements from both halves
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                result[k] = arr[left];
                left++;
            }else{
                result[k] = arr[right];
                right++;
            }
            k++;
        }

// copy remaining elements from left half
        while(left<=mid){
            result[k]=arr[left];
            left++;
            k++;
        }

        //copy remaining elements from right half
        while(right<=high){
            result[k]=arr[right];
            right++;
            k++;
        }

        //now copy sorted result back into original array
        for(int i=0;i<result.length;i++){
            arr[low+i] = result[i];
        }


//        for every merge call a new ArrayList is created
//        ArrayList<Integer> list = new ArrayList<>();
//        int left = low;
//        int right = mid+1;
//        while(left<=mid && right<=high){
//            if(arr[left]<=arr[right]){
//               list.add(arr[left]);
//               left++;
//            }else{
//                list.add(arr[right]);
//                right++;
//            }
//        }
//        while(left<=mid){
//            list.add(arr[left]);
//            left++;
//        }
//        while(right<=high){
//            list.add(arr[right]);
//            right++;
//        }
//        for(int i=0;i<list.size();i++){
//            arr[low+i] = list.get(i);
//        }
    }
}

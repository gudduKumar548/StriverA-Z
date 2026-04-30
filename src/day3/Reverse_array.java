package day3;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int[] result = reverseArray(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] reverseArray(int[] arr){
       return reverseOperation(arr,0);
    }
    public static int[] reverseOperation(int[] arr, int start){
        if(start>=arr.length/2){
            return arr;
        }
        helper(arr,start,arr.length-start-1);
        return reverseOperation(arr,start+1);
    }
    public static void helper(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
//    public static int[] reverseOperation(int[] arr,int start,int end){
//        if(start > end){
//            return arr;
//        }
//        int temp = arr[start];
//        arr[start] = arr[end];
//        arr[end] = temp;
//        return reverseOperation(arr, start+1,end-1);
//    }
}

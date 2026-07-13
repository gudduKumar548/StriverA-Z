package day7_Array_problems;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate_Array {
   public void rotate(int[] nums,int k){
       //Brute force approach
//       int n = nums.length;
//       k = k % n;
//
//       while(k > 0){
//
//           int last = nums[n-1];
//
//           for(int i=n-1; i>0; i--){
//               nums[i] = nums[i-1];
//           }
//
//           nums[0] = last;
//
//           k--;
//       }

       //better Approach
//       int n = nums.length;
//       k = k % n;
//       int[] temp = new int[n];
//       for(int i=0;i<n;i++){
//           temp[(i+k)%n] = nums[i];
//       }
//       for(int i=0;i<n;i++){
//           nums[i] = temp[i];
//       }

       //optimal
       /*
       normalize k = k % n
       Reverse the whole array
       rotate the k elements
       rotate the remaining elements
       * */
       int n=nums.length;
       k = k%n;
       if(k == 0){
           return;
       }
       int start = 0; int end = nums.length-1;
       while(start<end){
           int temp = nums[start];
           nums[start] = nums[end];
           nums[end] = temp;
           start++;
           end--;
       }
       int left = 0; int pos = k-1; int right = nums.length-1;
       while(left < pos){
           int temp = nums[left];
           nums[left] = nums[pos];
           nums[pos] = temp;
           left++;
           pos--;
       }
       while(k<right){
           int temp = nums[k];
           nums[k] = nums[right];
           nums[right] = temp;
           k++;
           right--;
       }
   }
}
class RotateArray{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter position");
        int pos = sc.nextInt();

        Rotate_Array ra = new Rotate_Array();
        ra.rotate(arr,pos);

        System.out.println("Rotated Array is: "+ Arrays.toString(arr));
    }
}

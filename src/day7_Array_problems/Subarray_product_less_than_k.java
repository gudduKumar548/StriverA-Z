package day7_Array_problems;

import java.util.Scanner;

public class Subarray_product_less_than_k{
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        // brute force
//        int n = nums.length;
//
//        if(k <= 1){
//            return 0;
//        }
//        int count = 0;
//        for(int i=0;i<n;i++){
//            double product=1;
//            for(int j=i;j<n;j++){
//                product *=nums[j];
//                if(product < k) {
//                    count++;
//                }
//            }
//        }
//        return count;

        //better approach
        int n = nums.length;

        if(k<=1){
            return 0;
        }
        int count = 0;
        for(int i=0;i<n;i++){
            long product=1;
            for(int j=i;j<n;j++){
                product *=nums[j];
                if(product < k) {
                    count++;
                }
                else{
                    break;
                }
            }
        }
        return count;


    }
}
class Subarrayproductlessthank{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target k");
        int k = sc.nextInt();

        Subarray_product_less_than_k splt = new Subarray_product_less_than_k();
        int result = splt.numSubarrayProductLessThanK(arr,k);
        System.out.println("maximum subarrays less than k: "+result);
    }
}

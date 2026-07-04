package day7_Array_problems;

import java.util.Arrays;
import java.util.Scanner;

public class Squares_of_a_sorted_array {
    public int[] sortedSquares(int[] nums){
        int n = nums.length;
        int[] arr = new int[n];

        int left = 0;
        int right = n-1;
        int idx = n-1;

        while(left<=right){
            int leftsquare = nums[left] * nums[left];
            int rightsquare = nums[right] * nums[right];

            if(leftsquare > rightsquare){
                arr[idx] = leftsquare;
                left++;
            }
            else{
                arr[idx] = rightsquare;
                right--;
            }
            idx--;
        }
        return arr;

    }
}
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements");

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        Squares_of_a_sorted_array soln = new Squares_of_a_sorted_array();
        int[] result = soln.sortedSquares(nums);
        System.out.println("Result: "+Arrays.toString(result));
    }
}

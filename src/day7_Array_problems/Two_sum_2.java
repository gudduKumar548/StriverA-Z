package day7_Array_problems;

import java.util.Arrays;
import java.util.Scanner;

public class Two_sum_2 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        int len = sc.nextInt();

        System.out.println("Enter elements");
        int[] arr = new int[len];

        for(int start =0;start<len;start++){
            arr[start] = sc.nextInt();
        }
        System.out.println("Enter target");
        int target = sc.nextInt();

        Arrays.sort(arr);

        Solution sln = new Solution();
        int[]  ans = sln.twosum(arr,target);
        System.out.println("Result: "+ Arrays.toString(ans));
    }
}
class Solution{
    public int[] twosum(int[]numbers,int target){
        int start = 0;
        int end = numbers.length-1;

        while(start<end){
            if(numbers[start]+numbers[end] == target){
                return new int[]{start+1,end+1};
            }
            else if(numbers[start]+numbers[end] > target){
                end--;
            }
            else{
                start++;
            }
        }
        return new int[]{-1,-1};
    }
}

package day7_Array_problems;

import java.util.Scanner;

public class Max_consecutive_ones {
    public int maxconsecutiveones(int[] nums){
//        int temp = 0;
//        for(int i=0;i<nums.length;i++){
//            int count = 0;
//            for(int j=i;j<nums.length;j++){
//                if(nums[j] == 1){
//                    count++;
//                }
//                else{
//                    break;
//                }
//            }
//            if(count > temp){
//                temp = count;
//            }
//        }
//        return temp;

        int count = 0;
        int temp = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                count++;
//               temp = Math.max(count,temp);
            }
            else{
                count = 0;
            }
            if(count > temp){
                temp = count;
            }
        }
        return temp;
    }
}
class Max_ones{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements");

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Max_consecutive_ones mco = new Max_consecutive_ones();
        int ans = mco.maxconsecutiveones(arr);
        System.out.println("Most consecutive one is: "+ans);
    }
}
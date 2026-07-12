package day7_Array_problems;

import java.util.Arrays;
import java.util.Scanner;

public class Three_sum_closest {
    public int threeSumClosest(int[] nums,int target){
        int bestsum = nums[0]+nums[1]+nums[2];
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    int currentdist = Math.abs(sum-target);
                    int existingdist = Math.abs(bestsum - target);

                    if(sum == target){
                        return sum;
                    }
                    if(currentdist < existingdist){
                        bestsum = sum;
                    }
                }
            }
        }
        return bestsum;
    }
}
class ThreeSumClosest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target");
        int target = sc.nextInt();
        sc.close();

        Three_sum_closest threesumclosest = new Three_sum_closest();
        int result = threesumclosest.threeSumClosest(arr,target);
        System.out.println("Three sum closest is: " +result);
    }
}

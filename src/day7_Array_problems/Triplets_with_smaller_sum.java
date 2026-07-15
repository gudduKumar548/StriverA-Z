package day7_Array_problems;

import java.util.Arrays;
import java.util.Scanner;

public class Triplets_with_smaller_sum {
    public int countTriplets(int sum,int[] nums){
        //Brute force
//       int n = nums.length;
//       int count=0;
//       for(int i=0;i<n-2;i++){
//           for(int j=i+1;j<n-1;j++){
//               for(int k=j+1;k<n;k++){
//                   int currentsum = nums[i]+nums[j]+nums[k];
//                   if(currentsum<sum){
//                       count++;
//                   }
//               }
//           }
//       }
//       return count;

        //optimal solution
        /*
        sort the array
        fix one element i
        apply two pointer
        */
        int n = nums.length;
        Arrays.sort(nums);
        int count = 0;
        for(int i=0;i<n-2;i++){
            int j=i+1;int k=n-1;
            while(j<k){
                int currentsum = nums[i]+nums[j]+nums[k];
                if(currentsum < sum ){
                    count +=(k-j);
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return count;
    }
}
class TripletSmallerSum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter sum: ");
        int sum = sc.nextInt();
        sc.close();

        Triplets_with_smaller_sum tsm = new Triplets_with_smaller_sum();
        int result = tsm.countTriplets(sum,arr);
        System.out.println("Triplet count: " +result);
    }
}

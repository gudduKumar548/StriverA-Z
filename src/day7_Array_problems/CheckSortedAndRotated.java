package day7_Array_problems;

import java.util.Arrays;
import java.util.Scanner;

public class CheckSortedAndRotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int n = sc.nextInt();

        System.out.println("Enter elements: ");
        int[] num = new int[n];
        for(int i=0;i<num.length;i++){
            num[i] = sc.nextInt();
        }

        boolean ans = isSortedAndRotated(num);
        System.out.println(ans);
    }
    public static boolean isSortedAndRotated(int[] arr){
        // optimal solution
        int count = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] > arr[(i+1)%n]){
                count++;
            }
        }
        return count<=1;

        // brute force
//        int[] original = arr.clone();
//        Arrays.sort(arr);
//        int n = arr.length;
//        for(int i=0;i<n;i++){
//            boolean ismatch = true;
//            int start = arr[0];
//            for(int j=0;j<n;j++){
//                if(arr[j] != original[j]) {
//                    ismatch = false;
//                    break;
//                }
//            }
//            if(ismatch){
//                return true;
//            }
//            for(int k=0;k<n-1;k++){
//                arr[k] = arr[k+1];
//            }
//            arr[n-1] = start;
//        }
//        return false;
    }

}

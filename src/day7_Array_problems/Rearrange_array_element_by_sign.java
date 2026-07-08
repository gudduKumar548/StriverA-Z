package day7_Array_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Rearrange_array_element_by_sign {
    // Brute force solution
    public int[] rearrangeArray(int[] nums){
//        int size = nums.length;
//        ArrayList<Integer> list1 = new ArrayList<>();
//        ArrayList<Integer> list2 = new ArrayList<>();
//        ArrayList<Integer> result = new ArrayList<>();
//
//        for(int start=0;start<size;start++){
//            if(nums[start] >=0){
//               list1.add(nums[start]);
//            }
//            else{
//                list2.add(nums[start]);
//            }
//        }
//        int st=0; int end=list1.size(); int left = 0; int right=list2.size();
//
//        while(st<end && left < right){
//            result.add(list1.get(st));
//            result.add(list2.get(left));
//            st++;
//            left++;
//        }
//        for(int pt=0;pt<result.size();pt++){
//            nums[pt] = result.get(pt);
//        }
//        return nums;

        int size = nums.length;
        int[] result = new int[size];
        int pos = 0;
        int neg = 1;

        for(int num:nums){
            if(num > 0) {
                result[pos] = num;
                pos +=2;
            }
            else{
                result[neg] = num;
                neg +=2;
            }
        }
        return result;
    }
}
class ArrangeBySign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        Rearrange_array_element_by_sign arrarrange = new Rearrange_array_element_by_sign();
        int[] result = arrarrange.rearrangeArray(arr);
        System.out.println("Rearrange Array by sign output: " + Arrays.toString(result));
    }
}
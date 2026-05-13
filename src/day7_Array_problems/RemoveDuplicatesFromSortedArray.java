package day7_Array_problems;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int size = removeDuplicates(arr);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }

    public static int removeDuplicates(int[] nums) {

//        brute force
//        LinkedHashSet<Integer> set = new LinkedHashSet<>();
//
//        for (int num : nums) {
//            set.add(num);
//        }
//
//        int start = 0;
//        for (int num : set) {
//            nums[start++] = num;
//        }
//
//        return set.size();

        // optimal solution
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != nums[count]){
                count++;
                nums[count] = nums[i];
            }
        }
        return count+1;
    }
}
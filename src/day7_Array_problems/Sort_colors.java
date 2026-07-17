package day7_Array_problems;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_colors {
    public void sortColors(int[] nums) {
        int[] newnums = new int[3];
        for(int i=0;i<nums.length;i++){
            newnums[nums[i]]++;
        }
        int start=0;int count=0;
        int n = newnums.length;
        while(start<n){
            for(int i=0;i<newnums[start];i++){
                nums[count] = start;
                count++;
            }
            start++;
        }
    }
}
class Sortcolors{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int i=0;i<n;i++){
            while(true){
                try {
                    System.out.println("Enter element " + (i + 1));
                    int value = sc.nextInt();
                    if (value == 0 || value == 1 || value == 2) {
                        nums[i] = value;
                        break;
                    }
                    else{
                        System.out.println("Plzz enter input 0,1 and 2 only");
                    }
                }
                catch(Exception e){
                    System.out.println("Invalid Input! plzz enter a valid Integer");
                }

            }
        }
        Sort_colors scr = new Sort_colors();
        scr.sortColors(nums);
        System.out.println("Sorted colors are: "+ Arrays.toString(nums));
    }
}
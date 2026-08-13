package BinarySearch;

import java.util.Arrays;

public class FirstAndLastOccurance {
    public static void main(String[] args) {
        int[] arr = {1};
        int target = 1;
        int[] ans = searchElement(arr,target);
        System.out.println("First and Last occurance: "+ Arrays.toString(ans));
    }
    static int[] searchElement(int[] nums, int target){
        int[] arr = {-1,-1};
        if(nums.length == 0){
            return arr;
        }
        arr[0] = findPos(nums,target,true);
        arr[1] = findPos(nums,target,false);

        return arr;
    }
    static int findPos(int[] nums, int target, boolean isValid){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                ans = mid;
                if(isValid){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else if(nums[mid]<target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return ans;
    }
}

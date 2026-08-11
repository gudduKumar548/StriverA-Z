package BinarySearch;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1};
        int target = 3;
        int ans = searchInsert(arr, target);
        System.out.println("Target suitable position is:"+ans);
    }
    static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start;
    }
}

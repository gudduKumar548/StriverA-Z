package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 3;
        int ans = searchInBS(arr, target);
        System.out.println("target found at index: "+ans);
    }
    static int searchInBS(int[] nums, int target){
        if(nums.length == 0){return -1;}
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}

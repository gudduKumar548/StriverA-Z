package BinarySearch;

public class SearchInAnInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,26,30};
        int target = 1;
        int ans = findRange(arr,target);
        System.out.println("Element found at index: "+ans);
    }
    static int findRange(int[] nums, int target){

        int start = 0;
        int end = 1;

        while(nums[end]<target){
            int newstart = end+1;
            end += (end - start + 1)*2;
            start = newstart;
        }
        return searchInArray(nums,target,start,end);
    }
    static int searchInArray(int[] nums, int target,int st, int end){
        while(st<=end){
            int mid = st+(end-st)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                st = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}

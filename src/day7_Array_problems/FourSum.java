package day7_Array_problems;

import java.util.*;

public class FourSum {
    public List<List<Integer>> foursum(int[] nums, int target){
        // brute force
//        int n = nums.length;
//        List<List<Integer>> list = new ArrayList<>();
//        for(int i=0;i<n-3;i++){
//            for(int j=i+1;j<n-2;j++){
//                for(int k=j+1;k<n-1;k++){
//                    for(int l=k+1;l<n;l++){
//                        int sum = nums[i]+nums[j]+nums[k]+nums[l];
//                        List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
//                        if(sum == target){
//                            Collections.sort(temp);
//                            if(!list.contains(temp)){
//                                list.add(temp);
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        return list;


        // optimal solution
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && nums[j] == nums[j-1]){
                    continue;
                }
                int k=j+1; int l=n-1;
                while(k<l){
                    long sum = (long)nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum == target){
                        result.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        k++;
                        l--;
                        while(k<l && nums[k] == nums[k-1]){
                            k++;
                        }
                        while(k<l && nums[l] == nums[l+1]){
                            l--;
                        }
                    }
                    else if(sum<target){
                        k++;
                    }
                    else{
                        l--;
                    }
                }
            }
        }
        return result;
    }
}
class Four_sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements: ");

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter target");
        int target = sc.nextInt();

        FourSum fs= new FourSum();
        List<List<Integer>> result = fs.foursum(nums,target);
        System.out.println("Result: "+result);
    }
}
package day7_Array_problems;

import java.util.*;

public class Three_sum {
    public List<List<Integer>> threesum(int[] nums){
        //Brute force
//        List<List<Integer>> result = new ArrayList<>();
//        int n = nums.length;
//        for(int i=0;i<n-3;i++){
//            for(int j=i+1;j<n-2;j++){
//                for(int k=j+1;k<n-1;k++){
//                    int sum = nums[i]+nums[j]+nums[k];
//                    if(sum == 0){
//                        List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
//                        Collections.sort(temp);
//                        if(!result.contains(temp)){
//                            result.add(new ArrayList<>(temp));
//                        }
//                    }
//                }
//            }
//        }
//        return result;

        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int j=i+1;int k=n-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j] == nums[j-1]){
                        j++;
                    }
                    while(j<k && nums[k] == nums[k+1]){
                        k--;
                    }
                }
                else if(sum<0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return result;
    }
}
class Threesum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        int len = sc.nextInt();

        int[] nums = new int[len];
        System.out.println("Enter elements");

        for(int i=0;i<len;i++){
            nums[i] = sc.nextInt();
        }

        Three_sum ts = new Three_sum();
        List<List<Integer>>  ans = ts.threesum(nums);
        System.out.println("Three sum to zero: "+ans);
    }
}

package day4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Count_freq_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int num = sc.nextInt();

        int[] arr = new int[num];
        System.out.println("Enter elements");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Map<Integer,Integer> ans= freq_count(arr);
        System.out.println(ans);
    }
    public static int[] count_freq(int[] arr){
        int[] arr1 = new int[arr.length];
        for(int i=0;i<arr1.length;i++) {
            arr1[arr[i]] += 1;
        }

    }
    public static Map<Integer,Integer> freq_count(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        return map;
    }
}

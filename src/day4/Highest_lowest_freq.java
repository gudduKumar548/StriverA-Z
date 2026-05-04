package day4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Highest_lowest_freq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        System.out.println("Enter elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Map<String,Integer> map = min_max_freq(arr);
        System.out.println(map);

    }
    public static Map<String, Integer> min_max_freq(int[] arr){
        Map<Integer,Integer> map1 = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            map1.put(arr[i], map1.getOrDefault(arr[i],0)+1);
        }
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        int minkey = -1;
        int maxkey = -1;

        for(Map.Entry<Integer,Integer> freq: map1.entrySet()){
            if(freq.getValue()<smallest){
                smallest = freq.getValue();
                minkey = freq.getKey();
            }
            if(freq.getValue()>largest){
                largest = freq.getValue();
                maxkey = freq.getKey();
            }
        }
        map2.put("Lowest frequency element:",minkey);
        map2.put("Lowest frequency:",smallest);
        map2.put("Highest frequency element:",maxkey);
        map2.put("Highest frequency:",largest);

        return map2;
    }
}

//        int smallest = Integer.MAX_VALUE;
//        int minkey = -1;
//        for(Map.Entry<Integer,Integer> freq: map1.entrySet()){
//            if(smallest > freq.getValue()){
//                smallest = freq.getValue();
//                minkey = freq.getKey();
//            }
//        }
//        map2.put(minkey,smallest);
//
//        int largest = Integer.MIN_VALUE;
//        int maxkey = -1;
//        for(Map.Entry<Integer,Integer> freq : map1.entrySet()){
//            if(largest<freq.getValue()){
//                largest = freq.getValue();
//                maxkey = freq.getKey();
//            }
//        }
//        map2.put(maxkey,largest);
//
//        return map2;


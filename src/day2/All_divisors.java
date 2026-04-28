package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class All_divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] ans = all_divisors(num);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] all_divisors(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i == 0){
                list.add(i);
                if(i != n/i){
                    list.add(n/i);
                }
            }
        }
        Collections.sort(list);

        int[] finalresult = new int[list.size()];
        for(int i=0;i<list.size();i++){
           finalresult[i] = list.get(i);
        }
        return finalresult;
    }
}







//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//
//       for(int i=1;i<=num;i++){
//            if(num%i == 0){
//                System.out.print(i+" ");
//            }
//        }
//       int[] ans = divisors(num);
//        System.out.println(Arrays.toString(ans));
//    }
//    public static int[] divisors(int n) {
//        ArrayList<Integer> list = new ArrayList<>();
//
//        for(int i=1;i<=n;i++){
//            if(n%i == 0) {
//                list.add(i);
//            }
//        }
//        int len = list.size();
//        int[] finalresult = new int[len];
//        for(int i=0;i<len;i++){
//            finalresult[i] = list.get(i);
//        }
//        return finalresult;
//    }
//}

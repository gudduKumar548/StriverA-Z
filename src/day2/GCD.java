package day2;

import java.util.ArrayList;
import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.println("Enter 2nd number: ");
        int n2 = sc.nextInt();

        int ans = gcd(n1,n2);
        System.out.println(ans);
    }
    public static int gcd(int n1, int n2){
//        int largest = 1;
//        for(int i=1;i<Math.min(n1,n2);i++){
//            if(n1%i == 0 && n2%i == 0){
//                if(i>largest){
//                    largest = i;
//                }
//            }
//        }
//        return largest;
        for(int i= Math.min(n1,n2); i>0;i--){
            if(n1%i == 0 && n2%i ==0){
                return i;
            }
        }
        return 1;


//        ArrayList<Integer> list1 = new ArrayList<>();
//
//        for(int i=1;i*i<=n1;i++){
//            if(n1%i == 0){
//                list1.add(i);
//                if(i != n1/i){
//                    list1.add(n1/i);
//                }
//            }
//        }
//        ArrayList<Integer> list2 = new ArrayList<>();
//
//        for(int i=1;i*i<=n2;i++){
//            if(n2%i == 0){
//                list2.add(i);
//                if(i != n2/i){
//                    list2.add(n2/i);
//                }
//            }
//        }
//        ArrayList<Integer> list3 = new ArrayList<>();
//        for(int num: list1){
//            if(list2.contains(num)){
//                list3.add(num);
//            }
//        }
//
//        int biggest = list3.get(0);
//        for(int i=1;i<list3.size();i++){
//            if(list3.get(i)>biggest){
//                biggest = list3.get(i);
//            }
//        }
//        return biggest;
    }
}

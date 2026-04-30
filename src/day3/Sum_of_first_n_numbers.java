package day3;

import java.util.Scanner;

public class Sum_of_first_n_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

       int ans = sum_of_n_numbers(num);
        System.out.println(ans);
    }
    public static int sum_of_n_numbers(int n){
        if(n==0){
            return n;
        }
        return n+sum_of_n_numbers(n-1);
//        or

//        if(n == 0){
//            return sum;
//        }
//        sum += n;
//        return sum_of_n_numbers(n-1,sum);

//        using formulla
//        return n*(n+1)/2;
    }
}

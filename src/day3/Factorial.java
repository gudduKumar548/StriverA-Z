package day3;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int ans = factorial(num);
        System.out.println(ans);
    }
    public static int factorial(int n){
        if(n == 1){
            return n;
        }
        return n * factorial(n-1);
    }
}

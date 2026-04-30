package day3;

import java.util.Scanner;

public class Print_something_n_times {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        print_something(num);
    }
    public static void print_something(int n){
//        tail recursion(work done first, then call a function)
        if(n == 0){
            return;
        }
        System.out.println(n);
        print_something(n-1);
    }
}

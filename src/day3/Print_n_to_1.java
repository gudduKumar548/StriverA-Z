package day3;

import java.util.Scanner;

public class Print_n_to_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        print_n_to_1(num);
    }
    public static void print_n_to_1(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        print_n_to_1(n-1);
    }
}

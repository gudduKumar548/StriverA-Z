package day3;

import java.util.Scanner;

public class Print_1_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        print_1_to_n(num,1);
    }
    public static void print_1_to_n(int n, int start){
        if(start > n){
            return;
        }
        System.out.println(start);
        print_1_to_n(n,start+1);
    }
}

package day3;

import java.util.Scanner;

public class Print_name_n_time {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Enter size: ");
        int n = sc.nextInt();

        print_name(n,name);
    }
    public static void print_name(int n,String name){
        if(n==0){
            return;
        }
        System.out.println(name);
        print_name(n-1,name);
    }
}

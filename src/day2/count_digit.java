package day2;

import java.util.Scanner;

public class count_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count =0;
        while(number>0){
            count++;
            number /=10;
        }
        System.out.println(count);
    }
}

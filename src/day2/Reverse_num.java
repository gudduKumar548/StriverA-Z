package day2;

import java.util.Scanner;

public class Reverse_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int result = 0;
        while(number>0){
            int rem = number%10;
            result = result*10 +rem;
            number /=10;
        }
        System.out.println(result);
    }
}

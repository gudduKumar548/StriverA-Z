package day2;

import java.util.Scanner;

public class Check_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int original = number;
        int result = 0;
        while(number>0){
            int rem = number%10;
            result = result*10 + rem;
            number /=10;
        }
        if(original == result){
            System.out.println("it's a palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
        sc.close();
    }
}

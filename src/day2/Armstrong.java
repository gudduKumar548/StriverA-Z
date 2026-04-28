package day2;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        System.out.println(check_palindrome(number));
    }
    public static boolean check_palindrome(int n){
        int original = n;

        int temp = n;

//       shortest way to calculate no of digits
//        int digit = n + (int)Math.log10(n) +1;
        int digit = 0;
        while(temp>0){
            digit ++;
            temp /=10;
        }

        int result = 0;
        while(n>0){
            int rem = n%10;
            result = (int) (result + Math.pow(rem,digit));
            n /=10;
        }
        return original == result ;
    }

}

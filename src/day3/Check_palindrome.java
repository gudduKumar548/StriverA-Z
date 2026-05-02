package day3;

import java.util.Scanner;

public class Check_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        boolean ans = check_Palindrome(str);
        System.out.println(ans);
    }
    public static boolean check_Palindrome(String str){
       return isPalindrome(str,0);
    }
    public static boolean isPalindrome(String str,int start){
//        if(start>=end){
//            return true;
//        }
//        if(str.charAt(start) != str.charAt(end)){
//            return false;
//        }
//        return isPalindrome(str,start+1,end-1);
//        or

          if(start>=str.length()/2){
              return true;
          }
          if(str.charAt(start) != str.charAt(str.length()-start-1)){
              return false;
          }
          return isPalindrome(str,start+1);
    }
}

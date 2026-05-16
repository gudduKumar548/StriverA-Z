package day8_String_problems;

import java.util.Scanner;

public class Largest_odd_number_in_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string input");
        String str = sc.nextLine();

        Solution sln = new Solution();
        String ans = sln.largestOddNumber(str);
        System.out.println("Largest odd number: "+ans);
    }

}
class Solution {
    public String largestOddNumber(String num) {
        for(int i=num.length()-1;i>=0;i--){
            int val = num.charAt(i) - '0';
            if(val%2 == 1){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}
package day8_String_problems;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       String str = sc.nextLine();

       String ans = reverseWords(str);
        System.out.println(ans);
    }
    public static String reverseWords(String str){
      /*  String[] newstring = str.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for(int i=newstring.length-1;i>=0;i--){
            result.append(newstring[i]);
            if(i!=0){
                result.append(" ");
            }
        }
        return result.toString();
       */
        StringBuilder result = new StringBuilder();
        int start = str.length()-1;
        while(start>=0){
            while(start>=0 && str.charAt(start) == ' '){
                start--;
            }
            if(start<0){
                break;
            }
            int end = start;
            while(start>=0 && str.charAt(start) != ' '){
                start--;
            }
            if(result.length() > 0){
                result.append(" ");
            }
            result.append(str.substring(start+1,end+1));
        }
        return result.toString();
    }
}

package day8_String_problems;

import java.util.Scanner;
import java.util.Stack;

public class Backspace_String_Compare {
    public boolean backspaceCompare(String s, String t){
        //brute force
//        StringBuilder strS = new StringBuilder(s);
//        StringBuilder strT = new StringBuilder(t);
//
//        int i=0;
//        while(i<strS.length()){
//            if(strS.charAt(i) == '#'){
//                strS.deleteCharAt(i);
//                if(i>0){
//                    strS.deleteCharAt(i-1);
//                    i--;
//                }
//                if(i<0){
//                    i=0;
//                }
//            }
//            else{
//                i++;
//            }
//        }
//        int j=0;
//        while(j<strT.length()){
//            if(strT.charAt(j) == '#'){
//                strT.deleteCharAt(j);
//                if(j>0){
//                    strT.deleteCharAt(j-1);
//                    j--;
//                }
//                if(j<0){
//                    j=0;
//                }
//            }
//            else{
//                j++;
//            }
//        }
//        return strS.toString().equals(strT.toString());

        // better approach
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();

        for(char ch: s.toCharArray()){
            if(ch == '#'){
                if(!stackS.empty()){
                    stackS.pop();
                }
            }
            else{
                stackS.push(ch);
            }
        }
        for(char ch:t.toCharArray()){
            if(ch == '#'){
                if(!stackT.empty()){
                    stackT.pop();
                }
            }
            else{
                stackT.push(ch);
            }
        }
        return stackS.equals(stackT);
    }
}
class BackspaceStringCompare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String S: ");
        String s = sc.nextLine();

        System.out.println("Enter String T: ");
        String t = sc.nextLine();

        Backspace_String_Compare bsc = new Backspace_String_Compare();
        boolean result = bsc.backspaceCompare(s,t);
        System.out.println("Result after comparison: "+result);
    }
}
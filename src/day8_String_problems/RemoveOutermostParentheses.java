package day8_String_problems;

import java.util.Scanner;
import java.util.Stack;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  input  = sc.nextLine();

        String ans = removeOutermostParentheses(input);
        System.out.println(ans);
    }
    public static String removeOutermostParentheses(String s){
        StringBuilder str = new StringBuilder();
        int counter = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                counter++;
                if (counter > 1) {
                    str.append(ch);
                }
            }
            else {
                counter--;
                if (counter > 0) {
                    str.append(ch);
                }
            }
        }

        return str.toString();

//        Stack<Character> stack = new Stack<>();
//        StringBuilder str = new StringBuilder();
//
//        for(int i=0;i<s.length();i++){
//            char ch = s.charAt(i);
//            if(ch == '('){
//                if(!stack.isEmpty()){
//                    str.append(ch);
//                }
//                stack.push(ch);
//            }
//            else if(ch == ')'){
//                stack.pop();
//                if(!stack.isEmpty()){
//                    str.append(ch);
//                }
//            }
//        }
//        return str.toString();
    }
}

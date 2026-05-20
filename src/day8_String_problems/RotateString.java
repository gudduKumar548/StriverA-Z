package day8_String_problems;

import java.util.Scanner;

public class RotateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter s: ");
        String s = sc.nextLine();

        System.out.println("Enter Goal: ");
        String goal = sc.nextLine();

        boolean result = rotateString(s,goal);
        System.out.println(result);
    }
    public static boolean rotateString(String s, String goal){
// optimal solution
        return (s+s).contains(goal);

//        Brute force
//        if(s.length() != goal.length()){
//            return false;
//        }
//        if(s.equals(goal)){
//            return true;
//        }
//        int n = s.length();
//        char[] arr = s.toCharArray();
//        for(int i=0;i<n;i++){
//            char ch = arr[0];
//            for(int j=1;j<n;j++){
//                arr[j-1] = arr[j];
//            }
//            arr[n-1] = ch;
//            String rotated = new String(arr);
//            if(rotated.equals(goal)){
//                return true;
//            }
//        }
//        return false;
    }
}

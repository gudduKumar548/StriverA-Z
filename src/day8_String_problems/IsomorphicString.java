package day8_String_problems;

import java.util.HashMap;
import java.util.Scanner;

public class IsomorphicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String s: ");
        String s = sc.nextLine();

        System.out.println("Enter String t: ");
        String t = sc.nextLine();

        boolean result = isIsomorpic(s,t);
        System.out.println("Isomorphic result: "+result);
    }
    public static boolean isIsomorpic(String s,String t){
        //optimal approach
        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if(map1[ch1] != map2[ch2]){
                return false;
            }
            map1[ch1] = i+1;
            map2[ch2] = i+1;
        }
        return true;
        // Better approach (worst case o(N) because containskey take o(n) for scanning)
//        HashMap<Character,Character> map = new HashMap<>();
//        for(int i=0;i<s.length();i++){
//            char original = s.charAt(i);
//            char mappingstring = t.charAt(i);
//
//            if(!map.containsKey(original)){
//                if(!map.containsValue(mappingstring)){
//                    map.put(original,mappingstring);
//                }
//                else{
//                    return false;
//                }
//            }
//            else{
//                char mappedstring = map.get(original);
//                if(mappedstring != mappingstring){
//                    return false;
//                }
//            }
//        }
//        return true;


        //Brute force
//        for(int i=0;i<s.length();i++){
//            for(int j=i+1;j<s.length();j++){
//                boolean result = ((s.charAt(i) != s.charAt(j)) && (t.charAt(i) != t.charAt(j))) || ((s.charAt(i) == s.charAt(j)) && (t.charAt(i) == t.charAt(j)));
//                if(!result){
//                    return false;
//                }
//            }
//
//        }
//        return true;
    }
}

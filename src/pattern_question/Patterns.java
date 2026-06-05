package pattern_question;

public class Patterns{
    public static void main(String[] args) {
        Pattern_problems.pattern1(4);
        Pattern_problems.pattern2(4);
        Pattern_problems.pattern3(4);
        Pattern_problems.pattern4(4);
        Pattern_problems.pattern5(5);
        Pattern_problems.pattern6(5);
        Pattern_problems.pattern7(5);
        Pattern_problems.pattern8(5);
        Pattern_problems.pattern9(5);
        Pattern_problems.pattern10(5);
        Pattern_problems.pattern11(5);
        Pattern_problems.pattern12(5);
        Pattern_problems.pattern13(5);
        Pattern_problems.pattern14(5);
        Pattern_problems.pattern15(5);
        Pattern_problems.pattern16(5);
        Pattern_problems.pattern17(5);
    }
}
class Pattern_problems{
    public static void pattern1(int n) {
        //question 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        //Question 2
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern3(int n){
        //Question 3
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern6(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern7(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<2*i;k++){
                System.out.print("*");
            }
            for(int l=1;l<=n-i;l++){
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern8(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*n-(2*i-1);k++){
                System.out.print("*");
            }
            for(int l=1;l<i;l++){
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern9(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*n-(2*i-1);k++){
                System.out.print("*");
            }
            for(int l=1;l<i;l++){
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern10(int n){
        for(int i=1;i<=2*n-1;i++){
            int start = (i>n) ? 2*n-i : i;
            for(int j=1;j<=start;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern11(int n){
        for(int i=0;i<n;i++){
            int start = (i%2 == 0) ? 1: 0;
            for(int j=0;j<=i;j++){
                System.out.print(start+" ");
                start = 1-start;
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern12(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int k=0; k<2*n-2*i;k++){
                System.out.print(" ");
            }
            for(int l=i;l>0;l--){
                System.out.print(l);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern13(int n){
        int start = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(start+" ");
                start += 1;
            }
            System.out.println();
        }
    }
    public static void pattern14(int n){
       for(int i=0;i<n;i++){
           for(char start = 'A';start<='A'+i;start++){
               System.out.print(start);
           }
           System.out.println();
       }
        System.out.println();
    }
    public static void pattern15(int n){
        for(int i=0;i<n;i++){
            for(char ch='A';ch<'A'+n-i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void pattern16(int n){
//        char ch='A';
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++) {
//                System.out.print(ch);
//            }
//            ch++;
//            System.out.println();
//        }
        for(int i=0;i<n;i++){
            char ch = (char) ('A'+ i);
            for(int j=0;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();

        }
    }
}

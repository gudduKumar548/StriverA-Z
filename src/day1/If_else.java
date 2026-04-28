package day1;

import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks;

        while(true) {
            System.out.println("Enter your makrs: ");
            marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks, Please Enter valid marks");
            } else {
                break;
            }
        }
            if(marks>=30){
                System.out.println("pass");
            }else{
                System.out.println("fail");
            }
        sc.close();
//        userInput();
//    }
//    public static void userInput(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your makrs: ");
//        int marks = sc.nextInt();
//        if(marks<0 || marks>100){
//            result(marks);
//        }
//        else if(marks>=30 && marks <=100){
//            System.out.println("pass");
//        }
//        else{
//            System.out.println("fail");
//        }
//    }
//    public static void result(int marks){
//        System.out.println("Invalid marks, Plzz Enter valid marks");
//        userInput();
    }
}

package day1;

import java.util.Scanner;

public class Data_types {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num= sc.nextInt();
        System.out.println(num);

        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println(ch);
        sc.nextLine();

        System.out.println("Enter String: ");
        String  str = sc.nextLine();
        System.out.println(str);

        System.out.println("Enter a large value: ");
        double dbl = sc.nextDouble();
        System.out.println(dbl);

        System.out.println("Enter a float number: ");
        float flt = sc.nextFloat();
        System.out.println(flt);

        System.out.println("Enter true or false: ");
        boolean bln = sc.nextBoolean();
        System.out.println(bln);
    }
}
